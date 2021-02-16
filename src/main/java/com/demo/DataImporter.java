package com.demo;

import com.demo.domain.Extra;
import com.demo.domain.Hotel;
import com.demo.domain.Room;
import com.demo.domain.RoomType;
import com.demo.domain.location.Address;
import com.demo.domain.location.Postcode;
import com.demo.domain.location.State;
import com.demo.persistance.HotelRepository;
import com.demo.reservation.ExtraRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalTime;

@Component
@Profile({"!test", "!integration"})
public class DataImporter {
    private HotelRepository hotelRepository;
    private ExtraRepository extraRepository;

    public DataImporter(HotelRepository hotelRepository, ExtraRepository extraRepository) {
        this.hotelRepository = hotelRepository;
        this.extraRepository = extraRepository;
    }

    @Bean
    public CommandLineRunner insertTestData() {
        return args -> {
            // For simplicity every hotel will have the same extras.
            System.out.println("-------------------CommandLineRunner, insserting sample data");
            // basic
            extraRepository.save(new Extra("Foxtel", new BigDecimal("1.20"), Extra.Type.Basic, Extra.Category.General));
            extraRepository.save(new Extra("Unlimited Internet", new BigDecimal("2.00"), Extra.Type.Basic, Extra.Category.General));
            extraRepository.save(new Extra("Laundry", new BigDecimal("2.50"), Extra.Type.Basic, Extra.Category.General));
            extraRepository.save(new Extra("Upgraded mini bar", new BigDecimal("12.00"), Extra.Type.Basic, Extra.Category.General));

            extraRepository.save(new Extra("Breakfast", new BigDecimal("2.00"), Extra.Type.Basic, Extra.Category.Food));
            extraRepository.save(new Extra("Lunch", new BigDecimal("4.00"), Extra.Type.Basic, Extra.Category.Food));
            extraRepository.save(new Extra("Dinner", new BigDecimal("5.60"), Extra.Type.Basic, Extra.Category.Food));

            // premium
            extraRepository.save(new Extra("Foxtel", new BigDecimal("0.20"), Extra.Type.Premium, Extra.Category.General));
            extraRepository.save(new Extra("Upgraded mini bar", new BigDecimal("1.50"), Extra.Type.Premium, Extra.Category.General));
            extraRepository.save(new Extra("Massage", new BigDecimal("6.00"), Extra.Type.Premium, Extra.Category.General));

            extraRepository.save(new Extra("Breakfast", new BigDecimal("1.50"), Extra.Type.Premium, Extra.Category.Food));
            extraRepository.save(new Extra("Lunch", new BigDecimal("3.20"), Extra.Type.Premium, Extra.Category.Food));
            extraRepository.save(new Extra("Dinner", new BigDecimal("5.00"), Extra.Type.Premium, Extra.Category.Food));

            createHotel1();
            createHotel2();
            createHotel3();
            createHotel4();
            createHotel5();
            createHotel6();
        };
    }

    private void createHotel1() {
        LocalTime earliestCheckInTime = LocalTime.of(9, 0);
        LocalTime latestCheckInTime = LocalTime.of(20, 0);
        LocalTime earliestCheckOutTime = LocalTime.of(12, 0);
        LocalTime latestCheckOutTime = LocalTime.of(14, 0);
        BigDecimal lateCheckoutFee = BigDecimal.valueOf(45.60);

        Address address = new Address("The Royal Grand Hotel", "Tubman Blvd", null,
                State.MT, "Monrovia", new Postcode("3000"));

        Hotel grandHotel = new Hotel("The Royal Grand Hotel", address, 4, "https://www.tripadvisor.co.za/Hotel_" +
                "Review-g293805-d637775-Reviews-Royal_Grand_Hotel-Monrovia_Montserrado_County.html",
                earliestCheckInTime,
                latestCheckInTime,
                earliestCheckOutTime,
                latestCheckOutTime,
                lateCheckoutFee);

        Room room1 = new Room("G1", RoomType.Economy, 1, BigDecimal.valueOf(65.12));
        Room room2 = new Room("G2", RoomType.Business, 2, BigDecimal.valueOf(105.45));
        Room room3 = new Room("G3", RoomType.Luxury, 4, BigDecimal.valueOf(205.66));
        Room room4 = new Room("G4", RoomType.Economy, 2, BigDecimal.valueOf(35.40));

        grandHotel.addRoom(room1);
        grandHotel.addRoom(room2);
        grandHotel.addRoom(room3);
        grandHotel.addRoom(room4);

        hotelRepository.save(grandHotel);
    }

    private void createHotel2() {
        LocalTime earliestCheckInTime = LocalTime.of(8, 0);
        LocalTime latestCheckInTime = LocalTime.of(19, 0);
        LocalTime earliestCheckOutTime = LocalTime.of(13, 0);
        LocalTime latestCheckOutTime = LocalTime.of(15, 0);
        BigDecimal lateCheckoutFee = BigDecimal.valueOf(29.40);

        Address address2 = new Address("The Farmington Hotel", "RIA Road", null,
                State.GB, "Buchanna", new Postcode("3150"));

        Hotel hotel = new Hotel("The Farmington Hotel", address2, 3, "https://www.tripadvisor.co.za/Hotel_Review-g681270-d12593812-Reviews-The_Farmington_Hotel-Harbel_Margibi_County.html",
                earliestCheckInTime,
                latestCheckInTime,
                earliestCheckOutTime,
                latestCheckOutTime,
                lateCheckoutFee);

        Room room1 = new Room("H1", RoomType.Economy, 5, BigDecimal.valueOf(85.12));
        Room room2 = new Room("H2", RoomType.Business, 2, BigDecimal.valueOf(105.45));
        Room room3 = new Room("H3", RoomType.Luxury, 4, BigDecimal.valueOf(205.66));
        Room room4 = new Room("H4", RoomType.Economy, 2, BigDecimal.valueOf(35.40));

        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);

