package dev.patika.library.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "booborrowing")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_borrowing_id" , columnDefinition = "serial")
    private long id;

    @NotNull
    @Column(name = "borrower_name")
    private long borrowing;

    @NotNull
    @Column(name = "borrower_email")
    private long getBorrowing;

    @NotNull
    @Column(name = "borrowing_date")
    private long borrowingDate;

    @NotNull
    @Column(name = "return_date")
    private long returnDate;



}
