package com.spiderindia.quickezedesgin.Bean.Dashboard;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Awesome Pojo Generator
 * */
public class DashBoardModelSub{
  @SerializedName("service_name")
  @Expose
  private String service_name;

  @SerializedName("image_path")
  @Expose
  private String image_path;

  @SerializedName("service_image")
  @Expose
  private String service_image;

  @SerializedName("created_at")
  @Expose
  private String created_at;

  @SerializedName("id")
  @Expose
  private Integer id;

  @SerializedName("created_by")
  @Expose
  private Integer created_by;
  @SerializedName("status")
  @Expose
  private Integer status;
  public void setService_name(String service_name){
   this.service_name=service_name;
  }
  public String getService_name(){
   return service_name;
  }
  public void setImage_path(String image_path){
   this.image_path=image_path;
  }
  public String getImage_path(){
   return image_path;
  }
  public void setService_image(String service_image){
   this.service_image=service_image;
  }
  public String getService_image(){
   return service_image;
  }
  public void setCreated_at(String created_at){
   this.created_at=created_at;
  }
  public String getCreated_at(){
   return created_at;
  }
  public void setId(Integer id){
   this.id=id;
  }
  public int getId(){
   return id;
  }
  public void setCreated_by(Integer created_by){
   this.created_by=created_by;
  }
  public Integer getCreated_by(){
   return created_by;
  }
  public void setStatus(Integer status){
   this.status=status;
  }
  public Integer getStatus(){
   return status;
  }
}