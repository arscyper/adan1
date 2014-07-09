package com.app.prayer.time.client;

import com.google.gwt.core.shared.GWT;

/**
 * @author Pandurang Patil 18-Mar-2014
 * 
 */
public class GWTCode {

 public static String hello() {
	 String name = "a";
	 GWT.log(name);
  return "Hello " + name + "!";
 }

 public static native void exportMethod() /*-{
  $wnd.gwtcode_hello = $entry(@com.app.prayer.time.client.GWTCode::hello());
	console.log("meme");
 }-*/;
}
