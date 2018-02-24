package cn.jpush.reactnativejpush;

/**
 * Created by chenjianwei on 2018/1/31.
 */

public class ExtraModel {

    public static final String TYPE_NEWS = "news";
    public static final String TYPE_WORDS = "comment";

    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean showNotification() {
        return TYPE_NEWS.equals(this.type) || TYPE_WORDS.equals(this.type);
    }
}
