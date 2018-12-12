package com.spiderindia.quickezedesgin.Bean;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class OTPSend {
  @SerializedName("result")
  @Expose
  private Boolean result;
  @SerializedName("message")
  @Expose
  private String message;
  public OTPSend(){
  }
  public OTPSend(Boolean result, String message){
   this.result=result;
   this.message=message;
  }
  public void setResult(Boolean result){
   this.result=result;
  }
  public Boolean getResult(){
   return result;
  }
  public void setMessage(String message){
   this.message=message;
  }
  public String getMessage(){
   return message;
  }
}