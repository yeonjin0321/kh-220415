package com.mvc.step1;

public class ActionForward {
   private String path = null;
   private boolean isRedirect = false; // true : snedRedirect, false: forward
  
   //게터 세터 생성
   public String getPath() {
      return path;
   }
   
   public void setPath(String path) {
      this.path = path;
   }
   public boolean isRedirect() {
      return isRedirect;
   }
   public void setRedirect(boolean isRedirect) {
      this.isRedirect = isRedirect;
   }
}