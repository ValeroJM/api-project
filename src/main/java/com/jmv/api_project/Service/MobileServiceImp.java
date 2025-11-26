package com.jmv.api_project.Service;

import com.jmv.api_project.Model.Entity.MobileEntity;
import com.jmv.api_project.Model.Response.MobileResponse;
import com.jmv.api_project.Repository.MobileEntityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class MobileServiceImp implements MobileService{
    @Autowired
    MobileEntityRepository mobileEntityRepository;

    public String setAndUpdateMobile(MobileResponse mobileResponse){
        MobileEntity mobileEntity = new MobileEntity();

        if (mobileResponse.getMobileId() != null){
            mobileEntity.setMobileId(mobileResponse.getMobileId());
        }

        if (mobileResponse.getName() != null){
            mobileEntity.setName(mobileResponse.getName());
        }

        if (mobileResponse.getMobileData() != null){
            if (mobileResponse.getMobileData().getColor() != null){
                mobileEntity.setColor(mobileResponse.getMobileData().getColor());
            }
            if (mobileResponse.getMobileData().getStrap_colour() != null){
                mobileEntity.setStrap_colour(mobileResponse.getMobileData().getStrap_colour());
            }
            if (mobileResponse.getMobileData().getCapacity() != null){
                mobileEntity.setCapacity(mobileResponse.getMobileData().getCapacity());
            }
            if (mobileResponse.getMobileData().getCapacityGB() != null){
                mobileEntity.setCapacity(mobileResponse.getMobileData().getCapacityGB());
            }
            if (mobileResponse.getMobileData().getPrice() != null){
                mobileEntity.setPrice(mobileResponse.getMobileData().getPrice());
            }
            if (mobileResponse.getMobileData().getGeneration() != null){
                mobileEntity.setGeneration(mobileResponse.getMobileData().getGeneration());
            }
            if (mobileResponse.getMobileData().getYear() != null){
                mobileEntity.setYear(mobileResponse.getMobileData().getYear());
            }
            if (mobileResponse.getMobileData().getCPU_model() != null){
                mobileEntity.setCPU_model(mobileResponse.getMobileData().getCPU_model());
            }
            if (mobileResponse.getMobileData().getHard_disk_size() != null){
                mobileEntity.setHard_disk_size(mobileResponse.getMobileData().getHard_disk_size());
            }
            if (mobileResponse.getMobileData().getCase_size() != null){
                mobileEntity.setCase_size(mobileResponse.getMobileData().getCase_size());
            }
            if (mobileResponse.getMobileData().getDescription() != null){
                mobileEntity.setDescription(mobileResponse.getMobileData().getDescription());
            }
            if (mobileResponse.getMobileData().getScreenSize() != null){
                mobileEntity.setScreenSize(mobileResponse.getMobileData().getScreenSize());
            }
        }

        if (mobileEntityRepository.findByName(mobileEntity.getName()).isPresent()){
            MobileEntity existingEntityRecord = new MobileEntity();
            existingEntityRecord = mobileEntityRepository.findByName(mobileEntity.getName()).get();
        }

        return "Mobile info: " + mobileResponse + "was successfully saved ><";
    }
}
