package com.admaxim.mvc.config;

public enum Event {

    START("start"),
    FIRSTQUARTILE("firstQuartile"),
    MIDPOINT("midpoint"),
    THIRDQUARTILE("thirdQuartile"),
    COMPLETE("complete"),
    MUTE("mute"),
    UNMUTE("unmute"),
    PAUSE("pause"),
    RESUME("resume"),
    SKIP("skip"),
    REWIND("rewind"),
    FULLSCREEN("fullscreen"),
    EXITFULLSCREEN("exitFullscreen"),
    EXPAND("expand"),
    COLLAPSE("collapse"),
    ACCEPTINVITATION("acceptInvitation"),
    CREATIVEVIEW("creativeView"),
    CLOSE("close"),
    PROGRESS("progress");

    private String event;

    private Event(String event) {
        this.event = event;
    }

    public String getValue() {
        return event;
    }

    public static String getStringValue(Event event) {
        return event.toString();
    }

    public static String getEventType(String event) {
        switch (event) {

            case "start":
                return getStringValue(Event.START);
            case "firstQuartile":
                return getStringValue(Event.FIRSTQUARTILE);
            case "midpoint":
                return getStringValue(Event.MIDPOINT);
            case "thirdQuartile":
                return getStringValue(Event.THIRDQUARTILE);
            case "complete":
                return getStringValue(Event.COMPLETE);
            case "mute":
                return getStringValue(Event.MUTE);
            case "unmute":
                return getStringValue(Event.UNMUTE);
            case"pause":
                return getStringValue(Event.PAUSE);
            case "resume":
                return getStringValue(Event.RESUME);
            case "skip":
                return getStringValue(Event.SKIP);
            case "rewind":
                return getStringValue(Event.REWIND);
            case "fullscreen":
                return getStringValue(Event.FULLSCREEN);
            case "exitFullscreen":
                return getStringValue(Event.EXITFULLSCREEN);
            case "expand":
                return getStringValue(Event.EXPAND);
            case "collapse":
                return getStringValue(Event.COLLAPSE);
            case "acceptInvitation":
                return getStringValue(Event.ACCEPTINVITATION);
            case "creativeView":
                return getStringValue(Event.CREATIVEVIEW);
            case "close":
                return getStringValue(Event.CLOSE);
            case "progress":
                return getStringValue(Event.PROGRESS);
            default:
               return  "lol";
        }
    }



}
