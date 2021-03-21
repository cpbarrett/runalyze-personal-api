package Runalyze.PersonalAPI.Sleep.SleepData;

import javax.persistence.Id;

public class Sleep {
    @Id
    private String id;
    private String date_time;
    private Integer duration;
    private Integer rem_duration;
    private Integer light_sleep_duration;
    private Integer deep_sleep_duration;
    private Integer awake_duration;
    private Integer hr_average;
    private Integer hr_lowest;
    private Integer quality;

    public Sleep(){}

    public Sleep(String id, String date_time, Integer duration, Integer rem_duration, Integer light_sleep_duration, Integer deep_sleep_duration, Integer awake_duration, Integer hr_average, Integer hr_lowest, Integer quality) {
        this.id = id;
        this.date_time = date_time;
        this.duration = duration;
        this.rem_duration = rem_duration;
        this.light_sleep_duration = light_sleep_duration;
        this.deep_sleep_duration = deep_sleep_duration;
        this.awake_duration = awake_duration;
        this.hr_average = hr_average;
        this.hr_lowest = hr_lowest;
        this.quality = quality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getRem_duration() {
        return rem_duration;
    }

    public void setRem_duration(Integer rem_duration) {
        this.rem_duration = rem_duration;
    }

    public Integer getLight_sleep_duration() {
        return light_sleep_duration;
    }

    public void setLight_sleep_duration(Integer light_sleep_duration) {
        this.light_sleep_duration = light_sleep_duration;
    }

    public Integer getDeep_sleep_duration() {
        return deep_sleep_duration;
    }

    public void setDeep_sleep_duration(Integer deep_sleep_duration) {
        this.deep_sleep_duration = deep_sleep_duration;
    }

    public Integer getAwake_duration() {
        return awake_duration;
    }

    public void setAwake_duration(Integer awake_duration) {
        this.awake_duration = awake_duration;
    }

    public Integer getHr_average() {
        return hr_average;
    }

    public void setHr_average(Integer hr_average) {
        this.hr_average = hr_average;
    }

    public Integer getHr_lowest() {
        return hr_lowest;
    }

    public void setHr_lowest(Integer hr_lowest) {
        this.hr_lowest = hr_lowest;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }
}
