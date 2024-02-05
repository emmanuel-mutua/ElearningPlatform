package com.emmutua.elearningplatform.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@Polymorphism(type = PolymorphismType.EXPLICIT) //To prevent getting the video when the super class is called //Solve poly-morphic queries issue
//@PrimaryKeyJoinColumn(name = "video_id") - for joined
//@DiscriminatorValue("V")
public class Video extends Resources{
    private int videoLength;
}
