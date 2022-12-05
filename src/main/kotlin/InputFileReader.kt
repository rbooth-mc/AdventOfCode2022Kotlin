import java.io.BufferedReader
import java.io.File

class InputFileReader(private var fileName: String) {
    fun reader(): BufferedReader {
        return File(fileName).bufferedReader()
    }
}
