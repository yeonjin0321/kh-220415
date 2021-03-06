package com.mbti;

import java.util.Scanner;

public class MbtiSet2 {
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("==== 개발자 MBTI 결과 보기 ====");
	        System.out.print("당신의 MBTI를 입력하십시오 : ");

	        String mbti = sc.next();
	        String result = null;

	        switch (mbti) { //스위치문 사용하기
	            case "intp":
	            case "INTP":
	                result = "백엔드";
	                break;
	            case "enfj":
	            case "ENFJ":
	                result = "프론트엔드";
	                break;
	            case "infj":
	            case "INFJ":
	                result = "풀스택";
	                break;
	            case "istj":
	            case "ISTJ":
	                result = "퍼블리셔";
	                break;
	            case "entj":
	            case "ENTJ":
	                result = "아키텍쳐";
	                break;
	            case "isfj":
	            case "ISFJ":
	                result = "보안전문가";
	                break;
	            case "intj":
	            case "INTJ":
	                result = "데이터분석가";
	                break;
	            case "enfp":
	            case "ENFP":
	                result = "AI";
	                break;
	            case "entp":
	            case "ENTP":
	                result = "iOS";
	                break;
	            case "esfj":
	            case "ESFJ":
	                result = "안드로이드";
	                break;
	            case "esfp":
	            case "ESFP":
	                result = "게임 개발자";
	                break;
	            case "estp":
	            case "ESTP":
	                result = "IoT개발";
	                break;
	            case "estj":
	            case "ESTJ":
	                result = "QA";
	                break;
	            case "infp":
	            case "INFP":
	                result = "블록체인";
	                break;
	            case "istp":
	            case "ISTP":
	                result = "임베디드 개발자";
	                break;
	            case "isfp":
	            case "ISFP":
	                result = "네트워크 개발자";
	                break;
	            default:
	                System.out.printf("정확한 MBTI 유형이 아니네요 ㅠㅠ");
	        }

	        if (result != null) { // 결과값이 NULL이 아니라면
	            System.out.printf("당신은 %s형입니다!", result);
	        }
	        sc.close(); //스캐너 닫기
	    }
	}