import"./96a5d2ba.js";import{K as e,M as t,L as i,R as s,S as a,u as r,D as n,z as o,v as l,w as c,G as d,H as h,a2 as u,a6 as m,a1 as p,a5 as g,a4 as b,I as v,a3 as _,E as y,x as f,T as C,Y as E,O as S,Z as T,P as k,Q as R,ax as I,f as D,e as $,at as A,ap as x,V as O,N as w,as as X,aw as N}from"./216055dc.js";import{aH as P,bS as q,bT as M}from"./7f3d7ca9.js";import{an as B,L as F,a7 as j,h as L,aV as H,z as V,a8 as G,ac as U,ab as W,ad as K,bj as z,ak as J,i as Y,aZ as Q,J as Z,dk as ee,cQ as te,bn as ie,ds as se,eC as ae,cP as re,W as ne,aD as oe,bF as le}from"./952f98a9.js";import{B as ce}from"./20acd25d.js";import"./7ab2eabf.js";import{B as de}from"./67256d35.js";import{B as he}from"./077d7438.js";import{a as ue}from"./80b427be.js";import{a as me}from"./dae2322c.js";import{B as pe,a as ge,b as be,c as ve,d as _e}from"./c56961f6.js";import{F as ye}from"./c2002ac1.js";import{B as fe,b as Ce}from"./2b04e291.js";import{B as Ee,b as Se}from"./41ed0536.js";import{B as Te,b as ke}from"./84dff06e.js";import{B as Re,b as Ie}from"./dd13577a.js";import{B as De,a as $e,d as Ae,c as xe}from"./ff7f0130.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./f89161ad.js";import"./7d773f57.js";import"./d2484b66.js";import"./4656db6d.js";import"./1aa01966.js";import"./4861c1f7.js";import"./32b24593.js";import"./13014d63.js";import"./7f28d0e7.js";import"./0f94a5c2.js";import"./e5f89cd9.js";import"./5aa1c2be.js";import"./69d7eba8.js";import"./5ccfb5b0.js";import"./e4099866.js";import"./1a79f9f5.js";import"./30ef6f1f.js";import"./854beed0.js";import"./e3d898b2.js";import"./d335c75d.js";import"./f9d0fbbe.js";customElements.define(e.is,e),customElements.define(P.is,P);const Oe={"phone-call":"_makePhoneCall","open-document":"_makeOpenDocument"};class we extends(B(F)){static get is(){return"bbva-controller-chatbot"}static get properties(){return{_clientId:{type:String},_deviceId:{type:String},_isInitialized:{type:Boolean},_navigationId:{type:String},commonNavigations:{type:Object},feedbackConfig:{type:Object},localStorageKeys:{type:Object},voiceConfiguration:{type:Object},headerButtons:{type:Array},openDocumentHeaders:{type:Object},host:{type:String}}}constructor(){super(),this._clientId="",this._deviceId="",this._isInitialized=!1,this._navigationId="",this.commonNavigations={},this.feedbackConfig={},this.localStorageKeys={},this.voiceConfiguration={},this.headerButtons=[],this.openDocumentHeaders={},this.host=""}init(){this._isInitialized?(this._fire("conversation-initialized",!0),this._fire("set-navigation-id",this._navigationId)):(this._manageStorage(),this._isInitialized=!0)}_manageStorage(){this._getFromStorage("history"),this._getFromStorage("modal")}setAppSettings(e){const{contact:{phoneNumberBbvaLine:t}}=e;this._fire("modal-text-phone-number",this.t("digital-butler-chatbot-terms-and-conditions-fourth-subtitle-text-1",{phoneNumber:t}))}manageNavigation({id:e,params:t}){const{event:i,detail:s}=this._parseNavigation(e,t);this._fire(i,s),this._navigationId=e,this._fire("set-navigation-id","")}_parseNavigation(e,t){const{page:i,customEvent:s}=this._getDestination(e),a=this._manageParams(i,t);return{event:we._getNavigationEventName(s,e,a),detail:{...a,...i?{page:i}:{}}}}_getDestination(e){var t;const i=Object.entries(this.commonNavigations).find((t=>{var i;return null===(i=t[1])||void 0===i?void 0:i.globalNavigationIds.find((t=>t===e))}));return{page:null==i?void 0:i[0],customEvent:null==i||null===(t=i[1])||void 0===t?void 0:t.customEvent}}_manageParams(e,t={}){var i,s,a,r,n,o;const l=t,c=null===(i=this.commonNavigations)||void 0===i||null===(s=i[e])||void 0===s?void 0:s.customParams,d=null===(a=this.commonNavigations)||void 0===a||null===(r=a[e])||void 0===r?void 0:r.valueToNumber,h=null===(n=this.commonNavigations)||void 0===n||null===(o=n[e])||void 0===o?void 0:o.parseProductId;return h&&null!=t&&t.productId&&(l[h]=t.productId,delete l.productId),null!=d&&d.length&&d.forEach((e=>{l[e]=Number(l[e])})),{...l,...c?{...c}:{}}}startSpeech({language:e}){this._fire("start-speech",{...this.voiceConfiguration.start,language:e})}stopSpeech(){this._fire("stop-speech",this.voiceConfiguration.stop)}static _getNavigationEventName(e,t,i){return Object.keys(i).length?e||`navigate-to-${t}`:"navigate"}static _getEventTargetPath(e){return e.composedPath&&e.composedPath()||e.path}exitOperative(){this._isInitialized=!1}saveHistoryMessagesToStorage({history:e}){this._saveInStorage({localStorageKey:"history",value:e})}_saveInStorage({localStorageKey:e,value:t}){this._fire("save-in-storage",{key:this.localStorageKeys[e],value:t})}manageActions({id:e,params:t}){const i=Oe[e];this[i]&&this[i](t)}_makePhoneCall({phoneNumber:e}){this._fire("open-call-action",{value:e})}_makeOpenDocument({url:e}){this._fire("open-document-action",{...this.openDocumentHeaders,value:this.host+e})}_getFromStorage(e){var t;const i=null===(t=this.localStorageKeys)||void 0===t?void 0:t[e];i&&this._fire("get-from-storage",{key:i})}getHistoryFromStorageSuccess(e){this._fire("send-history",e)}getHistoryFromStorageError(){this._fire("send-history",{})}getModalStorageSuccess({showModal:e}){e&&this._fire("show-initial-modal",!0)}getModalStorageError(){this._saveInStorage({localStorageKey:"modal",value:{showModal:!1}}),this.openVeil(),this._fire("show-initial-modal",!0)}openVeil(){this._fire("open-veil")}closeVeil(){this._fire("close-veil")}handleHeaderClick({index:e}){var t;const i=null===(t=this.headerButtons[e])||void 0===t?void 0:t.id,s={"btn-close":{event:"exit-feature-header",detail:!0},"btn-secondary":{event:"btn-secondary-click"}};if(we._getEventTargetPath(event).some((e=>e.getAttribute&&"digital-butler-chatbot-main-header"===e.getAttribute("id")))&&s[i]){const{event:e,detail:t}=s[i];this._fire(e,t)}}handleNativeBack(e){const{currentPage:t}=e.value.cancelledNavigation;"digitalButler"===t&&this._fire("handle-native-back",!0)}manageCreateConversation(){this.closeVeil(),this._setFeedbackConfig()}_setFeedbackConfig(){this.feedbackConfig.userId=this._clientId,this.feedbackConfig.authenticationData=`deviceid=${this._deviceId}`,this._fire("set-feedback-config",this.feedbackConfig)}setClientId(e){this._clientId=(null==e?void 0:e.grantingTicketUserId)||e}setDeviceId(e){this._deviceId=(null==e?void 0:e.secondaryUserId)||e}_fire(e,t){this.dispatchEvent(new CustomEvent(`${we.is}-${e}`,{composed:!0,bubbles:!0,detail:t}))}}customElements.define(we.is,we);const Xe=e=>{var t;return j(t=class extends e{constructor(){super(),this.messageData="",this.financialData=[],this.accountsData=[],this.accountSelected={},this.versionCustomerV1="",this.versionDossier="",this.versionPayments="",this.defaultDossiersStatus="",this.dossiersIdentifiers={},this.dossiers=[],this._customer={},this._fullfillmentDocuments={},this.defaultMainTaxResidence={},this.masks={},this.locale="",this.parkingId=""}fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}_cloneObject(e){return JSON.parse(JSON.stringify(e))}_filterAccountById(e){return this.accountsData.flatMap((e=>e.products)).find((t=>t.id===e))}_filterAccountByNumber(e){return this.accountsData.flatMap((e=>e.products)).find((t=>t.number===e))}loadAccountSelected(e,t){return e?this._filterAccountById(e):this._filterAccountByNumber(t)}getTagIds(e){const t=null==e?void 0:e.findIndex((e=>this.userBillInput&&e.billNumber.includes(this.userBillInput)));return{billNumber:e[t].billNumber,agreement:e[t].agreement,tagAlias:e[t].alias}}createRechargeTagDetail(e,t){var i,s,a;const r=null==e||null===(i=e.detail)||void 0===i?void 0:i[0];return{contactId:r.id,name:t.tagAlias,billNumber:r.billNumber,secondary:this._setMask(r.billNumber),currency:"MXN",amount:null===(s=r.billAmounts)||void 0===s||null===(a=s[1])||void 0===a?void 0:a.amountValue,class:"currency-xl balance_amount",text:"pase-tag-card-list-label",image:"001783556"===t.agreement?"images/tagCard/pase.svg":"images/tagCard/televia.svg"}}_setMask(e){return`•${e.substring(e.length-4,e.length)}`}getAccountDetailParking(e){this.parkingId=this.messageData.params.parkingId;const t=e.find((e=>e.id===this.parkingId)),{billNumber:i,alias:s}=t;return{idAccount:this.parkingId,numberComplete:i,title:s,descriptions:[`•${i.slice(-4)}`]}}_computeBirthData(e){var t,i;return{birthDate:null!=e&&null!==(t=e.birthData)&&void 0!==t&&t.birthDate?e.birthData.birthDate:"",unmasked:!1,country:null!=e&&null!==(i=e.birthData)&&void 0!==i&&i.country?e.birthData.country:"",helpIcon:!0}}_formatProperName(e){return e.replace(/#/g,"Ñ").toLowerCase().split(" ").map((e=>"de"===e?e:e.substr(0,1).toUpperCase()+e.substring(1).toLowerCase())).join(" ")}parseCustomer(e){var t,i;const s=e.detail,a={birthData:this._computeBirthData(s),identityDocuments:null!=s&&s.identityDocuments?s.identityDocuments:[],residence:null!=s&&null!==(t=s.taxResidence)&&void 0!==t&&t.country?s.taxResidence.country:{},nationalities:null!=s&&s.nationalities?s.nationalities:[],creationDate:null!=s&&s.creationDate?s.creationDate:"".replace(/[-]/g,"/"),taxResidences:null!=s&&null!==(i=s.taxResidence)&&void 0!==i&&i.nonPresentialResidences?s.taxResidence.nonPresentialResidences:{},gender:s.gender};this._computeCompleteName(a,s),this._customer=a}mapTaxResidence(e,t){const i=Boolean(e.length),s=t.find((e=>{var t;return!(null==e||null===(t=e.documentType)||void 0===t||!t.id)&&e.documentType.id})),a=void 0!==s?s:"",r=i?e[0]:this.defaultMainTaxResidence,n=e.filter(((e,t)=>e&&t>0)),o=Boolean(n.length);this._customer.taxResidence={...i&&{title:o?"glomo-customer-profile-mx-on-mexico-another-countries":"glomo-customer-profile-mx-just-in-mexico"},mainResidence:this._mapMainTaxResidence(a,r),additionalResidences:this._mapNonPresentialTaxResidences(n),userHasRfc:Boolean(a),hasInformedTaxResidences:i,...this._setTaxResidenceStatus(i)}}buildTaxResidencePayload(e){var t,i,s,a;const r=null!==(t=this._customer)&&void 0!==t&&null!==(i=t.taxResidence)&&void 0!==i&&i.additionalResidences?this._customer.taxResidence.additionalResidences:[],n=null!==(s=this._customer)&&void 0!==s&&null!==(a=s.taxResidence)&&void 0!==a&&a.mainResidence?this._customer.taxResidence.mainResidence:{},o=!e||this._validateTaxResidencesModel([n],!1)&&this._validateTaxResidencesModel([...r],!0);if(this.clientId&&o){var l,c,d,h,u,m,p,g,b,v;let e;return e=!(null===(l=this._customer)||void 0===l||null===(c=l.taxResidence)||void 0===c||!c.userHasRfc)&&this._customer.taxResidence.userHasRfc?(null==n?void 0:n.identifierFiscalNumber)??void 0:"",{expedientStatus:null!==(d=this._getDocumentStatus("taxResidence"))&&void 0!==d&&d.status?this._getDocumentStatus("taxResidence").status:void 0,customerData:{firstName:null!==(h=this._customer)&&void 0!==h&&h.firstName?this._customer.firstName:void 0,countryOfBirth:null!==(u=this._customer)&&void 0!==u&&null!==(m=u.birthData)&&void 0!==m&&m.country?this._customer.birthData.country:void 0,nationalities:null!==(p=this._customer)&&void 0!==p&&p.nationalities?this._customer.nationalities:[],countryOfDomicile:null!==(g=this._customer)&&void 0!==g&&g.residence?this._customer.residence:{},rfc:e,email:this.findEmail(this.contactDetailResponse.detail),clientId:this.clientId,customerId:this.customerId},taxResidenceInformation:{mainResidence:n,nonPresentialResidences:r,userHasRfc:null!==(b=this._customer)&&void 0!==b&&null!==(v=b.taxResidence)&&void 0!==v&&v.userHasRfc?this._customer.taxResidence.userHasRfc:void 0}}}return null}_computeCompleteName(e,t){e.firstName=this._formatProperName(null!=t&&t.firstName?t.firstName:""),e.lastName=this._formatProperName(null!=t&&t.lastName?t.lastName:""),e.secondLastName=this._formatProperName(null!=t&&t.secondLastName?t.secondLastName:""),e.completeName=`${e.firstName} ${e.lastName} ${e.secondLastName}`}_validateTaxResidencesModel(e,t){return e.every((e=>Boolean(e.id&&e.name&&(!t||e.identifierFiscalNumber))))}_mapMainTaxResidence(e,t){var i;const s=e?e.documentNumber:(null==t||null===(i=t.identityDocument)||void 0===i?void 0:i.documentNumber)??"";return{...this._createTaxResidenceItem(t),identifierFiscalNumber:s}}_mapNonPresentialTaxResidences(e){return e.length>0?e.map((e=>{var t,i;return{...this._createTaxResidenceItem(e),identifierFiscalNumber:null!=e&&null!==(t=e.taxPayer)&&void 0!==t&&null!==(i=t.identityDocument)&&void 0!==i&&i.documentNumber?e.taxPayer.identityDocument.documentNumber:""}})):[]}_createTaxResidenceItem(e){return{id:e.country.id,name:this._formatProperName(e.country.name)}}_setTaxResidenceStatus(e){const{status:t}=this._getDocumentStatus("taxResidence"),i="C"===t||"R"===t,s="E"===t||"Q"===t,a=this.taxResidenceJustUpdated||!t,r={helpIcon:!0};return"A"!==t||e?Object.assign(r,{editButton:!a,showHide:!0,showIncompleteWarning:i,...i&&{status:{id:t,title:"C"===t?"glomo-customer-profile-confirm":"glomo-customer-profile-rejected",class:"C"===t?"confirm":"rejected"}}}):Object.assign(r,{showIncompleteWarning:!0}),Object.assign(this._fullfillmentDocuments,{taxResidence:a||s}),r}_getDocumentStatus(e){return this.dossiers.find((t=>t.key===e))||{}}parseListContractingDossiers(e){let t=[];if(e&&e.detail){const i=e.detail;t=i.length?i.map((e=>{var t,i,s,a,r,n,o,l;const c=(null==e||null===(t=e.validationDocuments)||void 0===t||null===(i=t[0])||void 0===i||null===(s=i.documentStatus)||void 0===s?void 0:s.operation)??this.defaultDossiersStatus,d=null!=e&&null!==(a=e.validationDocuments)&&void 0!==a&&null!==(r=a[0].documentFamily)&&void 0!==r&&r.id?e.validationDocuments[0].documentFamily.id:"",h=null!==(n=e.validationDocuments)&&void 0!==n&&null!==(o=n[0])&&void 0!==o&&null!==(l=o.validityPeriod)&&void 0!==l&&l.startDate?e.validationDocuments[0].validityPeriod.startDate:"",u=this.dossiersIdentifiers.filter((e=>e.description===d));return{status:c,key:u.length?u[0].key:"",validityPeriodStart:h}})):[],this.dossiers=t}else this.dossiers=t}findEmail(e){const t=e.find((e=>"EMAIL"===e.contact.contactDetailType));return t?t.contact.address:null}sendEmail(){if(null!==this.contactDetailResponse){const e=this._getContactDetailsCustomer(this.contactDetailResponse);this._customer=this._cloneObject(e);const t=this._customer.find((e=>!e.isMobile)),i={customerID:this.customerId,idEmail:null!=t&&t.id?t.id:"",currentEmail:null!=t&&t.value?t.value:"",statusEmail:!(null==t||!t.isValidated)&&t.isValidated,requireEncryptedContactId:!0};this.fireEvent("update-email",i)}}_setMaskData(){this.masks={MXN:{account:"XXXX XXXX XXXX XXXX XXXX XXXX",deposit:"XXXX XXXX XXXX XXXX XXXX XXXX",loan:"XXXX XXXX XXXX XXXX XXXX XXXX",card:"XXXX XXXX XXXX XXXX",clabe:"XXXX XXXX XXXX XXXXXX",phone:"XX XXXX XXXX"},UYU:{card:"XXXX XXXX XXXX XXXX"},ARS:{card:"XXXX XXXX XXXX XXXX"},PEN:{account:"XXXX-XXXX-XXXXXXXXXX",interbankaccountcode:"XXX-XXX-XXXXXXXXXXXX-XX",remittanceaccount:"XXX-X-XXX-XX-XXXXXXXXXX",card:"XXXX XXXX XXXX XXXX",fund:"XXXX-XXXX-XXXXXXXXXXXX",loan:"XXXX-XXXX-XX-XXXXXXXXXX"}},this.contactBaseMap={mobile:{id:"",key:"glomo-customer-profile-mobile",value:"",visibleChars:4,isMobile:!0,unmasked:!1},email:{id:"",isChangeable:!0,key:"glomo-customer-profile-email",value:"",visibleChars:9,isMobile:!1,unmasked:!1}}}_mapCustomerContactsV1(e){return e.map((e=>{var t,i,s;const a=null!=e&&null!==(t=e.contact)&&void 0!==t&&t.contactDetailType?e.contact.contactDetailType:"",r=null!=e&&e.id?e.id:"",n="MOBILE"===a?"mobile":"email";let o="mobile"===n?(null==e||null===(i=e.contact)||void 0===i?void 0:i.number)??"":(null==e||null===(s=e.contact)||void 0===s?void 0:s.address)??"";const l=Boolean(o&&!o.includes("*")),c={...this.contactBaseMap[n]};return o&&"mobile"===n?(o=l?this._formatProduct(o,"phone"):o,{...c,id:r,value:o,unmasked:l}):"email"===n&&(o||this.forceToAppendEmailWithoutValue)?(o=o.toLowerCase(),c.isValidated=!(null==e||!e.isVerifiedByCustomer)&&e.isVerifiedByCustomer,Object.assign(c,{id:r,value:o,unmasked:l})):null}))}_formatProduct(e,t,i){t=t&&t.toLowerCase(),i=i||this.locale||"MXN";const s=this.masks[i]&&this.masks[i][t];return s&&"string"==typeof e?this._applyMask(e,s):e}_applyMask(e,t){const i=[];let s=0;const a=(e=(e||"").split("")).length;return t&&e&&a&&t.split("").forEach((t=>{s>=a||("X"===t?(i.push(e[s]),s+=1):i.push(t))})),i.join("")}_getContactDetailsCustomer(e){if(e||e.detail){const t=e.detail||e;let i=[];i=this._mapCustomerContactsV1(t);const s=i.find((e=>e&&e.isMobile)),a=i.find((e=>e&&!e.isMobile))||this.contactBaseMap.email;return[...s?[s]:[],...a?[a]:[]]}return[]}},"properties",{messageData:{type:Object},financialData:{type:Array},accountsData:{type:Array},accountSelected:{type:Object},versionCustomerV1:{type:String},versionDossier:{type:String},versionPayments:{type:String},defaultDossiersStatus:{type:String},dossiersIdentifiers:{type:Array},dossiers:{type:Array},_customer:{type:Object},_fullfillmentDocuments:{type:Object},defaultMainTaxResidence:{type:Object},masks:{type:Object},locale:{type:String},c:{type:String},parkingId:{type:String}}),t};class Ne extends(t(i(Xe(F)))){static get scopedElements(){const e=[he,ue,me,ce,de];return Ne.scopedElementsFromClasses(e)}static get properties(){return{url:{type:String},accountNumber:{type:String},productId:{type:String},customerId:{type:String},clientId:{type:String},rechargeId:{type:String},pocketId:{type:String},showCustomerContactDetailApiDm:{type:Boolean},showCustomerDetailApiDm:{type:Boolean},showCustomerDossierApiDm:{type:Boolean},isUnmasked:{type:Boolean},contactDetailResponse:{type:Object},customerDossierResponse:{type:Object},listDossiersRequestParams:{type:Object},_customerDataRes:{type:Object},resCECustomer:{type:Boolean},resCEDossier:{type:Boolean},resCEEmail:{type:Boolean},resCEContact:{type:Boolean},userBillInput:{type:String},listTagIds:{type:Object},showStoredServicesApiDm:{type:Boolean},showServiceBillsApiDm:{type:Boolean},dataServiceBills:{type:Boolean},captureError:{type:Boolean}}}constructor(){super(),this.url="",this.accountNumber="",this.productId="",this.customerId="",this.rechargeId="",this.pocketId="",this.showCustomerContactDetailApiDm=!1,this.showCustomerDetailApiDm=!1,this.userBillInput="",this.listTagIds={},this.showStoredServicesApiDm=!1,this.showServiceBills=!1,this.dataServiceBills=!1,this._customerDataRes={},this.isUnmasked=!1,this.contactDetailResponse={},this.listDossiersRequestParams={},this.showCustomerDossierApiDm=!1,this.resCEContact=!1,this.resCECustomer=!1,this.resCEEmail=!1,this.resCEDossier=!1,this.captureError=!1}initializeDataProvider(e){this.messageData=e,this.url=this.messageData.id??this.url,this.productId=this.messageData.params.productId??this.productId,this.accountNumber=this.messageData.params.accountNumber??this.accountNumber,this.customerId=this.messageData.params.customerId??this.customerId,this.clientId=this.messageData.params.clientId??this.customerId,this.listDossiersRequestParams={operationType:"G1","branch.id":"3607","status.id":"A"},this.defaultDossiersStatus="A",this.dossiersIdentifiers=[{key:"taxResidence",description:"CRSF"},{key:"kyc",description:"KY1"},{key:"address",description:"D"}],this._fullfillmentDocuments={curp:!0,identification:!0,address:!0,taxResidence:!0,kyc:!0},this.defaultMainTaxResidence={country:{id:"MEX",name:"Mexico"}},this.selectedFeature()}_redirectLink(){this.fireEvent("redirect-link",this.messageData)}selectedFeature(){const e=this.messageData.params.api??"";if(""!==e){const t={selectedAccount:this._accountSelectFunction.bind(this),aPocket:this._sendPocketId.bind(this),recharge:this._setCollapsed.bind(this),getStoredServiceRequest:this._getStoredServicesRequest.bind(this),fatcaValidation:this._fatcaValidation.bind(this),updateEmail:this._updateEmail.bind(this)};(Array.isArray(e)?e:[e]).filter((e=>t[e])).forEach((e=>t[e]()))}this._redirectLink()}_accountSelectFunction(){this.accountSelected=this.loadAccountSelected(this.productId,this.accountNumber),this.fireEvent("account-selected",this.accountSelected)}_sendPocketId(){this.pocketId=this.messageData.params.pocketId??this.pocketId,""!==this.pocketId&&this.fireEvent("pocket-id",this.pocketId)}async _fatcaValidation(){this.isUnmasked=!1,this._getCustomerApiDmRequest(),this._getCustomerContactDetailsRequest(),this._getCustomerDossierRequest(),this._customerDataRes={}}_setCollapsed(){this.rechargeId=this.messageData.params.rechargeId??this.rechargeId,"top-up-new-recipiente"===this.rechargeId?this.fireEvent("top-up-new-recipiente",!0):"top-up-my-number"===this.rechargeId?this.fireEvent("top-up-my-number",!0):"top-up-save-contacts"===this.rechargeId&&this.fireEvent("top-up-save-contacts",!0)}async _getCustomerApiDmRequest(){this.showCustomerDetailApiDm=!0,await this.updateComplete,await this.customerApiDmTag.getCustomer(this.customerId)}_updateEmail(){this._setMaskData(),this.isUnmasked=!0,this.resCEEmail=!0,this._getCustomerContactDetailsRequest()}async _getCustomerContactDetailsRequest(){this.showCustomerContactDetailApiDm=!0,await this.updateComplete,this.customerContactDetailsApiDmTag.getCustomerContactDetails(this.customerId,{unmasked:this.isUnmasked})}async _getCustomerDossierRequest(){this.showCustomerDossierApiDm=!0,await this.updateComplete,await this.customerDossierApiDmTag.getContractingDossiers(this.customerId,this.listDossiersRequestParams)}async _getStoredServicesRequest(){this.showStoredServicesApiDm=!0,await this.updateComplete,await this.storedServicesApiDm.getStoredServices({views:"full"})}async _getServiceBillsRequest(){var e,t;this.showStoredServicesApiDm=!1,this.showServiceBillsApiDm=!0,await this.updateComplete,this.serviceBillsApiDm.getServiceBills(null===(e=this.listTagIds)||void 0===e?void 0:e.agreement,{"billReference.referenceType.id":"BILL_NUMBER","billReference.value":null===(t=this.listTagIds)||void 0===t?void 0:t.billNumber})}get customerApiDmTag(){return this.shadowRoot.querySelector(`[data-tag-name = "${ce.is}"]`)}get customerContactDetailsApiDmTag(){return this.shadowRoot.querySelector(`[data-tag-name = "${he.is}"]`)}get customerDossierApiDmTag(){return this.shadowRoot.querySelector(`[data-tag-name = "${de.is}"]`)}get storedServicesApiDm(){return this.shadowRoot.querySelector(`[data-tag-name = "${ue.is}"]`)}get serviceBillsApiDm(){return this.shadowRoot.querySelector(`[data-tag-name = "${me.is}"]`)}get _getCustomerApiDm(){return L`
    <bbva-global-customer-api-dm
      host = ${this.host}
      requiredToken = ${this.requiredToken}
      version = ${this.versionCustomerV1}
      requiredOTP = "false"
      @customer-api-dm-fetch="${this._handleCustomerApiDmSuccess}"
      @customer-api-dm-fetch-error="${this._handleError}"
    ></bbva-global-customer-api-dm>
    `}get _getCustomerContactDetailApiDm(){return L`
    <bbva-global-customer-contact-details-api-dm
    host = ${this.host}
    requiredToken = ${this.requiredToken}
    version = ${this.versionCustomerV1}
    requiredOTP
    @customer-contact-details-api-dm-fetch="${this._handleCustomerContactDetailsSuccess}"
    @customer-contact-details-api-dm-fetch-error="${this._handleError}"
    ></bbva-global-customer-contact-details-api-dm>
    `}get _getCustomerDossierApiDm(){return L`
    <bbva-local-contract-documents-contracting-dossiers-api-dm
      host = ${this.host}
      requiredToken = ${this.requiredToken}
      version = ${this.versionDossier}
      requiredOTP = "false"
      @contracting-dossiers-api-dm-fetch="${this._handleCustomerDossierSuccess}"
      @contracting-dossiers-api-dm-fetch-error="${this._handleError}"
    ></bbva-local-contract-documents-contracting-dossiers-api-dm>
    `}get _getStoredServicesApiDm(){return L`
    <bbva-global-stored-services-api-dm
    .host="${this.host}"
    ?native= "${this.native}"
    .requiredToken="${this.requiredToken}"
    .version = "${this.versionPayments}"
    @stored-services-api-dm-fetch="${this._handleStoredServicesSuccess}"
    @stored-services-api-dm-fetch-error="${this._handleError}"
    ></bbva-global-stored-services-api-dm>
    `}get _getServiceBillsApiDm(){return L`
      <bbva-global-service-bills-api-dm
      .host="${this.host}"
      ?native= "${this.native}"
      .requiredToken="${this.requiredToken}"
      .version = "${this.versionPayments}"
      @service-bills-api-dm-fetch="${this._handleServiceBillsSuccess}"
      @service-bills-api-dm-fetch-error="${this._handleError}"
      ></bbva-global-service-bills-api-dm>
      `}_handleError(){return this.captureError=!0,this.captureError}_handleCustomerApiDmSuccess(e){this.parseCustomer(e),this.mapTaxResidence(this._customer.taxResidences,this._customer.identityDocuments),this.resCECustomer=!0,this._checkForLaunchResponse()}_handleCustomerContactDetailsSuccess(e){this.contactDetailResponse=e,this.resCEContact=!0,this._checkForLaunchResponse(),this.resCEEmail&&this.sendEmail()}_handleCustomerDossierSuccess(e){this.parseListContractingDossiers(e),this.resCEDossier=!0,this._checkForLaunchResponse()}_handleStoredServicesSuccess(e){const t=null==e?void 0:e.detail;if("recharge-tag"===this.url&&(this.userBillInput=this.messageData.params.userBillInput,this.listTagIds=this.getTagIds(t),this._getServiceBillsRequest()),"parking-recharge"===this.url){const e=this.getAccountDetailParking(t);this.fireEvent("account-detail-parking",e)}}_handleServiceBillsSuccess(e){const t=this.createRechargeTagDetail(e,this.listTagIds);this.fireEvent("recharge-tag-detail",t)}_checkForLaunchResponse(){this.resCECustomer&&this.resCEContact&&this.resCEDossier&&(this._customerDataRes=this.buildTaxResidencePayload(!0),this.fireEvent("editProfileTaxResidence",this._customerDataRes))}render(){return L`
      ${this.showCustomerContactDetailApiDm?this._getCustomerContactDetailApiDm:H}
      ${this.showStoredServicesApiDm?this._getStoredServicesApiDm:H}
      ${this.showServiceBillsApiDm?this._getServiceBillsApiDm:H}
      ${this.showCustomerDetailApiDm?this._getCustomerApiDm:H}
      ${this.showCustomerDossierApiDm?this._getCustomerDossierApiDm:H}
    `}}customElements.define("bbva-technicalcore-internal-link-provider",Ne);const Pe=V`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-chat-bot--_ambient--text-color: initial;
  }
`,qe=V`
:host([ambient~='primary-alt']), [ambient~='primary-alt'], [data-ambient~='primary-alt'] {
    --bbva-chat-bot--_ambient--text-color:
        var(--bbva-chat-bot--custom--primary-alt-ambient--text-color,
            ${s("colorPrimaryAltText01Default",a)}););
}
`,Me=V`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-chat-bot--_ambient--text-color: var(
      --bbva-chat-bot--custom--secondary-ambient--text-color,
      ${s("colorSecondaryText01Default",a)}
    );
  }
`,Be=V`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-chat-bot--_ambient--text-color: var(
      --bbva-chat-bot--custom--secondary-alt-ambient--text-color,
      ${s("colorSecondaryAltText01Default",a)}
    );
  }
