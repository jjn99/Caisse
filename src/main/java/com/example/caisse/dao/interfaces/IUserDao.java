package com.example.caisse.dao.interfaces;

import com.example.caisse.entities.Gestionnaire;
import lombok.NonNull;

public interface IUserDao {
   public Gestionnaire findByLogin(@NonNull String login);
}
