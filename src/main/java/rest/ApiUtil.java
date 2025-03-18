package rest;

import java.util.List;
import java.util.Map;

import io.restassured.response.Response;

public class ApiUtil {

	private static final String BASE_URL = "https://healthapp.yaksha.com/api";

	/**
	 * @Test1 This method creates a new appointment with authorization.
	 * 
	 * @param endpoint - The API endpoint to which the POST request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and appointmentId.
	 */
	public CustomResponse createAppointmentWithAuth(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		Integer appointmentId = 0;

		return new CustomResponse(response, statusCode, status, appointmentId);
	}

	/**
	 * @Test2 This method gets all applicable doctors with authorization.
	 * 
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse getAllApplicableDoctorsWithAuth(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		List<Map<String, Object>> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}

	/**
	 * @Test3 This method cancels an existing appointment with authorization.
	 * 
	 * @param endpoint - The API endpoint to which the PUT request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and resultMessage.
	 */
	public CustomResponse cancelAppointmentWithAuth(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		String resultMessage = null;

		return new CustomResponse(response, statusCode, status, resultMessage);
	}

	/**
	 * @Test4 This method finds if there is any clashing appointment.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and resultMessage.
	 */
	public CustomResponse clashAppointmentWithAuth(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		String resultMessage = null;

		return new CustomResponse(response, statusCode, status, resultMessage);
	}

	/**
	 * @Test5 This method searches for a patient using specified query parameters.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse searchPatientWithAuth(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		List<Map<String, Object>> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}

	/**
	 * @Test6 This method retrieves a list of appointments for a specified performer
	 *        within a given date range.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse bookingListWithAuthInRange(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		List<Map<String, Object>> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}

	/**
	 * @Test7 This method retrieves the complete list of stock details from the
	 *        pharmacy.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse AllStockDetailsWithAuth(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		List<Map<String, Object>> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}

	/**
	 * @Test8 This method retrieves details of the main store in the pharmacy
	 *        settings.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse MainStoreDetailsWithAuth(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		Map<String, Object> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}

	/**
	 * @Test9 This method retrieves a list of pharmacy stores and verifies the
	 *        details of each store.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse PharmacyStoresWithAuth(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		List<Map<String, Object>> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}

	/**
	 * @Test10 This method retrieves and verifies patient consumption details.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse PatientConsumption(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		List<Map<String, Object>> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}

	/**
	 * @Test11 This method activates a pharmacy counter using counter details.
	 *
	 * @param endpoint - The API endpoint to which the PUT request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse ActivatePharmCount(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		Map<String, Object> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}

	/**
	 * @Test12 This method deactivates a pharmacy counter.
	 *
	 * @param endpoint - The API endpoint to which the PUT request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse DeactivatePharmCount(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		Map<String, Object> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}

	/**
	 * @Test13 This method retrieves and verifies the list of appointment applicable
	 *         departments.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse AppointApplicDept(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		List<Map<String, Object>> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}

	/**
	 * @Test14 This method retrieves and verifies the list of currently admitted
	 *         patients.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse admittedPatientData(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		List<Map<String, Object>> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}

	/**
	 * @Test15 This method adds a new currency using the provided data.
	 *
	 * @param endpoint - The API endpoint to which the POST request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse addCurrencyWithAuth(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		Map<String, Object> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}

	/**
	 * @Test16 This method finds if a patient with the requested phone number
	 *         already exists.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse findMatchingPatientWithAuth(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		List<Map<String, Object>> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}

	/**
	 * @Test17 This method lists all registered patients and checks if their patient
	 *         IDs are unique.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse getRegisteredPatientsWithAuth(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		List<Map<String, Object>> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}

	/**
	 * @Test18 This method retrieves and verifies the list of Billing Counters.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - Contains response, statusCode, status and results.
	 */
	public CustomResponse getBillingCountersWithAuth(String endpoint, Object body) {
		Response response = null;

		int statusCode = 0;
		String status = null;
		List<Map<String, Object>> results = null;

		return new CustomResponse(response, statusCode, status, results);
	}
}
