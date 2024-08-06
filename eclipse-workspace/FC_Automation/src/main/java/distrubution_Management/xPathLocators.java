package distrubution_Management;

public class xPathLocators {
    public static final String distributor = "//li[@id='Distributor']";
    public static final String Adddistributor = "//li[@id='Distributor01']";
    public static final String DistributorName = "//input[@id='name']";
    public static final String ReportOrderSeq = "//input[@id='reportOrderSeqNo']";
    public static final String Nickname = "//input[@id='nickname']";
    public static final String EffectiveDay = "//*[@name='effectiveDay']";
    public static final String priceVerificationEffectiveDay = "//*[@name='priceVerificationEffectiveDay']";
    public static final String SupportSpecialist = "//select[@name='fieldRep']";
    public static final String ProcurementAnalyst = "//select[@name='pricingAnalyst']";
    public static final String Active = "//*[@id='active']";
    public static final String StartDate = "//input[@name='startDate']";
    public static final String BepId = "//*[@id='bepId']";
    public static final String PaId = "//*[@id='paDistributorId']";
    public static final String vendorCode = "//*[@id='vendorCode']";
    public static final String UsesUnitOfMeasure = "//input[@id='usesUnitOfMeasure']";
    public static final String AllowSundayDelivery = "//input[@id='allowSundayDelivery']";
    public static final String AnableNewDashboard = "//input[@id='enableNewDashboard']";
    public static final String Next = "//p-button[@class='p-element green']";
    
    
    public static final String MembershipLevel = "//*[@name='membershipLevels']";
    public static final String Address1 = "//*[@id='street1']";
    public static final String Address2 = "//*[@id='street2']";
    public static final String City = "//*[@id='city']";
    public static final String State = "//*[@name='state']";
    public static final String Zip = "//*[@id='zip']";
    public static final String Country = "//select[@name='country']";
    public static final String Phone = "//p-inputmask[@formcontrolname='phoneNo']//input";	
    public static final String Fax = "//p-inputmask[@formcontrolname='faxNo']//input";	
    public static final String Email = "//*[@id='email']";
    public static final String Website = "//*[@id='website']";
    public static final String Affiliation = "//*[@id='affiliation']";
    public static final String FileSelect = "//span[@class='btn btn-default btn-file']";
    public static final String File = "//input[@type='file']";  
    public static final String SapratorValue = "//select[@id='separatorValue']";
    public static final String NextInStep2 = "//p-button[@icon='pi pi-angle-right']";
    
    public static final String SearchShipper = "//input[@placeholder='Search Shipper']";
    public static final String SelectShipper = "(//li[@role='option'])[1]";
    public static final String AddToSelected = "//button[@icon='pi pi-angle-right']";
//    public static final String NextInStep3 = "//p-button[@icon='pi pi-angle-right']/button[@type='button']";
    public static final String NextInStep3 = "(//div[@class='p-card-footer']//button)[3]";
    
    public static final String ExportingInvoices = "//input[@id='exportInvoice']";
    public static final String InvoiceUploadFtpPath  = "(//input[@type='text'])[2]";
    public static final String InvoiceUpload  = "(//i[@class='fa fa-folder ng-star-inserted'])[1]";
    public static final String Acknowledgment  = "//select[@name='ackFileType']";
    public static final String SecondaryInvoiceUploadFTPPath  = "//*[@id='secondaryInvoicePathCheck']";
    public static final String SelectFromList  = "(//i[@class='fa fa-folder ng-star-inserted'])[32]";
    public static final String CentralBillingPathCheck  = "(//i[@aria-hidden='true'])[81]";
    public static final String NextInStep4 = "(//button[@type='button'])[5]";


    public static final String OrderWritePath = "(//select[@name='orderWritePath'])[1]";
    public static final String OrderCutoffTime = "(//select[@name='orderCutoffTime'])[1]";
    public static final String CopyCostFileFrom = "//select[@name='costWritePath']";
    public static final String PriceWritePath = "//select[@name='priceWritePath']";
    public static final String DataTransportProtocol = "//select[@name='preferredTransportProtocol']";
    public static final String DataTransportFormat = "//select[@name='preferredTransportFormats']";
    public static final String InProductionMode = "//input[@id='inProductionMode']";
    public static final String EdiPricingFormat = "//select[@name='ediPricingFormat']";
    public static final String AnId = "//input[@id='anId']";
    public static final String TransportId = "//input[@id='transportId']";
    public static final String EdiInterchangeQualifier = "//select[@name='ediInterchangeQualifier']";
    public static final String UsesPOLineReference = "//input[@id='usesPOLineRef']";
    public static final String ExportFtpId = "//select[@name='exportFtpId']";
    public static final String TransportAddress = "//input[@id='transportAddress']";
    public static final String TransportPassword = "//input[@id='transportPassword']";
    public static final String EdiInterchangeId = "//input[@id='ediInterchangeId']";
    public static final String NextInStep5 = "(//p-button[@icon='pi pi-angle-right'])[1]";


    public static final String BlueBookScore = "//*[@id='blueBookScore']";
    public static final String BlueBookScoreRating = "//*[@id='blueBookScoreRating']";
    public static final String FcScore = "//*[@id='fcScore']";
    public static final String BlueBookScoreExplanation = "//*[@id='//*[@id='blueBookScoreExplanation']']";
    public static final String FcScoreExplanation = "//*[@id='//*[@id='fcScoreExplanation']']";
    public static final String Submit = "//*[@label='Submit']//button";

}
