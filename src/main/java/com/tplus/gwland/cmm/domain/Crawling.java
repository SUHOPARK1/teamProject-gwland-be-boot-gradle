package com.tplus.gwland.cmm.domain;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {
	public static void main(String args[]) {
		/*
		 * Document 클래스 : 연결해서 얻어온 HTML 전체 문서 Element 클래스 : Document의 HTML 요소 Elements
		 * 클래스 : Element가 모인 자료형
		 */
		String url = "https://map.naver.com/v5/search/%EB%8B%A8%EC%B2%9C%EB%A9%B4%EC%98%A5/place/11733192?c=14311832.6990601,4606367.6313780,15,0,0,0,dh&placePath=%3Fentry%253Dbmp";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 주요 뉴스 태그
		Elements element = doc.select(
				"div.place_detail_wrapper");

//		// 헤더부분의 제목
//		String title = element.select("").text().substring(0, 4);
//		System.out.println(title);

		System.out.println("=======================================================");
		for (Element el : element.select(".WoYOw")) { // 하위 뉴스 기사들을 for문 돌리며 출력
			System.out.println(el.text());
		}
		System.out.println("=======================================================");
	}
}
