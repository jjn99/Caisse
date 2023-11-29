package com.example.caisse.dao.interfaces;

import com.example.caisse.entities.Gestionnaire;
import lombok.NonNull;

import java.util.List;

public interface IUserDao {
   public Gestionnaire findByLogin(@NonNull String login);

   public List<Gestionnaire> findAll();

   public void save(@NonNull Gestionnaire gestionnaire);

   public void update(@NonNull Gestionnaire gestionnaire);

   public void delete(@NonNull Integer idGestionnaire);
}
