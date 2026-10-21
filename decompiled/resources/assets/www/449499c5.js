import{H as t,an as e,eh as i,aj as a,fb as o,cT as r,z as n,a8 as s,ac as l,ar as c,a9 as d,aa as b,a as h,ap as p,L as g,ag as v,F as m,b$ as u,ak as y,bx as f,b1 as _,h as k,i as x,aW as $,ad as S,ab as w,b0 as C,aJ as I,bj as T,b6 as L,dt as A,av as P,bU as M,ah as D,cU as E,ai as B,aN as z,dj as N,cS as R,bF as O,aV as V,f as F,g as q,cL as X,bc as W,au as H,al as j,aS as U,bl as J,f2 as Y,V as G,af as K,cN as Z,bh as Q,aw as tt,aK as et,ae as it,b_ as at,cE as ot,cF as rt,bt as nt,c0 as st,cG as lt,aq as ct,bw as dt,cq as bt,ci as ht,cV as pt,cW as gt,cX as vt,cY as mt,fc as ut,fd as yt,b5 as ft,cI as _t,ck as kt,aI as xt,bz as $t,bA as St,bf as wt,bH as Ct,cB as It,U as Tt,bI as Lt,be as At,v as Pt,di as Mt}from"./952f98a9.js";import{a7 as Dt,f as Et,ao as Bt,cB as zt}from"./7f3d7ca9.js";import"./bb2482ab.js";import{C as Nt}from"./216055dc.js";import"./af658024.js";import"./6547a2ba.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./c0a2f832.js";import"./cae0f1de.js";const Rt=t((t=>class extends t{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(t){return t.reduce(((t,e)=>(t[e.is]=e,t)),{})}_handleModalState(t){var e;const i=null==t||null===(e=t.detail)||void 0===e?void 0:e.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==i?void 0:i.visible,modal:i}}))}})),Ot=t((t=>class extends(Dt(Rt(e(t)))){static get properties(){return{_historicalNotification:{type:Array},_customerData:{type:Object},_enrollmentData:{type:Object},_accountClabe:{type:String},_listBanks:{type:Array},useCryptoJS:{type:Boolean},banxicoExternalLink:{type:String},_paymentInformationLocalStorageData:{type:Array}}}constructor(){super(),this._historicalNotification=[],this._customerData={},this._enrollmentData={},this._accountClabe="",this.useCryptoJS=!1,this._listBanks={2001:"BANXICO",37006:"BANCOMEXT",37009:"BANOBRAS",37019:"BANJERCITO",37135:"NAFIN",37166:"BaBien",37168:"HIPOTECARIA FED",40002:"BANAMEX",40012:"BBVA MEXICO",40014:"SANTANDER",40021:"HSBC",40030:"BAJIO",40036:"INBURSA",40042:"MIFEL",40044:"SCOTIABANK",40058:"BANREGIO",40059:"INVEX",40060:"BANSI",40062:"AFIRME",40072:"BANORTE",40106:"BANK OF AMERICA",40108:"MUFG",40110:"JP MORGAN",40112:"BMONEX",40113:"VE POR MAS",40127:"AZTECA",40128:"AUTOFIN",40129:"BARCLAYS",40130:"COMPARTAMOS",40132:"MULTIVA BANCO",40133:"ACTINVER",40136:"INTERCAM BANCO",40137:"BANCOPPEL",40138:"ABC CAPITAL",40140:"CONSUBANCO",40141:"VOLKSWAGEN",40143:"CIBANCO",40145:"BBASE",40147:"BANKAOOL",40148:"PAGATODO",40150:"INMOBILIARIO",40151:"DONDE",40152:"BANCREA",40154:"BANCO COVALTO",40155:"ICBC",40156:"SABADELL",40157:"SHINHAN",40158:"MIZUHO BANK",40159:"BANK OF CHINA",40160:"BANCO S3",90600:"MONEXCB",90601:"GBM",90602:"MASARI",90605:"VALUE",90608:"VECTOR",90616:"FINAMEX",90617:"VALMEX",90620:"PROFUTURO",90630:"CB INTERCAM",90631:"CI BOLSA",90634:"FINCOMUN",90638:"NU MEXICO",90646:"STP",90652:"CREDICAPITAL",90653:"KUSPIT",90656:"UNAGRA",90659:"ASP INTEGRA OPC",90661:"ALTERNATIVOS",90670:"LIBERTAD",90677:"CAJA POP MEXICA",90680:"CRISTOBAL COLON",90683:"CAJA TELEFONIST",90684:"TRANSFER",90685:"FONDO (FIRA)",90686:"INVERCAP",90688:"CREDICLUB",90689:"FOMPED",90703:"TESORED",90706:"ARCUS",90710:"NVIO",90722:"Mercado Pago W",90723:"Cuenca",90901:"CLS",90902:"INDEVAL",90903:"CoDi Valida"},this.banxicoExternalLink="",this._paymentInformationLocalStorageData=[]}_getBankNameByCode(t){return this._listBanks[t]||"No found"}getEnrollmentData(){this._fireEvent("get-local-storage-codi",{key:"enrollment_codi_key"})}setCustomerData(t){this._customerData=t,this.getEnrollmentData()}setDataCodiEnrollment(t){this._enrollmentData=t}setDataPaymentInformation(t){0===Object.keys(t).length||"null"===t?this._fireEvent("navigate-to-register-page"):t&&t.value.length>0&&(this._paymentInformationLocalStorageData=t.value)}setFirstAccountId(t){const e=t[0].products[0].id;this._fireEvent("set-account-id",e),this._fireEvent("request-get-account")}setAccountClabe(t){this._accountClabe=t.formats[0].number}_getBodyRequestToPostponeOrRejectMovement(t,e){var i,a,o,r,n,s,l,c;const d=e?"02":"04",b=e?"01":"00",h=t.id,p=new Date(t.hs).getTime(),g=t.cc,v=t.mt&&t.mt>0?t.mt:"-",m=new Date(t.hl).getTime(),u=t.idCE,y=this._enrollmentData.aliasCodi,f=this._enrollmentData.dv,_=null===(i=this._customerData)||void 0===i||null===(a=i.bank)||void 0===a?void 0:a.bankId,k=this._accountClabe,x=`${null===(o=this._customerData)||void 0===o||null===(r=o.firstName)||void 0===r?void 0:r.toUpperCase()} ${null===(n=this._customerData)||void 0===n||null===(s=n.lastName)||void 0===s?void 0:s.toUpperCase()} ${null===(l=this._customerData)||void 0===l||null===(c=l.secondLastName)||void 0===c?void 0:c.toUpperCase()}`,$=t.v.nc,S=t.v.dv,w=t.v.ci,C=t.v.tc,I=t.v.cb,T=t.v.nb;if(m&&!e){const t=moment(new Date(m),"America/Mexico_City"),e=this.t("codi-refactor-payment-postponed-page-text-panel-info",{expirationHour:t.format("HH:mm"),expirationDate:t.format("DD/MM/YYYY")});this._fireEvent("send-codi-payment-postponed-text",e)}return{originalNotificationChain:`${d}|${b}|${h}|${p}|${g}|${v}|${m}|-|${u}|${y}|${f}|${_}|40|${k}|${x}|${$}|${S}|${w}|${C}|${I}|${T}`}}getHistoricalMovements(){console.log("🚀 ~ trahemos info de aqui :"),this._fireEvent("get-local-storage-codi",{key:"codi_payments_information"}),this._fireEvent("get-local-storage-codi",{key:"codi_historical_notification"})}_hasPaymentInformation(t=""){let e=[];return e=this._paymentInformationLocalStorageData.find((e=>e.id.substring(0,10)===t.substring(0,10))),e||!1}parseHistoricalNotification(t){if(t&&t.value){this._rawNotificationsData=t,console.log("🚀 ~ this._rawNotificationsData:",this._rawNotificationsData),this._historicalNotification=this._rawNotificationsData.value,console.log("🚀 ~ detail.value",this._historicalNotification),this._historicalNotification=this._jsonParse(this._historicalNotification),console.log("🚀 ~ _jsonParse: ",this._historicalNotification),this._historicalNotification=this._removeDuplicateMovements(this._historicalNotification),console.log("🚀 ~ _removeDuplicateMovements: ",this._historicalNotification);const e=this._addNewFields(this._historicalNotification);return console.log("🚀 ~ _addNewFields: ",e),e}}_postponedMovement(t){const e=this._rawNotificationsData,i=e.value.findIndex((e=>JSON.parse(e.payload).id===t));e.value[i].body="Pago pospuesto",this._saveDataLocalStorage("codi_historical_notification",e),console.log("🚀 ~ codi_historical_notification ~ newPayload:",e)}_filterAndSortMovements(t,e){if(t.length>0){const i=this._filterMovementsByStatus(t,e);return i.sort(((t,e)=>e.date-t.date)),this._generateNotificationStructure(i)}return[]}_filterMovementsByStatus(t,e){return t.filter((t=>e.includes(t.status)))}_generateNotificationStructure(t){const e=[];return t.forEach((t=>{const i=this._formatDate(t.date),a=e.find((t=>t.date===i)),o={id:t.operationId,amount:t.amount,read:!0,name:this._truncateString(t.description,24),description:JSON.stringify([t.concept?t.concept:"Sin concepto"]),badge:t.status,currencyAmount:"USD",type:"",badgeClass:this._getBadgeClassByStatus(t.status),operativeActions:this._getOperativeActionsByStatus(t.status,t.operationId),payload:t,link:""};if(a)a.notifications.push(o);else{const t={date:i,notifications:[o]};e.push(t)}})),e}_truncateString(t,e){return t.length>e?`${t.substring(0,e)}...`:t}_getOperativeActionsByStatus(t,e=""){const n=[];switch(t){case"Pagado":n.push({icon:r(),label:"Compartir Comprobante",id:e});break;case"Por pagar":n.push({icon:i(),label:"Pagar ahora",id:e},{icon:o(),label:"Posponer",id:e},{icon:a(),label:"Rechazar pago",id:e});break;case"Pospuesto":n.push({icon:i(),label:"Pagar ahora",id:e},{icon:a(),label:"Rechazar pago",id:e})}return n}_getBadgeClassByStatus(t){let e="";switch(t){case"Pagado":case"Cobrado":e="green-badge";break;case"Por pagar":e="yellow-badge";break;case"Pospuesto":e="blue-badge";break;case"Tu contacto rechazo":case"Rechazado por ti":case"Vencido":e="red-badge";break;default:e=""}return e}_formatDate(t){return moment(t).format("DD [de] MMMM [de] YYYY")}_jsonParse(t){return t.map((t=>{const e={...t};return e.payload=JSON.parse(t.payload),e}))}_removeDuplicateMovements(t){return t.filter((e=>{const i=e.body,a=i.includes("Se le solicita un pago")||i.includes("Pago pospuesto"),o=t.some((t=>t.payload.id===e.payload.id&&t.body.includes("Has realizado un pago"))),r=t.some((t=>t.payload.id===e.payload.id&&t.body.includes("Se ha rechazado tu pago")));if(a&&!o&&!r)return e;if(!a){const i=t.find((t=>t.payload.id===e.payload.id&&t.body.includes("Se le solicita un pago")));return i?e.payload.cc=i.payload.cc:(e.payload.qrPayment=!0,e.payload.cc="Sin concepto*"),e}}))}_addNewFields(t){return t.map((t=>{var e,i,a,o,r;const n={...t},s=null==n?void 0:n.body;let l="",c="",d="";if(s.includes("Se le solicita un pago")||s.includes("Pago pospuesto")){var b,h,p,g;l=s.includes("Se le solicita un pago")?"Por pagar":"Pospuesto",c=`Pago a ${this._capitalizeWords(null==n||null===(b=n.payload)||void 0===b||null===(h=b.v)||void 0===h?void 0:h.nb)}`;const t=new Date,e=new Date(null==n||null===(p=n.payload)||void 0===p?void 0:p.hl);d=new Date(null==n||null===(g=n.payload)||void 0===g?void 0:g.hs),t>e&&(l="Vencido")}else if(s.includes("Has realizado un pago a")){var v,m,u;l="Pagado",c=`Pago a ${this._capitalizeWords(null==n||null===(v=n.payload)||void 0===v||null===(m=v.v)||void 0===m?void 0:m.nb)}`,d=new Date(null==n||null===(u=n.payload)||void 0===u?void 0:u.hp)}else if(s.includes("Se ha rechazado tu pago")){var y,f,_;l="Rechazado por ti",c=`Pago a ${this._capitalizeWords(null==n||null===(y=n.payload)||void 0===y||null===(f=y.v)||void 0===f?void 0:f.nb)}`,d=new Date(null==n||null===(_=n.payload)||void 0===_?void 0:_.hs)}else if(s.includes("Has recibido un pago de")){var k,x;l="Cobrado",c=`Cobro a ${this._capitalizeWords(null==n||null===(k=n.payload)||void 0===k||null===(x=k.c)||void 0===x?void 0:x.nb)}`,d=new Date(n.payload.hp)}else if(s.includes("Se ha rechazado el pago")){var $,S,w;l="Tu contacto rechazo",c=`Cobro a ${this._capitalizeWords(null==n||null===($=n.payload)||void 0===$||null===(S=$.c)||void 0===S?void 0:S.nb)}`,d=new Date(null==n||null===(w=n.payload)||void 0===w?void 0:w.hp)}const C=this._hasPaymentInformation(null==n||null===(e=n.payload)||void 0===e?void 0:e.id);return n.payload.cc=C?null==C?void 0:C.concept:null==n||null===(i=n.payload)||void 0===i?void 0:i.cc,n.operationId=null==n||null===(a=n.payload)||void 0===a?void 0:a.id,n.description=c,n.concept=null==n||null===(o=n.payload)||void 0===o?void 0:o.cc,n.amount=null==n||null===(r=n.payload)||void 0===r?void 0:r.mt,n.status=l,n.date=d,n.link="#",n.urlBanxico=C?C.urlBanxico:"",n}))}_capitalizeWords(t=""){return t.toLowerCase().split(" ").map((t=>t.charAt(0).toUpperCase()+t.slice(1))).join(" ")}_saveDataLocalStorage(t,e){const i={key:t,value:e};this._fireEvent("set-local-storage-codi",i)}_formatDateLarge(t){if(t){return moment(t).format("DD MMMM YYYY, HH:mm:ss [h]")}}_findMovementById(t,e){return t.find((t=>t.operationId===e))}_getBodyRequestToGetMovementDetail(t){const{payload:e}=t.payload,i=this._getAuthenticationId(e),a={operationId:e.id,authentication:{id:i,verificationNumber:e.v.dv},contactDetails:[{contact:e.v.nc,contactType:{id:"MOBILE_NUMBER"}}],pageSize:10,paginationKey:1};return console.log("🚀  bodyRequest:",a),a}_getAuthenticationId(t){if(this.useCryptoJS){const e=this._XORCipherCustom(this._enrollmentData.pass,this._enrollmentData.maKS),i=CryptoJS.SHA512(t.id.toString()+e).toString(CryptoJS.enc.Hex).substring(64,128),a=t.v.nc.toString()+this._addLeftZeros(t.v.dv.toString(),3)+t.id.toString(),o=CryptoJS.enc.Hex.parse(i),r=CryptoJS.HmacSHA256(a,o);return CryptoJS.enc.Base64.stringify(r)}return""}_decryptPayment(t,e){if(this.useCryptoJS){const i=this._XORCipherCustom(this._enrollmentData.pass,this._enrollmentData.maKS),a=CryptoJS.SHA512(e.toString()+i).toString(CryptoJS.enc.Hex),o=a.substring(0,32),r=a.substring(32,64),n=CryptoJS.enc.Hex.parse(r),s=CryptoJS.enc.Hex.parse(o),l=CryptoJS.AES.decrypt(t,s,{iv:n}).toString(CryptoJS.enc.Utf8);return JSON.parse(l)}return""}_XORCipherCustom(t,e){const i=t.length,a=[],o=[];let r="",n="";for(let r=0;r<i;r+=2)a.push(t.substring(r,r+2)),o.push(e.substring(r,r+2));for(let t=0;t<a.length;t++)r=parseInt(a[t],16)^parseInt(o[t],16),n+=this._addLeftZeros(r.toString(16),2);return n}_addLeftZeros(t,e){const i=e-t.length;return i>0?"0".repeat(i)+t:t}_fireEvent(t,e={}){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}})),Vt=new c;var Ft=n`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${s(d.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1em);
  --_bg-color-modal: var(--colorsPrimaryCore, ${s(d.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${s(d.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${s(d.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${s(d.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)})));
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
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

:host([position=fixed]) {
  --bbva-header-main-position: fixed;
  width: 100%;
  left: 0;
  right: 0;
}

.header-main {
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: relative;
  padding-top: var(--bbva-header-main-padding-top, 0);
  margin: 0 auto;
  min-height: var(--bbva-header-main-min-height, 3rem);
  max-width: var(--bbva-header-main-max-width, 100%);
}
.header-main .icon {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  border: none;
  background: none;
  width: var(--bbva-header-main-width, 3rem);
  min-height: var(--bbva-header-main-min-height, 3rem);
  padding: 0;
  color: inherit;
  margin: 0;
}
.header-main .header-icons {
  display: flex;
  flex: none;
}
.header-main .header-icons.half-space {
  min-width: 2.875rem;
}
.header-main .header-icons.full-space {
  min-width: 5.75rem;
}
.header-main .header-icons.right-group .icon.primary, .header-main .header-icons.right-group .icon.secondary {
  margin-left: auto;
}
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: calc(((0.25 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 10) * 1em);
}
.header-main .heading-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  top: var(--bbva-header-main-text-top, var(--bbva-header-main-padding-top, 0));
  left: 0;
  width: 100%;
  height: var(--bbva-header-main-min-height, 3rem);
  margin: 0;
  overflow: hidden;
  text-align: center;
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${s(l.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  min-width: 0;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1em);
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1em);
}

:host([variant*=modal]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal, var(--_bg-color-modal));
}

:host([variant*=modal-three-level]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal-three-level, var(--_bg-color-modal-three-level));
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .heading-wrapper .text-wrapper {
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .header-icons .text-icon {
  color: var(--_color-modal-three-level);
}

:host([variant*=process]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-process, var(--_bg-color-process));
}

:host([variant*=sign]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-sign, var(--_bg-color-sign));
}

:host([variant*=transparent]) {
  background-color: var(--_bg-color-transparent);
}

:host([show-text-icon]) .header-main {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .icon {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .heading-wrapper {
  height: var(--bbva-header-main-min-height, 3.5rem);
}

[data-tag-name=bbva-badge-notification] {
  --bbva-badge-notification-position-right: -0.5625rem;
  --bbva-badge-notification-position-top: -0.1875rem;
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
${Vt.mediaRules()}`;class qt extends(h(p(e(g)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":v,"bbva-icon":m,"bbva-badge-notification":u}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(e,i);return a in t?t[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[Ft,y("bbva-header-main-shared-styles"),f("button:focus"),_.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return k`<bbva-icon icon="${x(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return k`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,e,i,a){const o=qt.toCamelCase(t),r=`icon${o}`,n=`accessibilityTextIcon${o}`;return k`<button
      class="${e}"
      id="btn-${t}"
      aria-label="${x(this.t(this[n]))}"
      aria-expanded=${x(a)}
      ?hidden="${!this[r]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(r):this._icon(r)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(t){return k` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${x(this.t(t))}"
    >
    </bbva-text>`}_tplHeading(t){return k`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(t)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:i,image:a,_hasMicroillustration:o,microillustration:r}=this;return k`
      <header class="header-main">
        <div class="header-icons ${t} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${e}"
          id="heading"
          aria-label=${(r||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${x(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span class="${o}" ?hidden="${!r}" aria-hidden="true">
            ${this.microillustration&&$[this.microillustration]}
          </span>
        </h1>

        <div class="header-icons ${t} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(qt.is,qt);var Xt=n`
:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${s(d.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${s(d.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${s(d.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${s(d.secondary200)})));
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

.image {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${s(S.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${s(w.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${s(S.typeLarge)});
}
.title.not-text {
  margin-bottom: 0;
}

.description {
  margin: 0 auto;
  color: var(--_panel-info-text-color);
}

[data-tag-name=bbva-link] {
  display: inline-block;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}
[data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

:host([loading]):before {
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 144px 144px, calc((44% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 8px, 283% 168px, -20% 200px, 92% 232px;
}

:host([loading][image]):before {
  margin-top: 0;
  min-height: 17.5rem;
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 100% 152px, calc((44% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 0px, 283% 172px, -20% 204px, 92% 236px;
}

:host([loading]):before {
  content: "";
  position: absolute;
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  min-height: 18.5rem;
  display: inline-block;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
`,Wt=n`
[ambient^=light] {
  --bbva-panel-info-title-color: initial;
  --bbva-panel-info-text-color: initial;
  --bbva-panel-info-text-highlight-color: initial;
  --bbva-panel-info-skeleton-color: initial;
}
`,Ht=n`
[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${s(d.primaryMedium)});
}
`;const jt={light:n`
    ${C.light}
    ${Wt}
  `,dark:n`
    ${C.dark}
    ${Ht}
  `};class Ut extends(I(h(p(e(g))))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":T,"bbva-link":L,"bbva-text":v}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:Object},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration=A,this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1,this.heading="",this.linkText=""}static get styles(){return[Xt,super.styles,y("bbva-panel-info-shared-styles"),jt.light,jt.dark]}get _contentImage(){return this.image?k` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:k`
      <span
        class="${P({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${this.microillustration}</span
      >
    `}get _isEmptyState(){return this.microillustration===A}render(){return k`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&k`
          <bbva-text
            tabindex="0"
            class="title ${P({"not-text":!this.text})}"
            text=${this.t(this.heading)}
            size="L"
            alignment="center"
            tag="${x(this.headingLevelTitle)}"
            ?ellipsis="${!!this.headingLines}"
            .lines="${this.headingLines}"
            inherit
          ></bbva-text>
        `}
        ${this.t(this.text)&&k`
          <bbva-text
            tabindex="0"
            class="description"
            text=${this.t(this.text)}
            size="S"
            alignment="center"
            ?ellipsis="${!!this.textLines}"
            .lines="${this.textLines}"
            inherit
          ></bbva-text>
        `}
        ${k` <slot></slot> `}
        ${this.linkText&&k`
          <bbva-link
            ?disabled=${this.disabled}
            @click="${this._buttonClickHandler}"
            .text="${this.t(this.linkText)}"
          ></bbva-link>
        `}
      </div>
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(Ut.is,Ut);const Jt=new c;var Yt=n`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  box-sizing: border-box;
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1em);
  position: relative;
  background-color: var(--bbva-notification-message-dark-mode-background-color, var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${s(d.primarySubduedLight)})));
  --_notification-message-icon-color: var(--bbva-notification-message-dark-mode-icon-color, var(--bbva-notification-message-icon-color, var(--colorsPrimaryCoreDark, ${s(d.primaryCoreDark)})));
  --_notification-message-information-icon-color: var(--bbva-notification-message-dark-mode-information-icon-color, var(--bbva-notification-message-information-icon-color, var(--colorsTertiaryType3Dark, ${s(d.tertiaryType3Dark)})));
  --_notification-message-success-icon-color: var(--bbva-notification-message-dark-mode-success-icon-color, var(--bbva-notification-message-success-icon-color, var(--colorsTertiaryType6Dark, ${s(d.tertiaryType6Dark)})));
  --_notification-message-error-icon-color: var(--bbva-notification-message-dark-mode-error-icon-color, var(--bbva-notification-message-error-icon-color, var(--colorsTertiaryType1Dark, ${s(d.tertiaryType1Dark)})));
  --_notification-message-sustainability-icon-color: var(--bbva-notification-message-dark-mode-sustainability-icon-color, var(--bbva-notification-message-sustainability-icon-color, var(--colorsPrimaryVariantDark, ${s(d.primaryVariantDark)})));
  --_notification-message-information-background-color: var(--bbva-notification-message-dark-mode-information-background-color, var(--bbva-notification-message-information-background-color, var(--colorsTertiaryType3Lightened, ${s(d.tertiaryType3Lightened)})));
  --_notification-message-success-background-color: var(--bbva-notification-message-dark-mode-success-background-color, var(--bbva-notification-message-success-background-color, var(--colorsTertiaryType6Lightened, ${s(d.tertiaryType6Lightened)})));
  --_notification-message-error-background-color: var(--bbva-notification-message-dark-mode-error-background-color, var(--bbva-notification-message-error-background-color, var(--colorsTertiaryType5Lightened, ${s(d.tertiaryType5Lightened)})));
  --_notification-message-sustainability-background-color: var(--bbva-notification-message-dark-mode-sustainability-background-color, var(--bbva-notification-message-sustainability-background-color, var(--colorsPrimaryVariantLightened, ${s(d.primaryVariantLightened)})));
  --_notification-message-title-color: var(--bbva-notification-message-dark-mode-title-color, var(--bbva-notification-message-title-color, var(--colorsSecondary600, ${s(d.secondary600)})));
  --_notification-message-paragraph-color: var(--bbva-notification-message-dark-mode-paragraph-color, var(--bbva-notification-message-paragraph-color, var(--colorsSecondary600, ${s(d.secondary600)})));
  --_text-weight: var(--bbva-notification-message-dark-mode-text-weight, var(--bbva-notification-message-text-weight, var(--fontFacePrimaryBookFontWeight, ${s(w.book.fontWeight)})));
  --skeleton-quote-color: var(--bbva-notification-message-dark-mode-skeleton-color, var(--bbva-notification-message-skeleton-color, var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)})));
  --skeleton-quote-bg: var(--bbva-notification-message-dark-mode-skeleton-bg-color, var(--bbva-notification-message-skeleton-bg-color, var(--colorsPrimarySubduedLight, ${s(d.primarySubduedLight)})));
  --_notification-message-skeleton-animated-layer-bg: var(--bbva-notification-message-dark-mode-skeleton-animated-layer-bg-color, var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)}));
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

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-size: var(--bbva-notification-message-title-size, var(--typographyTypeLarge, ${s(l.typeLarge)}));
}

.paragraph {
  color: var(--_notification-message-paragraph-color);
  font-weight: var(--bbva-notification-message-paragraph-weight, var(--_text-weight));
  font-size: var(--bbva-notification-message-paragraph-size, var(--typographyTypeSmall, ${s(l.typeSmall)}));
  line-height: var(--bbva-notification-message-line-height, var(--lineHeightTypeSmall, ${s(S.typeSmall)}));
}
.paragraph:not(.no-space) {
  padding: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

:host([hide-bottom-padding-paragraph]) > .paragraph {
  padding: 0;
}

.description {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-style: var(--fontFacePrimaryMediumFontStyle, ${s(w.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${s(w.medium.fontWeight)});
}

:host([description][description-text-italic]) > .description {
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${s(w.mediumItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${s(w.mediumItalic.fontWeight)});
}

[data-tag-name=bbva-icon] {
  margin: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  --bbva-icon-color: var(--_notification-message-icon-color);
}

[data-tag-name=bbva-link]:not(.no-space) {
  padding: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

:host([hide-bottom-padding-link]) [data-tag-name=bbva-link] {
  padding: 0;
}

[data-tag-name=bbva-button-default][variant="icon no-background"] {
  position: absolute;
  top: 0;
  right: 0;
}

:host([variant=information]) {
  background-color: var(--_notification-message-information-background-color);
}
:host([variant=information]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-information-icon-color);
}

:host([variant=success]) {
  background-color: var(--_notification-message-success-background-color);
}
:host([variant=success]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-success-icon-color);
}

:host([variant=error]) {
  background-color: var(--_notification-message-error-background-color);
}
:host([variant=error]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-error-icon-color);
}

:host([variant=sustainability]) {
  background-color: var(--_notification-message-sustainability-background-color);
}
:host([variant=sustainability]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-sustainability-icon-color);
}

:host([loading]) {
  position: relative;
  pointer-events: none;
  background-repeat: no-repeat;
  overflow: hidden;
  opacity: 1;
  height: 10.125rem;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 24px 24px, calc((87% * 2) + (16px/ 2)) 16px, calc((87% * 2) + (16px/ 2)) 16px, calc((64.5% * 2) + (16px/ 2)) 16px;
  background-position: 50% 32px, -7% 72px, -7% 96px, -17.3% 120px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  height: inherit;
  top: 0;
  right: 0;
  left: 6.25rem;
}
:host([loading]):host([variant=default]) .skeleton {
  background-color: var(--bbva-notification-message-dark-mode-background-color, var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${s(d.primarySubduedLight)})));
}
:host([loading]):host([variant=information]) {
  background-color: var(--_notification-message-information-background-color);
}
:host([loading]):host([variant=information]) .skeleton {
  background-color: var(--_notification-message-information-background-color);
}
:host([loading]):host([variant=success]) {
  background-color: var(--_notification-message-success-background-color);
}
:host([loading]):host([variant=success]) .skeleton {
  background-color: var(--_notification-message-success-background-color);
}
:host([loading]):host([variant=error]) {
  background-color: var(--_notification-message-error-background-color);
}
:host([loading]):host([variant=error]) .skeleton {
  background-color: var(--_notification-message-error-background-color);
}
:host([loading]):host([variant=sustainability]) {
  background-color: var(--_notification-message-sustainability-background-color);
}
:host([loading]):host([variant=sustainability]) .skeleton {
  background-color: var(--_notification-message-sustainability-background-color);
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
${Jt.mediaRules()}`;class Gt extends(h(e(I(g)))){static get is(){return"bbva-notification-message"}static get scopedElements(){return{"bbva-button-default":M,"bbva-link":L,"bbva-icon":m,"bbva-text":v}}static get properties(){return{iconSize:{type:Number,attribute:"icon-size"},icon:{type:String,attribute:"icon"},messageTitle:{type:String,attribute:"message-title"},message:{type:String},description:{type:String},tagTitle:{type:String,attribute:"tag-title"},linkTitle:{type:String,attribute:"link-title"},linkIcon:{type:String,attribute:"link-icon"},buttonText:{type:String,attribute:"button-text"},href:{type:String},loading:{type:Boolean,reflect:!1},variant:{type:String,reflect:!0},iconClose:{type:Boolean,attribute:"icon-close"},hideBottomPaddingParagraph:{type:Boolean,attribute:"hide-bottom-padding-paragraph"},hideBottomPaddingLink:{type:Boolean,attribute:"hide-bottom-padding-link"},descriptionTextItalic:{type:Boolean,attribute:"description-text-italic"},accessibilityLinkLabel:{type:String,attribute:"accessibility-link-label"}}}constructor(){super(),this.iconClose=!1,this.iconSize=24,this.variant="default",this._types={default:D(),information:E(),success:B(),error:z(),sustainability:N()},this.hideBottomPaddingParagraph=!1,this.hideBottomPaddingLink=!1,this.descriptionTextItalic=!1,this.loading=!1,this.accessibilityLinkLabel="bbva-notification-message-accessibility-link-label",this._accessibilityTextIcon="bbva-notification-message-accessibility-icon-text-",this.tagTitle="p"}static get styles(){return[super.styles,Yt,y("bbva-notification-message-shared-styles"),R.light]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.isRoleAlert?this.setAttribute("role","alert"):this.setAttribute("role","status"),this.disabledTabindex=!0}get isRoleAlert(){return"error"===this.variant}get _icon(){return this.icon?this.icon:this._types[this.variant]||D()}get _closeIcon(){return this.iconClose&&"default"===this.variant?k`
          <bbva-button-default
            variant="icon no-background"
            .icon="${O()}"
            @click="${this._iconClick}"
            aria-label="${this.t("bbva-notification-message-close")}"
          >
          </bbva-button-default>
        `:V}get _title(){return this.messageTitle?k`
          <bbva-text
            .tag="${this.tagTitle}"
            alignment="center"
            .text="${this.messageTitle}"
            class="title"
            unset
            size="M"
          ></bbva-text>
        `:V}get _paragraph(){return k`<div
      class="paragraph
            ${P({"no-space":!this.buttonText&&!this.linkTitle})}"
    >
      ${this.message?k`<bbva-text alignment="center" text=${this.message} unset size="S"></bbva-text> `:k`<slot></slot>`}
    </div>`}get _description(){return this.description?k` <bbva-text
          class="description"
          alignment="center"
          .text=${this.description}
          unset
          size="S"
        ></bbva-text>`:V}get _link(){return this.linkTitle?k`
          <bbva-link
            aria-label="${this.t(this.accessibilityLinkLabel)}"
            class="${P({"no-space":!this.buttonText})}"
            variant="message"
            .href="${this.href}"
            @click="${this._linkClick}"
            .icon="${this.linkIcon}"
          >
            <span>${this.linkTitle}</span>
          </bbva-link>
        `:V}get _button(){return this.buttonText?k`
          <bbva-button-default
            ambient="light"
            data-tag-name="bbva-button-default"
            text="${this.buttonText}"
            @click="${this._buttonClick}"
          ></bbva-button-default>
        `:V}get _accessibilityIconDescription(){return`${this._accessibilityTextIcon}${this.variant}`}_iconClick(){this.dispatchEvent(new CustomEvent("notification-message-icon-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("notification-message-link-click",{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){this.dispatchEvent(new CustomEvent("notification-message-button-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return k`${this.loading?k`<div class="skeleton"></div> `:k` ${this._closeIcon}
          <bbva-icon
            data-tag-name="bbva-icon"
            role="img"
            aria-label=${this.t(this._accessibilityIconDescription)}
            .icon="${this._icon}"
            .size="${this.iconSize}"
          ></bbva-icon>
          ${this._title} ${this._paragraph} ${this._description} ${this._link} ${this._button}`}`}}customElements.define(Gt.is,Gt);var Kt=n`[ambient^=light] {
  --bbva-date-color: initial;
  --bbva-date-skeleton-color: initial;
}
${(new c).mediaRules()}`;const Zt=new c;var Qt=n`[ambient^=dark] {
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-date-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${s(d.primaryCoreDark)});
}
${Zt.mediaRules()}`;const te={dark:n`
    ${_.dark}
    ${Qt}
  `,light:n`
    ${_.light}
    ${Kt}
  `},ee=new c;var ie=n`:host {
  display: inline-block;
  box-sizing: border-box;
  position: relative;
  --bbva-text-color: var(--bbva-date-dark-mode-color, var(--bbva-date-color, token("foundations.colors.secondary600")));
  --skeleton-quote-color: var(--bbva-date-dark-mode-skeleton-quote-color, var(--bbva-date-skeleton-quote-color, var(--colorsSecondary200, ${s(d.secondary200)})));
  --skeleton-quote-bg: var(--bbva-date-dark-mode-skeleton-bg, var(--bbva-date-skeleton-bg, transparent));
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

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-block;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((50px * 2) + (15px/ 2)) 15px;
  background-position: 0 0;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
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
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  white-space: nowrap;
}
${ee.mediaRules()}`;class ae extends(h(e(I(g)))){static get is(){return"bbva-date"}static get scopedElements(){return{"bbva-text":v}}static get properties(){return{date:{type:Date,converter:t=>new Date(t)},locale:{type:String},options:{type:Object},utc:{type:Boolean},clockSuffix:{type:String,attribute:"clock-suffix"},loading:{type:Boolean,reflect:!0},dateRange:{type:Array,attribute:"date-range"}}}constructor(){super(),this.date=new Date,this.locale="es-ES",this.utc=!1,this.clockSuffix="h",this.loading=!1,this.disabledTabindex=!0,this.options={day:"2-digit",month:"long",year:"numeric"}}static get styles(){return[super.styles,ie,y("bbva-date-shared-styles"),te.light,te.dark]}updated(t){var e,i;super.updated&&super.updated(t),0===(null===(e=this.dateRange)||void 0===e?void 0:e.length)&&(this.date=""),!this.isValidRange&&this.date&&this._dateFormat(this.date)!==this._currentDate&&(this._currentDate=this._dateFormat(this.date),this._handleChange()),(null===(i=this.dateRange)||void 0===i?void 0:i.length)>0&&this._fromToDateFormat(this.dateRange)!==this._currentDate&&(this._currentDate=this._fromToDateFormat(this.dateRange).join(""),this._handleChange())}_handleChange(){this.dispatchEvent(new CustomEvent("date-change",{composed:!0,bubbles:!0,detail:{value:this._currentDate}}))}get isValid(){return this.date&&"Invalid Date"!==this.date.toLocaleDateString()}get isValidRange(){var t;return(null===(t=this.dateRange)||void 0===t?void 0:t.length)>0&&"Invalid Date"!==this._fromToDateFormat(this.dateRange)}_dateFormat(t){const e=this.utc?{...this.options,timeZone:"UTC"}:this.options,i=e.day||e.month||e.year;return e.hour&&e.minute&&!i?t.toLocaleTimeString(this.locale,e).concat(` ${this.clockSuffix}`):t.toLocaleDateString(this.locale,e)}_fromToDateFormat(t){return[new Date(t[0]),new Date(t[1])].map(((t,e)=>t.toLocaleDateString(this.locale,this.options).concat(0===e?" - ":"")))}_fromToDateFormatA11y(t){const e=new Date(t[0]),i=new Date(t[1]),a={...this.options};return a.month="long",[e,i].map(((t,e)=>t.toLocaleDateString(this.locale,a).concat(0===e?` ${this.t("bbva-date-to-the")} `:""))).join("")}get _tplDate(){return this.isValid&&this.date&&!this.isValidRange&&k` <bbva-text
          unset
          text="${this._dateFormat(this.date)}"
          font-weight="500"
          font-style="italic"
          size="S"
        >
        </bbva-text>`||V}get _tplDateRange(){var t;return this.isValidRange&&(null===(t=this.dateRange)||void 0===t?void 0:t.length)>0&&k`
          <bbva-text
            unset
            text="${this._fromToDateFormat(this.dateRange)}"
            font-weight="500"
            font-style="italic"
            size="S"
            aria-hidden="true"
          >
          </bbva-text>
          <span data-id="sr-only" class="sr-only"
            >${this._fromToDateFormatA11y(this.dateRange)}</span
          >
        `||V}render(){return k` ${this._tplDate} ${this._tplDateRange} `}}q("colors.primaryCoreLightened"),q("colors.cool50");var oe=n`[ambient^=light] {
  --bbva-list-highlight-bg-color-pressed: initial;
  --bbva-list-highlight-link-color-pressed: initial;
  --bbva-list-highlight-icon-color: initial;
  --bbva-list-highlight-highlighted-color: initial;
  --bbva-list-highlight-sky-highlighted-color: initial;
  --bbva-list-highlight-color: initial;
  --bbva-list-highlight-heading-color: initial;
  --bbva-list-highlight-skeleton-color: initial;
  --bbva-list-highlight-icon-link-color: initial;
  --bbva-list-highlight-skeleton-color: initial;
}
${(new c).mediaRules()}`;const re=new c;const ne={dark:n`
    ${n`[ambient^=dark] {
  --bbva-list-highlight-bg-color-pressed: var(--colorsPrimaryCoreDark, ${s(d.primaryCoreDark)});
  --bbva-list-highlight-link-color-pressed: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-list-highlight-icon-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-list-highlight-highlighted-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-list-highlight-sky-highlighted-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-list-highlight-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-list-highlight-heading-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-list-highlight-skeleton-color: var(--colorsPrimaryMedium, ${s(d.primaryMedium)});
  --bbva-list-highlight-icon-link-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
}
${re.mediaRules()}`}
    ${X.dark}
    ${W.dark}
    ${H.dark}
    ${te.dark}
    ${C.dark}
    ${j.dark}
  `,light:n`
    ${oe}
    ${X.light}
    ${W.light}
    ${H.light}
    ${te.light}
    ${C.light}
    ${j.light}
  `},se=new c;var le=n`:host {
  display: block;
  box-sizing: border-box;
  position: relative;
  font-size: var(--typographyTypeSmall, ${s(l.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${s(w.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${s(w.book.fontStyle)});
  line-height: var(--lineHeightTypeSmall, ${s(S.typeSmall)});
  --_list-highlight-skeleton-quote-color: var(--bbva-list-highlight-skeleton-dark-mode-color, var(--bbva-list-highlight-skeleton-color, var(--colorsSecondary200, ${s(d.secondary200)})));
  --_list-highlight-skeleton-quote-bg: var(--bbva-list-highlight-skeleton-bg-dark-mode-color, var(--bbva-list-highlight-skeleton-bg, transparent));
  --_list-highlight-heading-color: var(--bbva-list-highlight-heading-dark-mode-color, var(--bbva-list-highlight-heading-color, var(--colorsSecondary500, ${s(d.secondary500)})));
  --_list-highlight-bg-color-pressed: var(--bbva-list-highlight-bg-dark-mode-color-pressed, var(--bbva-list-highlight-bg-color-pressed, var(--colorsSecondary100, ${s(d.secondary100)})));
  --_list-highlight-link-color-pressed: var(--bbva-list-highlight-link-dark-mode-color-pressed, var(--bbva-list-highlight-link-color-pressed, var(--colorsPrimaryCore, ${s(d.primaryCore)})));
  --_list-highlight-icon-color: var(--bbva-list-highlight-icon-dark-mode-color, var(--bbva-list-highlight-icon-color, var(--colorsSecondary500, ${s(d.secondary500)})));
  --_list-highlight-icon-link-color: var(--bbva-list-highlight-icon-link-dark-mode-color, var(--bbva-list-highlight-icon-link-color, var(--colorsPrimaryMedium, ${s(d.primaryMedium)})));
  --_list-highlight-highlighted-color: var(--bbva-list-highlight-highlighted-dark-mode-color, var(--bbva-list-highlight-highlighted-color,var(--colorsPrimaryCore, ${s(d.primaryCore)})));
  --_list-highlight-sky-highlighted-color: var(--bbva-list-highlight-sky-highlighted-dark-mode-color, var(--bbva-list-highlight-sky-highlighted-color, var(--colorsPrimarySubduedLight, ${s(d.primarySubduedLight)})));
  --_list-highlight-color: var(--bbva-list-highlight-dark-mode-color, var(--bbva-list-highlight-color, var(--colorsSecondary500, ${s(d.secondary500)})));
  --bbva-amount-color: var(--_list-highlight-heading-color);
  --bbva-text-color: var(--_list-highlight-heading-color);
  --bbva-badge-category-icon-color: var(--_list-highlight-icon-color);
}

:host(:active) {
  background: var(--_list-highlight-bg-color-pressed);
  --bbva-list-header-link-color: var(--_list-highlight-link-color-pressed);
}

:host::before {
  content: "";
  position: absolute;
  left: 0;
  height: 100%;
  width: 0.25rem;
  background: var(--_list-highlight-highlighted-color);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.header-text {
  margin: 0;
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  overflow: hidden;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host(.sky)::before {
  background-color: var(--_list-highlight-sky-highlighted-color);
}

.container {
  width: 100%;
  padding: var(--bbva-list-highlight-container-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem));
}

.attached {
  margin: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem) 0;
}

.clip {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

.content {
  display: flex;
  flex-direction: column;
}

:host([clip-box-size=small]) .content {
  margin-left: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

:host([clip-box-size=medium]) .content, :host([clip-box-size=large]) .content {
  margin-left: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

:host([icon]) .content, :host([image]) .content {
  margin-left: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-core-icon],
.content, .info {
  color: var(--_list-highlight-color);
}

.info {
  display: flex;
  flex-direction: column;
  align-items: flex-end;
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

[data-tag-name=bbva-badge-category] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-clip-box] {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

.entity-container {
  display: flex;
  flex-flow: nowrap;
  align-items: center;
}

[data-tag-name=bbva-link] {
  text-decoration: none;
  overflow: hidden;
  display: block;
}
[data-tag-name=bbva-link]::after {
  content: "";
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
}

.list-header {
  display: flex;
  align-items: center;
  line-height: var(--lineHeightTypeSmall, ${s(S.typeSmall)});
  font-size: var(--typographyTypeSmall, ${s(l.typeSmall)});
}

.right {
  margin-left: auto;
  white-space: nowrap;
  min-width: calc(((7.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  text-align: right;
}

.header-icon {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  flex-shrink: 0;
  color: var(--_list-highlight-icon-color);
}

:host([long-amount]) .header-text {
  order: 1;
}
:host([long-amount]) .description0 {
  order: 2;
}
:host([long-amount]) .entity-container {
  order: 3;
}
:host([long-amount]) [data-tag-name=bbva-amount], :host([long-amount]) [data-tag-name=bbva-date] {
  order: 4;
}
:host([long-amount]) .description1 {
  order: 5;
}
:host([long-amount]) .description2 {
  order: 6;
}
:host([long-amount]) .description3 {
  order: 7;
}
:host([long-amount]) [data-tag-name=bbva-badge-default] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  order: 8;
}
:host([long-amount]) [data-tag-name=bbva-badge-category] {
  order: 9;
}
:host([long-amount]) [data-tag-name=bbva-link] {
  display: flex;
  justify-content: flex-start;
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-block;
  width: 100%;
  height: var(--bbva-list-highlight-skeleton-height, 4.75rem);
  pointer-events: none;
  background-repeat: no-repeat;
  line-height: var(--lineHeightTypeSmall, ${s(S.typeSmall)});
  font-size: var(--typographyTypeSmall, ${s(l.typeSmall)});
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--_list-highlight-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_list-highlight-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_list-highlight-skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_list-highlight-skeleton-quote-color) 50%);
  background-color: var(--_list-highlight-skeleton-quote-bg);
  background-size: 24px 24px, calc((37% * 2) + (16px/ 2)) 16px, calc((23% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px;
  background-position: 16px 16px, 56px 16px, calc(100% - 16px) 16px, 56px 44px;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
:host([link]:not([link=""])) .header-text {
  color: var(--_list-highlight-icon-link-color);
  font-style: var(--fontFacePrimaryMediumFontStyle, ${s(w.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${s(w.medium.fontWeight)});
}
:host([link]:not([link=""])) .header-icon {
  color: var(--_list-highlight-icon-link-color);
}

.row {
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
  width: 100%;
}

.column {
  display: flex;
  flex-direction: column;
  flex: 1;
}

.break {
  flex-basis: 100%;
  height: 0;
}

.end {
  align-items: flex-end;
}

[data-tag-name=bbva-clip-entities] {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}
${se.mediaRules()}`;class ce extends(U(e(I(h(g))))){static get is(){return"bbva-list-highlight"}static get scopedElements(){const t=[K,Z,Q,tt,ae,L,et,it,v];return ce.scopedElementsFromClasses(t)}static get properties(){return{heading:{type:String},subtitles:{type:Array},date:{type:String},dateFormat:{type:Object,attribute:"date-format"},image:{type:String,reflect:!0},attached:{type:Boolean},badge:{type:String},badgeColor:{type:String,attribute:"badge-color"},boxAccessibilityText:{type:String,attribute:"box-accessibility-text"},attachedAccessibilityText:{type:String,attribute:"attached-accessibility-text"},entity:{type:String},entityText:{type:String,attribute:"entity-text"},account:{type:String},accountVisibleChars:{type:Number,attribute:"account-visible-chars"},maskedChar:{type:String,attribute:"masked-char"},categoryIcon:{type:String,attribute:"category-icon"},textCategory:{type:String,attribute:"text-category",reflect:!0},category:{type:String},link:{type:String,reflect:!0},linkAccesibilityLabel:{type:String,attribute:"link-accessibility-label"},amount:{type:String},variantAmount:{type:String},icon:{type:String,reflect:!0},iconAriaLabel:{type:String},clipBoxText:{type:String,attribute:"clip-box-text"},clipBoxSize:{type:String,attribute:"clip-box-size",reflect:!0},decimalDigits:{type:Number,attribute:"decimal-digits"},type:{type:String},ellipsis:{type:Boolean},longAmount:{type:Boolean,attribute:"long-amount"},loading:{type:Boolean,reflect:!0}}}static get styles(){return[super.styles,le,y("bbva-list-highlight-shared-styles"),ne.light,ne.dark]}constructor(){super(),this.longAmount=!1,this.variantAmount="xl",this.dateFormat={day:"2-digit",month:"long",year:"numeric"},this.decimalDigits=2,this.accountVisibleChars=4,this.maskedChar="•",this.loading=!1,this.ellipsis=!1}_clicked(){this.dispatchEvent(new CustomEvent("list-highlight-link-click",{detail:!0,bubbles:!0,composed:!0}))}get _badge(){return this.badge?k`
          <bbva-badge-default .text="${this.badge}" type="${this.badgeColor}"></bbva-badge-default>
        `:""}clipBoxTemplate(){return k`
      <bbva-clip-box
        class="bitone"
        .text="${this.clipBoxText}"
        .size="${this.clipBoxSize}"
        .accessibilityText="${this.BoxAccessibilityText}"
        ?hidden="${!this.clipBoxText}"
      ></bbva-clip-box>
    `}iconTemplate(){return k`
      <bbva-core-icon
        class="header-icon"
        role="img"
        .src="${this.image}"
        aria-label="${x(this.t(this.iconAriaLabel))}"
        .icon="${this.icon}"
        ?hidden="${!this.icon}"
        aria-hidden="${this.icon&&!this.iconAriaLabel}"
        style="${J(this._headingIconColor)}"
      ></bbva-core-icon>
    `}get _headingIconColor(){return{color:this.headingIconColor||""}}textHeaderTemplate(){return k`
      <bbva-text
        class="header-text"
        ?ellipsis="${this.ellipsis}"
        .text="${this.heading}"
        unset
      ></bbva-text>
    `}rightTemplate(){return k`
      <div class="right">
        <slot name="right">
          <div>${this.amount||0===this.amount?this._amount:this._date}</div>
        </slot>
      </div>
    `}get _date(){return k` <bbva-date date="${this.date}" .options="${this.dateFormat}"></bbva-date> `}get _amount(){return k`
      <bbva-amount
        variant="${this.variantAmount}"
        amount="${this.amount}"
        local-currency="${this.localCurrency}"
        currency-code="${this.currencyCode}"
        language="${this.language}"
        decimal-digits="${this.decimalDigits}"
        .type="${this.type}"
      >
      </bbva-amount>
    `}titleTemplate(){return k`
      <div class="${P({"list-header":!this.longAmount})}">
        ${this.clipBoxTemplate()} ${this.iconTemplate()} ${this.textHeaderTemplate()}
        ${this.rightTemplate()}
      </div>
    `}headerTemplate(){return this.link?k`
          <bbva-link
            aria-label="${this.linkAccesibilityLabel}"
            href="${this.link}"
            @click=${this._clicked}
          >
            ${this.titleTemplate()}
          </bbva-link>
        `:k` ${this.titleTemplate()} `}get _badgeCategory(){return(this.categoryIcon&&this.textCategory||this.category)&&k`
        <bbva-badge-category
          .icon="${this.categoryIcon}"
          .text="${this.textCategory}"
          .category="${this.category}"
        >
        </bbva-badge-category>
      `}get _attached(){return this.attached?k`
          <span class="attached ${P({column:this.longAmount,end:this.longAmount})}">
            <span class="sr-only">${this.t(this.attachedAccessibilityText)}</span>
            <bbva-core-icon size="16" class="attached" icon="${Y()}"></bbva-core-icon>
          </span>
        `:k``}addRow(t){return this.longAmount?t:k` <div class="row">${t}</div> `}get _subtitles(){return this.subtitles.map(((t,e)=>{const i=`description${e}`,a={[i]:!0,column:!this.longAmount,end:!this.longAmount&&e%2!=0};return k`
        <div class="${P(a)}">
          <div class="${P({row:this.longAmount})}">
            ${t}${1===e?this._attached:""}
          </div>
        </div>
        ${1===e?ce._break:""}
      `}))}static get _break(){return k` <div class="break"></div> `}get _maskedAccount(){return this.account&&G(this.account,this.maskedChar,!0,this.accountVisibleChars)}get _accountInfo(){return k` <div class="entity-container">${this._clipEntities} ${this._account}</div> `}get _clipEntities(){return k`
      <bbva-clip-entities entity="${this.entity}" size="small" ?hidden="${!this.entity}">
        ${this.entityText}</bbva-clip-entities
      >
    `}get _account(){return k`
      <bbva-text
        unset
        size="S"
        class="account"
        text="${this._maskedAccount}"
        ?hidden="${!this.account}"
      >
      </bbva-text>
    `}render(){return k`
      <div class="container">
        ${this.headerTemplate()}
        <div class="content">
          ${this.addRow(this._subtitles)} ${this._badge} ${this.addRow(this._accountInfo)}
          ${this._badgeCategory}
        </div>
      </div>
    `}}customElements.define(ce.is,ce);const de=new c;var be=n`:host {
  cursor: pointer;
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  align-items: center;
  text-align: center;
  max-width: var(--bbva-button-action-max-width, 4.125rem);
  font-size: var(--typographyType3XSmall, ${s(l.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${s(S.type3XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${s(w.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${s(w.medium.fontStyle)});
  --_button-action-color: var(--bbva-button-action-dark-mode-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${s(d.primaryMedium)})));
  --_button-action-active-color: var(--bbva-button-action-active-dark-mode-color, var(--bbva-button-action-active-color, var(--colorsPrimaryCoreDark, ${s(d.primaryCoreDark)})));
  --_dark-display: var(--bbva-button-action-card-logo-dark-mode-dark-display, var(--bbva-button-action-card-logo-dark-display, none));
  --_light-display: var(--bbva-button-action-card-logo-dark-mode-light-display, var(--bbva-button-action-card-logo-light-display, inline));
}

:host(:not([href])) {
  border: none;
  border-radius: 0;
  color: var(--_button-action-color);
}
:host(:not([href]))[active]:not([aria-disabled=true]) {
  background-color: transparent;
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

[data-tag-name=bbva-icon] {
  fill: var(--_button-action-color);
}

:host(:not([href])[active]:not([aria-disabled=true])) {
  background-color: transparent;
  color: var(--_button-action-active-color);
}
:host(:not([href])[active]:not([aria-disabled=true])) [data-tag-name=bbva-icon] {
  fill: var(--_button-action-active-color);
}

.app-pay-icon svg {
  height: 1.5rem;
  max-width: 3rem;
}
.app-pay-icon svg .dark, .app-pay-icon svg.dark {
  display: var(--_dark-display);
}
.app-pay-icon svg .light, .app-pay-icon svg.light {
  display: var(--_light-display);
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

label {
  cursor: pointer;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-badge-notification] {
  --_margin-left: 0;
}

@supports (-webkit-line-clamp: 3) {
  label {
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 3;
    -webkit-box-orient: vertical;
  }
}
${de.mediaRules()}`;var he=n`[ambient^=light] {
  --bbva-button-action-color: initial;
  --bbva-button-action-active-color: initial;
  --bbva-button-action-card-logo-dark-display: none;
  --bbva-button-action-card-logo-light-display: initial;
}
${(new c).mediaRules()}`;const pe=new c;const ge={dark:n`
    ${n`[ambient^=dark] {
  --bbva-button-action-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-button-action-active-color: var(--colorsPrimarySubduedLight, ${s(d.primarySubduedLight)});
  --bbva-button-action-card-logo-dark-display: inline;
  --bbva-button-action-card-logo-light-display: none;
}
${pe.mediaRules()}`}
    ${at.dark}
  `,light:n`
    ${he}
    ${at.light}
  `};let ve=class extends(h(I(ot))){static get is(){return"bbva-button-action"}static get scopedElements(){return{"bbva-icon":m,"bbva-core-image":rt,"bbva-badge-notification":u}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},appPayIcon:{type:String,attribute:"app-pay-icon"},imageAltText:{type:String,attribute:"image-alt-text"},label:{type:String},notifications:{type:Number},notificationsVariant:{type:String,attribute:"notifications-variant"},notificationsPosition:{type:String,attribute:"notifications-position"},notificationsAccesibilityText:{type:String}}}constructor(){super(),this.iconSize=24,this.icon="",this.image="",this.imageAltText="",this.notificationsPosition="right",this.appPayIcon=""}static get styles(){return[super.styles,be,y("bbva-button-action-shared-styles"),f(),ge.light,ge.dark]}get _imageWidth(){return 2*this.iconSize}get getIcon(){return this.icon?k`
        <bbva-icon onclick="void(0)" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>
      `:this.appPayIcon?k`<div class="app-pay-icon">${nt[this.appPayIcon]}</div>`:k`
        <bbva-core-image
          .src="${this.image}"
          .alt="${this.imageAltText}"
          sizing="contain"
          .width="${this._imageWidth}"
          .height="${this.iconSize}"
          onclick="void(0)"
          position="center"
        ></bbva-core-image>
      `}render(){return k`
      ${this.notifications?k`
            <bbva-badge-notification
              ambient="light"
              .accessibilityText="${this.notificationsAccesibilityText}"
              .text="${this.notifications}"
              .position="${this.notificationsPosition}"
              .variant="${this.notificationsVariant}"
              >${this.getIcon}
            </bbva-badge-notification>
          `:k` ${this.getIcon} `}
      <label onclick="void(0)"> ${this.label} </label>
      <slot></slot>
      ${this._action}
    `}};q("colors.primarySubdued"),q("colors.primaryCoreLight");const me=new c;var ue=n`:host {
  --_list-swipe-invoker-bg-color: var(--bbva-list-swipe-dark-mode-invoker-bg-color, var(--bbva-list-swipe-invoker-bg-color, var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)})));
  --_list-swipe-operative-bg-color: var(--bbva-list-swipe-dark-mode-operative-bg-color, var(--bbva-list-swipe-operative-bg-color, var(--colorsPrimaryCore, ${s(d.primaryCore)})));
  --_list-swipe-informative-bg-color: var(--bbva-list-swipe-dark-mode-informative-bg-color, var(--bbva-list-swipe-informative-bg-color, var(--colorsPrimaryMedium, ${s(d.primaryMedium)})));
  --_list-swipe-actions-item-operative-error-bg-color: var(--bbva-list-swipe-dark-mode-actions-item-operative-error-bg-color, var(--bbva-list-swipe-actions-item-operative-error-bg-color, var(--colorsTertiaryType1Medium, ${s(d.tertiaryType1Medium)})));
  --_list-swipe-actions-item-operative-error-active-bg-color: var(--bbva-list-swipe-dark-mode-actions-item-operative-error-active-bg-color, var(--bbva-list-swipe-actions-item-operative-error-active-bg-color, var(--colorsTertiaryType1Dark, ${s(d.tertiaryType1Dark)})));
  --_list-swipe-informative-bg-color-active: var(--bbva-list-swipe-dark-mode-informative-bg-color-active, var(--bbva-list-swipe-informative-bg-color-active, var(--colorsPrimaryCoreLight, ${s(d.primaryCoreLight)})));
  --_list-swipe-operative-bg-color-active: var(--bbva-list-swipe-dark-mode-operative-bg-color-active, var(--bbva-list-swipe-operative-bg-color-active, var(--colorsPrimaryCoreDark, ${s(d.primaryCoreDark)})));
  --_list-swipe-button-action-color: var(--bbva-list-swipe-dark-mode-button-action-color, var(--bbva-list-swipe-button-action-color, var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)})));
  display: block;
  box-sizing: border-box;
  width: 100%;
  position: relative;
  overflow: hidden;
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

:host([dragging]) {
  user-select: none;
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
  top: 0;
  left: 0;
  z-index: 1;
}
.left .sr-only {
  right: 4.0625rem;
  left: auto;
}

.invoker {
  -webkit-touch-callout: none;
  -webkit-user-select: none;
  user-select: none;
  position: relative;
  background-color: var(--_list-swipe-invoker-bg-color);
  will-change: transform;
  transform: translate3d(var(--_translate), 0, 0);
  z-index: 1;
}
.invoker.transition {
  transition: transform 0.2s;
}
.invoker.right {
  transform: translate3d(var(--_informative-width), 0, 0);
}
.invoker.left {
  transform: translate3d(var(--_operative-width), 0, 0);
}

:host([focus-visible]) .invoker:focus {
  outline-offset: -1px;
}

:host([loading]):after {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  display: inline-block;
  height: 11.75rem;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${s(d.primaryCore)}))) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${s(d.primaryCore)}))) 50%), linear-gradient(var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${s(d.primaryCore)}))) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${s(d.primaryCore)}))) 50%), linear-gradient(var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${s(d.primaryCore)}))) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${s(d.primaryCore)}))) 50%);
  background-color: var(--bbva-list-swipe-dark-mode-skeleton-quote-bg, var(--skeleton-quote-bg, var(--colorsPrimaryCoreLight, ${s(d.primaryCoreLight)})));
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: 10% 20px, calc(10% - 8px) 48px, 37% 20px, calc(37% + 16px) 48px, 63% 20px, calc(63% + 40px) 48px;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

