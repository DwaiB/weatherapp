package com.asterix.weatherapp.dto.ForcastDay;


public class Hour {
    private String time;
    private Integer is_day;
    private Condition condition;
    private Double humidity;
    private Integer cloud;
    private Double feelslike_c;

    public Hour(){}

    

    public Hour(String time, Integer is_day, Condition condition, Double humidity, Integer cloud, Double feelslike_c) {
        this.time = time;
        this.is_day = is_day;
        this.condition = condition;
        this.humidity = humidity;
        this.cloud = cloud;
        this.feelslike_c = feelslike_c;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getIs_day() {
        return is_day;
    }

    public void setIs_day(Integer is_day) {
        this.is_day = is_day;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Integer getCloud() {
        return cloud;
    }

    public void setCloud(Integer cloud) {
        this.cloud = cloud;
    }

    public Double getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(Double feelslike_c) {
        this.feelslike_c = feelslike_c;
    }



    public class Condition {
        private String text;
        private String icon;
        private Integer code;
    
        public Condition(){}
    
        public Condition(String text, String icon, Integer code) {
            this.text = text;
            this.icon = icon;
            this.code = code;
        }
    
        public String getText() {
            return text;
        }
    
        public void setText(String text) {
            this.text = text;
        }
    
        public String getIcon() {
            return icon;
        }
    
        public void setIcon(String icon) {
            this.icon = icon;
        }
    
        public Integer getCode() {
            return code;
        }
    
        public void setCode(Integer code) {
            this.code = code;
        }
    
        @Override
        public String toString() {
            return "condition:{\n\ttext : "+text+"\n\ticon : "+icon+"\n\tcode : "+code+"}";
        }
        
        
    }
}
