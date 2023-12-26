package com.example.demo;




import com.example.demo.entity.Book;
import com.example.demo.repo.bookrepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class MovieapiApplicationTests {



	@Autowired
	private bookrepo bookr;


	@Test
	void contextLoads() {

	}
	@Test
	void insert(){
		Book b=new Book();

		b.setTitle("Harry Potter and the Prisoner of Azkaban");
		// fiction ,fantasy
		b.setCat("fantasy");

    b.setAuthor("J.K. Rowling");
    b.setSummery("""
						
			"Harry Potter and the Prisoner of Azkaban" is the third book in the Harry Potter series by J.K. Rowling. The novel follows the young wizard Harry Potter as he returns for his third year at Hogwarts School of Witchcraft and Wizardry.
			   
			The story begins with Harry discovering that Sirius Black, a dangerous wizard and supporter of the dark wizard Voldemort, has escaped from the wizarding prison of Azkaban. Sirius is believed to be after Harry, and the wizarding world is on high alert. Additionally, Hogwarts is guarded by soul-sucking creatures known as Dementors in an effort to capture Sirius.
			   
			As Harry navigates the challenges of his third year, he learns more about his family's history and the connection between Sirius Black, his parents, and the dark arts. Alongside his friends Ron and Hermione, Harry uncovers the truth behind Sirius Black's actions and the mysterious magical map known as the Marauder's Map.
			   
			The story introduces new magical elements, including the concept of Animagi (wizards who can transform into animals) and the use of Time-Turners to manipulate time. The characters also encounter new creatures, such as Buckbeak the Hippogriff.
			   
			Ultimately, the plot takes a surprising turn as Harry discovers the real threat and the identity of the true enemy. Themes of friendship, loyalty, and the battle between good and evil are woven throughout the narrative.
			   
			"Harry Potter and the Prisoner of Azkaban" is known for its darker tone compared to the earlier books in the series and for its expansion of the Wizarding World's lore. The novel received critical acclaim and contributed to the immense success of the Harry Potter franchise.
			""");
    b.setImg("https://m.media-amazon.com/images/I/51Dfqo6jR5L.jpg");

  bookr.save(b);

System.out.println(bookr.findByCat("fantasy"));

	}




}