:host([animate]:not([opening])) .invoker {
  will-change: transform;
  transform: translate3d(initial, 0, 0);
}
:host([animate]:not([opening])) .invoker:not(.informative) {
  animation: panLeft 1.5s cubic-bezier(0.25, 0.1, 0.25, 1) 1;
}
:host([animate]:not([opening])) .invoker:not(.informative).large {
  animation-name: panLeftLarge;
}
:host([animate]:not([opening])) .invoker.informative {
  animation: panRight 1.5s cubic-bezier(0.25, 0.1, 0.25, 1) 1;
}
:host([animate]:not([opening])) .invoker.informative.large {
  animation-name: panRightLarge;
}

.actions-wrapper {
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  width: 100%;
}

[data-tag-name=bbva-button-action] {
  width: 5.5rem;
  max-width: none;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  color: var(--_list-swipe-button-action-color);
}
[data-tag-name=bbva-button-action][aria-disabled=true] {
  opacity: 1;
}

.actions {
  position: absolute;
  top: 0;
  height: 100%;
  display: flex;
  align-items: center;
  -webkit-touch-callout: none;
  -webkit-user-select: none;
  user-select: none;
}
.actions-informative {
  left: 0;
  background-color: var(--_list-swipe-informative-bg-color);
}
.actions-informative [active] {
  background-color: var(--_list-swipe-informative-bg-color-active);
}
.actions-operative {
  right: 0;
  background-color: var(--_list-swipe-operative-bg-color);
}
.actions-operative [active] {
  background-color: var(--_list-swipe-operative-bg-color-active);
}
.actions-operative [warning] {
  background-color: var(--_list-swipe-actions-item-operative-error-bg-color);
}
.actions-operative [warning] [active] {
  background-color: var(--_list-swipe-actions-item-operative-error-active-bg-color);
}
.right-dir .actions-operative, .left-dir .actions-informative {
  visibility: hidden;
}
.actions-list {
  list-style: none;
  padding: 0;
  margin: 0;
  display: flex;
  height: 100%;
}
.actions-item {
  margin: 0;
  padding: 0;
  display: flex;
  align-items: center;
}
.actions-item [data-tag-name=bbva-button-action] {
  height: 100%;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
@keyframes panLeft {
  0% {
    transform: translateX(0);
  }
  20% {
    transform: translateX(-86px);
  }
  30% {
    transform: translateX(-86px);
  }
  40% {
    transform: translateX(-86px);
  }
  50% {
    transform: translateX(-86px);
  }
  65% {
    transform: translateX(0);
  }
  70% {
    transform: translateX(6px);
  }
  80% {
    transform: translateX(0);
  }
  90% {
    transform: translateX(-2px);
  }
  100% {
    transform: translateX(0);
  }
}
@keyframes panLeftLarge {
  0% {
    transform: translateX(0);
  }
  20% {
    transform: translateX(-172px);
  }
  30% {
    transform: translateX(-172px);
  }
  40% {
    transform: translateX(-172px);
  }
  50% {
    transform: translateX(-172px);
  }
  65% {
    transform: translateX(0);
  }
  70% {
    transform: translateX(6px);
  }
  80% {
    transform: translateX(0);
  }
  90% {
    transform: translateX(-2px);
  }
  100% {
    transform: translateX(0);
  }
}
@keyframes panRight {
  0% {
    transform: translateX(0);
  }
  20% {
    transform: translateX(86px);
  }
  30% {
    transform: translateX(86px);
  }
  40% {
    transform: translateX(86px);
  }
  50% {
    transform: translateX(86px);
  }
  65% {
    transform: translateX(0);
  }
  70% {
    transform: translateX(-6px);
  }
  80% {
    transform: translateX(0);
  }
  90% {
    transform: translateX(2px);
  }
  100% {
    transform: translateX(0);
  }
}
@keyframes panRightLarge {
  0% {
    transform: translateX(0);
  }
  20% {
    transform: translateX(172px);
  }
  30% {
    transform: translateX(172px);
  }
  40% {
    transform: translateX(172px);
  }
  50% {
    transform: translateX(172px);
  }
  65% {
    transform: translateX(0);
  }
  70% {
    transform: translateX(-6px);
  }
  80% {
    transform: translateX(0);
  }
  90% {
    transform: translateX(2px);
  }
  100% {
    transform: translateX(0);
  }
}
${me.mediaRules()}`;class ye extends(p(h(e(g)))){static get is(){return"bbva-list-swipe"}static get scopedElements(){const t=[ve];return ye.scopedElementsFromClasses(t)}static get properties(){return{informativeActions:{type:Array,attribute:"informative-actions"},operativeActions:{type:Array,attribute:"operative-actions"},threshold:{type:Number},iconSize:{type:Number,attribute:"icon-size"},opening:{type:String},animate:{type:Boolean,reflect:!0},_transition:{type:Boolean},_translate:{type:Number},_operativeWidth:{type:Number},_informativeWidth:{type:Number},_swipeDirectionRight:{type:Boolean},_swipeDirectionLeft:{type:Boolean},_opened:{type:Boolean},_textStatus:{type:String},_firstTime:{type:String}}}constructor(){super(),this.operativeActions=[],this.informativeActions=[],this.threshold=.4,this.iconSize=24,this._transition=!0,this._translate=0,this.opening="",this._operativeWidth=0,this._informativeWidth=0,this._swipeDirectionRight=!1,this._swipeDirectionLeft=!1,this._opened=!1,this.animate=!1,this._accessibilityButtonActions="bbva-list-swipe-accessibility-button-actions",this._open="bbva-list-swipe-open",this._close="bbva-list-swipe-close",this._firstTime=!1}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._informativeItems=this.shadowRoot.querySelectorAll('.actions-informative [data-tag-name="bbva-button-action"]'),this._operativeItems=this.shadowRoot.querySelectorAll('.actions-operative [data-tag-name="bbva-button-action"]'),requestAnimationFrame((()=>{this._informativeWidth=this._informative.offsetWidth,this._operativeWidth=this._operative.offsetWidth})),this._invoker=this.shadowRoot.querySelector(".invoker"),this._srOnlySelector=this._invoker.querySelector(".sr-only"),ct(this._invoker,"track",(t=>this._onTrack(t))),dt(this._invoker,"pan-y")}updated(t){super.updated&&super.updated(t),this._informative=this.shadowRoot.querySelector(".actions-informative"),this._operative=this.shadowRoot.querySelector(".actions-operative"),this._informativeItems=this.shadowRoot.querySelectorAll('.actions-informative [data-tag-name="bbva-button-action"]'),this._operativeItems=this.shadowRoot.querySelectorAll('.actions-operative [data-tag-name="bbva-button-action"]'),ye._actionItemsState({informative:this._informativeItems,tabindex1:"-1",ariadisabled1:"true",operative:this._operativeItems,tabindex2:"-1",ariadisabled2:"true"}),this._defaultLeftOpened(),this._defaultRightOpened(),t.has("opening")&&this.opening&&(this._opened=!0,this._swipeDirectionRight="right"===this.opening,this._rightOpened(),this._leftOpened(),this._firstTime=!0),this._contextualTextManager(),this.opening||(this._informativeItems.length>0&&(ye._hide(this._informative),this._informativeItems[0].blur()),this._operativeItems.length>0&&(ye._hide(this._operative),this._operativeItems[0].blur())),(this.operativeActions.length>1||this.informativeActions.length>1&&0===this.operativeActions.length&&!this.opening)&&this._invoker.classList.add("large"),this.informativeActions.length>0&&0===this.operativeActions.length&&this._invoker.classList.add("informative")}static _actionItemsState({informative:t,operative:e,tabindex1:i,tabindex2:a,ariadisabled1:o,ariadisabled2:r}){t.forEach((t=>{t.setAttribute("tabindex",i),t.setAttribute("aria-disabled",o)})),e.forEach((t=>{t.setAttribute("tabindex",a),t.setAttribute("aria-disabled",r)}))}static _show(t){t&&t.removeAttribute("aria-hidden")}static _hide(t){t&&t.setAttribute("aria-hidden","true")}static get styles(){return[f(".invoker:focus"),ue,y("bbva-list-swipe-shared-styles"),ge.dark]}_defaultLeftOpened(){this._firstTime&&"left"===this.opening&&ye._actionItemsState({informative:this._informativeItems,tabindex1:"-1",ariadisabled1:"true",operative:this._operativeItems,tabindex2:"0",ariadisabled2:"false"})}_defaultRightOpened(){this._firstTime&&"right"===this.opening&&ye._actionItemsState({informative:this._informativeItems,tabindex1:"0",ariadisabled1:"false",operative:this._operativeItems,tabindex2:"-1",ariadisabled2:"true"})}_leftOpened(){"left"===this.opening&&this._opened&&(this._operativeItems.length>0||0===this._informativeItems.length)&&(ye._show(this._operative),ye._hide(this._informative),this._operativeItems[0].focus(),ye._actionItemsState({informative:this._informativeItems,tabindex1:"-1",ariadisabled1:"true",operative:this._operativeItems,tabindex2:"0",ariadisabled2:"false"}))}_rightOpened(){"right"===this.opening&&this._opened&&(this._informativeItems.length>0||0===this._operativeItems.length)&&(ye._show(this._informative),ye._hide(this._operative),this._informativeItems[0].focus(),ye._actionItemsState({informative:this._informativeItems,tabindex1:"0",ariadisabled1:"false",operative:this._operativeItems,tabindex2:"-1",ariadisabled2:"true"}))}_contextualTextManager(){this._opened?this._textStatus=this.t(this._close):this._textStatus=this.t(this._open)}render(){const t={"--_translate":`${this._translate}px`,"--_operative-width":-1*this._operativeWidth+"px","--_informative-width":`${this._informativeWidth}px`},e={transition:this._transition,right:"right"===this.opening,left:"left"===this.opening},i={"right-dir":this._swipeDirectionRight,opened:this._opened};return k`
      <div
        class="invoker ${P(e)}"
        style="${J(t)}"
        @transitionend="${this._onInvokerTransitionEnd}"
        @keydown="${this._onInvokerKeydown}"
      >
        <slot name="invoker"></slot>
        ${this.informativeActions.length>0||this.operativeActions.length>0?k`<span class="sr-only"
              >${this.t(this._accessibilityButtonActions,{status:this._textStatus})}</span
            >`:""}
      </div>

      <div class="actions-wrapper ${P(i)}">
        <div class="actions actions-informative">
          ${this.informativeActions.length?k`
                <ul class="actions-list">
                  ${this.informativeActions.map(((t,e)=>this._actionItems(t,e,"informative")))}
                </ul>
              `:""}
        </div>
        <div class="actions actions-operative">
          ${this.operativeActions.length?k`
                <ul class="actions-list">
                  ${this.operativeActions.map(((t,e)=>this._actionItems(t,e,"operative")))}
                </ul>
              `:""}
        </div>
      </div>
    `}_actionItems(t,e,i){return k`
      <li class="actions-item" ?warning="${t.warning}">
        <bbva-button-action
          ambient="dark"
          .icon="${t.icon}"
          .iconSize="${this.iconSize}"
          .label="${t.label}"
          @click="${()=>this._onActionClick(t,e,i)}"
        ></bbva-button-action>
      </li>
    `}_onTrack(t){var e;if(null!=t&&null!==(e=t.detail)&&void 0!==e&&e.state)switch(t.detail.state){case"start":this._trackStart();break;case"end":this._trackEnd(t.detail.dx);break;default:this._trackX(t.detail.dx)}}_trackStart(){this.setAttribute("dragging",""),this._invokerWidth=this._invoker.offsetWidth,this._opened=!0,this._operativeWidth=this._operative.offsetWidth,this._informativeWidth=this._informative.offsetWidth,this._setTrackReferences(this.opening),this.opening="",this._translate=this._startingPoint,this._transition=!1}_setTrackReferences(t){return"right"===t?(this._rightLimit=0,this._leftLimit=0-this._operativeWidth-this._informativeWidth,this._leftThreshold=0-this._informativeWidth-this._operativeWidth*this.threshold,this._rightThreshold=0-this._informativeWidth*this.threshold,this._startingPoint=this._informativeWidth,void(this._midThreshold=-1*this._informativeWidth)):"left"===t?(this._rightLimit=this._informativeWidth+this._operativeWidth,this._leftLimit=0,this._leftThreshold=this._operativeWidth*this.threshold,this._rightThreshold=this._operativeWidth+this._informativeWidth*this.threshold,this._startingPoint=-1*this._operativeWidth,void(this._midThreshold=this._operativeWidth)):(this._rightLimit=this._informativeWidth,this._leftLimit=0-this._operativeWidth,this._leftThreshold=0-this._operativeWidth*this.threshold,this._rightThreshold=this._informativeWidth*this.threshold,this._startingPoint=0,void(this._midThreshold=0))}_trackX(t){this._translate=this._startingPoint+Math.max(this._leftLimit,Math.min(t,this._rightLimit)),this._swipeDirectionRight=t>=this._midThreshold}_trackEnd(t){return this.removeAttribute("dragging",""),this._swipeDirectionRight=t>=this._midThreshold,this._transition=!0,this._translate=0,t<this._leftThreshold?(this.opening="left",void this._invokerTrackOpening()):t>this._rightThreshold?(this.opening="right",void this._invokerTrackOpening()):void(this.opening="")}_invokerTrackOpening(){this.dispatchEvent(new CustomEvent(`bbva-list-swipe-track-${this.opening}`,{detail:this,bubbles:!0,composed:!0}))}_onInvokerTransitionEnd(){this.opening||(this._opened=!1,this._swipeDirectionRight=!1)}_onActionClick(t,e,i){this.dispatchEvent(new CustomEvent("list-swipe-action-click",{detail:{item:t,index:e,type:i},bubbles:!0,composed:!0}))}_onInvokerKeydown(t){t.composedPath()[0]===this._invoker&&("arrowright"===t.key.toLowerCase()&&(t.preventDefault(),this._moveInvoker("right")),"arrowleft"===t.key.toLowerCase()&&(t.preventDefault(),this._moveInvoker("left")))}_moveInvoker(t){const e=this.opening;if(t===e)return;let i;this._trackStart(),"right"===t&&(i="left"===e?this._operativeWidth-1:this._rightLimit),"left"===t&&(i="right"===e?0-this._informativeWidth+1:this._leftLimit),this._trackEnd(i)}}customElements.define(ye.is,ye);var fe=n`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.notification-read {
  --bbva-list-highlight-highlighted-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --_list-highlight-highlighted-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
}

[data-tag-name=bbva-list-highlight] {
  --bbva-badge-category-icon-color: var(--colorsPrimaryMedium, ${s(d.primaryMedium)});
}

[data-tag-name=bbva-list-swipe] {
  --_actions-item-operative-error-bg-color: var(--colorsTertiaryType1Dark, ${s(d.tertiaryType1Dark)});
  --_operative-bg-color: var(--colorsPrimaryMedium, ${s(d.primaryMedium)});
  --bbva-badge-category-icon-color: var(--colorsPrimaryMedium, ${s(d.primaryMedium)});
}

.icon-sales {
  --bbva-badge-category-icon-color: var(--bbva-darker-purple) ;
}

.icon-golden {
  --bbva-badge-category-icon-color: var(--colorsTertiaryType3Medium) ;
}

.icon-darkend {
  --bbva-badge-category-icon-color: var(--colorsPrimaryVariantDarkened) ;
}

.icon-light-green {
  --bbva-badge-category-icon-color: var(--colorsTertiaryType6Dark) ;
}

.black-badge {
  --bbva-badge-default-color: var(--colorsColorsSecondary600, ${s(d.colorsSecondary600)});
}

.golden-badge {
  --bbva-badge-default-color: var(--colorsTertiaryType3Dark, ${s(d.tertiaryType3Dark)});
  --bbva-list-highlight-heading-dark-mode-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-amount-dark-mode-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
}

.blue-badge {
  --bbva-badge-default-color: var(--colorsPrimaryCore, ${s(d.primaryCore)});
}

.red-badge {
  --bbva-badge-default-color: var(--colorsTertiaryType1Dark, ${s(d.tertiaryType1Dark)});
}

.yellow-badge {
  --bbva-badge-default-color: var(--colorsTertiaryType3Dark, ${s(d.tertiaryType3Dark)});
}

.green-badge {
  --bbva-badge-default-color: var(--colorsTertiaryType6Dark, ${s(d.tertiaryType6Dark)});
}

.black-list-header {
  --bbva-list-header-heading-color: var(--colorsColorsSecondary600, ${s(d.colorsSecondary600)});
}
`;class _e extends(h(Nt(g))){static get is(){return"bbva-aggregation-swipe-list"}static get scopedElements(){return{"bbva-list-highlight":ce,"bbva-list-movement":bt,"bbva-list-swipe":ye}}static get properties(){return{notifications:{type:Array},operativeActions:{type:Array,attribute:"operative-actions"},language:{type:String},type:{type:String},hideHeader:{type:Boolean},showDivider:{type:Boolean},notificationsList:{type:Boolean}}}constructor(){super(),Promise.resolve().then((function(){return Ae})).then((({BbvaDivider:t})=>this.defineScopedElement("bbva-divider",t))),import("./7f3d7ca9.js").then((function(t){return t.ds})).then((({BbvaHeaderCategory:t})=>this.defineScopedElement("bbva-header-category",t))),this.notifications=[],this.operativeActions=[{icon:ht(),label:"Eliminar",warning:!0}],this.type="highlight",this.hideHeader=!1,this.showDivider=!1,this.notificationsList=!1,ht(),r(),D(),pt(),gt(),vt(),mt(),ut(),i(),yt(),a()}static get styles(){return[fe,y("bbva-aggregation-swipe-list-shared-styles")]}_clickOnNotification(t){this.dispatchEvent(new CustomEvent("view-notification",{bubbles:!0,composed:!0,detail:t})),this._swipeAllHide()}_deleteNotification(t,e){const i=e.detail.item.customEvent||"delete-notification";this.dispatchEvent(new CustomEvent(i,{bubbles:!0,composed:!0,detail:t})),this._swipeAllHide()}_swipeAllHide(){const t=this.shadowRoot.querySelectorAll("bbva-list-swipe");t.forEach(((e,i)=>{t[i].opening="right"}))}_swipeOnNotification(t){const e=this.shadowRoot.querySelectorAll("bbva-list-swipe");e.forEach(((i,a)=>{e[a].id!==t.sendDate&&(e[a].opening="right")}))}_notifications(){return this.notifications.map((t=>k`
      ${this.hideHeader?k``:this._addNotificationsHeader(t)}
      ${this._addNotificationsList(t.notifications)}
    `))}_addNotificationsHeader(t){return k`
      <bbva-header-category
        text="${t.date}"
        variant="date"
      >
      </bbva-header-category>
    `}_highlightList(t){return k`
      ${"number"==typeof t.amount?k`
        <bbva-list-highlight
          data-id="${this.notificationsList?t.id:""}"
          id="${this.notificationsList?t.id:t.name}"
          .icon="${t.headerIcon}"
          icon-aria-label="${t.iconArialLabel}"
          class="${t.read?"notification-read":""}
                ${t.colorIcon?"icon-sales":""}
                ${t.blackBadge?"black-badge":""}
                ${t.goldenBadge?"golden-badge":""}
                ${t.blackListHeader?"black-list-header":""}
                ${t.goldenIcon?"icon-golden":""}
                ${t.darkendIcon?"icon-darkend":""}
                ${t.lightGreen?"icon-light-green":""}
                ${t.badgeClass?t.badgeClass:""}"
          heading="${t.name}"
          link="${t.link}"
          slot="invoker"
          subtitles='${t.description}'
          category="${t.type}"
          category-icon="${t.icon}"
          text-category="${t.type}"
          badge="${t.badge}"
          amount="${t.amount}"
          language="${this.language}"
          local-currency="${t.currencyAmount}"
          currency-code="${t.currencyAmount}"
          @click="${()=>this._clickOnNotification(t)}"
        >
      </bbva-list-highlight>
      `:k`
      <bbva-list-highlight
        id="notification-text-${t.name}"
        class="${t.read?"notification-read":""} ${t.colorIcon?"icon-sales":""}"
        heading="${t.name}"
        .icon="${t.headerIcon}"
        icon-aria-label="Email"
        link="${t.link}"
        subtitles='${t.description}'
        category="${t.type}"
        text-category="${t.type}"
        category-icon="${t.icon}"
        slot="invoker"
        @click="${()=>this._clickOnNotification(t)}"
      ></bbva-list-highlight>
    `}`}_movementList(t){return k`
      <bbva-list-movement
        slot="invoker"
        card-title=${t.name}
        description=${t.description}
        .moreInfo=${t.type}
        @list-movement-item-click=${()=>this._clickOnNotification(t)}
      ></bbva-list-movement>
    `}_addNotificationsList(t){const e=t.length,i={highlight:"_highlightList",movement:"_movementList"}[this.type];return t.map(((t,a)=>k`
      <bbva-list-swipe id="${this.notificationsList?t.id:t.sendDate}"
        .operativeActions="${t.operativeActions?t.operativeActions:this.operativeActions}"
        @list-swipe-action-click="${e=>this._deleteNotification(t,e)}"
        @bbva-list-swipe-track-left="${()=>this.notificationsList?"":this._swipeOnNotification(t)}"
        @focus-visible-changed="${()=>this._swipeAllHide()}"
        >
        ${this[i](t)}
      </bbva-list-swipe>
      ${this.showDivider&&a!==e-1?k`<bbva-divider size="fit"></bbva-divider>`:k`<bbva-divider size="full"></bbva-divider>`}`))}render(){return k`
      <div class="container">
        ${this._notifications()}
      </div>
    `}}var ke=n`:host {
  display: block;
  box-sizing: border-box;
  color: var(--bbva-text-dark-mode-color, var(--bbva-text-color, var(--colorsPrimaryMedium, #1973B8))) !important;
  --_amount-text-color: var(--colorsSecondary600, #666666);
  --bbva-amount-color: var(--_amount-text-color);
  --_list-highlight-heading-color: var(--colorsPrimaryMedium, #1973B8);
  --bbva-list-highlight-heading-color: var(--_list-highlight-heading-color);
  --bbva-text-font-size: var(--typographyType9XLarge, 4.25rem);
  --bbva-text-font-weight: 500;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.notification-message-container {
  margin-left: 1rem;
  margin-right: 1rem;
}

.tab-default-container {
  margin-bottom: 0.5rem;
  text-align: start;
}
`;class xe extends(Ot(g)){static get is(){return"bbva-list-movements"}static get properties(){return{_completedTransactions:{type:Array},_pendingTransactions:{type:Array},_transactionSelected:{type:Object},_banxicoProvider:{type:Object},listMovements:{type:Array}}}constructor(){super(),this._completedTransactions=[],this._pendingTransactions=[],this._transactionSelected={},this.storageMovements={},this.customerData={},this.enrollmentData={},this.accountClabe="",this.listMovements=[]}static get scopedElements(){const t=[qt,ft,Et,v,Ut,Bt,Gt,_e,...xe.configurationScopedElements()];return xe.scopedElementsFromClasses(t)}static get styles(){return[ke,y("bbva-list-movements-shared-styles")]}updated(t){super.updated(t),t.has("listMovements")&&this._updatedTransactions()}_updatedTransactions(){this._completedTransactions=this._filterAndSortMovements(this.listMovements,["Pagado","Cobrado","Vencido","Rechazado por ti","Tu contacto rechazo"]),this._pendingTransactions=this._filterAndSortMovements(this.listMovements,["Por pagar","Pospuesto"])}_getOptions(){return[{title:"Finalizados"},{title:"Pendientes",badgeText:this._counterPendings(),badgeAccessible:`${this._counterPendings} notificaciones`}]}_counterPendings(){let t=0;return this._pendingTransactions.forEach((e=>{t+=e.notifications.length})),t}_renderCompletedTransactions(){return k`
    <bbva-aggregation-swipe-list
      id="completedTransactions"
      language="es-MX"
      notificationsList
      .notifications="${this._completedTransactions}"
    ></bbva-aggregation-swipe-list>
    `}_renderPendingTransactions(){return k`
    <bbva-aggregation-swipe-list
      id="pendingTransactions"
      language="es-MX"
      notificationsList
      .notifications="${this._pendingTransactions}"
    ></bbva-aggregation-swipe-list>
    `}_renderEmptyTransactions(){return k`
    <bbva-panel-info
      disabled-tabindex
      text="No tienes movimientos CoDi®">
    </bbva-panel-info>
    `}_renderNotificationMessage(){return k`
    <bbva-notification-message
      class="notification-message-container"
      variant="information"
      message="Si necesitas consultar movimientos anteriores a 30 días, hazlo en la sección de ‘Últimos movimientos’ de tu cuenta o directo en tus estados de cuenta que puedes revisar aquí en tu app BBVA.">
    </bbva-notification-message>
    `}render(){return k`
      <slot></slot>
      <bbva-header-main
        accessibility-text-icon-right-secondary=""
        icon-left-primary="${_t()}"
        icon-right-primary="${kt()}"
        @header-main-icon-left-primary-click="${this._headerIconClose}"
        @header-main-icon-right-primary-click="${this._headerIconClose}"
        text="CoDi®">
      </bbva-header-main>

      <bbva-header-category
        class="header-category-container"
        option-link="Filtrar"
        link-accessibility-text="Filtrar"
        text="ÚLTIMOS MOVIMIENTOS"
      ></bbva-header-category>

      <bbva-tab-default
      class="tab-default-container"
      accessibility-text="Available sections"
      .options="${this._getOptions()}"
      variant="badge"
      selected="0">

      <div class="panel" tabindex="0" role="tabpanel" id="content-0" aria-labelledby="tab-0">

        <!-- _Completed Transactions -->
        ${this._completedTransactions.length>0?this._renderCompletedTransactions():this._renderEmptyTransactions()}

        ${this._completedTransactions.length>30?this._renderNotificationMessage():""}

      </div>
      <div class="panel" tabindex="0" role="tabpanel" id="content-1" aria-labelledby="tab-1">

        <!-- Pending Transactions -->
        ${this._pendingTransactions.length>0?this._renderPendingTransactions():this._renderEmptyTransactions()}

        ${this._pendingTransactions.length>30?this._renderNotificationMessage():""}

      </div>
      </bbva-tab-default>
    `}}const $e=new c;var Se=n`[divider] {
  box-sizing: border-box;
}
[divider]::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: 100%;
}

hr[divider],
[divider]::after {
  margin: 0;
  border: none;
  display: block;
  height: 1px;
  background-color: var(--bbva-divider-dark-mode-color, var(--bbva-divider-color, var(--colorsSecondary300, ${s(d.secondary300)})));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}
${$e.mediaRules()}`;const we=new c;var Ce=n`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${s(d.secondary300)});
}
${we.mediaRules()}`;const Ie=new c;const Te={dark:n`
    ${n`[ambient^=dark] {
  --bbva-divider-color: var(--colorsSecondary300, ${s(d.secondary300)});
}
${Ie.mediaRules()}`}
  `,light:n`
    ${Ce}
  `};class Le extends(h(g)){static get is(){return"bbva-divider"}static get properties(){return{size:{type:String}}}constructor(){super(),this.size="full"}firstUpdated(){this.setAttribute("aria-hidden",!0)}static get styles(){return[Se,Te.light,Te.dark,y("bbva-divider-shared-styles")]}render(){return k` <hr divider="${this.size}" /> `}}customElements.define(Le.is,Le);var Ae=Object.freeze({__proto__:null,BbvaDivider:Le,bbvaDividerAmbient:Te});const Pe=new c;var Me=n`:host {
  cursor: pointer;
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  align-items: center;
  text-align: center;
  max-width: var(--bbva-button-action-max-width, 4.125rem);
  font-size: var(--typographyType3XSmall, ${s(l.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${s(S.type3XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${s(w.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${s(w.medium.fontStyle)});
  width: 100%;
  height: 100%;
  --_button-action-color: var(--bbva-button-action-dark-mode-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${s(d.primaryMedium)})));
  --_button-action-active-color: var(--bbva-button-action-active-dark-mode-color, var(--bbva-button-action-active-color, var(--colorsPrimaryCoreDark, ${s(d.primaryCoreDark)})));
  --_dark-display: var(--bbva-button-action-card-logo-dark-mode-dark-display, var(--bbva-button-action-card-logo-dark-display, none));
  --_light-display: var(--bbva-button-action-card-logo-dark-mode-light-display, var(--bbva-button-action-card-logo-light-display, inline));
}

:host(:not([href])) {
  border: none;
  border-radius: 0;
  color: var(--_button-action-color);
}
:host(:not([href]))[active]:not([aria-disabled=true]) {
  background-color: transparent;
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

[data-tag-name=bbva-icon] {
  fill: var(--_button-action-color);
}

:host(:not([href])[active]:not([aria-disabled=true])) {
  background-color: transparent;
  color: var(--_button-action-active-color);
}
:host(:not([href])[active]:not([aria-disabled=true])) [data-tag-name=bbva-icon] {
  fill: var(--_button-action-active-color);
}

.app-pay-icon svg {
  height: 1.5rem;
  max-width: 3rem;
}
.app-pay-icon svg .dark, .app-pay-icon svg.dark {
  display: var(--_dark-display);
}
.app-pay-icon svg .light, .app-pay-icon svg.light {
  display: var(--_light-display);
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

.text {
  cursor: pointer;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  overflow-wrap: anywhere;
  hyphens: auto;
}

[data-tag-name=bbva-badge-notification] {
  --_margin-left: 0;
}

@supports (-webkit-line-clamp: 3) {
  .text {
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 3;
    -webkit-box-orient: vertical;
  }
}
${Pe.mediaRules()}`;var De=n`[ambient^=light] {
  --bbva-button-action-color: initial;
  --bbva-button-action-active-color: initial;
  --bbva-button-action-card-logo-dark-display: none;
  --bbva-button-action-card-logo-light-display: initial;
}
${(new c).mediaRules()}`;const Ee=new c;const Be={dark:n`
    ${n`[ambient^=dark] {
  --bbva-button-action-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-button-action-active-color: var(--colorsPrimarySubduedLight, ${s(d.primarySubduedLight)});
  --bbva-button-action-card-logo-dark-display: inline;
  --bbva-button-action-card-logo-light-display: none;
}
${Ee.mediaRules()}`}
    ${at.dark}
  `,light:n`
    ${De}
    ${at.light}
  `};class ze extends(h(I(ot))){static get is(){return"bbva-button-action"}static get scopedElements(){return{"bbva-icon":m,"bbva-core-image":rt,"bbva-badge-notification":u}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},appPayIcon:{type:String,attribute:"app-pay-icon"},imageAltText:{type:String,attribute:"image-alt-text"},label:{type:String},notifications:{type:Number},notificationsVariant:{type:String,attribute:"notifications-variant"},notificationsPosition:{type:String,attribute:"notifications-position"},notificationsAccesibilityText:{type:String}}}constructor(){super(),this.iconSize=24,this.icon="",this.image="",this.imageAltText="",this.notificationsPosition="right",this.appPayIcon=""}static get styles(){return[super.styles,Me,y("bbva-button-action-shared-styles"),f(),Be.light,Be.dark]}get _imageWidth(){return 2*this.iconSize}get getIcon(){return this.icon?k`
        <bbva-icon onclick="void(0)" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>
      `:this.appPayIcon?k`<div class="app-pay-icon">${nt[this.appPayIcon]}</div>`:k`
        <bbva-core-image
          .src="${this.image}"
          .alt="${this.imageAltText}"
          sizing="contain"
          .width="${this._imageWidth}"
          .height="${this.iconSize}"
          onclick="void(0)"
          position="center"
        ></bbva-core-image>
      `}render(){return k`
      ${this.notifications?k`
            <bbva-badge-notification
              ambient="light"
              .accessibilityText="${this.notificationsAccesibilityText}"
              .text="${this.notifications}"
              .position="${this.notificationsPosition}"
              .variant="${this.notificationsVariant}"
              >${this.getIcon}
            </bbva-badge-notification>
          `:k` ${this.getIcon} `}
      <span class="text" onclick="void(0)"> ${this.label} </span>
      <slot></slot>
      ${this._action}
    `}}q("colors.primarySubdued"),q("colors.primaryCoreLight");var Ne=n`[ambient^=light] {
  --bbva-button-row-active-color: initial;
  --bbva-button-row-skeleton-color: initial;
  --bbva-button-row-skeleton-animated-layer-bg: initial;
  --bbva-button-row-skeleton-bg: initial;
}
`,Re=n`[ambient^=dark] {
  --bbva-button-row-active-color: var(--colorsPrimarySubduedLight, ${s(d.primarySubduedLight)});
  --bbva-button-row-skeleton-color: var(--colorsPrimaryCoreDark, ${s(d.primaryCoreDark)});
  --bbva-button-row-skeleton-bg: transparent;
  --bbva-button-row-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${s(d.primaryCoreDarkened)});
}
`;const Oe={dark:n`
    ${Be.dark}
    ${Re}
  `,light:n`
    ${Be.light}
    ${Ne}
  `},Ve=new c;var Fe=n`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  box-sizing: border-box;
  position: relative;
  min-height: 5rem;
  --_button-row-skeleton-animated-layer-bg: var(--bbva-button-row-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-button-row-skeleton-animated-layer-bg, var(--ambientsLight, ${s(xt.light)})));
  --_button-row-button-action-color: var(--bbva-button-row-dark-mode-button-action-color);
  --_button-row-photography-variant-color: var(--bbva-button-row-dark-mode-photography-variant-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${s(d.primaryMedium)})));
  --_button-row-photography-variant-active-color: var(--bbva-button-row-dark-mode-photography-variant-active-color, var(--_button-row-active-color));
  padding: 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1em);
  --_button-row-active-color: var(--bbva-button-row-dark-mode-active-color, var(--bbva-button-row-active-color, var(--colorsPrimaryCore, ${s(d.primaryCore)})));
  --_button-row-skeleton-quote-color: var(--bbva-button-row-dark-mode-skeleton-color, var(--bbva-button-row-skeleton-color, var(--colorsSecondary200, ${s(d.secondary200)})));
  --_button-row-skeleton-quote-bg: var(--bbva-button-row-dark-mode-skeleton-bg, var(--bbva-button-row-skeleton-bg, transparent));
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

.button-row {
  display: flex;
  flex-wrap: wrap;
  justify-content: inherit;
  box-sizing: border-box;
  outline: var(--bbva-button-row-buttons-outline, none);
  width: 100%;
}
.button-row .listitem-button {
  flex-basis: 33%;
  text-align: center;
  display: flex;
}
.button-row .listitem-button [data-tag-name=bbva-button-action] {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 12) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 12) * 1em);
  max-width: none;
  width: 100%;
  height: 100%;
  margin-bottom: auto;
}
.button-row .listitem-button [data-tag-name=bbva-button-action]:not([href])[active]:not([aria-disabled=true]) {
  background-color: transparent;
  color: var(--_button-row-active-color);
}
.button-row.three-buttons {
  justify-content: space-between;
}
.button-row.three-buttons::after {
  content: "";
  flex: auto;
}
.button-row.three-buttons .listitem-button {
  flex: none;
}

:host([variant=simple]) .button-row {
  padding: 0;
}
:host([variant=simple]) .listitem-button {
  flex: 1;
}

:host([class*=one-button]) > .button-row > .listitem-button {
  flex-basis: 100%;
}

:host([class*=two-buttons]) > .button-row > .listitem-button {
  flex-basis: 50%;
}

:host([class*=four-buttons]) > .button-row > .listitem-button {
  flex-basis: 25%;
}

:host([variant=photography]) .button-row .listitem-button [data-tag-name=bbva-button-action] {
  color: var(--_button-row-photography-variant-color);
  --bbva-button-action-dark-mode-color: var(--_button-row-photography-variant-color);
}
:host([variant=photography]) .button-row .listitem-button [data-tag-name=bbva-button-action][active] {
  color: var(--_button-row-photography-variant-active-color);
  --bbva-button-action-active-dark-mode-color: var(--_button-row-photography-variant-active-color);
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  min-height: 5rem;
  width: 100%;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  height: 5rem;
  top: 0;
  right: 0;
  left: 0;
  bottom: 0;
  background: var(--_button-row-skeleton-animated-layer-bg);
}

:host([loading].one-button) {
  background-image: linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%);
  background-color: var(--_button-row-skeleton-quote-bg);
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: 50% 20px, calc(50% + 28px) 48px;
}

:host([loading].two-buttons) {
  background-image: linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%);
  background-color: var(--_button-row-skeleton-quote-bg);
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: 25% 20px, calc(25% + 5px) 48px, 75% 20px, calc(75% + 50px) 48px;
}

