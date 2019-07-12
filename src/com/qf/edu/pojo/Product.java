package com.qf.edu.pojo;

import java.sql.Date;




/**
 * @author wwb
 *@see  商品的模型类
 */
public class Product {
	/*商品id,表中的主键*/
		private Integer pId;
		/*商品名称*/
		private String pName;
		/*商品市场价格*/
		private Double marketPrice;
		/*折扣后的价格*/
		private Double shopPrice;
		private String image;
		private String pDesc;
		private Integer Hot; 
		private Date pDate;
		private Integer csId;
		private Integer state;
		public Integer getpId() {
			return pId;
		}
		public void setpId(Integer pId) {
			this.pId = pId;
		}
		public String getpName() {
			return pName;
		}
		public void setpName(String pName) {
			this.pName = pName;
		}
		public Double getMarketPrice() {
			return marketPrice;
		}
		public void setMarketPrice(Double marketPrice) {
			this.marketPrice = marketPrice;
		}
		public Double getShopPrice() {
			return shopPrice;
		}
		public void setShopPrice(Double shopPrice) {
			this.shopPrice = shopPrice;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public String getpDesc() {
			return pDesc;
		}
		public void setpDesc(String pDesc) {
			this.pDesc = pDesc;
		}
		public Integer getHot() {
			return Hot;
		}
		public void setHot(Integer hot) {
			Hot = hot;
		}

		public Date getpDate() {
			return pDate;
		}
		public void setpDate(Date pDate) {
			this.pDate = pDate;
		}
		public Integer getcsId() {
			return csId;
		}
		public void setcsId(Integer csId) {
			this.csId = csId;
		}
		public Integer getState() {
			return state;    
		}
		public void setState(Integer state) {
			this.state = state;
		}
		
		 
		
		
	
}
