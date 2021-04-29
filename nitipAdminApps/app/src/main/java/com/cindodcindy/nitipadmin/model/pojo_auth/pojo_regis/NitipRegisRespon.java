
package com.cindodcindy.nitipadmin.model.pojo_auth.pojo_regis;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class NitipRegisRespon {

    @SerializedName("message")
    @Expose
    private String message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NitipRegisRespon() {
    }

    /**
     * 
     * @param message
     */
    public NitipRegisRespon(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