:host([loading].three-buttons) {
  background-image: linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%);
  background-color: var(--_button-row-skeleton-quote-bg);
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: 16% 20px, calc(16% - 1px) 48px, 50% 20px, calc(50% + 28px) 48px, 83% 20px, calc(83% + 58px) 48px;
}

:host([loading].four-buttons) {
  background-image: linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%);
  background-color: var(--_button-row-skeleton-quote-bg);
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: calc(12%) 20px, calc(0% + 20px) 48px, calc(30% + 18px) 20px, calc(30% + 28px) 48px, calc(60% + 5px) 20px, calc(60% + 40px) 48px, calc(88% - 5px) 20px, calc(100% + 30px) 48px;
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
${Ve.mediaRules()}`;class qe extends(I(h(g))){static get is(){return"bbva-button-row"}static get scopedElements(){return{"bbva-button-action":ze}}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},options:{type:Array},iconSize:{type:Number,attribute:"icon-size"},selected:{type:Number},variant:{type:String},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.options=[],this.iconSize=24,this.selected=0,this.variant="",this.loading=!1}updated(){this.options&&this.options.length>0&&this._assignClass(this)}_assignClass(t){t.classList.remove("one-button","two-buttons","three-buttons","four-buttons"),1===this.options.length?t.classList.add("one-button"):2===this.options.length?t.classList.add("two-buttons"):3===this.options.length?t.classList.add("three-buttons"):4===this.options.length&&t.classList.add("four-buttons")}static get styles(){return[Fe,y("bbva-button-row-shared-styles"),Oe.light,Oe.dark]}render(){return k`${this.loading?k`<div class="skeleton"></div>`:k` <div
          id="buttons"
          class="button-row"
          role="list"
          aria-label="${x(this.accessibilityText)}"
        >
          ${this.options.map(((t,e)=>this._getButton(t,e)))}
        </div>`}`}_getButton(t,e){return k`
      <span role="listitem" class="listitem-button">
        <bbva-button-action
          ?disabled="${this.disabled}"
          role="button"
          notifications-variant="alert"
          image="${x(t.image)}"
          .iconSize=${this.iconSize}
          .appPayIcon=${t.appPayIcon}
          .imageAltText="${this.imageAltText}"
          .icon="${t.icon}"
          .label="${t.label}"
          .notifications="${t.notifications}"
          @click="${()=>{this._select(e)}}"
        >
        </bbva-button-action>
      </span>
    `}_select(t){this.selected=t,this.dispatchEvent(new CustomEvent("button-row-item-click",{detail:t,bubbles:!0,composed:!0}))}}customElements.define(qe.is,qe);var Xe=n`:host {
  display: block;
  box-sizing: border-box;
  --_color-container: var(--bbva-transition-container-dark-mode-content-color, var(--bbva-transition-container-content-color, var(--colorsSecondary600, #121212)));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.value-info {
  font-weight: 500;
  color: #121212;
  text-align: end;
}

.fitConcept {
  word-wrap: break-word;
  height: auto;
  width: 181px;
}

.modal-content-wrapper {
  color: var(--_color-container);
}

bbva-text {
  font-style: var(--bbva-type-text-font-style, var(--bbva-badge-default-font-style, var(--fontFacePrimaryBookItalicFontStyle)));
}

.textitle {
  font-style: normal;
}

bbva-badge-default .text .lines {
  text-align: center !important;
}

.textbadge {
  margin-inline: auto;
  margin-bottom: 10px;
  margin-top: 2px;
}

.box {
  display: flex;
  align-items: stretch;
  margin-left: 10px;
  margin-bottom: 10px;
  margin-right: 10px;
  margin-top: 10px;
  text-align: left;
}

.url-value-info {
  margin: 0.3rem 0rem;
  margin-top: 0.2rem;
}

.url-value-info p {
  margin: 0;
}

.url-value-info span {
  margin: 0;
  color: #004481;
  font-weight: 500;
}

.detail-content {
  background: #F4F4F4;
  padding-top: 10px;
  padding-bottom: 1rem;
  padding-left: 0.5rem;
  padding-right: 0.5rem;
}

.divspacing {
  margin: auto;
}

.divspacingpad {
  padding-right: 68px;
}

.concepdata {
  text-align: justify;
}

.blue-badge {
  --bbva-badge-default-color: var(--colorsPrimaryCore, ${s(d.primaryCore)});
}

.red-badge {
  --bbva-badge-default-color: var(--colorsTertiaryType1Dark, ${s(d.tertiaryType1Dark)});
}

.yellow-badge {
  --bbva-badge-default-color: var(--colorsTertiaryType3Dark, ${s(d.tertiaryType3Dark)});
}

.green-badge {
  --bbva-badge-default-color: var(--colorsTertiaryType6Dark, ${s(d.tertiaryType6Dark)});
}
`;class We extends(Ot(g)){static get is(){return"bbva-movement-detail"}static get properties(){return{_transactionSelected:{type:Object},_typeMovement:{type:Object},_movementStatus:{type:String},_informationFields:{type:Array},_isIntrabankMovement:{type:Boolean},_isInterbankMovement:{type:Boolean},_viewMore:{type:Boolean}}}static get scopedElements(){const t=[qt,v,tt,Q,ft,Le,L,m,qe,...We.configurationScopedElements()];return We.scopedElementsFromClasses(t)}constructor(){super(),this._isInterbankMovement=!1,this._isIntrabankMovement=!1,this._viewMore=!1,this._transactionSelected={},this._typeMovement="",this._informationFields=[{status:"Pagado",fields:[{name:"Destinatario",isIntrabank:!0,isInterbank:!0,path:"v.nb"},{name:"CLABE destino",isIntrabank:!0,isInterbank:!0,path:"v.cb"},{name:"Banco destino",isIntrabank:!0,isInterbank:!0,path:"v.ci"},{name:"Concepto",isIntrabank:!0,isInterbank:!0,path:"cc"},{name:"Emisor",isIntrabank:!0,isInterbank:!0,path:"c.nb"},{name:"CLABE origen",isIntrabank:!1,isInterbank:!0,path:"c.cb"},{name:"Banco emisor",isIntrabank:!0,isInterbank:!0,path:"c.ci"},{name:"Tipo de movimeinto",isIntrabank:!0,isInterbank:!0,path:"e"},{name:"Fecha y hora de aplicación",isIntrabank:!0,isInterbank:!0,path:"hp"},{name:"Clave",isIntrabank:!1,isInterbank:!0,path:"cr"},{name:"Folio CoDi",isIntrabank:!0,isInterbank:!0,path:"id"}]},{status:"Cobrado",fields:[{name:"Emisor",isIntrabank:!0,isInterbank:!0,path:"c.nb"},{name:"CLABE origen",isIntrabank:!0,isInterbank:!0,path:"c.cb"},{name:"Banco emisor",isIntrabank:!0,isInterbank:!0,path:"c.ci"},{name:"Concepto",isIntrabank:!0,isInterbank:!0,path:"cc"},{name:"Destinatario",isIntrabank:!0,isInterbank:!0,path:"v.nb"},{name:"CLABE destino",isIntrabank:!0,isInterbank:!0,path:"v.cb"},{name:"Banco destino",isIntrabank:!0,isInterbank:!0,path:"v.ci"},{name:"Tipo de movimeinto",isIntrabank:!0,isInterbank:!0,path:"e"},{name:"Fecha y hora de aplicación",isIntrabank:!0,isInterbank:!0,path:"hp"},{name:"Clave",isIntrabank:!0,isInterbank:!1,path:"cr"},{name:"Folio CoDi",isIntrabank:!0,isInterbank:!0,path:"id"}]},{status:"Por pagar",fields:[{name:"Destinatario",isIntrabank:!0,isInterbank:!0,path:"v.nb"},{name:"CLABE",isIntrabank:!0,isInterbank:!0,path:"v.cb"},{name:"Banco",isIntrabank:!0,isInterbank:!0,path:"v.ci"},{name:"Concepto",isIntrabank:!0,isInterbank:!0,path:"cc"},{name:"Fecha y hora de vencimiento",isIntrabank:!0,isInterbank:!0,path:"hl"},{name:"Referencia",isIntrabank:!1,isInterbank:!0,path:"idCE"},{name:"Folio CoDi",isIntrabank:!0,isInterbank:!0,path:"id"}]},{status:"Vencido",fields:[{name:"Destinatario",isIntrabank:!0,isInterbank:!0,path:"v.nb"},{name:"CLABE",isIntrabank:!0,isInterbank:!0,path:"v.cb"},{name:"Banco",isIntrabank:!0,isInterbank:!0,path:"v.ci"},{name:"Concepto",isIntrabank:!0,isInterbank:!0,path:"cc"},{name:"Fecha y hora de vencimiento",isIntrabank:!0,isInterbank:!0,path:"hl"},{name:"Referencia",isIntrabank:!1,isInterbank:!0,path:"idCE"},{name:"Folio CoDi",isIntrabank:!0,isInterbank:!0,path:"id"}]},{status:"Rechazado por ti",fields:[{name:"Destinatario",isIntrabank:!0,isInterbank:!0,path:"v.nb"},{name:"CLABE",isIntrabank:!0,isInterbank:!0,path:"v.cb"},{name:"Banco",isIntrabank:!1,isInterbank:!0,path:"v.ci"},{name:"Banco destino",isIntrabank:!0,isInterbank:!1,path:"v.ci"},{name:"Concepto",isIntrabank:!0,isInterbank:!0,path:"cc"},{name:"Folio CoDi",isIntrabank:!0,isInterbank:!0,path:"id"}]},{status:"Tu contacto rechazo",fields:[{name:"Destinatario",isIntrabank:!0,isInterbank:!0,path:"v.nb"},{name:"CLABE",isIntrabank:!0,isInterbank:!0,path:"v.cb"},{name:"Banco destino",isIntrabank:!0,isInterbank:!0,path:"v.ci"},{name:"Concepto",isIntrabank:!0,isInterbank:!0,path:"cc"},{name:"Folio CoDi",isIntrabank:!0,isInterbank:!0,path:"id"}]},{status:"Pospuesto",fields:[{name:"Destinatario",isIntrabank:!0,isInterbank:!0,path:"v.nb"},{name:"CLABE destino",isIntrabank:!0,isInterbank:!0,path:"v.cb"},{name:"Banco destino",isIntrabank:!0,isInterbank:!0,path:"v.ci"},{name:"Concepto",isIntrabank:!0,isInterbank:!0,path:"cc"},{name:"Fecha y hora de vencimiento",isIntrabank:!0,isInterbank:!0,path:"hl"},{name:"Referencia",isIntrabank:!1,isInterbank:!0,path:"idCE"},{name:"Folio CoDi",isIntrabank:!0,isInterbank:!0,path:"id"}]}]}static get styles(){return[Xe,y("bbva-movement-detail-shared-styles")]}_getFieldsByStatus(t){if(t){return this._informationFields.find((e=>e.status===t)).fields}return[]}_getOperativeActions(){return this._getOperativeActionsByStatus(this._transactionSelected.badge)}updated(t){super.updated(t),t.has("_transactionSelected")&&(this._validateTypeMovement(this._transactionSelected),this._viewMore=!1)}_validateTypeMovement(t){var e,i,a;40012!==(null==t||null===(e=t.payload)||void 0===e||null===(i=e.payload)||void 0===i||null===(a=i.v)||void 0===a?void 0:a.ci)?(this._isInterbankMovement=!0,this._isIntrabankMovement=!1):(this._isInterbankMovement=!1,this._isIntrabankMovement=!0)}_getDate(){var t;return this._formatDateLarge(null===(t=this._transactionSelected.payload)||void 0===t?void 0:t.date)}_getFiledValue(t){const e=t.split("."),{payload:i}=this._transactionSelected.payload,a=this._transactionSelected.badge;let o="";if(1===e.length){const t=e[0];o=i[t],"e"===t?o="Pagado"===a?"Cargo":"Cobrado"===a?"Abono":"Desconocido":"hl"===t||"hp"===t?o=this._formatDateLarge(o):"cc"===t&&""===o&&(o="Sin concepto")}else if(2===e.length){const t=e[0],a=e[1];o=i[t][a],"ci"===a&&(o=this._getBankNameByCode(o))}return o||""}manageLinkExternalLogout(){this._fireEvent("codi-logout-confirm",{code:"LOGOUT",primaryButtonClass:"secondary",selectedConfig:{className:"error",openMaximized:!0,heroImage:"images/errors/error.svg",title:"alert-LOGOUT-accept",acceptBtLabel:"alert-LOGOUT-EXTERNAL-LINK-accept",cancelBtLabel:"alert-LOGOUT-EXTERNAL-LINK-cancel",onAcceptEvent:()=>{this.setLogoutExternalLink()},template:{type:"paragraphs",values:[{text:"alert-LOGOUT-EXTERNAL-LINK-message"}]}}})}setLogoutExternalLink(){const{urlBanxico:t}=this._transactionSelected.payload;this._fireEvent("action-launcher-external-link",{scheme:t,packageId:null})}_renderDetail(){return k`
      <bbva-text
        text="Pago CoDi®"
        alignment="center"
        size="L"
        font-weight="500"
        class="textitle">
      </bbva-text>

      <bbva-text
        text="${this._getDate()}"
        alignment="center"
        size="S"
        font-weight="500">
      </bbva-text>

      <bbva-amount
        variant="4xl"
        amount="${this._transactionSelected.amount}"
        currency-code="MXN"
        local-currency="MXN"
        language="es">
      </bbva-amount>

      <bbva-badge-default
        text="${this._transactionSelected.badge}"
        class="textbadge ${this._transactionSelected.badgeClass}">
      </bbva-badge-default>

      ${"Vencido"===this._transactionSelected.badge?k`
        <bbva-text
          text="Esta solicitud de dinero está vencida. Pide a tu contacto que te haga una nueva."
          alignment="center"
          size="S">
        </bbva-text>`:""}
    `}_renderFields(){const t=this._getFieldsByStatus(this._transactionSelected.badge).length,e=this._viewMore?t:5;return this._getFieldsByStatus(this._transactionSelected.badge).slice(0,e).map((t=>t.isInterbank===this._isInterbankMovement||t.isIntrabank===this._isIntrabankMovement?k`
        <div class="box">
          <div>${t.name}</div>
          <div class="divspacing"></div>
          <div class="value-info fitConcept">${this._getFiledValue(t.path)}</div>
        </div>
    `:""))}_renderUrlBanxico(){var t,e;return this._viewMore&&null!==(t=this._transactionSelected)&&void 0!==t&&null!==(e=t.payload)&&void 0!==e&&e.urlBanxico?k`
      <div class="url-value-info">
        <p>Consulta más información sobre tu movimiento en:</p>
        <bbva-link @click="${()=>this.manageLinkExternalLogout()}">https://www.banxico.org.mx/cep</bbva-link>
      </div>`:""}_renderViewMore(){return k`
      <bbva-link @click="${()=>{this._viewMore=!this._viewMore}}">
        ${this._viewMore?"Ver menos":"Ver más"}
        <bbva-icon icon="${this._viewMore?$t():St()}" size="24"></bbva-icon>
      </bbva-link>`}_renderButtonsActions(){return this._getOperativeActions()?k`
      <bbva-button-row
        disabled-tabindex=""
        accessibility-text="Acciones"
        .options="${this._getOperativeActions()}">
      </bbva-button-row>`:""}render(){return k`
    <bbva-header-main
      variant="modal"
      accessibility-text-icon-right-secondary=""
      icon-right-primary="${O()}"
      @header-main-icon-right-primary-click="${this._headerIconClose}"
      text="Detalle de movimiento">
    </bbva-header-main>

    <div class="detail-content">

      <!-- Muestra el detalle del movimiento -->
      ${this._renderDetail()}

      <bbva-divider></bbva-divider>

      <!-- Muestras la informacion del pago  -->
      ${this._renderFields()}

      <!-- Muestra el url bnaxico -->
      ${this._renderUrlBanxico()}

      <!-- Muestra más -->
      ${this._renderViewMore()}
    </div>

    <!-- Muestra los botones de acciones -->
    ${this._renderButtonsActions()}

    `}}const He=new c;var je=n`:host {
  --_select-bg-color: var(--bbva-form-select-bg-dark-mode-color, var(--bbva-form-select-bg-color,var(--colorsSecondary100, ${s(d.secondary100)})));
  --_select-border-color: var(--bbva-form-select-border-dark-mode-color, var(--bbva-form-select-border-color,var(--colorsSecondary500, ${s(d.secondary500)})));
  --_select-readonly-border-color: var(--bbva-form-select-readonly-border-dark-mode-color, var(--bbva-form-select-readonly-border-color,var(--colorsSecondary500, ${s(d.secondary500)})));
  --_select-button-color: var(--bbva-form-select-button-dark-mode-color, var(--bbva-form-select-button-color,var(--colorsSecondary600, ${s(d.secondary600)})));
  --_select-readonly-button-color: var(--bbva-form-select-readonly-button-dark-mode-color, var(--bbva-form-select-readonly-button-color,var(--colorsSecondary500, ${s(d.secondary500)})));
  --_select-label-color: var(--bbva-form-select-label-dark-mode-color, var(--bbva-form-select-label-color,var(--colorsSecondary500, ${s(d.secondary500)})));
  --_select-filled-label-color: var(--bbva-form-select-filled-label-dark-mode-color, var(--bbva-form-select-filled-label-color,var(--colorsSecondary600, ${s(d.secondary600)})));
  --_select-readonly-label-color: var(--bbva-form-select-readonly-label-dark-mode-color, var(--bbva-form-select-readonly-label-color,var(--colorsSecondary500, ${s(d.secondary500)})));
  --_select-label-value-color: var(--bbva-form-select-label-value-dark-mode-color, var(--bbva-form-select-label-color,var(--colorsSecondary500, ${s(d.secondary500)})));
  --_select-icon-color: var(--bbva-form-select-icon-dark-mode-color, var(--bbva-form-select-icon-color,var(--colorsPrimaryMedium, ${s(d.primaryMedium)})));
  --_select-readonly-icon-color: var(--bbva-form-select-readonly-icon-dark-mode-color, var(--bbva-form-select-readonly-icon-color,var(--colorsSecondary500, ${s(d.secondary500)})));
  --_message-color: var(--bbva-form-select-message-dark-mode-color, var(--bbva-form-select-message-color, var(--colorsSecondary600, ${s(d.secondary600)})));
  --_message-icon-color: var(--bbva-form-select-message-icon-dark-mode-color, var(--bbva-form-select-message-icon-color, var(--colorsTertiaryType1Dark, ${s(d.tertiaryType1Dark)})));
  --_info-message-color: var(--bbva-form-select-info-message-dark-mode-color, var(--bbva-form-select-info-message-color, var(--colorsSecondary500, ${s(d.secondary500)})));
  --_info-message-icon-color: var(--bbva-form-select-info-message-icon-dark-mode-color, var(--bbva-form-select-info-message-icon-color, var(--colorsPrimaryCoreDark, ${s(d.primaryCoreDark)})));
  --_invalid-select-color: var(--bbva-form-select-invalid-dark-mode-color, var(--bbva-form-select-invalid-color,var(--colorsSecondary600, ${s(d.secondary600)})));
  --_invalid-select-bg-color: var(--bbva-form-select-invalid-bg-dark-mode-color, var(--bbva-form-select-invalid-bg-color,var(--colorsTertiaryType5Lightened, ${s(d.tertiaryType5Lightened)})));
  --_invalid-select-border-color: var(--bbva-form-select-invalid-border-dark-mode-color, var(--bbva-form-select-invalid-border-color,var(--colorsTertiaryType5Medium, ${s(d.tertiaryType5Medium)})));
  --_invalid-select-label-color: var(--bbva-form-select-invalid-label-dark-mode-color, var(--bbva-form-select-invalid-label-color,var(--colorsTertiaryType1Dark, ${s(d.tertiaryType1Dark)})));
  --_invalid-select-icon-color: var(--bbva-form-select-invalid-icon-dark-mode-color, var(--bbva-form-select-invalid-icon-color,var(--colorsTertiaryType1Dark, ${s(d.tertiaryType1Dark)})));
  --_form-select-title-color: var(--bbva-form-select-title-dark-mode-color, var(--bbva-form-select-title-color, var(--colorsSecondary600, ${s(d.secondary600)})));
  --_form-select-label-out-color: var(--bbva-form-select-label-out-dark-mode-color, var(--bbva-form-select-label-out-color ,var(--colorsSecondary600, ${s(d.secondary600)})));
  --_form-select-help-icon-color: var(--bbva-form-select-help-icon-dark-mode-color, var(--bbva-form-select-help-icon-color,var(--colorsPrimaryMedium, ${s(d.primaryMedium)})));
  --_form-select-options-overlay-bg-color: var(--bbva-form-select-options-overlay-bg-dark-mode-color, var(--bbva-form-select-options-overlay-bg-color, var(--colorsPrimaryCoreDarkened, ${s(d.primaryCoreDarkened)})));
  --_form-select-options-wrapper-bg-color: var(--bbva-form-select-options-wrapper-bg-dark-mode-color, var(--bbva-form-select-options-wrapper-bg-color, var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)})));
  display: block;
  box-sizing: border-box;
  position: relative;
  min-height: 4rem;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*::before,
*::after {
  box-sizing: inherit;
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

.slot-select ::slotted(select) {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  margin: 0;
  opacity: 0;
  z-index: -1;
  pointer-events: none;
}

.info-title {
  font-family: inherit;
  font-size: var(--bbva-form-select-font-size, var(--typographyTypeSmall, ${s(l.typeSmall)}));
  line-height: var(--bbva-form-select-line-height, var(--lineHeightTypeSmall, ${s(S.typeSmall)}));
  font-weight: var(--bbva-form-select-font-weight, var(--fontFacePrimaryMediumFontWeight, ${s(w.medium.fontWeight)}));
  color: var(--_form-select-title-color);
  margin-bottom: var(--bbva-form-select-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem));
}

.label-out {
  --bbva-text-color: var(--_form-select-label-out-color);
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  display: flex;
}

.label {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  color: var(--_select-label-color);
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
[aria-invalid=true] .label {
  color: var(--_invalid-select-label-color);
}
:host([show-value]) .label {
  width: 70%;
}
:host([readonly]) .label {
  color: var(--_select-readonly-label-color);
}
:host([filled]) .label {
  width: 125%;
  transform: translateY(calc(((0.3 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem)) scale(0.8);
  transition: transform 0.2s ease-in-out;
}
:host([filled]):not([aria-invalid=true]) .label {
  color: var(--_select-filled-label-color);
}
.label-value {
  position: absolute;
  top: 0;
  right: 0;
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem));
  transform-origin: top right;
  color: var(--_select-label-value-color);
}

.help-icon {
  color: var(--_form-select-help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
}

.content {
  display: flex;
}
.content-text {
  flex: auto;
  min-width: 0;
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
  color: var(--_select-filled-label-color);
}
:host([readonly]) .content-text {
  color: var(--_select-readonly-label-color);
}
.content-value {
  flex: none;
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  color: var(--_select-label-value-color);
}

.button {
  position: relative;
  width: 100%;
  height: 3rem;
  font-family: inherit;
  font-size: var(--typographyTypeSmall, ${s(l.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${s(S.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${s(w.book.fontWeight)});
  background-color: var(--_select-bg-color);
  color: var(--_select-button-color);
  border: none;
  border-bottom: 1px solid var(--_select-border-color);
  border-radius: 1px;
  margin: 0;
  outline: none;
  padding: 0;
  cursor: pointer;
  text-align: left;
}
.button::-moz-focus-inner {
  border: 0;
}
.button[aria-invalid=true] {
  background-color: var(--_invalid-select-bg-color);
  border-bottom-color: var(--_invalid-select-border-color);
}
.button[aria-invalid=true] .content-text {
  color: var(--_invalid-select-color);
}
.button[disabled] {
  opacity: 0.4;
  cursor: default;
}
:host([readonly]) .button {
  color: var(--_select-readonly-button-color);
  border-bottom-color: var(--_select-readonly-border-color);
  cursor: default;
}
.button-content {
  display: flex;
  align-items: center;
  height: 100%;
}
.button-clip {
  flex: none;
  max-width: 3rem;
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}
.button-text {
  flex: auto;
  position: relative;
  height: 100%;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 15) * 1em) 0 calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 15) * 1em);
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  min-width: 0;
}
.button-icon {
  flex: none;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem);
  width: 3rem;
  display: flex;
  align-items: center;
  justify-content: center;
  color: var(--_select-icon-color);
}
[aria-invalid=true] .button-icon {
  color: var(--_invalid-select-icon-color);
}
:host([readonly]) .button-icon {
  color: var(--_select-readonly-icon-color);
}

.options-layer {
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  z-index: 1;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 1rem;
  opacity: 0;
  visibility: hidden;
  transition: opacity 0.2s, visibility 0s 0.2s;
}
.options-layer.opened {
  opacity: 1;
  visibility: visible;
  transition: opacity 0.2s, visibility 0s 0s;
}
.options-overlay {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  opacity: 0.95;
  background-color: var(--_form-select-options-overlay-bg-color);
}
.options-gradient {
  position: relative;
  max-width: 18rem;
  width: 100%;
}
.options-gradient::before, .options-gradient::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  height: 2.5rem;
}
.options-gradient::before {
  top: 0;
  background: linear-gradient(to bottom, var(--_form-select-options-wrapper-bg-color), rgba(255, 255, 255, 0));
}
.options-gradient::after {
  bottom: 0;
  background: linear-gradient(to top, var(--_form-select-options-wrapper-bg-color), rgba(255, 255, 255, 0));
}
.options-wrapper {
  overflow-y: auto;
  min-height: 14rem;
  max-height: 29rem;
  padding: 0;
  background-color: var(--_form-select-options-wrapper-bg-color);
  box-shadow: 0 1px 1px 0 rgba(18, 18, 18, 0.2);
  border-radius: 1px;
}

:host([native-selector]) select {
  z-index: 1;
  pointer-events: all;
  appearance: menulist-button;
  width: 100%;
  height: 3rem;
  cursor: pointer;
  opacity: 0;
  position: absolute;
  left: 0;
  margin: 0;
}

:host([focus-visible][native-selector]) #button {
  outline: auto;
}

