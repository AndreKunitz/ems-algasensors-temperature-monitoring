package com.akunitz.algasensors.temperature.monitoring.domain.repository;

import com.akunitz.algasensors.temperature.monitoring.domain.model.SensorAlert;
import com.akunitz.algasensors.temperature.monitoring.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorAlertRepository extends JpaRepository<SensorAlert, SensorId> {
}
