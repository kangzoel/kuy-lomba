package com.example.kuylomba.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.time.LocalDateTime;

public class Contest implements Parcelable {
    private String name;
    private int star;
    private String description;
    private int thumbnail;
    private String[] specifications;
    private int entryFee;
    private String rewardRange;
    private String category;
    private String deadline;
    private String website;

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public String[] getSpecifications() {
        return specifications;
    }

    public int getEntryFee() {
        return entryFee;
    }

    public String getRewardRange() {
        return rewardRange;
    }

    public String getCategory() {
        return category;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getWebsite() {
        return website;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setSpecifications(String[] specifications) {
        this.specifications = specifications;
    }

    public void setEntryFee(int entryFee) {
        this.entryFee = entryFee;
    }

    public void setRewardRange(String rewardRange) {
        this.rewardRange = rewardRange;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.star);
        dest.writeString(this.description);
        dest.writeInt(this.thumbnail);
        dest.writeStringArray(this.specifications);
        dest.writeInt(this.entryFee);
        dest.writeString(this.rewardRange);
        dest.writeString(this.category);
        dest.writeString(this.deadline);
        dest.writeString(this.website);
    }

    public Contest() {
    }

    protected Contest(Parcel in) {
        this.name = in.readString();
        this.star = in.readInt();
        this.description = in.readString();
        this.thumbnail = in.readInt();
        this.specifications = in.createStringArray();
        this.entryFee = in.readInt();
        this.rewardRange = in.readString();
        this.category = in.readString();
        this.deadline = in.readString();
        this.website = in.readString();
    }

    public static final Parcelable.Creator<Contest> CREATOR = new Parcelable.Creator<Contest>() {
        @Override
        public Contest createFromParcel(Parcel source) {
            return new Contest(source);
        }

        @Override
        public Contest[] newArray(int size) {
            return new Contest[size];
        }
    };
}