:host([native-selector]) .options-layer {
  display: none;
}

[data-tag-name=bbva-notification-help] {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1rem) 0;
  --bbva-notification-help-icon-color: var(--_info-message-icon-color);
  --bbva-notification-help-text-color: var(--_info-message-color);
  --bbva-notification-help-icon-color-alert: var(--_message-icon-color);
  --bbva-notification-help-text-color-alert: var(--_message-color);
}

@media (min-width: 600px) {
  .options-layer {
    position: absolute;
    top: 3rem;
    bottom: auto;
    display: block;
    padding: 0;
    transition: none;
  }
  .options-layer.opened {
    transition: none;
  }
  .options-overlay {
    display: none;
  }
  .options-gradient {
    max-width: none;
  }
  .options-gradient::before, .options-gradient::after {
    display: none;
  }
  .options-wrapper {
    padding: 0;
    max-height: none;
    min-height: 9rem;
    box-shadow: var(--boxShadowType1, ${s(wt.type1)});
  }
}
${He.mediaRules()}`;const Ue=new c;var Je=n`[ambient^=light] {
  --bbva-form-select-bg-color: initial;
  --bbva-form-select-border-color: initial;
  --bbva-form-select-readonly-border-color: initial;
  --bbva-form-select-title-color: initial;
  --bbva-form-select-label-out-color: initial;
  --bbva-form-select-button-color: initial;
  --bbva-form-select-readonly-button-color: initial;
  --bbva-form-select-label-color: initial;
  --bbva-form-select-filled-label-color: initial;
  --bbva-form-select-readonly-label-color: initial;
  --bbva-form-select-icon-color: initial;
  --bbva-form-select-readonly-icon-color: initial;
  --bbva-form-select-message-color: initial;
  --bbva-form-select-message-icon-color: initial;
  --bbva-form-select-info-message-color: initial;
  --bbva-form-select-info-message-icon-color: initial;
  --bbva-form-select-invalid-bg-color: initial;
  --bbva-form-select-invalid-border-color: initial;
  --bbva-form-select-invalid-label-color: initial;
  --bbva-form-select-invalid-icon-color: initial;
  --bbva-form-select-invalid-color: initial;
  --bbva-form-select-help-icon-color: initial;
}

