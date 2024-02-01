package toDoList.entities.concretes;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor // lombok ile parametreli constructor oluşturur
@NoArgsConstructor  // lombok ile parametresiz constructor oluşturur
@Getter // lombok ile oto getter kodu yazar
@Setter // lombok ile oto setter kodu yazar
@Entity
@Table(name = "tasks")  // Veritabanında "tasks" adında tablo oluşturur
public class Task {
    @Id // Veritabanında PK alanıdır
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Id'yı otomatik artan yapar
    @Column(name = "id") // Tablodaki id kolonunun karşılığı olarak belirttik.
    private int id;
    @Column(name = "name")  // Tablodaki name kolonunun karşılığı olarak belirttik.
    private String name;
//    @Column(name = "description")  // Tablodaki description kolonunun karşılığı olarak belirttik.
//    private String description;
//    @Column(name = "creationDate")  // Tablodaki creationDate kolonunun karşılığı olarak belirttik.
//    private LocalDateTime creationDate; // Task oluşturulma zamanı
//    @Column(name = "dueDate")  // Tablodaki dueDate kolonunun karşılığı olarak belirttik.
//    private LocalDateTime dueDate; // Task tamamlanması gereken zaman




}
