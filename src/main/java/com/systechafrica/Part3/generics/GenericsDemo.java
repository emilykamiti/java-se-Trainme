// package com.systechafrica.Part3.generics;

// public class GenericsDemo {
//     public static void main(String[] args) {

//     }

//     public static void withGenerics() {
//         StorageGenerics<MaizeFloor> storage = new StorageGenerics<>();
//         MaizeFloor floor = new MaizeFloor();
//         MaizeFloor floor2 = new MaizeFloor();
//         MaizeFloor[] maizeFloors = { floor, floor2 };

//         storage.store(maizeFloors);

//         Bag bag = new Bag();
//         Bag bag2 = new Bag();
//         Bag[] bags = { bag, bag2 };

//         StorageGenerics<Bag> bagstorage = new StorageGenerics<>();
//         bagstorage.store(bags);
//         Bag bagStorage = bagstorage.store(bag2);

//     }

//     public static void withoutGenerics() {
//         Storage storage = new Storage();
//         MaizeFloor floor = new MaizeFloor();
//         MaizeFloor floor2 = new MaizeFloor();
//         MaizeFloor[] maizeFloors = { floor, floor2 };

//         storage.store(maizeFloors);

//         Bag bag = new Bag();
//         Bag bag2 = new Bag();
//         Bag[] bags = { bag, bag2 };

//         storage.store(bags);

//     }
// }