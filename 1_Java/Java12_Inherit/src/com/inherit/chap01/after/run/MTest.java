package com.inherit.chap01.after.run;

import java.util.Date;

import com.inherit.chap01.after.model.dto.Desktop;
import com.inherit.chap01.after.model.dto.SmartPhone;
import com.inherit.chap01.after.model.dto.Television;

public class MTest {
	public static void main(String[] args) {
		Television t = new Television("LG", "03", "t-22334", "LGTV", 400, new Date(), 65);
		Desktop d = new Desktop("æ÷«√", "01", "m-01234", "æ∆¿Ã∏∆", 500, new Date(), "m1", 500, 32, "∏∆os", true);
		SmartPhone s = new SmartPhone("ªÔº∫", "02", "g-4321", "∞∂∑∞Ω√", 130, new Date(), "Ω∫≥¿µÂ∑°∞Ô", 100, 16, "æ»µÂ∑Œ¿ÃµÂ", "kt");

		System.out.println(t.information());
		System.out.println(d.information());
		System.out.println(s.information());
	}

}
