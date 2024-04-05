package za.ac.iie.st10444988.myapplication
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val compareButton: Button = findViewById(R.id.compareButton)
        val clearButton: Button = findViewById(R.id.clearButton)
        val ageEditText: EditText = findViewById(R.id.ageEditText)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        // Set up onClickListener for compareButton
        compareButton.setOnClickListener {
            val userInput: String = ageEditText.text.toString().trim()

            if (userInput.isEmpty()) {
                resultTextView.text = "Please enter a valid age – it must be a whole number without any decimals or text."
            } else {
                val userAge: Int? = userInput.toIntOrNull()

                if (userAge == null) {
                    resultTextView.text = "Please enter a valid age – it must be a whole number without any decimals or text."
                } else {
                    if (userAge < 20 || userAge > 100) {
                        resultTextView.text = "Please enter an age between 20 and 100."
                        ageEditText.text.clear()
                    } else {
                        val result: String = when (userAge) {
                            36 -> "Nelson Mandela, known and loved around the world for his commitment to peace, negotiation, and reconciliation, was South Africa's first democratically elected president (1994-1999). Mandela was an anti-apartheid revolutionary and political leader, as well as a philanthropist with an abiding love for children."
                            96 -> "Nelson Mandela, known and loved around the world for his commitment to peace, negotiation, and reconciliation, was South Africa's first democratically elected president (1994-1999). Mandela was an anti-apartheid revolutionary and political leader, as well as a philanthropist with an abiding love for children."
                            39 -> "Martin Luther King, Jr., is known for his contributions to the American civil rights movement in the 1960s. His most famous work is his 'I Have a Dream' speech, delivered in 1963, in which he spoke of his dream of a United States that is void of segregation and racism."
                            84 -> "Isaac Newton formulated laws of motion and gravitation. These laws are mathematical formulas that explain how objects move when a force acts on them. Newton published his most famous book, Principia, in 1687 while he was a mathematics professor at Trinity College, Cambridge."
                            52 -> "William Shakespeare is widely regarded as the greatest writer in the English language and the world's greatest dramatist. He is often called England's national poet and the 'Bard of Avon'."
                            55 -> "Louisa May Alcott is most famous for her novel Little Women (1868–69), an autobiographical text about a cheery family of modest means. She also submitted work regularly to The Atlantic Monthly and published several short stories and other novels for youth, but none were as successful as Little Women."
                            88 -> "Francis Crick was one of Britain's great scientists. He is best known for his work with James Watson which led to the identification of the structure of DNA in 1953."
                            62 -> "Carl Sagan was an American astronomer, cosmologist, astrophysicist, astrobiologist, author, science popularizer, and science communicator in astronomy and other natural sciences."
                            46 -> "John F. Kennedy was the 35th president of the United States (1961-1963). He was the youngest man ever elected to the presidency, succeeding the man who, at the time, was the oldest. He symbolized—as he well realized—a new generation and its coming-of-age."
                            75 -> "Francis Drake was an English sea captain, privateer, navigator, slaver, and politician of the Elizabethan era."
                            else -> "Nobody known to me died at this age."
                        }
                        // Display the result
                        resultTextView.text = result
                    }
                }
            }
        }

        // Set up onClickListener for clearButton
        clearButton.setOnClickListener {
            ageEditText.text.clear()
            resultTextView.text = ""
        }
    }
}


