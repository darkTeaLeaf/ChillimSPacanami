package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class AdvertisementService {

    private final AdvertisementRepository advertisementRepository;

    public AdvertisementService(AdvertisementRepository advertisementRepository){
        this.advertisementRepository = advertisementRepository;
    }

    public void add(AdvertisementModel advertisement){
        advertisementRepository.save(advertisement);
    }

    public void deleteById(AdvertisementModel advertisement){
        advertisementRepository.deleteById(advertisement.id);
    }

    public void update(AdvertisementModel advertisement){
        advertisementRepository.save(advertisement);
    }

    public AdvertisementModel getAdvertisementById(long advertisementid){
        return advertisementRepository.findById(advertisementid).get();
    }
}
