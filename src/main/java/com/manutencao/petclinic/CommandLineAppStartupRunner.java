package com.manutencao.petclinic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.manutencao.petclinic.entity.Appointment;
import com.manutencao.petclinic.entity.MedicalRecord;
import com.manutencao.petclinic.entity.Notification;
import com.manutencao.petclinic.entity.Pet;
import com.manutencao.petclinic.entity.User;
import com.manutencao.petclinic.repository.IAppoitmentRepository;
import com.manutencao.petclinic.repository.IMedicalRecordRepository;
import com.manutencao.petclinic.repository.INotificationRepository;
import com.manutencao.petclinic.repository.IPetRepository;
import com.manutencao.petclinic.repository.IUserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

  private final IAppoitmentRepository appoitmentRepository;
  private final IMedicalRecordRepository medicalRecordRepository;
  private final INotificationRepository notificationRepository;
  private final IPetRepository petRepository;
  private final IUserRepository userRepository;

  DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  @Override
  public void run(String... args) throws Exception {
    User user = User.builder().fullName("Marcelo Alves").email("marcelo@gmail.com").cellphone("51992345356").build();
    User vet = User.builder().fullName("Marina Silva").email("marina@gmail.com").cellphone("51991348756").build();
    userRepository.save(user);
    userRepository.save(vet);
    Pet pet = Pet.builder().breed("Poodle").name("Pipoca").birthday(buildLocalDate("12/06/2006")).owner(user).photoUrl("https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcRxfqSjBuNplIuvG_nvuHF9qkZ2F6cWhhl55GqxZ_kZNPJ9KsaerGhfnyinsDNuUrz7I2AiwvitRqgHflg").build();
    Pet pet1 = Pet.builder().breed("Bulldog").name("Gordo").birthday(buildLocalDate("25/01/2012")).owner(user).photoUrl("https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcS-wkdokbCCcNAyz2jYQuYJBaXSzSuvQdYWLgr8ukQMirHLZEL51W4U3GsQVh_X1hmRVVRsWRXkVMIB1rs").build();
    Pet pet2 = Pet.builder().breed("German Shepherd").name("Firula").birthday(buildLocalDate("01/03/2015")).owner(user).photoUrl("https://encrypted-tbn1.gstatic.com/licensed-image?q=tbn:ANd9GcTo7Ip1_kUvkTHPE7QSLlCr_-hYsl8ts_HQ997mQ14iiD3mbds6IZCz_kC_f2VAxM4bsgvbaegk70M3hXQ").build();
    Pet pet3 = Pet.builder().breed("Border Collie").name("Vader").birthday(buildLocalDate("17/09/2020")).owner(user).photoUrl("https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcTo_W61NHQrw6wyYYSFT4ClvHNpqFieCbaP0LHiWnPS-_qq8nxpSLpJY-Otuat6vA5S4jNgEvR9P0mFFE8").build();
    petRepository.save(pet);
    petRepository.save(pet1);
    petRepository.save(pet2);
    petRepository.save(pet3);
    Appointment appointment = Appointment.builder().date(buildLocalDate("22/03/2023")).petId(pet).veterinarian(vet).build();
    appoitmentRepository.save(appointment);
    MedicalRecord medicalRecord = MedicalRecord.builder().date(buildLocalDate("22/03/2023")).petId(pet).veterinarian(vet).record("We took an X ray of Pipoca, which showed a dark mass on her stomach we will need to investigate further.").build();
    medicalRecordRepository.save(medicalRecord);
    Notification notification = Notification.builder().notification("You have an appointment tomorrow.").viewed(false).user(user).build();
    notificationRepository.save(notification);
  }

  private LocalDate buildLocalDate(String date){
    return LocalDate.parse(date, dateTimeFormatter);
  }
  
}
