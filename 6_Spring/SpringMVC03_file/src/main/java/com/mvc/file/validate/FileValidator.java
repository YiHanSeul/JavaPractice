package com.mvc.file.validate;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

//유효성 검사
@Service
public class FileValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}
	//유효성 검사
	@Override
	public void validate(Object target, Errors errors) {
		UploadFile file=(UploadFile)target; //object를 uploadfile로 형변환
		
		if(file.getFile().getSize()==0) {//파일의 size가 0이면 error
			errors.rejectValue("file", "errorCode","Please select a file");
		}
	}

}
