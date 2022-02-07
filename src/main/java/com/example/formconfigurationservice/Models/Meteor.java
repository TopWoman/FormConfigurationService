//package com.example.formconfigurationservice.Models;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.mongodb.config.EnableMongoAuditing;
//import org.springframework.data.mongodb.core.mapping.Field;
//
//import java.util.Date;
//@NoArgsConstructor
////@JsonFormat
////@EnableMongoAuditing
//public class Meteor {
//
//    @Id
//    @JsonFormat
////    @GeneratedValue(strategy = GenerationType.AUTO)
//    private String id;
//
////    public String getId() {
////        return id;
////    }
////    public void setId(String id) {
////        this.id = id;
////    }
//
//    @JsonFormat
//    private String idRequest;
//
//    @JsonFormat
//    private Integer priority;
//
////    @Field(name = "64")
//    @JsonFormat
//    private String name;
//
////    @Field(name = "min_angle")
//    @JsonFormat
//    private Float minAngle;
//
////    @Field(name = "max_angle")
//    @JsonFormat
//    private Float maxAngle;
//
////    @Field (name = "min_azimuth")
//    @JsonFormat
//    private Float minAzimuth;
//
////    @Field(name = "max_azimuth")
//    @JsonFormat
//    private Float maxAzimuth;
//
//    @JsonFormat
////    @Field(name = "max_cloudiness")
//    private Integer maxCloudiness;
//
//    @JsonFormat
////    @Field(name = "min_sun")
//    private Float minSun;
//
//    @JsonFormat
////    @Field(name = "max_sun")
//    private Float maxSun;
//
//    @JsonFormat
////    @Field(name = "min_azimuth_sun")
//    private Float minAzimuthSun;
//
//    @JsonFormat
////    @Field(name = "max_azimuth_sun")
//    private Float maxAzimuthSun;
//
////    @Field(name = "begin_shooting")
////    @LastModifiedDate
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private Date beginShooting;
//
////    @Field(name = "end_shooting")
////    @LastModifiedDate
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private Date endShooting;
//
//    @JsonFormat
////    @Field(name = "period_shooting")
//    private Integer periodShooting;
//
//    @JsonFormat
////    @Field(name = "id_spatial_ref_sys")
//    private Integer idSpatialRefSys;
//
////    @Field(name = "id_format")
//    @JsonFormat
//    private int idFormat;
//
//    @JsonFormat
////    @Field(name = "region_type")
//    private Integer regionType;
//
//    @JsonFormat
////    @Field(name = "bits_per_pixel")
//    private Integer bitsPerPixel;
//    @JsonFormat
////    @Field(name = "max_file_size")
//    private Long maxFileSize;
//
////    @LastModifiedDate
////    @JsonDeserialize()
//    @JsonFormat
//    private Date corrected = new Date();
//
////    @LastModifiedDate
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    private Date canceled;
//
//    @JsonFormat
//    private String comment;
//
//    @JsonFormat
////    @Field(name = "id_media")
//    private Integer idMedia;
//
//    @JsonFormat
////    @Field(name = "id_delivery_method")
//    private Integer idDeliveryMethod;
//
//    @JsonFormat
////    @Field(name = "is_stereo")
//    private Boolean isStereo;
//
//    @JsonFormat
////    @Field(name = "shooting_type")
//    private Integer shootingType;
//
//    @JsonFormat
////    @Field(name = "way_direction")
//    private Integer wayDirection;
//
//    @JsonFormat
////    @Field(name = "polarization")
//    private Integer polarization;
//
//    @JsonFormat
////    @Field(name = "id_surface_type")
//    private Integer idSurfaceType;
//
//    @JsonFormat
////    @Field(name = "overlap")
//    private Float overlap;
//
//    @JsonFormat
////    @Field(name = "minimal_coverage_percent")
//    private Integer minimalCoveragePercent = 100;
//
//}