[ambient=light100] {
  --bbva-form-select-bg-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
}
${Ue.mediaRules()}`;const Ye=new c;var Ge=n`[ambient^=dark] {
  --bbva-form-select-bg-color: var(--colorsPrimaryCoreLight, ${s(d.primaryCoreLight)});
  --bbva-form-select-border-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-form-select-readonly-border-color: var(--colorsSecondary100, ${s(d.secondary100)});
  --bbva-form-select-title-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-form-select-label-out-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-form-select-button-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-form-select-readonly-button-color: var(--colorsSecondary300, ${s(d.secondary300)});
  --bbva-form-select-label-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-form-select-filled-label-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-form-select-readonly-label-color: var(--colorsSecondary300, ${s(d.secondary300)});
  --bbva-form-select-icon-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-form-select-readonly-icon-color: var(--colorsSecondary100, ${s(d.secondary100)});
  --bbva-form-select-message-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-form-select-message-icon-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-form-select-info-message-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-form-select-info-message-icon-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-form-select-invalid-bg-color: var(--colorsTertiaryType5Lightened, ${s(d.tertiaryType5Lightened)});
  --bbva-form-select-invalid-border-color: var(--colorsTertiaryType5Medium, ${s(d.tertiaryType5Medium)});
  --bbva-form-select-invalid-label-color: var(--colorsTertiaryType1Dark, ${s(d.tertiaryType1Dark)});
  --bbva-form-select-invalid-icon-color: var(--colorsTertiaryType1Dark, ${s(d.tertiaryType1Dark)});
  --bbva-form-select-invalid-color: var(--colorsSecondary600, ${s(d.secondary600)});
  --bbva-form-select-help-icon-color: var(--colorsPrimarySubdued, ${s(d.primarySubdued)});
}

