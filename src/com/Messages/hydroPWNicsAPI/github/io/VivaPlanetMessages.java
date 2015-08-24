package com.Messages.hydroPWNicsAPI.github.io;

public class VivaPlanetMessages {
	
	
	public VivaPlanetMessages(){
		
	}
	public static void SendPicture (){

	WebRequest photoRequest = WebRequest.Create (

	"https://vivaplanetmobileservicedev.azure-mobile.net/api/hummingbirdblobupload?";);

	photoRequest.Method = "GET";

	photoRequest.Headers.Add(("X-ZUMO-APPLICATION", "CNrRmLkrpkdlQqmfUvbzCadCDxSMaj62");

	PhotoUploadResponse photoResp = null;

	using (var sbPhotoResponseStream = photoRequest.GetResponse ().GetResponseStream ())

	{

	StreamReader sr = new StreamReader (sbPhotoResponseStream);

	string data = sr.ReadToEnd ();

	photoResp = JsonConvert.DeserializeObject<PhotoUploadResponse> (data);

	}

	Console.WriteLine ("Pushing photo to SAS Url: " + photoResp.sasUrl);

	WebRequest putPhotoRequest = WebRequest.Create (photoResp.sasUrl);

	putPhotoRequest.Method = "PUT";

	putPhotoRequest.Headers.Add ("x-ms-blob-type", "BlockBlob");

	FileStream fs = new FileStream(@"C:\Users\Shane\Documents\VivaPlanet\LUKE.PNG", FileMode.Open);

	using (fs)

	using (var reqStream = putPhotoRequest.GetRequestStream ())

	{

	Console.WriteLine ("Writing photo to blob...");

	fs.CopyTo (reqStream);

	}

	using (putPhotoRequest.GetResponse ())

	{

	//response from the service...typically a 201

	Console.WriteLine ("Sucessfully Uploaded Photo to cloud");

	DeviceReport device = new DeviceReport () {

	HasPhoto = true,

	DeviceID = DeviceSerialNumer,

	PhotoUrl = photoResp.sasUrl,

	PhotoId = photoResp.photoId

	};

	NotifyServiceQueue (device, photoResp);

	}

	}
	

}
