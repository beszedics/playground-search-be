package com.project.playgroundsearch.database.entities;

import javax.persistence.*;

@Entity
@Table(name = "playgrounds")
public class PlaygroundEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "has_swing")
    private Boolean hasSwing;

    @Column(name = "has_slide")
    private Boolean hasSlide;

    @Column(name = "has_carousel")
    private Boolean hasCarousel;

    @Column(name = "has_sandbox")
    private Boolean hasSandbox;

    @Column(name = "has_balancing_bridge")
    private Boolean hasBalancingBridge;

    @Column(name = "has_teeter")
    private Boolean hasTeeter;

    @Column(name = "has_rope_pyramid")
    private Boolean hasRopePyramid;

    @Column(name = "has_squirrel_wheel")
    private Boolean hasSquirrelWheel;

    @Column(name = "has_hanging")
    private Boolean hasHanging;

    @Column(name = "has_obstacle_course")
    private Boolean hasObstacleCourse;

    @Column(name = "has_rest_house")
    private Boolean hasRestHouse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Boolean getHasSwing() {
        return hasSwing;
    }

    public void setHasSwing(Boolean hasSwing) {
        this.hasSwing = hasSwing;
    }

    public Boolean getHasSlide() {
        return hasSlide;
    }

    public void setHasSlide(Boolean hasSlide) {
        this.hasSlide = hasSlide;
    }

    public Boolean getHasCarousel() {
        return hasCarousel;
    }

    public void setHasCarousel(Boolean hasCarousel) {
        this.hasCarousel = hasCarousel;
    }

    public Boolean getHasSandbox() {
        return hasSandbox;
    }

    public void setHasSandbox(Boolean hasSandbox) {
        this.hasSandbox = hasSandbox;
    }

    public Boolean getHasBalancingBridge() {
        return hasBalancingBridge;
    }

    public void setHasBalancingBridge(Boolean hasBalancingBridge) {
        this.hasBalancingBridge = hasBalancingBridge;
    }

    public Boolean getHasTeeter() {
        return hasTeeter;
    }

    public void setHasTeeter(Boolean hasTeeter) {
        this.hasTeeter = hasTeeter;
    }

    public Boolean getHasRopePyramid() {
        return hasRopePyramid;
    }

    public void setHasRopePyramid(Boolean hasRopePyramid) {
        this.hasRopePyramid = hasRopePyramid;
    }

    public Boolean getHasSquirrelWheel() {
        return hasSquirrelWheel;
    }

    public void setHasSquirrelWheel(Boolean hasSquirrelWheel) {
        this.hasSquirrelWheel = hasSquirrelWheel;
    }

    public Boolean getHasHanging() {
        return hasHanging;
    }

    public void setHasHanging(Boolean hasHanging) {
        this.hasHanging = hasHanging;
    }

    public Boolean getHasObstacleCourse() {
        return hasObstacleCourse;
    }

    public void setHasObstacleCourse(Boolean hasObstacleCourse) {
        this.hasObstacleCourse = hasObstacleCourse;
    }

    public Boolean getHasRestHouse() {
        return hasRestHouse;
    }

    public void setHasRestHouse(Boolean hasRestHouse) {
        this.hasRestHouse = hasRestHouse;
    }

    @Override
    public String toString() {
        return "PlaygroundEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", hasSwing=" + hasSwing +
                ", hasSlide=" + hasSlide +
                ", hasCarousel=" + hasCarousel +
                ", hasSandbox=" + hasSandbox +
                ", hasBalancingBridge=" + hasBalancingBridge +
                ", hasTeeter=" + hasTeeter +
                ", hasRopePyramid=" + hasRopePyramid +
                ", hasSquirrelWheel=" + hasSquirrelWheel +
                ", hasHanging=" + hasHanging +
                ", hasObstacleCourse=" + hasObstacleCourse +
                ", hasRestHouse=" + hasRestHouse +
                '}';
    }
}