[ambient=dark100] {
  --bbva-form-select-bg-color: var(--colorsPrimaryCoreLight, ${s(d.primaryCoreLight)});
  --bbva-form-select-help-icon-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-select-bg-color: var(--colorsPrimaryCoreDark, ${s(d.primaryCoreDark)});
}
${Ye.mediaRules()}`;const Ke={dark:n`
    ${Ct.dark}
    ${Ge}
  `,light:n`
    ${Ct.light}
    ${Je}
  `};class Ze extends(h(e(It))){static get is(){return"bbva-form-select"}static get scopedElements(){return{"bbva-icon":m,"bbva-core-select":It,"bbva-form-option":Tt,"bbva-notification-help":Lt,"bbva-text":v}}static get optionTag(){return this.getScopedTagName("bbva-form-option").toUpperCase()}static get properties(){return{openIcon:{type:String,attribute:"open-icon"},closeIcon:{type:String,attribute:"close-icon"},iconSize:{type:Number,attribute:"icon-size"},showValue:{type:Boolean,attribute:"show-value"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoTitle:{type:String,attribute:"info-title"},infoMessage:{type:String,attribute:"info-message"},defaultClip:{type:Boolean,attribute:"default-clip"},nativeSelector:{type:Boolean,attribute:"native-selector"},allNative:{type:Boolean,attribute:"all-native"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:String,attribute:"help-icon"},accessibilityHelpText:{type:String,attribute:"accessibility-help-text"},optionalLabel:{type:String,attribute:"optional-label"},accessibilityIconNotification:{type:String,attribute:"accessibility-icon-notification"},nativeSelectAccessibilityText:{type:String,attribute:"native-select-accessibility-text"}}}constructor(){super(),this.openIcon=St(),this.closeIcon=$t(),this.iconSize=24,this.errorIcon=z(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=D(),this.infoIconSize=16,this.infoMessage="",this.infoTitle="",this.name="selector",this.nativeSelector=!1,this.optionalLabel="bbva-form-select-optional-label",this.accessibilityIconNotification="",this.nativeSelectAccessibilityText="",this.allNative=!1,this.addEventListener("change",this._fireSelectedItem),this.accessibilityHelpText="bbva-form-select-help-button-text",this.showValue=!1}firstUpdated(t){super.firstUpdated(t)}updated(t){super.updated&&super.updated(t),t.has("items")&&(this._items=[...this.shadowRoot.querySelectorAll(this.allNative?"option":this.constructor.optionTag.toLowerCase())],this._updateOptions()),t.has("_selectedOption")&&(this._selectedOptionText?this.setAttribute("filled",""):this.removeAttribute("filled"));const e=this.shadowRoot.querySelector(".options-wrapper");t.has("opened")&&e&&(this.opened||this.nativeSelector||this.allNative?e.removeAttribute("aria-hidden"):e.setAttribute("aria-hidden","true"))}_notificationLabel({elem:t,elem1:e,elem2:i,elem3:a}){return`${t} ${e} ${this._errorVisible&&i} ${this.infoMessage&&a}`}_shouldUpdateOptions(){var t;let e=!(null!==(t=this._options)&&void 0!==t&&t.length&&this._items.length===this._options.length&&this._options.every((t=>this._items.includes(t))));return this.allNative&&(e=e&&this._items.length>0),e}_updateOptions(){this._options=this._shouldUpdateOptions()?this._lightNodes.concat(this._items):this._options,this._enabledOptions=this._options.filter((t=>!t.disabled));const t=this._options.find((t=>t.selected));t?this._selectItem(t):this._unselect(),this.requestUpdate()}get _errorVisible(){return this.errorMessage&&this.invalid}get _selectedOptionText(){return this._selectedOption&&this._selectedOption.labelValue?this._selectedOption.labelValue:this._selectedOption&&this._selectedOption.text}get _selectedOptionLabel(){return this._selectedOption&&this._selectedOption.labelValue&&this._selectedOption.text?this._selectedOption.text:""}get _selectedOptionClip(){return this._selectedOption&&this._selectedOption.clip}get _selectedOptionValue(){return this._selectedOption&&this._selectedOption.value}static get styles(){return[f(".button:focus"),je,y("bbva-form-select-shared-styles"),Ke.dark,Ke.light]}get field(){return k` ${this._control} ${this._optionsLayer} ${this._select} `}get _control(){return k`
      <button
        id="button"
        class="button"
        ?disabled="${this.disabled}"
        aria-expanded="${this.opened}"
        aria-invalid="${this.invalid}"
        aria-haspopup="listbox"
        aria-labelledby="${this._notificationLabel({elem:"label",elem1:"content-text",elem2:"alert",elem3:"info"})}"
        @click="${this._onButtonClick}"
        aria-hidden=${this.nativeSelector||this.allNative}
        tabindex=${this.nativeSelector?"-1":"0"}
      >
        ${this._controlContent}
      </button>
    `}get _controlContent(){return k`
      <span class="button-content">
        ${this._clip}
        <span class="button-text">
          ${this._label}
          <span class="content">
            <span id="content-text" class="content-text"> ${this._selectedOptionText} </span>
            ${this.showValue?k` <span class="content-value"> ${this._selectedOptionValue} </span> `:""}
          </span>
        </span>
        ${this._selectIcon}
      </span>
    `}get _clip(){if(this._selectedOptionClip){const t=this._selectedOptionClip.cloneNode(!0);return k` <span class="button-clip" aria-hidden="true"> ${t} </span> `}if(this.defaultClip&&void 0!==this.item(0)&&this.item(0).clip){const t=this.item(0).clip.cloneNode();return k` <span class="button-clip" aria-hidden="true"> ${t} </span> `}return""}get _label(){return this.labelOut&&!this.label&&(this.label=this.labelOut),k`
      <span id="label" class="label">${this._labelToShow}</span>
      ${this.showValue&&!this._selectedOptionValue?k` <span id="label-value" class="label-value">Value</span> `:""}
    `}get _labelToShow(){let t;return t=this._selectedOption&&this._selectedOptionLabel?this._selectedOptionLabel:this.label,this.labelOut||this.required||(t=`${t} ${this.t(this.optionalLabel)}`),k` ${t} `}get _selectIcon(){return k`
      <span class="button-icon" aria-hidden="true">
        <bbva-icon
          .icon="${this.opened?this.closeIcon:this.openIcon}"
          .size="${this.iconSize}"
        ></bbva-icon>
      </span>
    `}get _helpIcon(){return this.helpIcon&&this.labelOut?k`
          <bbva-icon
            role="button"
            aria-label="${this.t(this.accessibilityHelpText)}"
            @click="${this._helpClicked}"
            class="help-icon"
            .icon="${this.helpIcon}"
            size="24"
            .disabledTabindex="${!1}"
          >
          </bbva-icon>
        `:""}_helpClicked(){this.dispatchEvent(new CustomEvent("form-select-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _optionsLayer(){return k`
      <div class="options-layer ${this.opened&&!this.nativeSelector?"opened":""}">
        <div class="options-overlay"></div>
        <div class="options-gradient">
          <div class="options-wrapper">${this._optionsList}</div>
        </div>
      </div>
    `}get _labelOut(){return this.labelOut?k`
        <div class="label-out">
          <bbva-text
            tag="label"
            unset
            size="S"
            id="help-text"
            for="${this.nativeSelector||this.allNative?"selector":"button"}"
            .text=${this.required?`${this.labelOut}`:`${this.labelOut} ${this.t(this.optionalLabel)}`}
          ></bbva-text>
          ${this._helpIcon}
        </div>
      `:""}_optionItemTemplate(t){return k`
      <bbva-form-option
        ?disabled="${t.disabled}"
        ?selected="${t.selected}"
        .value="${t.value}"
        >${t.text}</bbva-form-option
      >
    `}get messageError(){return this._errorVisible?k`
          <bbva-notification-help
            role="alert"
            class="alert"
            id="alert"
            disabled-tabindex
            accessibility-label-icon="${this.accessibilityIconNotification}"
            .icon="${this.errorIcon}"
            .size="${this.errorIconSize}"
            text="${this.errorMessage}"
          ></bbva-notification-help>
        `:""}get messageInfo(){return this.infoMessage?k`
          <bbva-notification-help
            id="info"
            disabled-tabindex
            accessibility-label-icon="${this.accessibilityIconNotification}"
            .icon="${this.infoIcon}"
            size="${this.infoIconSize}"
            text="${this.infoMessage}"
          ></bbva-notification-help>
        `:""}get textTitle(){return this.infoTitle?k`
          <div class="info-title">
            <span>${this.infoTitle}</span>
          </div>
        `:""}get _nativeSelect(){return k`
      <select
        id="selector"
        name="${this.name}"
        aria-label="${this.nativeSelectAccessibilityText}"
        ?disabled="${this.disabled}"
        ?required="${this.required}"
        @invalid="${this._onInvalid}"
        @change="${t=>this._handleNativeOptionClick(t)}"
      >
        ${this.items.map((t=>k` <option
              ?disabled="${t.disabled}"
              ?selected="${t.selected}"
              value="${t.value}"
            >
              ${t.text}
            </option>`))};
      </select>
    `}get _hybridNativeSelect(){const t=this.querySelectorAll('[data-tag-name="bbva-form-option"]'),e=t.length>0?Array.from(t):this.items;return k`
      <select
        id="selector"
        name="${this.name}"
        aria-labelledby="${this._notificationLabel({elem:"label",elem1:"",elem2:"alert",elem3:"info"})}"
        ?disabled="${this.disabled}"
        ?required="${this.required}"
        @invalid="${this._onInvalid}"
        @change="${t=>this._handleNativeOptionClick(t)}"
        class="focus-only"
      >
        ${e.map((t=>k` <option
              ?disabled="${t.disabled}"
              ?selected="${t.selected}"
              value="${t.value}"
            >
              ${t.text}
            </option>`))}
      </select>
      ${this._control}${this._optionsLayer} ${this._select}
    `}_handleNativeOptionClick(t){null!=t&&t.target&&(this.selectedIndex=t.target.selectedIndex,this.value=t.target.value,this.dispatchEvent(new CustomEvent("change",{bubbles:!0,composed:!0})))}_fireSelectedItem(){this.dispatchEvent(new CustomEvent("bbva-form-select-selected-item",{bubbles:!0,composed:!0,detail:{selectedIndex:this.selectedIndex,value:this.value}}))}get _selector(){return this.allNative?this._nativeSelect:this.nativeSelector?this._hybridNativeSelect:this.field}render(){return k`
      ${this.textTitle} ${this._labelOut} ${this._selector} ${this.messageError} ${this.messageInfo}
    `}}customElements.define(Ze.is,Ze);const Qe=new c;var ti=n`:host {
  display: block;
  position: relative;
  box-sizing: border-box;
  width: 100%;
  --_form-filter-tag-color: var(--bbva-form-filter-dark-mode-tag-color, var(--bbva-form-filter-tag-color, var(--colorsSecondary600, ${s(d.secondary600)})));
  --_form-filter-tag-bg-color: var(--bbva-form-filter-dark-mode-tag-background-color, var(--bbva-form-filter-tag-background-color, var(--colorsSecondary100, ${s(d.secondary100)})));
  --_form-filter-remove-filter-color: var(--bbva-form-filter-dark-mode-remove-filter-color, var(--bbva-form-filter-remove-filter-color, var(--colorsPrimaryMedium, ${s(d.primaryMedium)})));
  --_form-filter-gradient-color: var(--bbva-form-filter-dark-mode-gradient-color, var(--bbva-form-filter-gradient-color, var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)})));
  --skeleton-quote-color: var(--bbva-form-filter-skeleton-dark-mode-color, var(--bbva-form-filter-skeleton-color, var(--colorsSecondary200, ${s(d.secondary200)})));
  --skeleton-quote-bg: var(--bbva-form-filter-skeleton-dark-mode-bg-color, var(--bbva-form-filter-skeleton-bg, transparent));
  --_bbva-form-filter-skeleton-animated-layer-bg: var(--bbva-form-filter-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-form-filter-skeleton-animated-layer-bg, var(--ambientsLight, ${s(xt.light)})));
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