        hotelRepository.save(hotel);
    }

    private void createHotel3() {
        LocalTime earliestCheckInTime = LocalTime.of(9, 0);
        LocalTime latestCheckInTime = LocalTime.of(20, 0);
        LocalTime earliestCheckOutTime = LocalTime.of(12, 0);
        LocalTime latestCheckOutTime = LocalTime.of(14, 0);
        BigDecimal lateCheckoutFee = BigDecimal.valueOf(45.60);

        Address address = new Address("Cevello Blanca", "2 smith street", null,
                State.MT, "Carlton", new Postcode("3053"));

        Hotel hotel = new Hotel("Cevello Blanca", address, 5, "cevellohotel.com.au",
                earliestCheckInTime,
                latestCheckInTime,
                earliestCheckOutTime,
                latestCheckOutTime,
                lateCheckoutFee);

        Room room1 = new Room("C1", RoomType.Economy, 4, BigDecimal.valueOf(65.12));
        Room room2 = new Room("C2", RoomType.Business, 4, BigDecimal.valueOf(105.45));
        Room room3 = new Room("C3", RoomType.Luxury, 4, BigDecimal.valueOf(205.66));
        Room room4 = new Room("C4", RoomType.Economy, 1, BigDecimal.valueOf(35.40));

        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);

        hotelRepository.save(hotel);
    }

    private void createHotel4() {
        LocalTime earliestCheckInTime = LocalTime.of(9, 0);
        LocalTime latestCheckInTime = LocalTime.of(20, 0);
        LocalTime earliestCheckOutTime = LocalTime.of(12, 0);
        LocalTime latestCheckOutTime = LocalTime.of(14, 0);
        BigDecimal lateCheckoutFee = BigDecimal.valueOf(45.60);

        Address address = new Address("Bravo", "7 apple avenue", null,
                State.MT, "Docklands", new Postcode("3008"));

        Hotel hotel = new Hotel("Bravo", address, 2, "bravoohotel.com.au",
                earliestCheckInTime,
                latestCheckInTime,
                earliestCheckOutTime,
                latestCheckOutTime,
                lateCheckoutFee);

        Room room1 = new Room("B1", RoomType.Economy, 4, BigDecimal.valueOf(35.12));
        Room room2 = new Room("B2", RoomType.Business, 5, BigDecimal.valueOf(115.35));
        Room room3 = new Room("B3", RoomType.Luxury, 4, BigDecimal.valueOf(215.36));
        Room room4 = new Room("B4", RoomType.Economy, 2, BigDecimal.valueOf(135.40));

        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);

        hotelRepository.save(hotel);
    }

    private void createHotel5() {
        LocalTime earliestCheckInTime = LocalTime.of(9, 0);
        LocalTime latestCheckInTime = LocalTime.of(20, 0);
        LocalTime earliestCheckOutTime = LocalTime.of(12, 0);
        LocalTime latestCheckOutTime = LocalTime.of(14, 0);
        BigDecimal lateCheckoutFee = BigDecimal.valueOf(45.60);

        Address address = new Address("Hilton Garden Inn", "RIA Road", null,
                State.GB, "Buchanna", new Postcode("3000"));

        Hotel hotel = new Hotel("Hilton Garden Inn", address, 4, "https://h.priceline.com/hotel/cr/hilton-garden-inn" +
                "-liberia-airport.en-gb.html?aid=826590;label=liberia-2pc3NNfoS1T7qc_ztM7AVAS79423435681%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-8688083941%3Alp1028682%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YZVcNNsENnH0_Jxt6fWoC48;sid=0e550e508f1c5a8e11f113a83c26aa28",
                earliestCheckInTime,
                latestCheckInTime,
                earliestCheckOutTime,
                latestCheckOutTime,
                lateCheckoutFee);

        Room room1 = new Room("Z1", RoomType.Economy, 4, BigDecimal.valueOf(35.12));
        Room room2 = new Room("Z2", RoomType.Economy, 5, BigDecimal.valueOf(115.35));
        Room room3 = new Room("Z3", RoomType.Luxury, 4, BigDecimal.valueOf(215.36));
        Room room4 = new Room("Z4", RoomType.Economy, 2, BigDecimal.valueOf(135.40));

        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);

        hotelRepository.save(hotel);
    }

    private void createHotel6() {
        LocalTime earliestCheckInTime = LocalTime.of(9, 0);
        LocalTime latestCheckInTime = LocalTime.of(20, 0);
        LocalTime earliestCheckOutTime = LocalTime.of(12, 0);
        LocalTime latestCheckOutTime = LocalTime.of(14, 0);
        BigDecimal lateCheckoutFee = BigDecimal.valueOf(45.60);

        Address address = new Address("Palm Spring Resort", "Tubman Blvd", null,
                State.MT, "Tubman Blvd", new Postcode("3000"));

        Hotel hotel = new Hotel("Palm Spring Resort", address, 4, "http://www.liberiapalmspring.com/",
                earliestCheckInTime,
                latestCheckInTime,
                earliestCheckOutTime,
                latestCheckOutTime,
                lateCheckoutFee);

        Room room1 = new Room("X1", RoomType.Economy, 4, BigDecimal.valueOf(13.12));
        Room room2 = new Room("X2", RoomType.Economy, 5, BigDecimal.valueOf(94.35));
        Room room3 = new Room("X3", RoomType.Luxury, 4, BigDecimal.valueOf(193.16));
        Room room4 = new Room("X4", RoomType.Economy, 2, BigDecimal.valueOf(19.40));

        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);

        hotelRepository.save(hotel);
    }
}
