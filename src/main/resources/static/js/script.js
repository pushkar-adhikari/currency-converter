	function getRate() {
		var rateId = document.getElementById("selectCurrency").value;
		var httpRequest = new XMLHttpRequest();
		var URL = "value?currency=" + rateId;
		httpRequest.onreadystatechange = function() {
			if (httpRequest.readyState == 4 && httpRequest.status == 200) {
				document.getElementById("rate").value = httpRequest.responseText;
				if (document.getElementById("amount").value != "")
					fnCalculate();
			}
		};
		httpRequest.open("GET", URL, true);
		httpRequest.send(null);
	}

	function calculate() {
		var rate = document.getElementById("rate").value;
		if (rate == "") {
			alert("Please Select Conversion Currency");
			document.getElementById("rate").value = "";
		} else {
			var amount = document.getElementById("amount").value;
			var result = amount * rate;
			document.getElementById("result").value = result;
		}
	}