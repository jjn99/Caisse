package com.example.caisse.dao.interfaces;

import com.example.caisse.entities.Gestionnaire;
import lombok.NonNull;

import java.util.List;

public interface IUserDao {
   public Gestionnaire findByLogin(@NonNull String login);

   public List<Gestionnaire> findAll();

   public boolean save(@NonNull Gestionnaire gestionnaire);

   public boolean update(@NonNull Gestionnaire gestionnaire);

   public boolean delete(@NonNull Integer Id);
   public boolean deleteByLogin(@NonNull String login);
}
