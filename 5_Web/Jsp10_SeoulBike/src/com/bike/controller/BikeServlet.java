package com.bike.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bike.dao.BikeDao;
import com.bike.dto.BikeDto;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@WebServlet("/bike.do")
public class BikeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String command = request.getParameter("command");
		System.out.println("[command:" + command + "]");

		if (command.equals("first")) {
			response.sendRedirect("bike01.jsp");
		} else if (command.equals("first_db")) {
			String[] bikeList = request.getParameterValues("bike");

			List<BikeDto> dtos=new ArrayList<BikeDto>();
			for (int i = 0; i < bikeList.length; i++) {
				//System.out.println(bikeList[i]);
				String [] tmp=bikeList[i].split("/"); //첫번째 데이터 꺼내와서 / 를 기준으로 스플릿으로 자르기
				BikeDto dto=new BikeDto(tmp[0], //자른 데이터를 dto 객체에 추가
						Integer.parseInt(tmp[1]),
						tmp[2],
						tmp[3],
						Integer.parseInt(tmp[4]),
						Double.parseDouble(tmp[5]),
						Double.parseDouble(tmp[6]));
				dtos.add(dto); //dto에 추가가 다되었으면 list<BikeDto>에 추가
			}
			int res=new BikeDao().insert(dtos); //객체를 만들면서 바로 메소드 실행
			
			if(res==dtos.size()) {
				System.out.println("\ninsert 성공\n");
				response.sendRedirect("index.html");
			}else {
				System.out.println("\ninsert 실패ㅠ\n");
				response.sendRedirect("bike01.jsp");
			}
		}else if(command.equals("second")) {
			response.sendRedirect("bike02.jsp");
		}else if(command.equals("second_db")) {
			String obj=request.getParameter("obj");
			//System.out.println(obj);
			JsonParser parser=new JsonParser();
			JsonElement element= parser.parse(obj); //string형태를 json 객체로 변환하여 사용
		
			List<BikeDto> dtos=new ArrayList<BikeDto> ();
			
			for(int i=0; i<element.getAsJsonObject().get("DATA").getAsJsonArray().size();i++) {
				//System.out.println(element.getAsJsonObject().get("DATA").getAsJsonArray().get(i));
				JsonObject tmp=element.getAsJsonObject().get("DATA").getAsJsonArray().get(i).getAsJsonObject();
				
				JsonElement addr_gu_je=tmp.get("addr_gu");
				JsonElement content_id_je=tmp.get("content_id");
				JsonElement content_nm_je=tmp.get("content_nm");
				JsonElement new_addr_je=tmp.get("new_addr");
				JsonElement cradle_count_je=tmp.get("cradle_count");
				JsonElement longitude_je=tmp.get("longitude");
				JsonElement latitude_je=tmp.get("latitude");
				
				
				//자바타입 변수로 바꿈
				String addr_gu =addr_gu_je.getAsString();
				int content_id=content_id_je.getAsInt();
				String content_nm=content_nm_je.getAsString();
				String new_addr=new_addr_je.getAsString();
				int cradle_count=cradle_count_je.getAsInt();
				double longitude=longitude_je.getAsDouble();
				double latitude=latitude_je.getAsDouble();
				
				
				//가공한 데이터를 dto에 저장
				 BikeDto dto=new BikeDto();
				 dto.setAddr_gu(addr_gu);
				 dto.setContent_id(content_id);
				 dto.setContent_nm(content_nm);
				 dto.setNew_addr(new_addr);
				 dto.setCradle_count(cradle_count);
				 dto.setLongitude(longitude);
				 dto.setLatitude(latitude);
				 
				 //만들어둔 리스트에 추가
				 dtos.add(dto);
			}
			
			int res=new BikeDao().insert(dtos);
			if(res>0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
			PrintWriter out=response.getWriter();
			out.print(res);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
