package com.day15;

//다음은 우리반 학생들의  자바, html, 오라클과목에 대한 성적표 이다.
//총점, 평균,석차를 구하시오
public class Nansu2 {


		 public static void main(String args[]){  
		        String[] name={"이민형","황인준","이제노","나재민","박지성"}; // 이름 초기화  
		        byte[][] score={{96,92,98}, // 점수 초기화(2차원 배열: byte형)  
		                        {88,90,68},  
		                        {98,80,75},  
		                        {64,70,72},  
		                        {80,88,94}};  
		        short[] sum = new short[5]; // 개개인의 합계가 저장될 공간  
		        short[] sum_subject = new short[3]; // 과목별 합계가 저장될 공간  
		        short total_sum = 0; // 전체 합계가 저장될 공간  
		        float[] average = new float[5]; // 개개인의 평균이 저장될 공간  
		        float[] average_subject = new float[3]; // 과목별 평균이 저장될 공간  
		        float total_average = 0.0f; // 전체 평균의 합계가 저장될 공간  
		        short[] rank = new short[5]; // 개인별 석차가 저장될 공간  
		        // 개인별 점수 합계, 평균 계산   
		        for(int i=0;i<score.length;i++){ //5 행(사람 수)
		            for(int j=0;j<score[1].length;j++){  //3 열 (과목의 숫자) 
		                sum[i]+=score[i][j]; // 개인별 점수의 합계가 sum의 i번째 요소에 저장됨  
		                average[i]=(float)sum[i]/score[1].length; // 점수 합계의 평균 산출-> average에 저장  
		            }  
		        }  
		        // 과목별 합계 및 평균 계산  
		        for(int i=0; i<score[1].length; i++){  
		            for(int j=0; j<score.length; j++){  
		                sum_subject[i]+=score[j][i]; // 과목별 점수 합계 계산(sum_subject에 저장)  
		                average_subject[i]=(float)sum_subject[i]/score.length; // 과목별 평균점수  
		            }  
		        }  
		        // 개인별 석차 계산  
		        for(int i=0; i<score.length; i++){  //5
		            int stat=1; // stat(현재 랭킹)이라는 임시 변수 생성, 석차 결과에 대입될 예정  
		            for(int j=0; j<score.length; j++){  
		                if(sum[i] < sum[j]) //sum(합계)의 0번째요소와 0~4번째 요소를 비교(다른 것보다 작은지 검사)  
		                    stat++; // 다른 것보다 작다면 1증가(순위 산정)  
		            }  
		            rank[i]=(short)stat; // stat에서 계산된 석차가 rank의 i번째 요소에 대입됨  
		        }  
		        //결과 테이블 표시  
		        System.out.println("이 름\t국어\t영어\t수학\t합계\t평균\t석차\n" +  
		                "===================================================");  
		        for(int i=0; i<score.length; i++){  
		            System.out.print(name[i]+"\t"); // 이름 출력  
		            for(int j=0; j<score[1].length; j++){  
		                System.out.print(score[i][j]+"\t"); // 개인별 점수 출력  
		            }  
		            System.out.print(sum[i]+"\t"); // 개인별 점수 합계 출력  
		            //System.out.print(average[i]+"\t");  
		            System.out.format("%.1f", average[i]); // 평균점수를 소수점 1자리까지 표시  
		            System.out.print("\t"+rank[i]); // 석차를 표시  
		            System.out.println(""); // 한 줄 띄우기  
		        }  
		        System.out.println("===================================================");  
		        //합계 표시  
		        System.out.print("합계\t");  
		        for(int i=0; i<score[1].length; i++){  
		            System.out.print(sum_subject[i]+"\t"); // 각 과목의 합계를 표시  
		            total_sum+=sum_subject[i]; // 각 과목의 합계를 합함  
		        }  
		        System.out.println(total_sum); // 위에서 합한 과목 합계를 보여줌  
		        //평균 표시  
		        System.out.print("평균\t");  
		        for(int i=0; i<score[1].length; i++){  
		            System.out.print(average_subject[i]+"\t"); // 각 과목의 평균을 보여줌  
		            total_average+=average_subject[i]; // 모든 과목의 평균의 합  
		        }  
		        System.out.println(total_average); // 평균 총 합계 표시하고 끝남.  
		    }  
		}  


	