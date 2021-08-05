import com.domain.Car
import com.domain.Employee
import com.services.ISearchService
import com.services.impl.SearchServiceImpl

ISearchService iSearchService = new  SearchServiceImpl()
List<Employee> employeeoList = iSearchService.findAll();
employeeoList.each {println it }

Employee employee = iSearchService.findBySsn(104);
print "Search Result: $employee"

/* Using Groovy Beans */

Car car = new Car(brand: "Ford",owner: "XYZ");
println "Printing car"
println car