.gradient.left::before, .gradient.right::after {
  content: "";
  position: absolute;
  left: 0;
  top: 0;
  height: 100%;
  width: 1.875rem;
  pointer-events: none;
  background-image: linear-gradient(to right, var(--_form-filter-gradient-color) 0%, rgba(255, 255, 255, 0) 100%);
}
.gradient.right::after {
  left: auto;
  right: 0;
  transform: rotate(180deg);
}

.filters {
  display: flex;
  box-sizing: border-box;
  width: 100%;
  margin: 0;
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 15) * 1em) 0 calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 15) * 1em);
  overflow-x: auto;
  -webkit-overflow-scrolling: touch;
  scrollbar-width: none;
  list-style: none;
}
.filters::-webkit-scrollbar {
  display: none;
}

.tag-edit {
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 15) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 15) * 1em);
  min-width: 3.5rem;
}

.tag {
  display: flex;
  flex-grow: 1;
  flex-shrink: 0;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 15) * 1em);
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 15) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 15) * 1em);
  border-radius: var(--borderRadiusSmall, ${s(At.small)});
  background-color: var(--_form-filter-tag-bg-color);
  min-width: 3.5rem;
  max-width: fit-content;
}
.tag [data-tag-name=bbva-text] {
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${s(w.mediumItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${s(w.mediumItalic.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${s(S.typeSmall)});
  color: var(--_form-filter-tag-color);
}

.filters .tag:nth-child(2) {
  margin-left: 0;
}

.right-padding-fix:after {
  display: block;
  content: "";
  width: 1rem;
}

.remove-filter {
  fill: var(--_form-filter-remove-filter-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(b.spacer)}))) / 16) * 1em);
}

