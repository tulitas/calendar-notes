package com.Models;

public class CalendarDay {

  public CalendarDay() {
  }

  public CalendarDay(Integer dayNumber, String href, String additionalInformation) {
    this.dayNumber = dayNumber;
    this.href = href;
    this.additionalInformation = additionalInformation;
  }

  private Integer dayNumber;
  private String href;
  private String additionalInformation;

  public Integer getDayNumber() {
    return dayNumber;
  }

  public void setDayNumber(Integer dayNumber) {
    this.dayNumber = dayNumber;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }
}
