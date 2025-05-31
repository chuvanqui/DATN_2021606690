package com.example.quanlypet.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.quanlypet.model.DoctorObj;

import java.util.List;


@Dao
public interface DoctorDao {
    @Insert
    void insert(DoctorObj doctorObj);

    @Query("SELECT * FROM Doctor")
    List<DoctorObj> getAllData();

    @Update
    void edit(DoctorObj doctorObj);

    @Query("SELECT *FROM doctor where id=:id ")
    DoctorObj getIdDoctor(String id);

    // ✅ Xoá theo đối tượng
    @Delete
    void delete(DoctorObj doctorObj);

    // ✅ Tuỳ chọn: Xoá theo id
    @Query("DELETE FROM Doctor WHERE id = :id")
    void deleteById(String id);

}