:host([hide-editable-label]) .filters li:nth-child(1) {
  display: none;
}
:host([hide-editable-label]) .filters li:nth-child(2) {
  margin-left: 0;
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 3.5rem;
  width: 100%;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--skeleton-quote-color) 100%, transparent 0);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((28px * 2) + (16px/ 2)) 16px, 79px 32px, 79px 32px, 79px 32px;
  background-position: 0 50%, 43px 50%, 130px 50%, 217px 50%;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 4.125rem;
  background: var(--_bbva-form-filter-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
${Qe.mediaRules()}`;var ei=n`[ambient^=light] {
  --bbva-form-filter-gradient-color: initial;
  --bbva-form-filter-tag-background-color: initial;
  --bbva-form-filter-tag-color: initial;
  --bbva-form-filter-remove-filter-color: initial;
  --bbva-form-filter-skeleton-color: initial;
  --bbva-form-filter-skeleton-animated-layer-bg: initial;
}
${(new c).mediaRules()}`;const ii=new c;var ai=n`[ambient^=dark] {
  --bbva-form-filter-gradient-color: var(--colorsPrimaryCore, ${s(d.primaryCore)});
  --bbva-form-filter-tag-background-color: var(--colorsPrimaryCoreDark, ${s(d.primaryCoreDark)});
  --bbva-form-filter-tag-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-form-filter-remove-filter-color: var(--colorsPrimarySubdued, ${s(d.primarySubdued)});
  --bbva-form-filter-skeleton-color: var(--colorsPrimaryCoreDark, ${s(d.primaryCoreDark)});
  --bbva-form-filter-skeleton-animated-layer-bg: var(--colorsPrimaryCore, ${s(d.primaryCore)});
}

[ambient^=dark400] {
  --bbva-form-filter-gradient-color: var(--colorsPrimaryCoreDarkened, ${s(d.primaryCoreDarkened)});
  --bbva-form-filter-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${s(d.primaryCoreDarkened)});
}
${ii.mediaRules()}`;const oi={dark:n`
    ${C.dark}
    ${_.dark}
    ${ai}
  `,light:n`
    ${C.light}
    ${_.light}
    ${ei}
  `};class ri extends(h(e(g))){static get is(){return"bbva-form-filter"}static get scopedElements(){return{"bbva-link":L,"bbva-text":v}}static get properties(){return{linkAccessibility:{type:String,attribute:"accessibility-link"},filters:{type:Array},editableLabel:{type:String,attribute:"editable-label"},iconSize:{type:Number,attribute:"icon-size"},hideEditableLabel:{type:Boolean,attribute:"hide-editable-label",reflect:!0},_availableScroll:{type:String},_filters:{type:Object},loading:{type:Boolean,reflect:!0},linkHref:{type:String,attribute:"link-href"}}}constructor(){super(),this.editableLabel="bbva-form-filter-editable-label",this.linkAccessibility="bbva-form-filter-link-accessibility",this.iconSize=16,this.loading=!1}firstUpdated(){super.firstUpdated&&super.firstUpdated(),this._filters=this.shadowRoot.querySelector(".filters"),this._onStepsScroll()}updated(t){super.updated&&super.updated(t),t.has("filters")&&(this._onStepsScroll(),this.requestUpdate())}static get styles(){return[ti,y("bbva-form-filter-shared-styles"),oi.light,oi.dark]}_editClick(){this.dispatchEvent(new CustomEvent("form-filter-edit-click",{detail:!0,bubbles:!0,composed:!0}))}_closeClick(t){this.dispatchEvent(new CustomEvent("form-filter-close-click",{detail:t,bubbles:!0,composed:!0}))}get _scrollable(){return this._filters&&(this._filters.scrollHeight>this._filters.clientHeight||this._filters.scrollWidth>this._filters.clientWidth)}_onStepsScroll(){const{scrollLeft:t,scrollWidth:e,offsetWidth:i}=this._filters;this._availableScroll=0!==t?t+i>=e?"left":"left right":"right"}render(){return k`${this.loading?k`<div class="skeleton"></div>`:k`<ul
            class="filters"
            @scroll="${this._onStepsScroll}"
            tabindex="${x(this._scrollable?"0":void 0)}"
          >
            <li class="tag-edit">
              <bbva-link
                id="link"
                data-tag-name="bbva-link"
                @click="${this._editClick}"
                href="${x(this.linkHref)}"
              >
                ${this.t(this.editableLabel)}
              </bbva-link>
            </li>
            ${this.filters.map(((t,e)=>k`
                  <li class="tag">
                    <bbva-text text="${t.name}" tag="span" size="S" ellipsis></bbva-text>
                    ${t.removable?k`
                          <bbva-link
                            class="remove-filter"
                            data-tag-name="bbva-link"
                            aria-label="${this.t(this.linkAccessibility)} ${t.name}"
                            icon="${O()}"
                            icon-size="${this.iconSize}"
                            href="${x(this.linkHref)}"
                            @click="${()=>this._closeClick(e)}"
                          ></bbva-link>
                        `:V}
                  </li>
                `))}
            ${this._scrollable?k` <div class="right-padding-fix"></div> `:V}
          </ul>
          <div class="${this._scrollable?"gradient":""} ${this._availableScroll}"></div> `}`}}customElements.define(ri.is,ri);const ni=new c;const si={dark:n`
    ${n`[ambient^=dark] {
  --bbva-form-filter-tag-background-color: var(--colorsPrimaryCoreDark, ${s(d.primaryCoreDark)});
  --bbva-form-filter-dark-mode-tag-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-link-with-icon-icon-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
  --bbva-link-dark-mode-color: var(--colorsPrimaryCoreLightened, ${s(d.primaryCoreLightened)});
}
${ni.mediaRules()}`}
  `};var li=n`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.notification-message-container {
  margin-left: 1rem;
  margin-right: 1rem;
  padding-top: 15px;
  text-align: start;
}

.form-select-container {
  margin-left: 1rem;
  margin-right: 1rem;
}

.form-select {
  text-align: start;
}

.slot-content {
  margin-top: 100%;
  padding-bottom: 0.2rem;
}

div .fix-bottom {
  margin-top: 4.2rem;
}

.panel-info {
  padding-top: 2rem;
}

.list-container {
  margin-bottom: 0.5rem;
  text-align: start;
}

bbva-form-filter {
  background-color: var(--colorsPrimaryCore, ${s(d.primaryCore)});
}
`;class ci extends g{static get is(){return"bbva-movements-filter"}static get properties(){return{_filters:{type:Array},listMovements:{type:Array},_ambient:{type:String},_isDisableSecharButton:{type:Boolean},_filterList:{type:String},_isFormSelectVisible:{type:Boolean},_isSpinnerVisible:{type:Boolean},_selectedFilter:{type:String}}}static get scopedElements(){const t=[qt,Ze,Tt,M,ri,Pt,Ut,...ci.configurationScopedElements()];return ci.scopedElementsFromClasses(t)}constructor(){super(),this._selectedFilter="",this._isSpinnerVisible=!1,this._isFormSelectVisible=!0,this._ambient="dark",this._isDisableSecharButton=!0,this._filters=[],this.listMovements=[],this.status=[{name:"Por pagar",value:"Por pagar"},{name:"Pospuesto",value:"Pospuesto"},{name:"Pagado",value:"Pagado"},{name:"Cobrado",value:"Cobrado"},{name:"Rechazado",value:"Rechazado"},{name:"Vencido",value:"Vencido"}],this._filterList=[]}static get styles(){return[li,si.dark,y("bbva-movement-detail-shared-styles")]}_filterAndSortMovements(t,e){if(t.length>0){const i=this._filterMovementsByStatus(t,e);return i.sort(((t,e)=>e.date-t.date)),this._generateNotificationStructure(i)}return[]}_filterMovementsByStatus(t,e){return t.filter((t=>e.includes(t.status)))}_generateNotificationStructure(t){const e=[];return t.forEach((t=>{const i=this._formatDate(t.date),a=e.find((t=>t.date===i)),o={id:t.operationId,amount:t.amount,read:!0,name:this._truncateString(t.description,24),description:JSON.stringify([t.concept]),badge:t.status,currencyAmount:"USD",type:"",badgeClass:this._getBadgeClassByStatus(t.status),operativeActions:this._getOperativeActionsByStatus(t.status,t.operationId),payload:t,link:"#"};if(a)a.notifications.push(o);else{const t={date:i,notifications:[o]};e.push(t)}})),e}_formatDate(t){return moment(t).format("DD [de] MMMM [de] YYYY")}_truncateString(t,e){return t.length>e?`${t.substring(0,e)}...`:t}_getOperativeActionsByStatus(t,e=""){const n=[];switch(t){case"Pagado":n.push({icon:r(),label:"Compartir Comprobante",id:e});break;case"Por pagar":n.push({icon:i(),label:"Pagar ahora",id:e},{icon:o(),label:"Posponer",id:e},{icon:a(),label:"Rechazar pago",id:e});break;case"Pospuesto":n.push({icon:i(),label:"Pagar ahora",id:e},{icon:a(),label:"Rechazar pago",id:e})}return n}_getBadgeClassByStatus(t){let e="";switch(t){case"Pagado":case"Cobrado":e="green-badge";break;case"Por pagar":e="yellow-badge";break;case"Pospuesto":e="blue-badge";break;case"Tu contacto rechazo":case"Rechazado por ti":case"Vencido":e="red-badge";break;default:e=""}return e}_onClickSearch(){this._isFormSelectVisible=!1,this._isSpinnerVisible=!0,this.filterListTransactions()}filterListTransactions(){const t=this._filters[0].name;this._filterList="Rechazado"===t?this._filterAndSortMovements(this.listMovements,["Rechazado por ti","Tu contacto rechazo"]):this._filterAndSortMovements(this.listMovements,t),this._isSpinnerVisible=!1}_headerIconClose(){this._selectedFilter="",this._isSpinnerVisible=!1,this._isFormSelectVisible=!0,this._isDisableSecharButton=!0,this._filters=[]}_selectFormItem({detail:t}){this._filters.length>0&&this._filters.pop(),this._isDisableSecharButton=!1,this._filters.push({name:t.value,removable:!0}),this._selectedFilter=t.value}_removeFilterItem(){this._filterList=[],this._isFormSelectVisible=!0,this._selectedFilter=""}_editFilter(){this._isFormSelectVisible=!0}_renderSpinner(){return k`
      <bbva-progress-content visible></bbva-progress-content>
    `}_renderEmptyTransactions(){return k`
    <bbva-panel-info
      class="panel-info"
      disabled-tabindex
      text="No tienes movimientos CoDi® Pendientes">
    </bbva-panel-info>
    `}_renderHeaderMain(){return k`
    <bbva-header-main
      variant="modal"
      accessibility-text-icon-right-secondary=""
      icon-right-primary="${O()}"
      @header-main-icon-right-primary-click="${this._headerIconClose}"
      text="Filtrar movimientos">
    </bbva-header-main>
    `}_renderFormSelect(){return k`
    <!-- Status label -->
    <bbva-header-category
      text="Estatus">
    </bbva-header-category>

    <!-- Form select -->
    <div class="form-select-container">
      <bbva-form-select class="form-select"
        .value="${this._selectedFilter}"
        label="Estatus de movimiento"
        optional-label=""
        @bbva-form-select-selected-item="${this._selectFormItem}">
        ${this.status.map((t=>k`
            <bbva-form-option
              class="form-select"
              value="${t.value}">
              ${t.name}
            </bbva-form-option>
          `))}
      </bbva-form-select>
    </div>

    <!-- Select button -->
    <div class="slot-content">
      <bbva-button-default
        class="fix-bottom"
        variant="primary"
        @click="${this._onClickSearch}"
        ?disabled="${this._isDisableSecharButton}">
          Buscar
      </bbva-button-default>
    </div>
    `}_renderMovementsList(){return k`
    <!-- Filtro de movimientos -->
    <bbva-form-filter
      ambient="${this._ambient}"
      editable-label="Editar"
      .filters="${this._filters}"
      @form-filter-close-click="${this._removeFilterItem}"
      @form-filter-edit-click="${this._editFilter}">
    </bbva-form-filter>

    ${0===this._filterList.length?this._renderEmptyTransactions():""}

    <!-- Lista de movimientos -->
    <bbva-aggregation-swipe-list
      id="transactionList"
      language="es-MX"
      notificationsList
      .notifications="${this._filterList}"
      class="list-container">
    </bbva-aggregation-swipe-list>
    `}render(){return k`
    <div class="detail-content">
      ${this._renderHeaderMain()}

      ${this._isFormSelectVisible?this._renderFormSelect():this._renderMovementsList()}

      ${this._isSpinnerVisible?this._renderSpinner():""}
    </div>
    `}}customElements.define(_e.is,_e);var di=n`:host {
  display: block;
  box-sizing: border-box;
}
:host [data-tag-name=bbva-form-input] [data-tag-name=bbva-form-amount] .slot-input::slotted(input) {
  background-color: red;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding:0px ;
}
`;class bi extends(Ot(g)){static get is(){return"bbva-feature-qr-payments-p2p-codi-payment-mx"}static get properties(){return{_isListMovementsVisible:{type:Boolean},_isMovementDetailVisible:{type:Boolean},_isMovementsFilterVisible:{type:Boolean},_transactionSelected:{type:Object},_banxicoProvider:{type:Object},_listMovements:{type:Array},_isRejected:{type:Boolean},_postponedMovementId:{type:String}}}constructor(){super(),this._isListMovementsVisible=!0,this._isMovementDetailVisible=!1,this._isMovementsFilterVisible=!1,this._entryUsingFilter=!1,this._transactionSelected={},this._listMovements=[],this._isRejected=!1,this._postponedMovementId=""}static get styles(){return[di,y("bbva-feature-qr-payments-p2p-codi-payment-mx-shared-styles")]}static get scopedElements(){const t=[Mt,xe,We,ci,zt,...bi.configurationScopedElements()];return bi.scopedElementsFromClasses(t)}firstUpdated(){this._fireEvent("bbva-list-movements-ready")}initPage(){this._isListMovementsVisible=!0,this._isMovementDetailVisible=!1,this._isMovementsFilterVisible=!1,this._entryUsingFilter=!1,this._transactionSelected={},this._listMovements=[],this._isRejected=!1,this._postponedMovementId="",this.getHistoricalMovements()}viewMovementDetail({detail:t}){this._transactionSelected=t,this._isMovementDetailVisible=!0}viewMovementDetailFromFilter({detail:t}){this._transactionSelected=t,this._entryUsingFilter=!0,this._isMovementsFilterVisible=!1,this._isMovementDetailVisible=!0}closeMovementDetail(){this._isMovementDetailVisible=!1,this._entryUsingFilter?this._isMovementsFilterVisible=!0:this._isListMovementsVisible=!0}_getResponseChargeMessage(t){if(this._fireEvent("send-response-charge-message-to-log",t),console.log("🚀 ~ response.detail:",t.detail),t.detail&&t.detail.encryptedMessages){const o=t.detail.encryptedMessages,r=this._decryptPayment(o,this._transactionSelected.id);console.log("🚀 ~ data",r);const n=window.codiMovementsGlobalArray.find((t=>{var e,i,a,o;return(null===(e=t.detail)||void 0===e||null===(i=e.references)||void 0===i||null===(a=i[1])||void 0===a?void 0:a.value)===(null==r||null===(o=r[0])||void 0===o?void 0:o.cr)}));var e,i,a;if(n)this._transactionSelected.payload.urlBanxico=null==n||null===(e=n.detail)||void 0===e||null===(i=e.customExternalReference)||void 0===i||null===(a=i.trackingInformation)||void 0===a?void 0:a.href}}_getResponseNotification({detail:t}){if(console.log("🚀 ~ BbvaFeatureQrPaymentsP2pCodiPaymentMx ~ _getResponseNotification ~ detail:",t),t.digitalStamp){const t=this._isRejected?"show-modal-rejected":"show-modal-postponed";!this._isRejected&&this._savePostponedMovement(),this._fireEvent(t)}}get _banxicoDm(){return this._banxicoProvider||(this._banxicoProvider=this.shadowRoot.querySelector('[data-tag-name = "bbva-dataprovider-banxico"]')),this._banxicoProvider}_chargeMessagesPost(t){this._banxicoDm.chargeMessagesPost(t)}_notificationPost(t){this._banxicoDm.notificationPost(t)}get _banxicoApiProvider(){return k`
      <bbva-dataprovider-banxico
      .host=${this.host}
      apiVersion="0"
      .requiredToken=${this.requiredToken}
      ?native=${this.native}
      .headers=${this.headers}
      @post-charge-messages-success=${this._getResponseChargeMessage}
      @post-charge-messages-error=${this._getResponseChargeMessage}
      @post-notification-success=${this._getResponseNotification}
      @post-notification-error=${this._getResponseNotification}>
      </bbva-dataprovider-banxico>
    `}_handleButtonAction({detail:t}){const e=t.item.label,i=this._findMovementById(this._listMovements,t.item.id),{payload:a}=i;this._handleActions(e,a)}_handleButtonActionOfDetail({detail:t}){const e=this._getOperativeActionsByStatus(this._transactionSelected.badge)[t].label,{payload:i}=this._transactionSelected.payload;this._handleActions(e,i)}_handleActions(t,e){if(this._isListMovementsVisible=!1,this._isMovementDetailVisible=!1,this._isMovementsFilterVisible=!1,"Pagar ahora"===t)this._fireEvent("show-modal-payment",e);else if("Rechazar pago"===t){this._isRejected=!0;const t=this._getBodyRequestToPostponeOrRejectMovement(e,this._isRejected);this._notificationPost(t)}else if("Posponer"===t){this._isRejected=!1,this._postponedMovementId=e.id;const t=this._getBodyRequestToPostponeOrRejectMovement(e,this._isRejected);this._notificationPost(t)}else if("Compartir Comprobante"===t){this._fireEvent("reset-receipt");const t=this._valueToShareReceipt(e);this._fireEvent("set-share-receipt",t),this._fireEvent("click-share-receipt")}}_valueToShareReceipt(t){const e=this._listBanks[t.v.ci]||"otro";let i;return i=40012==t.v.ci?{id:t.id,date:t.hp,title:this.t("codi-payment-qr-send-payment","Enviar pago"),amountLabel:"codi-payment-qr-request-amount",concept:t.cc,fees:[{text:"cells-successful-response-fees",amount:0,currency:"MXN"}],origin:{product:{id:"ACCOUNTS",name:"CLABE"},number:t.c.cb,avatar:"./images/icon_card.svg",description:"BBVA"},destination:{product:{id:"ACCOUNTS",name:t.v.nb},avatar:"./images/ico_movil.svg",number:t.v.cb,description:e},chargeAmount:{amount:t.mt,currency:"MXN",class:"amount-huge-decimals"},topInfo:[{key:"codi-payment-qr-type-operation",value:"codi-payment-qr-pay-with",class:" spacing"},{key:"codi-payment-qr-reference",value:t.cr,class:" spacing"},{key:"codi-payment-qr-concept",value:t.cc,class:" spacing"},{key:"codi-payment-qr-operation-folio",value:t.id,class:" spacing"}],templateSelected:"qrPayments"}:{id:t.id,date:t.hp,title:this.t("codi-payment-qr-send-payment","Enviar pago"),amountLabel:"codi-payment-qr-request-amount",concept:t.cc,fees:[{text:"cells-successful-response-fees",amount:0,currency:"MXN"}],origin:{product:{id:"ACCOUNTS",name:"CLABE"},number:t.c.cb,avatar:"./images/icon_card.svg",description:"BBVA"},destination:{product:{id:"ACCOUNTS",name:t.v.nb},avatar:"./images/ico_movil.svg",number:t.v.cb,description:e},chargeAmount:{amount:t.mt,currency:"MXN",class:"amount-huge-decimals"},topInfo:[{key:"codi-payment-qr-type-operation",value:"codi-payment-qr-pay-with",class:" spacing"},{key:"codi-payment-qr-reference",value:t.id,class:" spacing"},{key:"codi-payment-qr-concept",value:t.cc,class:" spacing"},{key:"codi-payment-qr-operation-folio",value:t.id,class:" spacing"},{key:"codi-payment-qr-tracking-key",value:t.cr?t.cr:"",class:" spacing"}],templateSelected:"qrPayments"},i}shareReceipt(t){this._fireEvent("codi-qr-share-receipt-history",{value:t.receipt,mimetype:"image/jpeg"})}_savePostponedMovement(){this._listMovements=this._listMovements.map((t=>(t.operationId===this._postponedMovementId&&(t.status="Pospuesto"),t))),this._postponedMovement(this._postponedMovementId)}setDataCodiHistoricalNotification(t){this._listMovements=this.parseHistoricalNotification(t)}_openSideMenu(){this._fireEvent("open-side-menu")}_exitHistoryMovements(){this._fireEvent("back-step-out-flow")}updated(t){if(super.updated(t),t.has("_transactionSelected")){const t=this._transactionSelected,e=t.badge;"Pagado"!==e&&"Cobrado"!==e&&"Tu contacto Rechazo"!==e||this._getMovementDetail(t)}}_getMovementDetail(t){const e=this._getBodyRequestToGetMovementDetail(t);this._chargeMessagesPost(e)}render(){return k`
      <slot></slot>

      <!-- Data provider -->
      ${this._banxicoApiProvider}

      <!-- List Movements Container -->
      <bbva-transition-container  id="list-movements" ?visible=${this._isListMovementsVisible}>
          <bbva-list-movements
          slot="slot-content"
          .listMovements="${this._listMovements}"
          @header-category-link-click="${()=>{this._isMovementsFilterVisible=!0}}"
          @view-notification="${this.viewMovementDetail}"
          @list-swipe-action-click="${this._handleButtonAction}"
          @header-main-icon-left-primary-click="${this._exitHistoryMovements}"
          @header-main-icon-right-primary-click="${this._openSideMenu}"
          ></bbva-list-movements>
      </bbva-transition-container>

      <!-- Movement Detail Container -->
      <bbva-transition-container  id="movement-detail" ?visible=${this._isMovementDetailVisible}>
          <bbva-movement-detail
          slot="slot-content"
          @header-main-icon-right-primary-click="${this.closeMovementDetail}"
          ._transactionSelected="${this._transactionSelected}"
          @button-row-item-click="${this._handleButtonActionOfDetail}"
          ></bbva-movement-detail>
      </bbva-transition-container>

      <!-- Movements Filter Container -->
      <bbva-transition-container  id="movements-filter" ?visible=${this._isMovementsFilterVisible}>
          <bbva-movements-filter
          slot="slot-content"
          .listMovements="${this._listMovements}"
          @header-main-icon-right-primary-click="${()=>{this._isMovementsFilterVisible=!1}}"
          @view-notification="${this.viewMovementDetailFromFilter}"
          @list-swipe-action-click="${this._handleButtonAction}"
          ></bbva-movements-filter>
      </bbva-transition-container>
    `}}customElements.define(bi.is,bi);
