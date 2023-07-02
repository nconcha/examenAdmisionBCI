package bci.appRest.UserManagerService.dto;

public class phonesDTO {
	 private Long id;
	    private String number;
	    private String cityCode;
	    private String countryCode;
		public phonesDTO(Long id, String number, String cityCode, String countryCode) {
			super();
			this.id = id;
			this.number = number;
			this.cityCode = cityCode;
			this.countryCode = countryCode;
		}
		public phonesDTO() {
			super();
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getCityCode() {
			return cityCode;
		}
		public void setCityCode(String cityCode) {
			this.cityCode = cityCode;
		}
		public String getCountryCode() {
			return countryCode;
		}
		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}
	    
	    

}
