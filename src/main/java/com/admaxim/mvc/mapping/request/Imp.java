package com.admaxim.mvc.mapping.request;



import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

// rtb-2.3--Native Issue
@Mapper
public class Imp {

    private String id;
//    private List<Metric> metrics;
    private Banner banner;
    private Video video;
//    private Audio audio;
    // native
//    private Native nAtive;

    private String displaymanager;
    private String displaymanagerver;
    private Integer instl;
    private String tagid;
    private Float bidfloor;
    private String bidfloorcur;
//    private Integer clickbrowser;
    private Integer secure;
    private List<String> iframebuster;
    private Pmp pmp;
//    private Integer exp;
    private Object ext;


    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

//    public List<Metric> getMetrics() { return metrics; }
//    public void setMetrics(List<Metric> metrics) { this.metrics = metrics; }

    public Banner getBanner() { return banner; }
    public void setBanner(Banner banner) { this.banner = banner; }

    public Video getVideo() { return video; }
    public void setVideo(Video video) { this.video = video; }

//    public Audio getAudio() { return audio; }
//    public void setAudio(Audio audio) { this.audio = audio; }

//    public Native getnAtive() { return nAtive; }
//    public void setnAtive(Native nAtive) { this.nAtive = nAtive; }

    public Pmp getPmp() { return pmp; }
    public void setPmp(Pmp pmp) { this.pmp = pmp; }

    public String getDisplaymanager() { return displaymanager; }
    public void setDisplaymanager(String displaymanager) { this.displaymanager = displaymanager; }

    public String getDisplaymangerver() { return displaymanagerver; }
    public void setDisplaymangerver(String displaymangerver) { this.displaymanagerver = displaymanagerver; }

    public Integer getInstl() { return instl; }
    public void setInstl(Integer instl) { this.instl = instl; }

    public String getTagid() { return tagid; }
    public void setTagid(String tagid) { this.tagid = tagid; }

    public Float getBidfloor() { return bidfloor; }
    public void setBidfloor(Float bidfloor) { this.bidfloor = bidfloor; }

    public String getBidfloorcur() { return bidfloorcur; }
    public void setBidfloorcur(String bidfloorcur) { this.bidfloorcur = bidfloorcur; }

//    public Integer getClickbrowser() { return clickbrowser; }
//    public void setClickbrowser(Integer clickbrowser) { this.clickbrowser = clickbrowser; }

    public Integer getSecure() { return secure; }
    public void setSecure(Integer secure) { this.secure = secure; }

    public List<String> getIframebuster() { return iframebuster; }
    public void setIframebuster(List<String> iframebuster) { this.iframebuster = iframebuster; }

//    public Integer getExp() { return exp; }
//    public void setExp(Integer exp) { this.exp = exp; }

    public Object getExt() { return ext; }
    public void setExt(Object ext) { this.ext = ext; }


//    @Override
//    public String toString() {
//        return "Imp{" +
//                "id='" + id + '\'' +
//                ", banner=" + banner +
//                ", video=" + video +
//                ", native=" + nAtive +
//                ", displaymanager='" + displaymanager + '\'' +
//                ", displaymanagerver='" + displaymanagerver + '\'' +
//                ", instl=" + instl +
//                ", tagid='" + tagid + '\'' +
//                ", bidfloor=" + bidfloor +
//                ", bidfloorcur='" + bidfloorcur + '\'' +
//                ", secure=" + secure +
//                ", iframebuster=" + iframebuster +
//                ", pmp=" + pmp +
//                ", ext=" + ext +
//                '}';
//    }
}