`;const Fe=r([Object.freeze({__proto__:null,primary:Pe,primaryAlt:qe,secondary:Me,secondaryAlt:Be}),n,o]),je=Object.values(Fe);var Le=V`
:host {
  --_chat-bot-text-color: var(--bbva-chat-bot--_ambient--text-color, var(--bbva-chat-bot--custom--primary-ambient--text-color, ${s("colorPrimaryText01Default",a)}));
}
`,He=V`
:host {
  display: flex;
  box-sizing: border-box;
  padding: 0.5rem 1rem;
  color: var(--_chat-bot-text-color);
  font-size: var(--typographyTypeSmall, ${G(U.typeSmall)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${G(W.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${G(W.medium.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${G(K.typeSmall)});
}

:host([disabled-animation]) {
  gap: 1rem;
}
:host([disabled-animation]) .paragraph {
  margin-right: 0;
}

.paragraph {
  position: relative;
  min-width: 0;
  flex: auto;
}
.paragraph p {
  margin: 0;
}

:host([disabled]) [data-tag-name=bbva-type-link] {
  opacity: 1;
}

:host([clip-bot]:not([disabled-animation])) {
  padding-left: 0;
}
:host([clip-bot]:not([disabled-animation])) .paragraph {
  margin-right: 0;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.heading {
  margin-bottom: 0.5rem;
  font-style: var(--fontFacePrimaryMediumFontStyle, ${G(W.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${G(W.medium.fontWeight)});
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
`;class Ve extends(l(c(F))){static get scopedElements(){return{"bbva-core-heading":z,"bbva-clip-bot":pe,"bbva-type-text":d,"bbva-type-link":h}}static get is(){return"bbva-chat-bot"}static get properties(){return{heading:{type:String},clipBot:{type:String,attribute:"clip-bot"},headingLevel:{type:String,attribute:"heading-level"},headingEllipsisLines:{type:Number,attribute:"heading-ellipsis-lines"},description:{type:String},descriptionEllipsisLines:{type:String,attribute:"description-ellipsis-lines"},disabledAnimation:{type:Boolean,reflect:!0,attribute:"disabled-animation"},descriptionFontWeight:{type:String,attribute:"description-font-weight"},link:{type:String},linkHref:{type:String,attribute:"link-href"}}}constructor(){super(),this.clipBot="",this.heading="",this.description="",this.headingLevel="h2",this.headingEllipsisLines=1,this.descriptionEllipsisLines=3,this.disabledAnimation=!1,this.descriptionFontWeight="500",this.link=""}static get styles(){return[super.styles,Le,He,je,J("bbva-chat-bot-shared-styles")]}get _title(){return L`
      <div class="content">
        <bbva-type-text
          class="heading"
          tag="${this.headingLevel}"
          ?ellipsis=${""!==this.headingEllipsisLines}
          lines=${this.headingEllipsisLines}
          unset
          size="L"
          text=${this.heading}
        >
        </bbva-type-text>
      </div>
    `}get _clipbotBlock(){return L`
      <div class="media">
        <bbva-clip-bot
          ?disabled-animation="${this.disabledAnimation}"
          mode="${this.mode}"
          variant="${this.clipBot}"
        >
        </bbva-clip-bot>
      </div>
    `}_linkClick(){this.dispatchEvent(new CustomEvent("chat-bot-link-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return L`
      ${this.clipBot?this._clipbotBlock:""}

      <div class="paragraph">
        ${this.heading?this._title:""}
        ${this.description?L`<bbva-type-text
              unset
              size="S"
              .fontWeight="${this.descriptionFontWeight}"
              ?ellipsis="${this.descriptionEllipsisLines&&this.descriptionEllipsisLines>0}"
              lines=${this.descriptionEllipsisLines}
              text="${this.description}"
              tag="p"
            ></bbva-type-text>`:L` <p>
              <slot></slot>
              ${this.link?L`<bbva-type-link
                    href="${Y(this.linkHref)}"
                    .text="${this.link}"
                    ?disabled="${this.disabled}"
                    @click="${this._linkClick}"
                  ></bbva-type-link>`:""}
            </p>`}
      </div>
    `}}class Ge{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let a=0|t,r=Math.max(a>=0?a:s-Math.abs(a),0);for(;r<s;){if((n=i[r])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;r++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,a="",r=0,n=arguments.length;r!==n;++r){var o=+arguments[r];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?s=i.push(o):(o-=65536,s=i.push(55296+(o>>10),o%1024+56320)),s>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class Ue extends Ge{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const We=0,Ke=1,ze="jwt",Je="tsec",Ye="none";class Qe extends Ge{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=We,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Ue,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Je:this.requiredToken=Ye,this.requiresJWT=!1):this.requiredToken===Je?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===ze?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Ye?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Je)}_setJwtHandler(){this._setTokenHandler(ze)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=Q),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===Ke?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(Je,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(ze,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===ze?"JWT ":"",a=e===ze?"Authorization":Je;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[i].getItem(r);n?t[a]=t[a]||s+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],a=0,r=0;if(s<=127?(a=0,r=255&s):s<=223?(a=1,r=31&s):s<=239?(a=2,r=15&s):s<=244&&(a=3,r=7&s),e.length-i-a>0){let t=0;for(;t<a;)s=e[i+t+1],r=r<<6|63&s,t+=1}else r=65533,a=e.length-i;t+=String.fromCodePoint(r),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",a=i[e].split(s);t[a.shift().toLowerCase()]=a.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(a=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[s])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,i=n.authenticationdata||null,s=n.authenticationstate,a=n.authenticationchallenge,r=n.authenticationresponse}return{type:t,data:i,state:s,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",s)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:r,data:n,state:o,challenge:l,response:c}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(d),i=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,d,r,n,o,l,c),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,r,n,o,l,c),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,a,r){this._defineSignatureValue(t,i,s);const n={type:t,data:i,challenge:a,metadata:e};r&&(n.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,a,r){s?this._notifySignatureRequired(e,t,i,s,a,r):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,a,r,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,a):this._notifySignatureRequired(t,i,s,a,r,n)}}class Ze extends Qe{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class et extends Ze{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`digital-butler/v${this.version}/conversations`)}toString(){return super.toString("BGADPDigitalButlerConversationsPostV0")}}class tt extends Ze{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`digital-butler/v${this.version}/conversations/{conversation-id}/messages`)}toString(){return super.toString("BGADPDigitalButlerConversationsConversationMessagesPostV0")}}class it extends(Z(F)){}class st extends it{static get is(){return"bbva-global-conversations-api-dm"}constructor(){super()}postConversations(e){this._generateGetService(this._getService("post",e),{customEvent:"conversations-api-dm-create",errorFireEventHandler:"conversations-api-dm-create-error"},this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}Conversations`,this._getBgadp(s))}_getBgadp(e){return{postConversationsV0:()=>new et(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class at extends it{static get is(){return"bbva-global-conversation-messages-api-dm"}constructor(){super()}postConversationMessages(e,t){const i={"conversation-id":e};this._generateGetService(this._getService("post",t,i),{customEvent:"conversation-messages-api-dm-create",errorFireEventHandler:"conversation-messages-api-dm-create-error"},this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}ConversationMessages`,this._getBgadp(s))}_getBgadp(e){return{postConversationMessagesV0:()=>new tt(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}var rt=V`
:host {
  display: block;
  padding: 1rem;
  --bbva-clip-box--custom--primary-ambient--border-color: none;
}

.row {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.row--secondary {
  padding-top: 0.5rem;
}

.alias {
  padding-right: 1rem;
}

.image-reference-wrapper {
  display: flex;
  gap: 0.5rem;
}

[data-tag-name=bbva-type-amount] {
  --bbva-type-amount-font-weight: var(--fontFacePrimaryMediumFontWeight, ${G(W.medium.fontWeight)});
}
`;const nt=["ACTIVATED"];class ot extends(l(B(F))){static get is(){return"bot-product-balance"}static get scopedElements(){return{"bbva-type-amount":u,"bbva-type-text":d,"bbva-badge-default":m,"bbva-badge-reference":Ee,"bbva-clip-card":Te}}static get properties(){return{data:{type:Object},localCurrency:{type:String,attribute:"local-currency"},language:{type:String},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"},userProducts:{type:Object,attribute:"user-products"}}}constructor(){super(),this.data={},this.localCurrency="",this.language="",this.showCurrencyCode=!1,this.userProducts={}}static get styles(){return[rt,J("bot-user-message-shared-styles"),p.primaryAlt,n.primaryAlt,g.primaryAlt,Se.primaryAlt,ke.primaryAlt]}static _getStatusType(e){return nt.includes(e)?"":{RESTRICTED:"blocked",BLOCKED:"blocked",EXPIRED:"blocked",OFF:"off"}[e]||"pending"}render(){var e,t,i,s,a,r,n,o,l,c,d,h,u,m,p,g,b,v,_,y,f,C,E,S,T,k,R,I,D,$,A,x,O,w,X;return L`
      <div class="row" ambient="primary-alt">
        <bbva-type-text
          class="alias"
          size="S"
          font-weight="500"
          tag="span"
          .text="${this.data.alias||this.data.name}"
        ></bbva-type-text>
        <bbva-type-amount
          variant="l"
          type="${(null===(e=this.data.balances)||void 0===e||null===(t=e[0])||void 0===t?void 0:t.amount)<0?"uncovered":"bold"}"
          .amount="${null===(i=this.data.balances)||void 0===i||null===(s=i[0])||void 0===s?void 0:s.amount}"
          .currencyCode="${null===(a=this.data.balances)||void 0===a||null===(r=a[0])||void 0===r?void 0:r.currency}"
          .localCurrency="${this.localCurrency}"
          .language="${this.language}"
          ?show-currency-code="${this.showCurrencyCode}"
        >
        </bbva-type-amount>
      </div>
      <div class="row">
        <div class="image-reference-wrapper">
          ${"CARD"===this.data.productType?L`
                <bbva-clip-card
                  size="xs"
                  .cardImage="${null!==(n=this.data.image)&&void 0!==n&&n.url?this.data.image.url:null===(o=this.userProducts)||void 0===o||null===(l=o.cards)||void 0===l||null===(c=l.find((e=>e.id===this.data.id)))||void 0===c?void 0:c.imageUrl}"
                  .status="${ot._getStatusType(null===(d=this.data.status)||void 0===d?void 0:d.id)}"
                ></bbva-clip-card>
              `:L``}
          <bbva-badge-reference
            accessibility-text="${this.t("digital-butler-chatbot-product-number-accessibility-text",{number:this.data.number.slice(-4)})}"
            .number="${this.data.number}"
            .entities="${"ACCOUNT"===this.data.productType?[{icon:ee(),size:"xs",accessibilityText:this.t("digital-butler-chatbot-bbva-logo-accessibility-text")}]:[]}"
          ></bbva-badge-reference>
        </div>
        ${null!==(h=this.data.balances)&&void 0!==h&&null!==(u=h[0])&&void 0!==u&&u.description?L`
              <bbva-type-text
                size="S"
                tag="span"
                .text="${this.data.balances[0].description}"
              ></bbva-type-text>
            `:L``}
      </div>
      ${null!==(m=this.data.status)&&void 0!==m&&m.description&&!nt.includes(null===(p=this.data.status)||void 0===p?void 0:p.id)||"CARD"===this.data.productType&&(null!==(g=this.data.balances)&&void 0!==g&&null!==(b=g[1])&&void 0!==b&&b.amount||0===(null===(v=this.data.balances)||void 0===v||null===(_=v[1])||void 0===_?void 0:_.amount))?L`
            <div class="row row--secondary" ambient="primary-alt">
              <bbva-badge-default
                .type="${ot._getStatusType(null===(y=this.data.status)||void 0===y?void 0:y.id)}"
                .text="${(null===(f=this.data.status)||void 0===f?void 0:f.description)||""}"
              ></bbva-badge-default>
              ${"CARD"===this.data.productType&&(null!==(C=this.data.balances)&&void 0!==C&&null!==(E=C[1])&&void 0!==E&&E.amount||0===(null===(S=this.data.balances)||void 0===S||null===(T=S[1])||void 0===T?void 0:T.amount))?L`
                    <bbva-type-amount
                      variant="m"
                      .type="${(null===(k=this.data.balances)||void 0===k||null===(R=k[1])||void 0===R?void 0:R.amount)<0?"uncovered":"bold"}"
                      .amount="${null===(I=this.data.balances)||void 0===I||null===(D=I[1])||void 0===D?void 0:D.amount}"
                      .currencyCode="${null===($=this.data.balances)||void 0===$||null===(A=$[1])||void 0===A?void 0:A.currency}"
                      .localCurrency="${this.localCurrency}"
                      .language="${this.language}"
                    >
                    </bbva-type-amount>
                  `:""}
            </div>
          `:L``}
      ${"CARD"===this.data.productType&&null!==(x=this.data.balances)&&void 0!==x&&null!==(O=x[1])&&void 0!==O&&O.description?L`
            <div class="row">
              <div></div>
              <bbva-type-text
                size="S"
                tag="span"
                .text="${null===(w=this.data.balances)||void 0===w||null===(X=w[1])||void 0===X?void 0:X.description}"
              ></bbva-type-text>
            </div>
          `:L``}
    `}}var lt=V`
:host {
  display: block;
}

[data-tag-name=bbva-header-category] {
  padding: 0.5rem 1rem 0;
}

.expandable-header {
  display: block;
  width: 100%;
}
.expandable-header [data-tag-name=bbva-header-category] {
  padding: 0 1rem;
}

[data-tag-name=bbva-divider-default] {
  padding: 0 16px;
  display: block;
}
[data-tag-name=bbva-divider-default].family-divider {
  padding: 0;
}
`;class ct extends(l(F)){static get is(){return"bot-family-products-balance"}static get scopedElements(){return{"bbva-expandable-accordion":fe,"bbva-header-category":b,"bot-product-balance":ot,"bbva-divider-default":v}}static get properties(){return{data:{type:Array},localCurrency:{type:String,attribute:"local-currency"},language:{type:String},userProducts:{type:Object,attribute:"user-products"},_showCurrencyCode:{type:Boolean}}}constructor(){super(),this.data=[],this.localCurrency="",this.language="",this.userProducts={},this._showCurrencyCode=!1}updated(e){super.updated(e),(e.has("data")||e.has("localCurrency"))&&(this._showCurrencyCode=this.data.some((e=>{var t;return(null===(t=e.totalBalances)||void 0===t?void 0:t.currency)!==this.localCurrency})))}static get styles(){return[lt,J("bot-user-message-shared-styles"),Ce.primaryAlt,_.primaryAlt,y.primaryAlt]}_productsTemplate(e){var t,i;return L`
      <div role="${Y((null==e||null===(t=e.products)||void 0===t?void 0:t.length)>1?"list":void 0)}">
        ${null==e||null===(i=e.products)||void 0===i?void 0:i.map(((t,i)=>L`
            <bot-product-balance
              role="${Y(e.products.length>1?"listitem":void 0)}"
              .data="${{...t,productType:e.productType}}"
              .localCurrency="${this.localCurrency}"
              .language="${this.language}"
              .userProducts="${this.userProducts}"
              ?show-currency-code="${this._showCurrencyCode}"
            ></bot-product-balance>
            ${i<e.products.length-1?L` <bbva-divider-default></bbva-divider-default> `:""}
          `))}
      </div>
    `}get _singleFamilySingleProductTemplate(){return this._productsTemplate(this.data[0])}get _shortListOfProducts(){return this.data.map((e=>{var t,i,s,a,r,n;return L`
        <div ambient="primary-alt">
          <bbva-header-category
            heading-level="2"
            .language="${this.language}"
            .amount="${(null==e||null===(t=e.products)||void 0===t?void 0:t.length)>1?null===(i=e.totalBalances)||void 0===i?void 0:i.amount:""}"
            .typeAmount="${(null===(s=e.totalBalances)||void 0===s?void 0:s.amount)<0&&e.products.length>1?"uncovered":"grey"}"
            .currencyCode="${(null==e||null===(a=e.products)||void 0===a?void 0:a.length)>1?null===(r=e.totalBalances)||void 0===r?void 0:r.currency:""}"
            .localCurrency="${this.localCurrency}"
            .text="${e.name}${this._showCurrencyCode&&null!==(n=e.totalBalances)&&void 0!==n&&n.currency?` (${e.totalBalances.currency})`:""}"
            ?show-currency-code="${this._showCurrencyCode}"
            show-value-zero
          ></bbva-header-category>
          ${this._productsTemplate(e)}
        </div>
      `}))}get _manyProductsTemplate(){return this.data.map(((e,t)=>{var i,s,a,r;return L`
        <bbva-expandable-accordion ambient="primary-alt" heading-level="2">
          <div slot="header" class="expandable-header">
            <bbva-header-category
              .language="${this.language}"
              .amount="${null===(i=e.totalBalances)||void 0===i?void 0:i.amount}"
              .typeAmount="${(null===(s=e.totalBalances)||void 0===s?void 0:s.amount)<0?"uncovered":"grey"}"
              .currencyCode="${null===(a=e.totalBalances)||void 0===a?void 0:a.currency}"
              .localCurrency="${this.localCurrency}"
              .text="${e.name}${this._showCurrencyCode&&null!==(r=e.totalBalances)&&void 0!==r&&r.currency?` (${e.totalBalances.currency})`:""}"
              ?show-currency-code="${this._showCurrencyCode}"
              show-value-zero
            ></bbva-header-category>
          </div>
          <div slot="content">
            <bbva-divider-default></bbva-divider-default>
            ${this._productsTemplate(e)}
          </div>
        </bbva-expandable-accordion>
        ${t<this.data.length-1?L` <bbva-divider-default></bbva-divider-default> `:""}
      `}))}render(){var e,t,i;const s=1===this.data.length;if(s&&1===(null===(e=this.data[0])||void 0===e||null===(t=e.products)||void 0===t?void 0:t.length))return this._singleFamilySingleProductTemplate;return s&&(null===(i=this.data[0])||void 0===i?void 0:i.products.length)>2||!s&&this.data.some((e=>e.products.length>1))?this._manyProductsTemplate:this._shortListOfProducts}}var dt=V`
:host {
  display: block;
  text-align: right;
  padding-right: 8px;
}

[data-tag-name=bbva-chat-container] {
  min-height: auto;
  display: inline-block;
  --bbva-chat-container--custom--primary-alt-ambient--bg-pressed-color: ${s("colorPrimaryAltSurfaceAlternativeDefault",a)};
}
`;class ht extends(l(F)){static get is(){return"bot-user-message"}static get scopedElements(){return{"bbva-chat-container":ge,"bbva-type-text":d}}static get properties(){return{text:{type:String}}}static get styles(){return[dt,J("bot-user-message-shared-styles"),be.primaryAlt,n.primaryAlt]}render(){return L`
      <bbva-chat-container disable-click ambient="primary-alt">
        <bbva-type-text size="S" tag="span" .text="${this.text}"></bbva-type-text>
      </bbva-chat-container>
    `}}var ut=V`
[data-tag-name=bbva-form-rating] {
  padding: 0.5rem 1rem 1rem;
}
`;class mt extends(l(F)){static get is(){return"bot-binary-feedback"}static get scopedElements(){return{"bbva-form-rating":Re}}static get properties(){return{data:{type:Object},disabled:{type:Boolean}}}constructor(){super(),this.data={},this.disabled=!1}static get styles(){return[ut,J("bot-binary-feedback-shared-styles"),Ie.primaryAlt]}get value(){return{NONE:void 0,POSITIVE:0,NEGATIVE:1}[this.data.rating]}_onRating({detail:e}){this.disabled=!0,this.data.rating=e?"NEGATIVE":"POSITIVE",this.dispatchEvent(new CustomEvent("bot-binary-feedback-rating-updated",{composed:!0,bubbles:!0,detail:{forms:this.data.forms,value:!e}}))}render(){return L`
      <bbva-form-rating
        ambient="primary-alt"
        inline
        has-not-ellipsis
        text=""
        .contentTitle="${this.data.content}"
        .value="${this.value}"
        ?disabled="${"NONE"!==this.data.rating||this.disabled}"
        @form-rating-value-change="${this._onRating}"
      >
      </bbva-form-rating>
    `}}const pt={CONTINUITY_DELAY:1250,ONBOARDING_CHIP:"onboarding"},gt={TEXT:"TEXT",BUTTON:"BUTTON",EVENT:"EVENT",VOICE:"VOICE"},bt={WELCOME:"WELCOME",FEEDBACK_POSITIVE:"FEEDBACK_POSITIVE",FEEDBACK_NEGATIVE:"FEEDBACK_NEGATIVE",NAVIGATION_RETURN:"NAVIGATION_RETURN"},vt={BINARY_FEEDBACK:"BINARY_FEEDBACK",BOT_MESSAGE:"BOT_TEXT",CONVERSATION_CREATION:"CONVERSATION_CREATION",MESSAGES_GROUP_DIVIDER:"MESSAGES_GROUP_DIVIDER",INFO_LIST:"INFO_LIST",LINK:"LINK",MOVEMENTS_LIST:"TRANSACTIONS",OPTION_LIST:"OPTION_LIST",PRODUCT_FAMILY_BALANCE:"PRODUCT_FAMILY_BALANCE",USER_MESSAGE:"USER_TEXT"},_t={NAVIGATION:"NAVIGATION",MESSAGE:"MESSAGE",ACTION:"ACTION"},yt={MESSAGE:"MESSAGE",EVENT:"EVENT"},ft={COPY:"copy",CALL:"phone-call"};var Ct=V`
:host {
  display: block;
  --bbva-type-icon--custom--primary-ambient--color: ${s("colorPrimaryLinkMainDefault",a)};
}

[data-tag-name=bbva-type-link] {
  padding: 1rem;
  width: 100%;
}
[data-tag-name=bbva-type-link]:hover, [data-tag-name=bbva-type-link][active] {
  --bbva-type-icon--custom--primary-ambient--color: ${s("colorPrimaryLinkMainPressed",a)};
}

.link-text {
  flex: 1;
  padding-right: 1rem;
}

.chip {
  margin: 0.5rem 1rem;
  background-color: ${s("colorPrimarySurfaceAmbientDefault",a)};
}
.chip [data-tag-name=bbva-type-link] {
  padding: 0.5rem 1rem;
}
`;class Et extends(l(F)){static get is(){return"bot-link"}static get scopedElements(){return{"bbva-type-link":h,"bbva-type-icon":f}}static get properties(){return{data:{type:Object},disabled:{type:Boolean}}}constructor(){super(),this.data={},this.disabled=!1}static get styles(){return[Ct,J("bot-link-shared-styles"),o.primary,C.primary]}_onClick(){this.dispatchEvent(new CustomEvent("bot-link-click",{composed:!0,bubbles:!0}))}render(){return L`
      <div
        class="${this.data.linkType===_t.MESSAGE?"chip":""}"
      >
        <bbva-type-link
          ambient="primary"
          icon="${this.data.icon?te[this.data.icon]():""}"
          ?disabled="${this.disabled}"
          @click="${this._onClick}"
          ><span class="link-text">${this.data.title}</span>${this.data.linkType!==_t.MESSAGE?L`
                <bbva-type-icon .icon="${ie()}" size="24"></bbva-type-icon>
              `:""}</bbva-type-link
        >
      </div>
    `}}var St=V`
.info-container {
  display: flex;
  justify-content: space-between;
  align-items: center;
  gap: 1rem;
  padding: 0.5rem 1rem;
}

[data-tag-name=bbva-type-link] {
  padding: 0;
  margin: 0;
}

[data-tag-name=bbva-divider-default] {
  padding: 0 1rem;
  display: block;
}

.info-list-title {
  padding: 0.5rem 1rem;
}
`;class Tt extends(l(F)){static get is(){return"bot-info-list"}static get scopedElements(){return{"bbva-type-text":d,"bbva-type-link":h,"bbva-divider-default":v}}static get properties(){return{data:{type:Object},disabled:{type:Boolean},showDivider:{type:Boolean,attribute:"show-divider"}}}constructor(){super(),this.data={},this.disabled=!1,this.ambient="primary-alt",this.showDivider=!1}static get styles(){return[St,J("bot-info-list-shared-styles"),n.primaryAlt,o.primaryAlt,y.primaryAlt]}_onClick(e){const t={...e,id:e.actionId};this.dispatchEvent(new CustomEvent("bot-info-list-click",{composed:!0,bubbles:!0,detail:t}))}render(){var e;return L`
      ${this.showDivider?L` <bbva-divider-default></bbva-divider-default> `:""}
      ${null===(e=this.data)||void 0===e?void 0:e.detail.map((e=>L`
          <div class="info-container">
            <div>
              ${e.title?L`
                    <bbva-type-text
                      font-weight="500"
                      size="S"
                      tag="span"
                      .text="${e.title}"
                    ></bbva-type-text>
                  `:""}
              ${e.content?L`
                    <bbva-type-text size="S" tag="span" .text="${e.content}"></bbva-type-text>
                  `:""}
            </div>
            ${e.linkText?L`
                  <bbva-type-link
                    .text="${e.linkText}"
                    ?disabled="${this.disabled}"
                    @click="${()=>this._onClick(e)}"
                  ></bbva-type-link>
                `:""}
          </div>
        `))}
    `}}var kt=V`
[slot=right] {
  padding: 1rem;
  display: flex;
  gap: 0.5rem;
  flex-direction: column;
}
`;class Rt extends(l(F)){static get is(){return"bot-option-list"}static get scopedElements(){return{"bbva-form-container":De,"bbva-form-control-input":$e,"bbva-type-text":d}}static get properties(){return{data:{type:Object},disabled:{type:Boolean}}}constructor(){super(),this.data={},this.disabled=!1}static get styles(){return[kt,J("bot-option-list-shared-styles"),Ae.primaryAlt,xe.primaryAlt,n.primaryAlt]}_onClick({detail:e}){this.data.detail.forEach(((t,i)=>{t.selected=i===e.selected}))}render(){return L`
      <bbva-form-container
        divider-size="fit"
        ambient="primary-alt"
        @form-container-radio-change="${this._onClick}"
      >
        ${this.data.detail.map((e=>L`
              <bbva-form-control-input
                slot="_option"
                type="radio"
                name="option"
                .value="${e.id}"
                ?checked="${e.selected}"
                ?disabled="${this.disabled}"
              >
                <div slot="right">
                  ${e.title?L`
                        <bbva-type-text
                          tag="span"
                          size="S"
                          font-weight="500"
                          .text="${e.title}"
                        ></bbva-type-text>
                      `:""}
                  ${e.content?L`
                        <bbva-type-text
                          tag="span"
                          size="S"
                          .text="${e.content}"
                        ></bbva-type-text>
                      `:""}
                </div>
              </bbva-form-control-input>
            `))}
      </bbva-form-container>
    `}}var It=V`
.movement-wrapper {
  padding: 1rem;
  display: flex;
  flex-direction: column;
}

.title-wrapper {
  display: flex;
  gap: 0.5rem;
}

.row {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 1rem;
}

[data-tag-name=bbva-divider-default] {
  padding: 0 1rem;
  display: block;
}

[data-tag-name=bbva-header-category] {
  padding: 1rem 1rem 0;
}

[data-tag-name=bbva-badge-reference] {
  padding-top: 0.5rem;
}

[data-tag-name=bbva-badge-default] {
  padding-top: 0.5rem;
}

[data-tag-name=bbva-badge-icon] {
  padding-top: 1rem;
}
`;class Dt extends(l(B(F))){static get is(){return"bot-movements-list"}static get scopedElements(){const e=[b,T,d,h,u,Ee,k,m,M,v,Tt];return Dt.scopedElementsFromClasses(e)}static get properties(){return{data:{type:Array},localCurrency:{type:String,attribute:"local-currency"},language:{type:String},disabled:{type:Boolean}}}constructor(){super(),this.data=[],this.localCurrency="",this.language="",this.disabled=!1,this.ambient="primary-alt"}static get styles(){return[It,J("bot-movements-list-shared-styles"),_.primaryAlt,E.primaryAlt,n.primaryAlt,o.primaryAlt,p.primaryAlt,Se.primaryAlt,S.primaryAlt,g.primaryAlt,q.primaryAlt,y.primaryAlt]}_onClick(e){this.dispatchEvent(new CustomEvent("bot-movements-list-click",{composed:!0,bubbles:!0,detail:e}))}static _getDefaultIcon(e){return{EXPENSE:{icon:se(),bgColor:"others"},INCOME:{icon:ae(),bgColor:"otherIncome"}}[e]}static _getClipBoxIconConfig(e){var t,i,s,a,r,n;const o=null===(t=e.classification)||void 0===t||null===(i=t.category)||void 0===i||null===(s=i.image)||void 0===s?void 0:s.id,l=Dt._getDefaultIcon(null===(a=e.moneyFlow)||void 0===a?void 0:a.id);return o?[{icon:"",category:o,bgColor:null===(r=re[o])||void 0===r?void 0:r.color,size:"xs"}]:[{icon:null==l?void 0:l.icon,category:"",bgColor:null===(n=re[null==l?void 0:l.bgColor])||void 0===n?void 0:n.color,size:"xs"}]}render(){return this.data.map(((e,t,i)=>{var s,a,r,n,o,l,c,d,h,u,m,p,g,b,v,_;const y=null===(s=i[t-1])||void 0===s?void 0:s.operationDate.slice(0,10),f=e.operationDate.slice(0,10),C=f!==y,E=null===(a=i[t+1])||void 0===a?void 0:a.operationDate.slice(0,10),S=null===(r=e.classification)||void 0===r||null===(n=r.category)||void 0===n||null===(o=n.image)||void 0===o?void 0:o.id,T=null===(l=e.classification)||void 0===l||null===(c=l.category)||void 0===c||null===(d=c.icon)||void 0===d?void 0:d.id;return L`
        ${C?L`
              <bbva-header-category
                heading-level="2"
                variant="date"
                .date="${e.operationDate}"
                .locale="${this.language}"
                font-style-date="italic"
                font-weight-date="500"
              ></bbva-header-category>
            `:""}
        <div class="movement-wrapper">
          <div class="row">
            <div class="title-wrapper">
              <bbva-clip-box
                static-entity
                .group="${Dt._getClipBoxIconConfig(e)}"
              ></bbva-clip-box>
              ${e.message&&!this.disabled?L`
                    <bbva-type-link
                      .text="${e.concept}"
                      @click="${()=>this._onClick(e)}"
                    ></bbva-type-link>
                  `:L`
                    <bbva-type-text
                      size="S"
                      tag="span"
                      font-weight="500"
                      .text="${e.concept}"
                    ></bbva-type-text>
                  `}
            </div>
            <bbva-type-amount
              variant="l"
              .type="${e.amount.amount<0?"":"income"}"
              .amount="${e.amount.amount}"
              .currencyCode="${e.amount.currency}"
              .localCurrency="${this.localCurrency}"
              .language="${this.language}"
            ></bbva-type-amount>
          </div>
          ${e.extendedConcept||null!==(h=e.transactionType)&&void 0!==h&&h.name?L`
                <bbva-type-text
                  size="S"
                  tag="span"
                  .text="${e.extendedConcept||(null===(u=e.transactionType)||void 0===u?void 0:u.name)}"
                ></bbva-type-text>
              `:""}
          ${!e.message&&null!==(m=e.contract)&&void 0!==m&&m.number?L`
                <bbva-badge-reference
                  .number="${e.contract.number}"
                  .entities="${[]}"
                ></bbva-badge-reference>
              `:""}
          ${"PENDING"===(null===(p=e.status)||void 0===p?void 0:p.id)?L`
                <bbva-badge-default .text="${null===(g=e.status)||void 0===g?void 0:g.name}"></bbva-badge-default>
              `:""}
          ${e.valueDate?L`
                <bbva-type-date
                  date="${e.valueDate}"
                  .previousText="${this.t("digital-butler-chatbot-movement-operation-date")}"
                  .options="${{day:"2-digit",month:"2-digit",year:"numeric"}}"
                  .locale="${this.language}"
                ></bbva-type-date>
              `:""}
          ${e.message||!S&&!T?"":L`
                <bbva-badge-icon
                  category="${S}"
                  icon="${te[T]&&te[T]()||""}"
                  .description="${null===(b=e.classification)||void 0===b||null===(v=b.category)||void 0===v||null===(_=v.subcategory)||void 0===_?void 0:_.name}"
                ></bbva-badge-icon>
              `}
        </div>
        ${!e.message&&null!=e&&e.additionalInformation?L`
              <bot-info-list
                .data=${{detail:e.additionalInformation.params.map((e=>({title:e.name,content:null!=e&&e.currency?ne(e.value,{currencyCode:e.currency,localCurrency:this.localCurrency}):e.value})))}}
              >
              </bot-info-list>
            `:""}
        ${E===f?L`
              <bbva-divider-default></bbva-divider-default>
            `:""}
      `}))}}var $t=V`
:host {
  display: block;
}

[data-tag-name=bbva-type-date] {
  display: block;
  padding: 1rem 1rem 0.5rem;
}

[data-tag-name=bbva-notification-message] {
  margin: 0 1rem 0.5rem;
}
`;class At extends(l(F)){static get is(){return"bot-conversation-creation"}static get scopedElements(){const e=[k,R];return At.scopedElementsFromClasses(e)}static get properties(){return{data:{type:Object},infoMessage:{type:String,attribute:"info-message"},language:{type:String}}}constructor(){super(),this.data={},this.infoMessage="",this.language="",this.ambient="primary-alt"}static get styles(){return[$t,J("bot-conversation-creation-shared-styles"),S.primaryAlt]}render(){return L`
      ${this.infoMessage?L`
            <bbva-notification-message
              variant="caution"
              book-title
              .messageTitle="${this.infoMessage}"
            ></bbva-notification-message>
          `:L``}
      <bbva-type-date
        .date="${new Date(this.data.timestamp)}"
        .options="${{day:"2-digit",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit"}}"
        .locale="${this.language}"
        font-weight="500"
        font-style="italic"
      ></bbva-type-date>
    `}}const xt=[ct,ht,mt,Et,Tt,Rt,Dt,At],Ot={[vt.BOT_MESSAGE]:"_buildBotMessage",[vt.USER_MESSAGE]:"_buildUserMessage",[vt.CONVERSATION_CREATION]:"_buildConversationCreationMessage",[vt.BINARY_FEEDBACK]:"_buildBinaryFeedbackMessage",[vt.PRODUCT_FAMILY_BALANCE]:"_buildProductFamilyBalanceMessage",[vt.LINK]:"_buildLinkMessage",[vt.INFO_LIST]:"_buildInfoListMessage",[vt.OPTION_LIST]:"_buildOptionListMessage",[vt.MOVEMENTS_LIST]:"_buildMovementsListMessage"};class wt{constructor(e){this.controller=e,this.currentConversationStartGroupIndex=-1}setCurrentConversationStartGroupIndex(e){this.currentConversationStartGroupIndex=e}getComponent({messageType:e,detail:t},i){const s=Ot[e];return this[s]?this[s](t,i):L``}_buildBotMessage(e,{groupIndex:t,messageIndex:i}){var s;const a=t===this.controller.messages.findLastIndex((e=>e.some((({messageType:e})=>e===vt.BOT_MESSAGE)))),r=(null===(s=this.controller.messages[t])||void 0===s?void 0:s.findIndex((({messageType:e})=>e===vt.BOT_MESSAGE)))===i,n=a&&r,o=e[0].content.replaceAll("\n","<br/>");return L`
      <bbva-chat-bot
        description-ellipsis-lines="0"
        description-font-weight="400"
        .description="${o}"
        .clipBot="${n?"avatar":""}"
        disabled-animation
      ></bbva-chat-bot>
    `}_buildUserMessage(e){return L` <bot-user-message .text="${e[0].content}"></bot-user-message> `}_buildConversationCreationMessage(e,{groupIndex:t}){const i=t===this.currentConversationStartGroupIndex&&0!==t;return L`
      <bot-conversation-creation
        .data="${e[0]}"
        .language="${this.controller.language}"
        .infoMessage="${i?this.controller.t("digital-butler-chatbot-old-conversations-info"):""}"
      ></bot-conversation-creation>
    `}_buildBinaryFeedbackMessage(e,{groupIndex:t}){const i=[vt.USER_MESSAGE,vt.CONVERSATION_CREATION],s=this.controller.messages.findLastIndex((e=>e.some((({messageType:e})=>i.includes(e))))),a=t<s;return L`
      <bot-binary-feedback
        .data="${e[0]}"
        ?disabled="${a}"
        @bot-binary-feedback-rating-updated="${e=>this.controller._handleBinaryFeedbackClick(e,t)}"
      ></bot-binary-feedback>
    `}_buildProductFamilyBalanceMessage(e){return L`
      <bot-family-products-balance
        .data="${e}"
        .localCurrency="${this.controller.localCurrency}"
        .language="${this.controller.language}"
        .userProducts="${this.controller.userProducts}"
      ></bot-family-products-balance>
    `}_buildLinkMessage(e,{groupIndex:t}){return L`
      ${e.map((e=>L`
          <bot-link
            ?hidden="${e.linkType===_t.MESSAGE&&t!==this.controller.messages.length-1}"
            .data="${e}"
            ?disabled="${t<this.currentConversationStartGroupIndex}"
            @bot-link-click="${()=>{this.controller._dispatchEventWithMessageTracking("digital-butler-chatbot-link-click",{linkType:e.linkType,title:e.title,id:e.id},t),this.controller._handleElementInteractionClick(e.linkType,e)}}"
          ></bot-link>
        `))}
    `}_buildInfoListMessage(e,{groupIndex:t,messageIndex:i}){var s;const a=[vt.BOT_MESSAGE],r=i>0&&!a.includes(null===(s=this.controller.messages[t][i-1])||void 0===s?void 0:s.messageType);return L`
      ${e.map(((e,i)=>L`
          <bot-info-list
            .data="${e}"
            ?disabled="${t<this.currentConversationStartGroupIndex}"
            ?show-divider="${i>0||r}"
            @bot-info-list-click="${e=>this.controller._handleElementInteractionClick(e.detail.actionId?_t.ACTION:_t.MESSAGE,e.detail)}"
          ></bot-info-list>
        `))}
    `}_buildOptionListMessage(e,{groupIndex:t}){return L`
      <bot-option-list
        .data="${e[0]}"
        ?disabled="${t!==this.controller.messages.length-1}"
      ></bot-option-list>
    `}_buildMovementsListMessage(e,{groupIndex:t}){return L`
      <bot-movements-list
        .data="${e}"
        .localCurrency="${this.controller.localCurrency}"
        .language="${this.controller.language}"
        ?disabled="${t<this.currentConversationStartGroupIndex}"
        @bot-movements-list-click="${e=>this.controller._handleElementInteractionClick(_t.MESSAGE,e.detail)}"
      ></bot-movements-list>
    `}}const Xt={[ft.COPY]:"_copyText",[ft.CALL]:"_actionDispatchEvent"};class Nt{constructor(e){this.controller=e}executeAction(e,t){const i=Xt[e];this[i]&&this[i](e,t)}_copyText(e,{actionText:t,content:i}){navigator.clipboard.writeText(i),t&&(this.controller._notificationToast={...this.controller._notificationToast,visible:!0,text:t})}_actionDispatchEvent(e,t){this.controller._customDispatchEvent("digital-butler-chatbot-action-execute",{id:e,params:t})}}var Pt=V`
:host {
  --_digital-butler-chatbot-content-bg-color: var(--digital-butler-chatbot--_ambient--default-content-bg-color,var(--digital-butler-chatbot--custom--primary-ambient--default-content-bg-color,${s("colorPrimaryAltSurfaceAmbientDefault",a)}));
  --_digital-butler-chatbot-form-bg-color: var(--digital-butler-chatbot--_ambient--default-form-bg-color,var(--digital-butler-chatbot--custom--primary-ambient--default-form-bg-color,${s("colorPrimarySurfaceAmbientDefault",a)}));
}
`,qt=V`
:host {
  display: flex;
  flex-direction: column;
  height: var(--digital-butler-chatbot-height, var(--_digital-butler-chatbot-height, 100%));
  box-sizing: border-box;
  overflow-y: auto;
  overflow-x: hidden;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.content-wrapper {
  flex: 1;
  display: flex;
  flex-direction: column;
  justify-content: flex-end;
  background-color: var(--_digital-butler-chatbot-content-bg-color);
}

.messages-group {
  padding-bottom: 0.5rem;
  position: relative;
}

.writting-status {
  padding-bottom: 0.5rem;
}
.writting-status [data-tag-name=bbva-chat-bot] {
  gap: 1rem;
  padding: 0.5rem 1rem;
}

.suggestions-wrapper {
  background-color: var(--_digital-butler-chatbot-form-bg-color);
  padding: 1rem 1rem 0;
  display: flex;
  gap: 8px;
  flex-wrap: wrap;
}
.suggestions-wrapper [data-tag-name=bbva-button-default] {
  --button-default-min-width: 0;
  padding: 0.5rem 1rem;
}

.chat-form-wrapper {
  position: sticky;
  bottom: 0;
}
.chat-form-wrapper[shadowed] {
  box-shadow: 0 -3px 2px 0 rgba(18, 18, 18, 0.08);
}

.chat-form-container {
  background-color: var(--_digital-butler-chatbot-form-bg-color);
  padding: 1rem;
  position: relative;
  z-index: 1;
}

.section-error-wrapper {
  position: relative;
  padding: 0 1rem 1rem;
}
.section-error-wrapper [data-tag-name=bbva-progress-content] {
  position: absolute;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

[data-tag-name=bbva-notification-toast] {
  display: block;
  position: relative;
  --bbva-notification-toast-fixed-bottom-container-position: absolute;
}

[data-tag-name=bbva-chat-form] {
  --bbva-chat-form--_ambient--textarea-focus-color: none;
}
`,Mt=V`
#digital-butler-chatbot-full-error-modal .error-modal-microillustration {
  margin-bottom: 1rem;
}
#digital-butler-chatbot-full-error-modal .error-modal-title {
  margin-bottom: 0.5rem;
}
`;class Bt extends(i(t(B(F)))){static get is(){return"digital-butler-chatbot"}static get scopedElements(){const t=[st,at,I,D,Ve,ve,d,$,e,A,R,x,ye,...xt,...Bt.configurationScopedElements()];return Bt.scopedElementsFromClasses(t)}static get properties(){return{origin:{type:String},appVersion:{type:String,attribute:"app-version"},digitalButlerApiVersion:{type:String,attribute:"digital-butler-api-version"},singleSignOnApiVersion:{type:String,attribute:"single-sign-on-api-version"},localCurrency:{type:String,attribute:"local-currency"},conversationId:{type:String,attribute:"conversation-id"},messages:{type:Array},suggestions:{type:Array},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"},voiceTranscriptDisabled:{type:Boolean,attribute:"voice-transcript-disabled"},transcript:{type:String},historyExpiryHoursPeriod:{type:Number,attribute:"history-expiry-hours-period"},aapTarget:{type:String,attribute:"aap-target"},targetIdUniqueKey:{type:String,attribute:"target-id-unique-key"},pkcs7:{type:String},hostConversa:{type:String,attribute:"host-conversa"},initialMessage:{type:String,attribute:"initial-message"},refererId:{type:String,attribute:"referer-id"},attachModalsToBody:{type:Boolean,attribute:"attach-modals-to-body"},feedbackConfig:{type:Object,attribute:"feedback-config"},userProducts:{type:Object,attribute:"user-products"},_isBotWritting:{type:Boolean},_requestErrors:{type:Object},_currentRequests:{type:Object},_lastRequest:{type:Object},_notificationToast:{type:Object},_messageTracking:{type:Object},_internalFeatures:{type:Object},_lastConversationCreation:{type:Object}}}constructor(){super(),this.config={fixedHeader:!0,header:{variant:"modal-initial",text:"Blue",buttons:[{id:"btn-help",icon:oe(),accessibilityText:"digital-butler-chatbot-header-help"},{id:"btn-close",icon:le(),accessibilityText:"digital-butler-chatbot-header-close"}],id:"main-header","@header-main-icon-click":this._manageHeaderMainClicks.bind(this)},loader:!1,notify:!1},this.origin="",this.appVersion="",this.headers={},this.digitalButlerApiVersion="0",this.singleSignOnApiVersion="0",this.localCurrency="",this.conversationId="",this.messages=[],this.suggestions=[],this.maxRequestAttempts=3,this.voiceTranscriptDisabled=!1,this.transcript="",this.history={},this.historyExpiryHoursPeriod=24,this.aapTarget="",this.targetIdUniqueKey="",this.pkcs7="",this.hostConversa="",this.initialMessage="",this.refererId="",this.attachModalsToBody=!1,this.feedbackConfig={},this.userProducts={},this._isBotWritting=!1,this._requestErrors={conversationCreated:0,messageReceived:0},this._currentRequests={conversationCreated:!1,messageReceived:!1},this._lastRequest={},this._notificationToast={visible:!1,text:""},this._messageTracking={},this._internalFeatures={feedback:[]},this._lastConversationCreation={},this._componentCreator=new wt(this),this._actionProvider=new Nt(this),this._continuityMessages=[]}updated(e){var t,i,s,a;(super.updated(e),e.has("messages")||e.has("_isBotWritting"))&&(this._manageScrollAfterMessage(),this._isBotWritting||(null===(i=this.messages[this.messages.length-2])||void 0===i||null===(s=i[0])||void 0===s?void 0:s.messageType)!==vt.CONVERSATION_CREATION||this.updateComplete.then((()=>{this.chatFormElement.focus()})));(e.has("messages")&&null!==(t=this.messages)&&void 0!==t&&t.length&&this._customDispatchEvent("digital-butler-chatbot-history-messages-change",{history:this._getFeatureState(["messages"])}),e.has("history")&&this.history&&!e.get("history"))&&(null!==(a=Object.keys(this.history))&&void 0!==a&&a.length&&(this._lastConversationCreation=this._getLastConversationCreation(),this._updateFeatureState({...this.history,messages:this._removeExpiredMessages(this.history.messages)})),this._manageCreateConversation());e.has("refererId")&&this.refererId&&this.updateComplete.then((()=>{this._sendMessage({interactionType:gt.EVENT,event:bt.NAVIGATION_RETURN,params:[{name:"id",value:this.refererId}]})}))}firstUpdated(e){super.firstUpdated(e),this.setAttribute("role","application"),this._setupStickyChatForm()}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._disableStickyChatForm()}static get styles(){return[Pt,qt,Mt,J("digital-butler-chatbot-shared-styles"),O.secondary,Fe.primaryAlt,_e.primary,w.primary,n.primary,X.primary]}get conversationsDmElement(){return this._conversationsDmElement||(this._conversationsDmElement=this.shadowRoot.querySelector("#bbva-global-conversations-api-dm")),this._conversationsDmElement}get conversationDmElement(){return this._conversationDmElement||(this._conversationDmElement=this.shadowRoot.querySelector("#bbva-global-conversation-messages-api-dm")),this._conversationDmElement}get singleSignOnDmElement(){return this._singleSignOnDmElement||(this._singleSignOnDmElement=this.shadowRoot.querySelector("#bbva-global-single-sign-on-api-dm")),this._singleSignOnDmElement}get feedbackFeatureElement(){return this._feedbackFeatureElement||(this._feedbackFeatureElement=this.shadowRoot.querySelector('[data-tag-name="feedback-client-voice-connect"]')),this._feedbackFeatureElement}get scrollableContentElement(){return this._scrollableContentElement||(this._scrollableContentElement=this.shadowRoot.querySelector(".content-wrapper")),this._scrollableContentElement}get stickyDetectorElement(){return this._stickyDetectorElement||(this._stickyDetectorElement=this.shadowRoot.querySelector(".sticky-detector")),this._stickyDetectorElement}get chatFormWrapperElement(){return this._chatFormWrapperElement||(this._chatFormWrapperElement=this.shadowRoot.querySelector(".chat-form-wrapper")),this._chatFormWrapperElement}get chatFormElement(){return this._chatFormElement||(this._chatFormElement=this.shadowRoot.querySelector('[data-tag-name="bbva-chat-form"]')),this._chatFormElement}get _headers(){return this._accessToken?{...this.headers,authorization:`Bearer ${this._accessToken}`}:this.headers}_manageScrollAfterMessage(){setTimeout((()=>{var e,t;const i=(null===(e=this.messages[this.messages.length-2])||void 0===e?void 0:e.some((({messageType:e})=>e===vt.USER_MESSAGE)))?null===(t=[...this.shadowRoot.querySelectorAll('[data-tag-name="bot-user-message"]')].pop())||void 0===t?void 0:t.parentNode:[...this.shadowRoot.querySelectorAll(".messages-group")].pop(),s=this._isBotWritting?this.stickyDetectorElement:i,a=this.scrollableContentElement.offsetTop;this.scrollTo({top:((null==s?void 0:s.offsetTop)||a)-a,behavior:"smooth"}),this.clientHeight===this.scrollHeight&&this._manageContinuityMessages()}),0)}_setupStickyChatForm(){const e=document.body.clientHeight-this.getBoundingClientRect().top;this.style.setProperty("--_digital-butler-chatbot-height",`${e}px`);const t=()=>{this._chatFormStickyObserver&&this._chatFormStickyObserver.unobserve(this.stickyDetectorElement),this._chatFormStickyObserver=new IntersectionObserver((([e])=>{const t=1===e.intersectionRatio;this.chatFormWrapperElement.toggleAttribute("shadowed",!t),t&&this._manageContinuityMessages()}),{threshold:1,root:this,rootMargin:`0px 0px -${this.chatFormWrapperElement.clientHeight}px 0px`}),this._chatFormStickyObserver.observe(this.stickyDetectorElement)};this._chatFormResizeObserver=new ResizeObserver((()=>t())),this._chatFormResizeObserver.observe(this.chatFormWrapperElement)}_disableStickyChatForm(){this._chatFormStickyObserver&&this._chatFormStickyObserver.unobserve(this.stickyDetectorElement),this._chatFormResizeObserver&&this._chatFormResizeObserver.unobserve(this.chatFormWrapperElement)}_manageHeaderMainClicks(e){var t,i,s;const a=null==e||null===(t=e.detail)||void 0===t?void 0:t.index,r=null===(i=this.config.header)||void 0===i||null===(s=i.buttons)||void 0===s?void 0:s[a];"btn-close"===(null==r?void 0:r.id)?this.navigateBack():"btn-help"===(null==r?void 0:r.id)&&this._customDispatchEvent("digital-butler-chatbot-help-click")}_manageCreateConversation(){if(this.pkcs7)if(this.conversationId&&this._accessToken){const e=this.messages.findLastIndex((e=>e[0].messageType===vt.CONVERSATION_CREATION));this._componentCreator.setCurrentConversationStartGroupIndex(e)}else this._createConversation();else this._requestSingleSignOn()}_requestSingleSignOn(){this._isBotWritting=!0;const e={targetIdUniqueKey:this.targetIdUniqueKey,aapTarget:this.aapTarget};this.singleSignOnDmElement.postSingleSignOn(e)}_createConversation(){this._isBotWritting=!0;const e={authenticationData:[{authenticationData:[this.pkcs7],idAuthenticationData:"pkcs7-firma"}],customerMetaData:{appVersion:this.appVersion,origin:this.origin}};this.conversationsDmElement.postConversations(e)}_getLastConversationCreation(){var e,t,i;return(null===(e=this.history.messages.findLast((e=>e[0].messageType===vt.CONVERSATION_CREATION)))||void 0===e||null===(t=e[0])||void 0===t||null===(i=t.detail)||void 0===i?void 0:i[0])||{}}_startConversation(){const{timestamp:e,onboardingDisplayCounter:t=0,onboardingClickDate:i=null}=this._lastConversationCreation;this.messages=[...this.messages,[{messageType:vt.CONVERSATION_CREATION,detail:[{timestamp:Date.now(),onboardingDisplayCounter:t,onboardingClickDate:i}]}]],this._componentCreator.setCurrentConversationStartGroupIndex(this.messages.length-1),this._sendMessage({interactionType:this.initialMessage?gt.TEXT:gt.EVENT,event:this.initialMessage?"":bt.WELCOME,params:!this.initialMessage&&e?[{name:"lastConversationDate",value:new Date(e).toISOString()},{name:"onboardingDisplayCounter",value:t},...i?[{name:"onboardingClickDate",value:new Date(i).toISOString()}]:[]]:[],message:this.initialMessage,chatText:this.initialMessage})}_sendMessage({interactionType:e,message:t,event:i,params:s=[],chatText:a}){var r,n,o,l,c;const d=null===(r=this.messages[this.messages.length-1])||void 0===r?void 0:r.find((({messageType:e})=>e===vt.OPTION_LIST)),h=d&&(null===(n=d.detail)||void 0===n||null===(o=n[0])||void 0===o||null===(l=o.detail)||void 0===l||null===(c=l.find((({selected:e})=>e)))||void 0===c?void 0:c.id),u=e=>e.replace(/<[a-zA-Z]+[^\s]*/g,"");this._continuityMessages=[],this._isBotWritting=!0,this._lastRequest={customerMetaData:{appVersion:this.appVersion,origin:this.origin},interactionType:e,message:t?u(t):i,event:i,params:h?[...s,{name:"id",value:h}]:s},this.conversationDmElement.postConversationMessages(this.conversationId,this._lastRequest),a&&(this.messages=[...this.messages,[{messageType:vt.USER_MESSAGE,detail:[{content:u(a)}]}]])}static _convertParamsToObject(e){return(null==e?void 0:e.reduce(((e,t)=>({...e,[t.name]:t.value})),{}))||{}}_handleElementInteractionClick(e,t){const i={[_t.NAVIGATION]:"_handleNavigationClick",[_t.MESSAGE]:"_handleMessageClick",[_t.ACTION]:"_handleActionClick"}[e];i&&this[i](t),t.suggestionType&&(this.suggestions=[])}_handleMessageClick(e){var t,i,s;e.id===pt.ONBOARDING_CHIP&&(this.messages[this._componentCreator.currentConversationStartGroupIndex][0].detail[0].onboardingClickDate=Date.now()),this._sendMessage({interactionType:gt.BUTTON,message:yt.MESSAGE===(null===(t=e.messagePayload)||void 0===t?void 0:t.payloadType)?e.messagePayload.content:e.message,event:yt.EVENT===(null===(i=e.messagePayload)||void 0===i?void 0:i.payloadType)?e.messagePayload.content:"",chatText:e.message,params:null===(s=e.messagePayload)||void 0===s?void 0:s.params})}_handleNavigationClick({id:e,params:t}){this.navigateForward(e,Bt._convertParamsToObject(t))}_handleActionClick({id:e,params:t}){this._actionProvider.executeAction(e,Bt._convertParamsToObject(t))}async _handleBinaryFeedbackClick({detail:e},t){Object.keys(this.feedbackConfig).length?(this._lastFeedback={...e},this._isBotWritting=!0,this._lastFeedback.value?this.feedbackFeatureElement.setIsHidden(!0):this._loadFeedbackForm()):this._sendFeedbackContinuityMessage(e.value),this._dispatchEventWithMessageTracking("digital-butler-chatbot-feedback-fill",{forms:e.forms,rating:e.value},t)}_sendFeedbackContinuityMessage(e){const t=e?bt.FEEDBACK_POSITIVE:bt.FEEDBACK_NEGATIVE;this._sendMessage({interactionType:gt.BUTTON,event:t,message:t})}_loadFeedbackForm(){var e,t;this.feedbackFeatureElement.setExternalData({feedbackOrigin:{origin:this._lastFeedback.forms.origin.id,step:this._lastFeedback.value?this._lastFeedback.forms.positive.id:this._lastFeedback.forms.negative.id,runAll:!0},data:{rate_selected:this._lastFeedback.value,client_voice_connect_customfield1:this.conversationId,client_voice_connect_customfield2:null===(e=this.messages.findLast((e=>e.find((e=>e.messageType===vt.BINARY_FEEDBACK)))))||void 0===e||null===(t=e[0])||void 0===t?void 0:t.id}})}_submitFeedbackAndReset(){this.feedbackFeatureElement.addEventListener("feedback-client-voice-connect-success-submit",(()=>{this.feedbackFeatureElement.reset(),this._internalFeatures.feedback=[]}),{once:!0}),this.feedbackFeatureElement.submitExternal()}async _onFeedbackFormReady(){Object.keys(this._lastFeedback).length&&this._lastFeedback.value&&this._submitFeedbackAndReset(),this._sendFeedbackContinuityMessage(this._lastFeedback.value),this._lastFeedback={}}_onFeedbackLoadError(){this._sendFeedbackContinuityMessage(this._lastFeedback.value),this._lastFeedback={}}_onSingleSignOn({detail:e}){this.pkcs7=e.pkcs7,this._createConversation()}_onConversationCreated({detail:e}){this._requestErrors={...this._requestErrors,conversationCreated:0},this._currentRequests={...this._currentRequests,conversationCreated:!1},this._isBotWritting=!1,this.conversationId=e.conversationId,this._accessToken=e.accessToken,this.updateComplete.then((()=>{this._startConversation()}))}_onMessageReceived({detail:e}){var t,i,s,a,r,n;if(!e.messageTracking||(null===(t=e.messageTracking)||void 0===t?void 0:t.category)===(null===(i=this._messageTracking)||void 0===i?void 0:i.category)&&(null===(s=e.messageTracking)||void 0===s?void 0:s.subCategory)===(null===(a=this._messageTracking)||void 0===a?void 0:a.subCategory)&&(null===(r=e.messageTracking)||void 0===r?void 0:r.intent)===(null===(n=this._messageTracking)||void 0===n?void 0:n.intent)||this._customDispatchEvent("digital-butler-chatbot-intent-change",{messageTracking:e.messageTracking}),this._requestErrors={...this._requestErrors,messageReceived:0},this._currentRequests={...this._currentRequests,messageReceived:!1},e.messages.length){const t=e.messages.findIndex((({messageType:e})=>e===vt.MESSAGES_GROUP_DIVIDER)),i=t>-1,s=i?e.messages.slice(0,t):e.messages;this.messages=[...this.messages,[...s]],this._continuityMessages=i?e.messages.slice(t+1):[],this._handleOnboardingChip(e)}this.conversationId=e.conversationId,this.suggestions=e.suggestions||[],this._isBotWritting=!1,this._messageTracking={...this._messageTracking,...e.messageTracking}}_handleOnboardingChip({messages:e}){var t;if(null===(t=e.find((e=>e.messageType===vt.LINK)))||void 0===t?void 0:t.detail.find((e=>e.linkType===_t.MESSAGE&&e.id===pt.ONBOARDING_CHIP))){const e=this.messages[this._componentCreator.currentConversationStartGroupIndex][0].detail[0];this.messages[this._componentCreator.currentConversationStartGroupIndex][0].detail[0]=e.onboardingClickDate?{...e,onboardingDisplayCounter:1,onboardingClickDate:null}:{...e,onboardingDisplayCounter:e.onboardingDisplayCounter+1}}}_manageContinuityMessages(){if(this._continuityMessages.length){const e=this._continuityMessages;this._continuityMessages=[],this._isBotWritting=!0,setTimeout((()=>{this.messages=[...this.messages,[...e]],this._isBotWritting=!1}),pt.CONTINUITY_DELAY)}}navigateBack(e=!0){const t=this._getActiveInternalFeature();t?t.backMethod():(this.conversationId="",this._accessToken="",this.pkcs7="",this.suggestions=[],this._continuityMessages=[],this.refererId="",this.history=null,this._messageTracking={},e&&this._customDispatchEvent("navigation-go-back"))}_getActiveInternalFeature(){return{feedback:{element:this.feedbackFeatureElement,backMethod:()=>{this._internalFeatures.feedback.length>1?(this.feedbackFeatureElement.reset(),this._internalFeatures.feedback=[]):this._submitFeedbackAndReset()}}}[Object.keys(this._internalFeatures).find((e=>this._internalFeatures[e].length))]}_onRequestError(e){this._requestErrors={...this._requestErrors,[e]:this._requestErrors[e]+1},this._currentRequests={...this._currentRequests,[e]:!1},this._isBotWritting=!1,"conversationCreated"===e&&this._requestErrors.conversationCreated>this.maxRequestAttempts&&(this._customDispatchEvent("digital-butler-chatbot-conversation-error"),this.navigateBack()),"messageReceived"===e&&this._requestErrors.messageReceived>this.maxRequestAttempts&&this._customDispatchEvent("digital-butler-chatbot-message-error")}_customDispatchEvent(e,t){this.dispatchEvent(new CustomEvent(e,{composed:!0,bubbles:!0,detail:t}))}_dispatchEventWithMessageTracking(e,t,i){var s,a;this._customDispatchEvent(e,{messageTracking:{conversationId:this.conversationId,messageId:null===(s=this.messages[i])||void 0===s||null===(a=s[0])||void 0===a?void 0:a.id},...t})}_handleNavigation(){}navigateForward(e,t){this.history=this._getFeatureState(),this._customDispatchEvent("digital-butler-chatbot-navigation-external",{id:e,params:t,history:this.history})}_removeExpiredMessages(e=[]){const t=Date.now(),i=60*this.historyExpiryHoursPeriod*60*1e3,s=e.findIndex((e=>e[0].messageType===vt.CONVERSATION_CREATION&&t-e[0].detail[0].timestamp<=i));return s>-1?e.slice(s):[]}_updateFeatureState(e){Object.keys(e).forEach((t=>{this[t]=e[t]}))}_getFeatureState(e){const t=e||Object.keys(Bt.properties),i=e?[]:["history","refererId","_requestErrors"],s=e?[]:["_accessToken"],a=[...t.filter((e=>!i.includes(e))),...s].reduce(((e,t)=>({...e,[t]:this[t]})),{});return JSON.parse(JSON.stringify(a))}get _messagesTemplate(){return N(this.messages,((e,t)=>t),((e,t)=>L`
        <div class="messages-group">
          ${e[0].messageType!==vt.CONVERSATION_CREATION?L`
                <span class="sr-only">
                  ${e.find((e=>e.messageType===vt.USER_MESSAGE))?this.t("digital-butler-chatbot-messages-group-accessibility-text-user"):this.t("digital-butler-chatbot-messages-group-accessibility-text-bot")}
                </span>
              `:L``}
          ${N(e,((e,t)=>t),((e,i)=>this._componentCreator.getComponent(e,{groupIndex:t,messageIndex:i})))}
        </div>
      `))}get _botWrittingTemplate(){return this._isBotWritting?L`
          <div class="writting-status">
            <bbva-chat-bot
              description-ellipsis-lines="0"
              description-font-weight="400"
              .description="${this.t("digital-butler-chatbot-writing")}"
              clip-bot="writing"
            ></bbva-chat-bot>
          </div>
        `:L``}get _suggestionsTemplate(){var e;return null!==(e=this.suggestions)&&void 0!==e&&e.length?L`
          <div ambient="secondary" class="suggestions-wrapper">
            ${this.suggestions.map((e=>{var t,i;return L`
                <bbva-button-default
                  variant="${Y(null===(t=e.options)||void 0===t||null===(i=t.find((e=>"variant"===e.name)))||void 0===i?void 0:i.value)}"
                  @click="${()=>{this._dispatchEventWithMessageTracking("digital-butler-chatbot-suggestion-click",{suggestionType:e.suggestionType,title:e.title,id:e.id},this.messages.length-1),this._handleElementInteractionClick(e.suggestionType,e)}}"
                  >${e.title}</bbva-button-default
                >
              `}))}
          </div>
        `:L``}get _chatFormTemplate(){return L`
      <div ambient="primary" class="chat-form-wrapper">
        ${this._notificationToastTemplate}
        <div class="chat-form-container">
          <bbva-chat-form
            ?record="${!this.voiceTranscriptDisabled}"
            ?keep-talking-animation="${!this.voiceTranscriptDisabled}"
            text-placeholder="digital-butler-chatbot-form-placeholder"
            ?disabled="${this._isBotWritting||!this.conversationId}"
            .transcript="${this.transcript}"
            @chat-form-send-click="${({detail:e})=>{this.suggestions=[],this._sendMessage({interactionType:this.transcript?gt.VOICE:gt.TEXT,message:e,chatText:e}),this.transcript=""}}"
            @chat-form-mic-request="${()=>{this.transcript="",this._customDispatchEvent("digital-butler-chatbot-microphone-start",{language:this.language})}}"
            @chat-form-mic-cancel="${()=>this._customDispatchEvent("digital-butler-chatbot-microphone-stop",!0)}"
          ></bbva-chat-form>
        </div>
      </div>
    `}get _fullErrorTemplate(){return L`
      <div ambient="primary">
        <bbva-help-modal
          id="digital-butler-chatbot-full-error-modal"
          full-height
          fixed-footer
          avoid-icon-close-modal
          title-lines="0"
          ?attach-to-body="${this.attachModalsToBody}"
          .contentStyles="${this.attachModalsToBody?Mt:""}"
          .closeModalElements="${[]}"
          .headerCloseIconAriaLabel="${this.t("digital-butler-chatbot-modal-icon-aria-label")}"
          .headerText="${this.t("digital-butler-chatbot-error-modal-header")}"
          .buttonText="${this.t("digital-butler-chatbot-error-modal-link")}"
          ?disabled-button="${this._requestErrors.conversationCreated>this.maxRequestAttempts}"
          ?visible="${this._requestErrors.conversationCreated}"
          @help-modal-header-click="${this.navigateBack}"
          @help-modal-footer-button-click="${()=>{this._currentRequests={...this._currentRequests,conversationCreated:!0},this._manageCreateConversation()}}"
        >
          <div slot="slot-content">
            <bbva-clip-microillustration
              class="error-modal-microillustration"
              alt-microillustration="error"
              size="M"
            >
            </bbva-clip-microillustration>
            <bbva-type-text
              unset
              class="error-modal-title"
              text="${this.t("digital-butler-chatbot-error-modal-title")}"
              size="3XL"
              tag="h2"
              font-weight="700"
            >
            </bbva-type-text>
            <bbva-type-text
              .text="${this.t("digital-butler-chatbot-error-modal-text")}"
              size="S"
              tag="span"
            >
            </bbva-type-text>
            <bbva-progress-content
              .accessibilityText="${this.t("digital-butler-chatbot-loading-accessibility-text")}"
              variant="transparent"
              ?visible="${this._currentRequests.conversationCreated}"
            >
            </bbva-progress-content>
          </div>
        </bbva-help-modal>
      </div>
    `}get _sectionErrorTemplate(){const e=this._requestErrors.messageReceived<=this.maxRequestAttempts;return L`
      <div ambient="primary" class="section-error-wrapper">
        <bbva-notification-message
          variant="error"
          book-title
          .messageTitle="${e?this.t("digital-butler-chatbot-error-section-text"):this.t("digital-butler-chatbot-error-section-text-no-retries")}"
          .linkTitle="${e?this.t("digital-butler-chatbot-error-section-link"):""}"
          @notification-message-link-click="${()=>{this._currentRequests={...this._currentRequests,messageReceived:!0},this.conversationDmElement.postConversationMessages(this.conversationId,this._lastRequest)}}"
        ></bbva-notification-message>
        <bbva-progress-content
          .accessibilityText="${this.t("digital-butler-chatbot-loading-accessibility-text")}"
          variant="transparent"
          ?visible="${this._currentRequests.messageReceived}"
        ></bbva-progress-content>
      </div>
    `}get _notificationToastTemplate(){return L`
      <bbva-notification-toast
        auto-hide
        fixed-bottom
        type="success"
        .alertText="${this._notificationToast.text}"
        ?show="${this._notificationToast.visible}"
        @notification-toast-close="${()=>{this._notificationToast={...this._notificationToast,visible:!1}}}"
      ></bbva-notification-toast>
    `}get _dmsTemplate(){return L`
      <bbva-global-single-sign-on-api-dm
        id="bbva-global-single-sign-on-api-dm"
        .host="${this.host}"
        .headers="${Y(this.headers)}"
        .version="${this.singleSignOnApiVersion}"
        .native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @single-sign-on-api-dm-create="${this._onSingleSignOn}"
        @single-sign-on-api-dm-create-error="${()=>{this._onRequestError("conversationCreated")}}"
        @api-dm-error="${()=>{this._onRequestError("conversationCreated")}}"
      >
      </bbva-global-single-sign-on-api-dm>
      <bbva-global-conversations-api-dm
        id="bbva-global-conversations-api-dm"
        .host="${this.host}"
        .headers="${Y(this.headers)}"
        .version="${this.digitalButlerApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        @conversations-api-dm-create="${this._onConversationCreated}"
        @conversations-api-dm-create-error="${()=>{this._onRequestError("conversationCreated")}}"
        @api-dm-error="${()=>{this._onRequestError("conversationCreated")}}"
      >
      </bbva-global-conversations-api-dm>
      <bbva-global-conversation-messages-api-dm
        id="bbva-global-conversation-messages-api-dm"
        .host="${this.hostConversa}"
        .headers="${Y(this._headers)}"
        .version="${this.digitalButlerApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        @conversation-messages-api-dm-create="${this._onMessageReceived}"
        @conversation-messages-api-dm-create-error="${()=>{this._onRequestError("messageReceived")}}"
        @api-dm-error="${()=>{this._onRequestError("messageReceived")}}"
      >
      </bbva-global-conversation-messages-api-dm>
    `}get _feedbackFeatureTemplate(){return L`
      <feedback-client-voice-connect
        .appId="${this.feedbackConfig.appId}"
        .userId="${this.feedbackConfig.userId}"
        .countryId="${this.feedbackConfig.countryId}"
        .channelId="${this.feedbackConfig.channelId}"
        .segmentId="${this.feedbackConfig.segmentId}"
        .aapTarget="${this.feedbackConfig.aapTarget}"
        .targetIdUniqueKey="${this.feedbackConfig.targetIdUniqueKey}"
        .requiredTokenLocal="${this.requiredToken}"
        .requiredTokenGlobal="${this.requiredToken}"
        .isNative="${this.native}"
        .singleSignOnApiVersion="${this.feedbackConfig.singleSignOnApiVersion}"
        .customerFeedbackApiVersion="${this.feedbackConfig.customerFeedbackApiVersion}"
        .hostLocal="${this.host}"
        .hostGlobal="${this.feedbackConfig.hostGlobal}"
        .pathGlobal="${this.feedbackConfig.pathGlobal}"
        .authenticationData="${Y(this.feedbackConfig.authenticationData)}"
        .authenticationType="${Y(this.feedbackConfig.authenticationType)}"
        @feedback-client-voice-connect-external-data-added="${this._onFeedbackFormReady}"
        @feedback-client-voice-connect-form-hidden-change="${this._loadFeedbackForm}"
        @feedback-client-voice-connect-saturated-form-empty="${this._onFeedbackLoadError}"
        @feedback-client-voice-connect-onload-error="${this._onFeedbackLoadError}"
        @help-modal-open="${()=>{this._internalFeatures.feedback.push({currentPage:this.feedbackFeatureElement.currentPage})}}"
        @help-modal-close="${()=>{this._internalFeatures.feedback.pop()}}"
        @navigation-go-forward="${e=>{e.stopPropagation()}}"
        @navigation-go-back="${e=>{e.stopPropagation(),this._internalFeatures.feedback=[]}}"
      >
      </feedback-client-voice-connect>
    `}render(){return L`
      ${super.render()} ${this._dmsTemplate}
      <div ambient="primary-alt" class="content-wrapper" role="log">
        ${this._messagesTemplate} ${this._botWrittingTemplate}
        ${this._requestErrors.messageReceived?this._sectionErrorTemplate:L``}
        <div class="sticky-detector"></div>
      </div>
      ${this._suggestionsTemplate} ${this._chatFormTemplate} ${this._fullErrorTemplate}
      ${this._feedbackFeatureTemplate}
    `}}customElements.define(Bt.is,Bt);class Ft extends F{static get is(){return"bbva-analyticmanager-digital-butler"}static get properties(){return{availableActionsTypes:{type:Array},_persistData:{type:Object},_intentPage:{type:Object},initialModal:{type:Boolean}}}constructor(){super(),this.availableActionsTypes=[],this._persistData={},this._intentPage={},this.initialModal=!1}firstPageView({conversationId:e}){this._customMessageTracking({conversationId:e}),this._persistData.level2="inicio",this._firePersistData("page-view"),this.initialModal&&this.termsAndConditions()}termsAndConditions(){const{level2:e,level3:t,level4:i}=this._persistData;this._persistData.level2="terminos y condiciones",this._persistData.level3="",this._persistData.level4="",this._firePersistData("page-view-terms"),Object.assign(this._persistData,{level2:e,level3:t,level4:i})}setIntent({messageTracking:e}){this._intentPage=e,this._setPageName(e)}returnToConversation(){this._setPageName(this._intentPage),this._firePersistData("page-view")}ratingAction({rating:e,messageTracking:t}){this._customMessageTracking(t),this._interactionLevel(`consulta ${e?"":"no "}resuelta`,"rating")}linkIntentPage({id:e,title:t,linkType:i,messageTracking:s}){const a={NAVIGATION:()=>{this._firePageLink(e,t,"internal")},ACTION:()=>{this.availableActionsTypes.includes(e)&&this._firePageLink(e,t,"external")}};a[i]&&(this._customMessageTracking(s),a[i]())}_firePageLink(e,t,i){this._persistData.pageLink=`${null==e?void 0:e.toLowerCase()}|${null==t?void 0:t.toLowerCase()}`,this._firePersistData(`${i}-link`)}suggestionAction({title:e,id:t,messageTracking:i}){this._customMessageTracking(i),this._interactionLevel(`sugerencias|${t.toLowerCase()||""}|${e.toLowerCase()}`,"suggestion")}_customMessageTracking({conversationId:e,messageId:t}){var i;this._persistData.siteSearchTerm=`${e}${t?`|${t.toLowerCase()}`:""}`,null!==(i=this._intentPage)&&void 0!==i&&i.intent&&(this._persistData.customFields=`intent:${this._intentPage.intent}`)}_interactionLevel(e,t){this._persistData.interactionLevel=e,this._firePersistData(`interaction-level-${t}`)}_setPageName({category:e,subCategory:t}){this._persistData.level2=null==e?void 0:e.toLowerCase(),this._persistData.level3=null==t?void 0:t.toLowerCase()}siteError(){this._firePersistData("site-error")}pageError(){this._firePersistData("page-error")}reset(){this._persistData={},this._intentPage={},this.initialModal=!1}_firePersistData(e){this.dispatchEvent(new CustomEvent(`${Ft.is}-${e}`,{bubbles:!0,composed:!0,detail:this._persistData}))}}customElements.define(Ft.is,Ft);
