package com.grupo4.eflete.Repositories;


import com.grupo4.eflete.Model.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvioRepository extends JpaRepository<Envio, Long> {


}
