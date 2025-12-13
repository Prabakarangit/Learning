package learn.designPattern.creational.builder;

public class Notification {

    private final String title;
    private final String body;
    private final String imageUrl;
    private final String clickAction;

    public Notification(Builder builder){
        this.title = builder.title;
        this.body = builder.body;
        this.imageUrl = builder.imageUrl;
        this.clickAction = builder.clickAction;
    }

    public static class Builder{
        private  String title;
        private  String body;
        private  String imageUrl;
        private  String clickAction;

        public Builder title(String title){
            this.title = title;
            return this;
        }
        public Builder body(String body){
            this.body = body;
            return this;
        }
        public Builder imageUrl(String imageUrl){
            this.imageUrl = imageUrl;
            return this;
        }
        public Builder clickAction(String clickAction){
            this.clickAction = clickAction;
            return this;
        }

        public Notification build(){
            return new Notification(this);
        }

    }

}
