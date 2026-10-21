import{z as e,a8 as t,ac as a,a9 as i,a as n,ap as s,an as r,L as o,ag as c,F as d,b$ as l,ak as m,bx as h,b1 as p,h as v,i as u,c0 as g,f as b,g as f,aZ as y,J as _,a7 as x,aI as $,aX as T,b2 as S,aV as M,aD as A,cH as k,aL as C,bF as E,en as P,eo as I,bW as D,eh as L,aj as w,ep as R,ee as O,eq as N,er as F,aN as q,b5 as j,A as H,D as z,a$ as B,au as V,a_ as G,es as U,cI as X,cT as K,aw as Y,b4 as W,_ as J,di as Q,cS as Z,cK as ee,cM as te,bU as ae,b0 as ie,dt as ne,ah as se,b6 as re,bH as oe,et as ce,bI as de,cD as le}from"./952f98a9.js";import{L as me,M as he}from"./216055dc.js";import{b as pe,B as ve}from"./85e2fa69.js";import"./523f7d21.js";import{bW as ue,bq as ge,by as be,bp as fe,bo as ye,y as _e,x as xe,bM as $e,bO as Te,bX as Se,bY as Me,bZ as Ae,f as ke}from"./7f3d7ca9.js";import"./c0a2f832.js";import"./cae0f1de.js";class Ce extends ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`flexible-financings/v${this.version}/microloans/{microloan-id}`)}toString(){return super.toString("BGADPFlexibleFinancingsMicroloansMicroloanGetV0")}}class Ee extends ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`flexible-financings/v${this.version}/microloans/{microloan-id}/scheduled-installments`)}toString(){return super.toString("BGADPFlexibleFinancingsMicroloansMicroloanScheduledInstallmentsGetV0")}}class Pe extends ge{static get is(){return"bbva-global-microloan-api-dm"}static get properties(){return{microloan:{type:Object,attribute:!1}}}constructor(){super(),this.microloan={}}resetMicroloan(){this.microloan={}}getMicroloan(e,t={}){if(Object.keys(this.microloan).length)return;t=Object.assign({"microloan-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"microloan-api-dm-fetch",errorFireEventHandler:"microloan-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}Microloan`,this._getBgadp(i))}_getBgadp(e){return{getMicroloanV0:()=>new Ce(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class Ie extends ge{static get is(){return"bbva-global-microloan-scheduled-installments-api-dm"}static get properties(){return{microloanScheduledInstallments:{type:Object,attribute:!1}}}constructor(){super(),this.microloanScheduledInstallments={}}resetMicroloanScheduledInstallments(){this.microloanScheduledInstallments={}}getMicroloanScheduledInstallments(e,t={}){if(Object.keys(this.microloanScheduledInstallments).length)return;t=Object.assign({"microloan-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"microloan-scheduled-installments-api-dm-fetch",errorFireEventHandler:"microloan-scheduled-installments-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}MicroloanScheduledInstallments`,this._getBgadp(i))}_getBgadp(e){return{getMicroloanScheduledInstallmentsV0:()=>new Ee(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}var De=e`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${t(i.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${t(i.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${t(i.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${t(i.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${t(i.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${t(i.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${t(i.primarySubduedLight)}));
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
  cursor: pointer;
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
.header-main .header-icons.right-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.right-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons.left-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.left-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: 0.125rem;
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${t(a.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  min-width: 0;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper.image #image {
  max-height: -webkit-fill-available;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 0.3125rem;
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: 0.3125rem;
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

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
`;class Le extends(n(s(r(o)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":c,"bbva-icon":d,"bbva-badge-notification":l}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,a=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,i=Math.max(t,a);return i in e?e[i]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[De,m("bbva-header-main-shared-styles"),h("button:focus"),p.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return v`<bbva-icon icon="${u(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return v`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,a,i){const n=Le.toCamelCase(e),s=`icon${n}`,r=`accessibilityTextIcon${n}`;return v`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${u(this.t(this[r]))}"
      aria-expanded=${u(i)}
      ?hidden="${!this[s]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(s):this._icon(s)}
      ${this.showTextIcon?this._textIcon(a):""}
    </button>`}_textIcon(e){return v` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${u(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return v`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(e)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:a,image:i,_hasMicroillustration:n}=this;return v`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(n||i)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(a)}
          tabindex="-1"
        >
          ${a&&" "!==a&&this._tplHeading(a)||""}
          <img src="${u(i)}" alt="" ?hidden="${!i}" id="image" aria-hidden="true" />

          <span
            class="${n}"
            ?hidden="${!n}"
            aria-hidden="true"
          >
            ${this.microillustration}
          </span>
        </h1>

        <div class="header-icons ${e} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}f("colors.primaryCoreLightened"),f("colors.cool80"),f("colors.cool70"),f("colors.primaryCoreLightened"),f("colors.cool100"),f("colors.tertiaryType6Darkened"),f("colors.tertiaryType4Darkened"),f("colors.secondary300");class we{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),i=a.length>>>0;if(0===i)return!1;let n=0|t,s=Math.max(n>=0?n:i-Math.abs(n),0);for(;s<i;){if((r=a[s])===(o=e)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;s++}var r,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var a=[],i=0,n="",s=0,r=arguments.length;s!==r;++s){var o=+arguments[s];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=a.push(o):(o-=65536,i=a.push(55296+(o>>10),o%1024+56320)),i>=16383&&(n+=e.apply(null,a),a.length=0)}return n+e.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",a=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${a&&a.message}`)}}class Re extends we{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const Oe=0,Ne=1,Fe="jwt",qe="tsec",je="none";class He extends we{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Oe,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Re,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=qe:this.requiredToken=je,this.requiresJWT=!1):this.requiredToken===qe?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Fe?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===je?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(qe)}_setJwtHandler(){this._setTokenHandler(Fe)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((a,i)=>{t=Object.assign(t,{resolve:a,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let a=this._getRequestHeaders();Object.keys(a).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,a[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=y),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let a=e.replace(/[\{\}]+/g,""),i=t[a];return i?delete t[a]:this._error(9,`Missing ${a} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(t);a.length&&(e=[e,a.map((e=>{let a=t[e];return Array.isArray(a)&&this.paramArrayMode===Ne?this._arrayToQueryParam(e,a):`${e}=${a}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(qe,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Fe,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var i=t.getItem(a);i&&"null"!==i&&(e[a]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const a=window.sessionStorage;t=Object.keys(a).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=a.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const a=`${e}Handler`,i=e===Fe?"JWT ":"",n=e===Fe?"Authorization":qe;if(void 0===this[a]||null===this[a])this._error(11,`${e} handler is undefined`);else{const s=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let r=this[a].getItem(s);r?t[n]=t[n]||i+r:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((a=>{t.push(`${a}=${e[a]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let a;const i=new Promise(((e,t)=>{a=(a,i)=>{a?t(a):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?a(i.error):a(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let a=0;for(;a<e.length;){let i=e[a],n=0,s=0;if(i<=127?(n=0,s=255&i):i<=223?(n=1,s=31&i):i<=239?(n=2,s=15&i):i<=244&&(n=3,s=7&i),e.length-a-n>0){let t=0;for(;t<n;)i=e[a+t+1],s=s<<6|63&i,t+=1}else s=65533,n=e.length-a;t+=String.fromCodePoint(s),a+=n+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},a=e.trim().split(/[\r\n]+/);for(const e in a)if(a.hasOwnProperty(e)&&""!==a[e]){let i=": ",n=a[e].split(i);t[n.shift().toLowerCase()]=n.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,a,i){let n=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(n=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(n=JSON.parse(t.headers)[i])}if(n){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;e.getItem(t)!==n&&(e.setItem(t,n),this._emitTokenUpdate(a,n))}}_emitTokenUpdate(e,t){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,a,i,n,s;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),a=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),n=e.getResponseHeader("AuthenticationChallenge"),s=e.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(e.headers);t=r.authenticationtype,a=r.authenticationdata||null,i=r.authenticationstate,n=r.authenticationchallenge,s=r.authenticationresponse}return{type:t,data:a,state:i,challenge:n,response:s}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",a=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",a="",i=""){let n;if("object"==typeof e&&e){const s=this._getSignatureData(e.signatureType,t,a);n=this._makeKeyValuePairFromObject(s,e.signatureValue),e.challenge&&(n+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(n,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(n=`password=${e}`,this._buildSignatureHeaders(n,"2",i)):(n=`${a}=${e}`,this._buildSignatureHeaders(n,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let a,i=e.split(",");if(i.length>1){a=i.map((e=>`${e}=${t[e]}`)).join(",")}else a=`${e}=${t}`;return a}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),n=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:s,data:r,state:o,challenge:c,response:d}=this._extractSignatureResponseHeaders(e),l=this._getRequestMetadata(e);if(n)this._notifySignatureInvalid(l),a=!0;else if(s)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,l,s,r,o,c,d),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(l,s,r,o,c,d),a=!0}return a}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),n=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),s=this._getRequestMetadata(e);n&&(this._notifyWaitingForProcessResponse(s),a=!0)}return a}_notifySignatureRequiredFirstStep(e,t,a,i){this._defineSignatureType(t,a),this._defineSignatureValue(t,a,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:a,metadata:e}}))}_notifySignatureRequired(e,t,a,i,n,s){this._defineSignatureValue(t,a,i);const r={type:t,data:a,challenge:n,metadata:e};s&&(r.response=s),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:a}=e;return{path:this._path,method:this.method,url:t,status:a}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",a=""){const i=t.split(";").findIndex((t=>t===e));return a?a.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,a,i,n,s){i?this._notifySignatureRequired(e,t,a,i,n,s):this._notifySignatureRequiredFirstStep(e,t,a,i)}_notifySignatureTypeUsingErrorCode(e,t,a,i,n,s,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,a,i,n):this._notifySignatureRequired(t,a,i,n,s,r)}}class ze extends He{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class Be extends He{constructor(e=null){super(Object.assign(e||{},{method:"HEAD"}))}toString(e=""){return super.toString(e||"BGADPRequestHEAD")}}class Ve extends He{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class Ge extends ze{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersGetV0")}}class Ue extends ze{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersGetV1")}}class Xe extends Ve{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersPostV1")}}class Ke extends Be{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersHeadV1")}}class Ye extends(_(o)){_mappingBank(e){this._renameProperty(e,"bank.bankId","id"),this._renameProperty(e,"bank.branch.branchId","id"),e.bank&&e.bank.branch&&e.bank.branch.costCenter&&(e.bank.branch.costCenter={id:e.bank.branch.costCenter})}_mappingGender(e){this._renameProperty(e,"gender.name","description")}_mappingIdentityDocuments(e){for(let t=0;t<e.identityDocuments.length;t++)this._renameProperty(e.identityDocuments[t],"documentType.name","description"),this._renameProperty(e.identityDocuments[t],"status.name","description")}_mappingMaritalStatus(e){this._renameProperty(e,"maritalStatus.name","description")}_mappingNationalities(e){for(let t=0;t<e.nationalities.length;t++)this._renameProperty(e.nationalities[t],"name","description")}_mappingPersonalTitle(e){this._renameProperty(e,"personalTitle.name","description")}_mappingResidence(e){this._renameProperty(e,"residence","taxResidence"),this._renameProperty(e,"taxResidence.residenceType.name","description")}_mappingVerification(e){this._renameProperty(e,"enrollmentModality","verification"),this._renameProperty(e,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(e){for(let t=0;t<e.segments.length;t++)this._renameProperty(e.segments[t],"name","description")}_changeNameToDescription(e){e.map((e=>{this._renameProperty(e,"name","description")}))}}class We extends Ye{static get is(){return"bbva-global-customers-api-dm"}static get properties(){return{customers:{type:Array,attribute:!1}}}constructor(){super(),this.customers=[]}resetCustomers(){this.customers=[]}getCustomers(e={}){if(Object.keys(this.customers).length)return;this._generateGetService(this._getService("get",{},e),{customEvent:"customers-api-dm-fetch",errorFireEventHandler:"customers-api-dm-fetch-error"},this._responseMapping,e.fields)}postCustomers(e){this._generateGetService(this._getService("post",e),{customEvent:"customers-api-dm-create",errorFireEventHandler:"customers-api-dm-create-error"},this._responseMapping),this.resetCustomers()}headCustomers(){this._generateGetService(this._getService("head",{},{}),{customEvent:"customers-api-dm-head-fetch",errorFireEventHandler:"customers-api-dm-head-fetch-error"},this._responseMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}Customers`,this._getBgadp(i))}_getBgadp(e){return{getCustomersV0:()=>new Ge(e),getCustomersV1:()=>new Ue(e),postCustomersV1:()=>new Xe(e),headCustomersV1:()=>new Ke(e),default:()=>"BGADP called not exist"}}_responseMapping(e){const t=["membershipDate","arrivalReference"];if(e.length)for(let a=0;a<e.length;a++)this._renameProperty(e[a],"customerId","id"),this._mappingBank(e[a]),this._mappingGender(e[a]),this._mappingIdentityDocuments(e[a]),this._mappingMaritalStatus(e[a]),e[a].nationalities&&this._mappingNationalities(e[a]),this._mappingPersonalTitle(e[a]),this._mappingResidence(e[a]),this._removeFields(t,e[a]);return e}}class Je extends Ye{static get is(){return"bbva-global-customer-lopd-documents-base-api-dm"}resetCustomerLopdDocuments(){this.customerLopdDocuments={}}getCustomerLopdDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}CustomerLopdDocuments`,this._getBgadp(i))}_getBgadp(e){return{getCustomerLopdDocumentsV3:()=>new be(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}x(Je,"GET_EVENTS",{customEvent:"customer-lopd-documents-api-dm-fetch",errorFireEventHandler:"customer-lopd-documents-api-dm-fetch-error"}),customElements.define(Je.is,Je);var Qe=e`
:host {
  display: block;
  box-sizing: border-box;
  text-align: initial;
  --_card-transaction-servicing-finance-payment-dashboard-primary-text-color: var(--card-transaction-servicing-finance-payment-dashboard-dark-mode-primary-text-color, var(--card-transaction-servicing-finance-payment-dashboard-primary-text-color, var(--colorsSecondary600, ${t(i.secondary600)})));
  --_card-transaction-servicing-finance-payment-dashboard-bg-color-principal: var(--card-transaction-servicing-finance-payment-dashboard-dark-mode-bg-color-principal, var(--card-transaction-servicing-finance-payment-dashboard-bg-color-principal, var(--colorsSecondary100, ${t(i.secondary100)})));
  --_card-transaction-servicing-finance-payment-dashboard-bg-color-secondary: var(--card-transaction-servicing-finance-payment-dashboard-dark-mode-bg-color-secondary, var(--card-transaction-servicing-finance-payment-dashboard-bg-color-secondary, var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)})));
  --_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color: var(--card-transaction-servicing-finance-payment-dashboard-skeleton-dark-mode-color, var(--card-transaction-servicing-finance-payment-dashboard-skeleton-color, var(--colorsSecondary200, ${t(i.secondary200)})));
  --_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-bg: var(--card-transaction-servicing-finance-payment-dashboard-skeleton-bg-dark-mode-color, var(--card-transaction-servicing-finance-payment-dashboard-skeleton-bg, transparent));
  --_card-transaction-servicing-finance-payment-dashboard-skeleton-animated-layer-primary-bg: var(--card-transaction-servicing-finance-payment-dashboard-dark-mode-skeleton-animated-layer-primary-bg-color, var(--card-transaction-servicing-finance-payment-dashboard-skeleton-animated-layer-primary-bg, var(--ambientsLight, ${t($.light)})));
  --_card-transaction-servicing-finance-payment-dashboard-skeleton-animated-layer-secondary-bg: var(--card-transaction-servicing-finance-payment-dashboard-dark-mode-skeleton-animated-layer-secondary-bg-color, var(--card-transaction-servicing-finance-payment-dashboard-skeleton-animated-layer-secondary-bg, var(--colorsSecondary100, ${t(i.secondary100)})));
  --_card-transaction-servicing-finance-payment-dashboard-default--text-color: var(--card-transaction-servicing-finance-payment-dashboard--_ambient--default--text-color, var(--card-transaction-servicing-finance-payment-dashboard--primary-alt-ambient--default--text-color, var(--colorsPrimaryCore, ${t(i.primaryCore)})));
  --_card-transaction-servicing-finance-payment-dashboard-success--text-color: var(--card-transaction-servicing-finance-payment-dashboard--_ambient--success--text-color, var(--card-transaction-servicing-finance-payment-dashboard--primary-alt-ambient--success--text-color, var(--colorsTertiaryType6Dark, ${t(i.tertiaryType6Dark)})));
  --_card-transaction-servicing-finance-payment-dashboard-data-visualization-bar-dark-mode-color: var(--card-transaction-servicing-finance-payment-dashboard-data-visualization-bar-dark-mode-color, var(--card-transaction-servicing-finance-payment-dashboard-data-visualization-bar-color, var(--colorsPrimaryVariant, ${t(i.primaryVariant)})));
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
@supports (padding-bottom: env(safe-area-inset-bottom)) {
  :host {
    --safe-area-inset-bottom: env(safe-area-inset-bottom);
    padding-bottom: var(--safe-area-inset-bottom, 0);
  }
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
  --bbva-header-main-z-index: 2;
  --bbva-text-color: initial;
}

[data-tag-name=bbva-data-visualization-bar] {
  --bbva-data-visualization-bar-color: var(--_card-transaction-servicing-finance-payment-dashboard-data-visualization-bar-dark-mode-color);
}

[data-tag-name=bbva-amount] {
  --bbva-amount-color: var(--_card-transaction-servicing-finance-payment-dashboard-primary-text-color, var(--colorsSecondary600, ${t(i.secondary600)}));
}

[data-tag-name=bbva-text] {
  --bbva-text-color: var(--_card-transaction-servicing-finance-payment-dashboard-primary-text-color, var(--colorsSecondary600, ${t(i.secondary600)}));
}
[data-tag-name=bbva-text].default-text-color {
  --bbva-text-color: var(--_card-transaction-servicing-finance-payment-dashboard-default--text-color);
}
[data-tag-name=bbva-text].success-text-color {
  --bbva-text-color: var(--_card-transaction-servicing-finance-payment-dashboard-success--text-color);
}
[data-tag-name=bbva-text].detail-text-color {
  --bbva-text-color: var(--card-transaction-servicing-finance-payment-dashboard--_ambient--success--text-color, var(--card-transaction-servicing-finance-payment-dashboard--primary-alt-ambient--success--text-color, var(--colorsSecondary500, ${t(i.secondary500)})));
}
[data-tag-name=bbva-text].end-date {
  --lineHeightTypeSmall: 24px;
  padding-bottom: var(--card-transaction-servicing-finance-payment-dashboard-text-end-date-padding-bottom, 0.625rem);
}

[data-tag-name=bbva-button-row] {
  --_button-row-skeleton-animated-layer-bg: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-animated-layer-primary-bg, var(--ambientsLight, ${t($.light)}));
  --_button-row-skeleton-quote-color: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color, var(--colorsSecondary200, ${t(i.secondary200)}));
  background-color: var(--card-transaction-servicing-finance-payment-dashboard-dark-mode-bg-color-secondary, var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)}));
  --bbva-button-action-color: var(--card-transaction-servicing-finance-payment-dashboard-button-action-color, var(--colorsPrimaryMedium, ${t(i.primaryMedium)}));
}

[data-tag-name=bbva-link] {
  --bbva-link-color: var(--card-transaction-servicing-finance-payment-dashboard-link-color, var(--colorsPrimaryMedium, ${t(i.primaryMedium)}));
}

[data-tag-name=bbva-notification-message] {
  --bbva-text-color: var(--_card-transaction-servicing-finance-payment-dashboard-primary-text-color, var(--colorsSecondary600, ${t(i.secondary600)}));
}

.loader {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 3rem;
  margin: var(--card-transaction-servicing-finance-payment-dashboard-img-margin, 2rem 0 1rem 0);
  background-image: linear-gradient(-60deg, transparent 50%, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-bg);
  background-size: calc((169px * 2) + (16px/ 2)) 16px, calc((103px * 2) + (16px/ 2)) 16px, calc((72px * 2) + (16px/ 2)) 16px, calc((65px * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 100% 0, 0 30px, 100% 30px;
}
.loader .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 3rem;
  background: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-animated-layer-primary-bg);
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
.wrapper {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-wrapper-padding, 4rem 1rem 1rem);
}
.wrapper.bg-color-principal {
  background-color: var(--_card-transaction-servicing-finance-payment-dashboard-bg-color-principal);
  box-shadow: 0 0.0625rem 0.1875rem 0 rgba(18, 18, 18, 0.2);
}
.wrapper.bg-color-secondary {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-bg-color-secondary-padding, 0 1rem 1rem);
  background-color: var(--_card-transaction-servicing-finance-payment-dashboard-bg-color-secondary);
}

[data-tag-name=bbva-header-category] {
  --bbva-text-color: var(--card-transaction-servicing-finance-payment-dashboard-header-category-color, var(--colorsSecondary600, ${t(i.secondary600)}));
  padding: var(--card-transaction-servicing-finance-payment-dashboard-header-padding, unset);
}

[data-tag-name=bbva-tab-default] {
  background-color: var(--card-transaction-servicing-finance-payment-dashboard-dark-mode-bg-color-secondary, var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)}));
  --bbva-tab-default-active-background-color: var(--card-transaction-servicing-finance-payment-dashboard-tab-default-active-background-color, var(--colorsSecondary100, ${t(i.secondary100)}));
  --bbva-tab-default-selected-color: var(--card-transaction-servicing-finance-payment-dashboard-tab-default-selected-color, var(--colorsPrimaryCore, ${t(i.primaryCore)}));
  --bbva-tab-default-text-color: var(--card-transaction-servicing-finance-payment-dashboard-tab-default-text-color, var(--colorsSecondary500, ${t(i.secondary500)}));
  --bbva-tab-default-shadow-selected: var(--card-transaction-servicing-finance-payment-dashboard-tab-default-shadow-selected, var(--colorsPrimaryCore, ${t(i.primaryCore)}));
  --bbva-tab-default-shadow: var(--card-transaction-servicing-finance-payment-dashboard-tab-default-shadow, var(--colorsSecondary300, ${t(i.secondary300)}));
  margin: var(--card-transaction-servicing-finance-payment-dashboard-tab-default-margin, 0);
}

.deferrable-list-movements [data-tag-name=bbva-divider]:last-of-type {
  display: none;
}

.image {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-image-padding, 1rem 1rem auto);
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: var(--card-transaction-servicing-finance-payment-dashboard-img-margin, 0 auto 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: var(--card-transaction-servicing-finance-payment-dashboard-span-margin, 1.5rem auto 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.text-content {
  font-weight: 350;
}

.text-content-bold {
  font-weight: 500;
  color: var(--colorsSecondary600, ${t(i.secondary600)});
}

.financing-line-detail {
  background-color: var(--card-transaction-servicing-finance-payment-dashboard-dark-mode-line-detail-bg-color, var(--card-transaction-servicing-finance-payment-dashboard-line-detail-bg-color, var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)})));
  display: flex;
  flex-direction: column;
}
.financing-line-detail [data-tag-name=bbva-amount] {
  --skeleton-quote-color: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color, var(--colorsSecondary100, ${t(i.secondary100)}));
  --_bbva-amount-skeleton-animated-layer-bg: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-animated-layer-primary-bg, var(--ambientsLight, ${t($.light)}));
}
.financing-line-detail [data-tag-name=bbva-text] {
  margin: var(--card-transaction-servicing-finance-payment-dashboard-financing-line-detail-text-margin, 1rem 0);
}
.financing-line-detail .data-visualitation-size {
  width: 85%;
  margin: var(--card-transaction-servicing-finance-payment-dashboard-data-visualitation-size-margin, 0 auto);
}
.financing-line-detail .financing-line-detail-amount {
  display: flex;
  justify-content: space-between;
  padding: var(--card-transaction-servicing-finance-payment-dashboard-financing-line-detail-amount-padding, 1rem 1rem);
}
.financing-line-detail .financing-line-detail-amount [data-tag-name=bbva-text] {
  margin: var(--card-transaction-servicing-finance-payment-dashboard-financing-line-detail-amount-text-margin, 0);
}
.financing-line-detail .financing-line-detail-amount .amounts-detail {
  display: flex;
  flex-direction: column;
}
.financing-line-detail .financing-line-detail-amount .amounts-detail .details-structure {
  display: flex;
  align-items: center;
}
.financing-line-detail .financing-line-detail-amount .amounts-detail .details-structure [data-tag-name=bbva-text] {
  padding-left: var(--card-transaction-servicing-finance-payment-dashboard-text-padding-left, 0.75rem);
}

ul, li {
  list-style: none;
  margin: var(--card-transaction-servicing-finance-payment-dashboard-ul-li-margin, 0);
  padding: var(--card-transaction-servicing-finance-payment-dashboard-ul-li-padding, 0);
}

li {
  position: relative;
}

.demo-container {
  display: flex;
  flex-wrap: wrap;
}

.demo-container li {
  display: flex;
  flex-direction: column;
  width: 50%;
}

.romboide {
  width: 0.75rem;
  height: 0.75rem;
  background: var(--colorsPrimaryVariant, ${t(i.primaryVariant)});
  -webkit-transform: skew(20deg);
  -moz-transform: skew(20deg);
  -ms-transform: skew(20deg);
  -o-transform: skew(20deg);
  transform: skew(20deg);
  rotate: 110deg;
}
.romboide.color-gray {
  background-color: var(--colorsSecondary200, ${t(i.secondary200)});
}

.list {
  margin-top: var(--card-transaction-servicing-finance-payment-dashboard-list-margin-top, 1rem);
  display: flex;
  flex-direction: column;
}
.list [data-tag-name=bbva-amount] {
  --skeleton-quote-color: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color, var(--colorsSecondary200, ${t(i.secondary200)}));
  --_bbva-amount-skeleton-animated-layer-bg: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-animated-layer-secondary-bg, var(--colorsSecondary100, ${t(i.secondary100)}));
}
.list [data-tag-name=bbva-text] {
  --skeleton-quote-color: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color, var(--colorsSecondary200, ${t(i.secondary200)}));
  --_bbva-text-skeleton-animated-layer-bg: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-animated-layer-secondary-bg, var(--colorsSecondary100, ${t(i.secondary100)}));
}
.list [data-tag-name=bbva-notification-help] {
  --skeleton-quote-color: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color, var(--colorsSecondary200, ${t(i.secondary200)}));
}

.list-item {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.list-item-detail {
  display: flex;
  align-items: center;
}
.list-item-detail [data-tag-name=bbva-text] {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-list-item-detail-text-padding, 0.75rem 0);
}

.amount {
  font-weight: 500;
}

[data-tag-name=bbva-notification-help] {
  --bbva-icon-color: var(--card-transaction-servicing-finance-payment-dashboard-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${t(i.primaryCoreDark)}));
  --bbva-notification-help-text-color: var(--card-transaction-servicing-finance-payment-dashboard-primary-text-color, var(--colorsSecondary500, ${t(i.secondary500)}));
  padding-left: var(--card-transaction-servicing-finance-payment-dashboard-notification-help-padding-left, unset);
}

[data-tag-name=filter-movements] {
  width: 100%;
  box-sizing: border-box;
  height: 200%;
  margin: var(--card-transaction-servicing-finance-payment-dashboard-filter-movements-margin, auto);
  display: block;
}

.error {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-error-padding, 1rem 0);
}

.info {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-info-padding, 1rem 0 0.5rem);
}

.financial-statement {
  background-color: var(--card-transaction-servicing-finance-payment-dashboard-dark-mode-bg-color-secondary, var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)}));
  padding: var(--card-transaction-servicing-finance-payment-dashboard-financial-statement-padding, 0 1rem 0.5rem);
}
.financial-statement [data-tag-name=bbva-header-category] {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-financial-statement-header-padding, 0.5rem 0 0.5rem);
}

.financial-statement-details {
  display: flex;
  flex-direction: column;
  row-gap: 1rem;
}
.financial-statement-details [data-tag-name=bbva-text].detail-field-text {
  font-style: normal;
}
.financial-statement-details [data-tag-name=bbva-amount] {
  --skeleton-quote-color: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color, var(--colorsSecondary200, ${t(i.secondary200)}));
  --_bbva-amount-skeleton-animated-layer-bg: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-animated-layer-primary-bg, var(--ambientsLight, ${t($.light)}));
}
.financial-statement-details [data-tag-name=bbva-text] {
  --skeleton-quote-color: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color, var(--colorsSecondary200, ${t(i.secondary200)}));
  --_bbva-text-skeleton-animated-layer-bg: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-animated-layer-primary-bg, var(--ambientsLight, ${t($.light)}));
}

.movements-detail {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-movements-detail-padding, 1rem 1rem 0);
}

.detail-list [data-tag-name=bbva-text] {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-detail-list-padding, 0 1rem);
  margin: var(--card-transaction-servicing-finance-payment-dashboard-detail-list-margin, 1.25rem 0 1rem 0);
}

.movements [data-tag-name=bbva-divider]:last-of-type {
  display: none;
}
.movements [data-tag-name=bbva-text] {
  margin: var(--card-transaction-servicing-finance-payment-dashboard-movements-text-margin, 1.25rem 0 1rem 0);
}
.movements .one-movement {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-one-movement-padding, 1rem 0);
}
.movements .one-movement [data-tag-name=bbva-text] {
  margin: var(--card-transaction-servicing-finance-payment-dashboard-one-movement-text-margin, 0);
}
.movements .one-movement .detail {
  display: flex;
  justify-content: space-between;
}
.movements .one-movement .resumen-detail {
  display: flex;
  align-items: center;
  column-gap: 0.25rem;
}
.movements .one-movement .resumen-detail .varian {
  display: flex;
  align-items: center;
  column-gap: 0.5rem;
}
.movements .one-movement .resume-detail-pending {
  display: flex;
  column-gap: 0.25rem;
}

.list-movements {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-list-movements-padding, 1.25rem 0 2rem);
}
.list-movements .movements-detail {
  display: flex;
  justify-content: space-between;
  padding: var(--card-transaction-servicing-finance-payment-dashboard-list-movements-detail-padding, 0 1rem);
}

.empty-description {
  display: flex;
  flex-direction: column;
  row-gap: 1rem;
  text-align: center;
}

.view-all-section {
  display: flex;
  justify-content: center;
  align-items: center;
  margin: var(--card-transaction-servicing-finance-payment-dashboard-view-all-section-margin, 1.5rem 1rem 0.75rem 1rem);
}

.list-movements-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
`,Ze=e`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-clip-microillustration] {
  padding-bottom: var(--card-transaction-servicing-finance-payment-dashboard-clip-microillustration-padding-bottom, 0.75rem);
}

[data-tag-name=bbva-text] {
  padding-bottom: var(--card-transaction-servicing-finance-payment-dashboard-modal-info-text-padding-bottom, 0.75rem);
}

[data-tag-name=bbva-help-modal] {
  --bbva-text-color: var(--card-transaction-servicing-finance-payment-dashboard-header-category-color, var(--colorsSecondary600, ${t(i.secondary600)}));
  --bbva-icon-color: var(--card-transaction-servicing-finance-payment-dashboard-see-more-modal-icon-color, var(--colorsPrimaryCoreDark, ${t(i.primaryCoreDark)}));
}
`;class et extends(T(me(r(o)))){static get is(){return"info-modal"}static get scopedElements(){const e=[k,C,c];return et.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},modalConfig:{type:Object,attribute:"modal-config"},settingsAmount:{type:Number,attribute:"settings-amount"},cutOffDay:{type:String,attribute:"cut-off-day"}}}static get styles(){return[Ze,p.light,S.light,m("info-modal-shared-styles")]}constructor(){super(),this.visible=!1,this.modalConfig={},this.settingsAmount=0,this.cutOffDay=""}_panelContent(){var e,t,a,i,n,s,r,o,c,d;return this.modalConfig.panel?v`
          <div slot="slot-content">
            <section class="panel-container">
              <bbva-clip-microillustration
                microillustration="${null===(e=this.modalConfig)||void 0===e||null===(t=e.panel)||void 0===t?void 0:t.microillustration}"
                size="L"
              ></bbva-clip-microillustration>
              <bbva-text
                class="panel-title"
                size="L"
                font-weight="500"
                alignment="center"
                text="${this.t(null===(a=this.modalConfig)||void 0===a||null===(i=a.panel)||void 0===i?void 0:i.heading)}"
                tag="span"
              ></bbva-text>
              <bbva-text
                class="panel-description"
                size="S"
                alignment="center"
                text="${this.t(null===(n=this.modalConfig)||void 0===n||null===(s=n.panel)||void 0===s?void 0:s.text,{settingsAmount:this.settingsAmount})}"
                tag="span"
              ></bbva-text>
              ${null!==(r=this.modalConfig)&&void 0!==r&&null!==(o=r.panel)&&void 0!==o&&o.complementaryText?v`
                    <bbva-text
                      class=""
                      size="M"
                      alignment="center"
                      tag="span"
                      text="${this.t(null===(c=this.modalConfig)||void 0===c||null===(d=c.panel)||void 0===d?void 0:d.complementaryText)}"
                    ></bbva-text>
                  `:M}
            </section>
          </div>
        `:M}get _renderModal(){var e,t,a,i,n,s,r,o,c,d,l,m;return v`
      <bbva-help-modal
        .accessibilityTextIconRightPrimary=${this.t("card-transaction-servicing-finance-debit-multipurchase-accessibility-close-button")}
        .buttonText=${this.t(null===(e=this.modalConfig)||void 0===e?void 0:e.buttonText)}
        .headerType=${null===(t=this.modalConfig)||void 0===t?void 0:t.headerType}
        .headerText=${this.t(null===(a=this.modalConfig)||void 0===a?void 0:a.headerText)}
        .modalType=${null===(i=this.modalConfig)||void 0===i?void 0:i.modalType}
        .titleIcon="${null!==(n=this.modalConfig)&&void 0!==n&&n.panel?"":A()}"
        .titleText=${this.t(null===(s=this.modalConfig)||void 0===s?void 0:s.titleText)}
        .closeModalElements=${(null===(r=this.modalConfig)||void 0===r?void 0:r.closeModalElements)||["footer-button","header-right-primary"]}
        aria-label=${this.t(null===(o=this.modalConfig)||void 0===o?void 0:o.headerText)}
        fixed-footer
        full-height
        ?visible=${this.visible}
        hide-content-padding-top
      >
        ${null!==(c=this.modalConfig)&&void 0!==c&&c.panel?this._panelContent():v`
              <div slot="slot-content">
                <bbva-text
                  class=""
                  size="M"
                  alignment="center"
                  text="${this.t(null===(d=this.modalConfig)||void 0===d?void 0:d.descriptionText,{settingsAmount:this.settingsAmount})}"
                  tag="span"
                ></bbva-text>
                ${null!==(l=this.modalConfig)&&void 0!==l&&l.complementaryText?v`
                      <bbva-text
                        class=""
                        size="M"
                        alignment="center"
                        text="${this.t(null===(m=this.modalConfig)||void 0===m?void 0:m.complementaryText,{day:this.cutOffDay})}"
                      ></bbva-text>
                    `:M}
              </div>
            `}
      </bbva-help-modal>
    `}render(){return v`
      ${this._renderModal}
    `}}var tt=e`
:host {
  display: block;
  box-sizing: border-box;
  overflow: hidden;
  width: 100%;
}

.panel-container {
  display: flex;
  flex-direction: column;
  align-items: center;
}

[data-tag-name=bbva-clip-card] {
  margin-top: var(--card-transaction-servicing-finance-payment-dashboard-banner-card-image-margin-top, 1rem);
}

[data-tag-name=bbva-clip-microillustration] {
  margin-top: var(--card-transaction-servicing-finance-payment-dashboard-banner-microillustruation-margin-top, 1rem);
}

[data-tag-name=bbva-header-category] {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-modal-error-header-padding, 0);
}

[data-tag-name=bbva-text] {
  width: 100%;
}
[data-tag-name=bbva-text].panel-title {
  margin-top: var(--card-transaction-servicing-finance-payment-dashboard-banner-card-title-margin-top, 1.5rem);
  text-align: center;
}
[data-tag-name=bbva-text].panel-description {
  margin: var(--card-transaction-servicing-finance-payment-dashboard-banner-card-description-margin, 0.5rem 0 1.5rem 0);
  text-align: center;
}
`;class at extends(T(me(r(o)))){static get is(){return"error-modal"}static get scopedElements(){const e=[k,C,c];return at.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},modalConfig:{type:Object,attribute:"modal-config"}}}static get styles(){return[tt,p.light,S.light,m("error-modal-shared-styles")]}constructor(){super(),this.visible=!1,this.modalConfig={}}_panelContent(){return this.modalConfig.panel?v`
          <div slot="slot-content">
            <section class="panel-container">
              <bbva-clip-microillustration
                microillustration="${this.modalConfig.panel.microillustration}"
                size="L"
              ></bbva-clip-microillustration>
              <bbva-text
                class="panel-title"
                size="L"
                font-weight="500"
                text="${this.modalConfig.panel.heading}"
                tag="span"
              ></bbva-text>
              <bbva-text
                class="panel-description"
                size="S"
                text="${this.modalConfig.panel.text}"
                tag="span"
              ></bbva-text>
            </section>
          </div>
        `:M}get _renderModal(){var e,t,a,i,n,s,r,o,c,d,l,m,h,p,u,g,b;return v`
      <bbva-help-modal
        id="${(null===(e=this.modalConfig)||void 0===e?void 0:e.id)||"modal-error"}"
        ambient="light"
        icon-right-primary=${E()}
        .buttonText=${this.t(null===(t=this.modalConfig)||void 0===t?void 0:t.buttonText)}
        .headerType=${null===(a=this.modalConfig)||void 0===a?void 0:a.headerType}
        .headerText=${this.t(null===(i=this.modalConfig)||void 0===i?void 0:i.headerText)}
        .linkText=${this.t(null===(n=this.modalConfig)||void 0===n?void 0:n.linkText)}
        .modalType=${null===(s=this.modalConfig)||void 0===s?void 0:s.modalType}
        .titleText=${this.t(null===(r=this.modalConfig)||void 0===r?void 0:r.titleText)}
        .bodyText=${this.t(null===(o=this.modalConfig)||void 0===o?void 0:o.bodyText)}
        .titleIcon=${null===(c=this.modalConfig)||void 0===c?void 0:c.titleIcon}
        .closeModalElements=${(null===(d=this.modalConfig)||void 0===d?void 0:d.closeModalElements)||["footer-button","footer-link","header-right-primary"]}
        aria-label=${this.t(null===(l=this.modalConfig)||void 0===l?void 0:l.headerText)}
        ?fixed-footer=${null===(m=this.modalConfig)||void 0===m?void 0:m.fixedFooter}
        ?full-height=${null===(h=this.modalConfig)||void 0===h?void 0:h.fullHeight}
        ?visible=${this.visible}
        hide-content-padding-top
        @header-main-icon-right-primary-click=${null===(p=this.modalConfig)||void 0===p?void 0:p.headerPrimaryClick}
        @help-modal-footer-button-click=${null===(u=this.modalConfig)||void 0===u?void 0:u.footerButtonClick}
        @help-modal-veil-click=${null===(g=this.modalConfig)||void 0===g?void 0:g.veilClick}
        @help-modal-footer-link-click=${null===(b=this.modalConfig)||void 0===b?void 0:b.footerLinkClick}
      >
        ${this._panelContent()}
      </bbva-help-modal>
    `}render(){return v`
      ${this._renderModal}
    `}}var it=e`
[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
  --bbva-button-action-color: var(--card-transaction-servicing-finance-payment-dashboard-button-action-color, var(--colorsPrimaryMedium, ${t(i.primaryMedium)}));
  --bbva-text-color: var(--card-transaction-servicing-finance-payment-dashboard-header-category-color, var(--colorsSecondary600, ${t(i.secondary600)}));
  --bbva-icon-color: var(--card-transaction-servicing-finance-payment-dashboard-see-more-modal-icon-color, var(--colorsPrimaryCoreDark, ${t(i.primaryCoreDark)}));
}
`;const{moment:nt}=window,st={commons:[{icon:P(),label:"card-transaction-servicing-finance-payment-dashboard-defer-purchases",id:"post-contracting"},{icon:I(),label:"card-transaction-servicing-finance-payment-dashboard-line-advance-payment",id:"advance-payment"},{icon:D(),label:"card-transaction-servicing-finance-payment-dashboard-view-account-statement",id:"account-status"},{icon:L(),label:"card-transaction-servicing-finance-payment-dashboard-monthly-payment",id:"monthly-payment"},{icon:w(),label:"card-transaction-servicing-finance-payment-dashboard-cancel-line",id:"cancel-line"},{icon:R(),label:"card-transaction-servicing-finance-payment-dashboard-see-line-detail",id:"line-detail"}],overdue:[{icon:L(),label:"card-transaction-servicing-finance-payment-dashboard-pay-overdue-balance",id:"overdue-payment"},{icon:D(),label:"card-transaction-servicing-finance-payment-dashboard-view-account-statement",id:"account-status"},{icon:w(),label:"card-transaction-servicing-finance-payment-dashboard-cancel-line",id:"cancel-line"}]};function rt(e){const t=e.split(" "),a=2===t.length?t[1]:void 0,i=void 0!==a?`${t[0].toLowerCase()} ${a}`:t[0].toLowerCase();return i.charAt(0).toUpperCase()+i.slice(1)}function ot({amount:e,currency:t,language:a,decimalsHidden:i=!1}){const n=O({amount:e||0,currencyCode:t||"EUR",localCurrency:t||"EUR",language:a||"es",minusSymbol:"-",decimalDigits:2,decimalsHidden:i,currencySymbol:N(t,t)});return F(n)}function ct(e){return e.toLowerCase().replace(/(?:^\w|[A-Z]|\b\w|\s+)/g,((e,t)=>0==+e?"":0===t?e.toLowerCase():e.toUpperCase()))}function dt(e,t){return nt(e).format(t)}function lt(e,t,a=!0){e.dispatchEvent(new CustomEvent(`card-transaction-servicing-finance-payment-dashboard-${t}`,{detail:a,bubbles:!0,composed:!0}))}const mt=()=>({cutOffDate:{headerText:"card-transaction-servicing-finance-payment-dashboard-info-header-cut-off-date",headerType:"modal-three-level",buttonText:"card-transaction-servicing-finance-payment-dashboard-modal-acknowledged",modalType:"modal-three-level",titleText:"card-transaction-servicing-finance-payment-dashboard-info-title-cut-off-date",descriptionText:"card-transaction-servicing-finance-payment-dashboard-info-body-text-cut-off-date",complementaryText:"card-transaction-servicing-finance-payment-dashboard-info-complementary-text-cut-off-date",closeModalElements:["footer-button","header-right-primary"]},nextPaymentDate:{headerText:"card-transaction-servicing-finance-payment-dashboard-info-header-next-payment-date",headerType:"modal-three-level",buttonText:"card-transaction-servicing-finance-payment-dashboard-modal-acknowledged",modalType:"modal-three-level",titleText:"card-transaction-servicing-finance-payment-dashboard-info-title-next-payment-date",descriptionText:"card-transaction-servicing-finance-payment-dashboard-info-body-text-next-payment-date",complementaryText:"card-transaction-servicing-finance-payment-dashboard-info-complementary-text-next-payment-date",closeModalElements:["footer-button","header-right-primary"]},cantDefer:{headerText:"card-transaction-servicing-finance-payment-dashboard-title-free-line",headerType:"modal-three-level",buttonText:"card-transaction-servicing-finance-payment-dashboard-modal-acknowledged",modalType:"modal-three-level",titleText:"card-transaction-servicing-finance-payment-dashboard-title-free-line",descriptionText:"card-transaction-servicing-finance-payment-dashboard-body-text-free-line",complementaryText:"card-transaction-servicing-finance-payment-dashboard-complementary-text-free-line",closeModalElements:["footer-button","header-right-primary"]},freeLine:{headerText:"card-transaction-servicing-finance-payment-dashboard-deferred-purchases",headerType:"modal",buttonText:"card-transaction-servicing-finance-payment-dashboard-modal-acknowledged",modalType:"modal",panel:{microillustration:"caution",heading:"card-transaction-servicing-finance-payment-dashboard-title-free-line",text:"card-transaction-servicing-finance-payment-dashboard-body-text-free-line",complementaryText:"card-transaction-servicing-finance-payment-dashboard-complementary-text-free-line"},closeModalElements:["footer-button","header-right-primary"]}}),ht=({headerPrimaryClick:e,footerButtonClick:t,footerLinkClick:a,veilClick:i})=>({GETFINANCINGDETAILS_RETRY:{titleText:"card-transaction-servicing-finance-payment-dashboard-unavailable-operation-retry-title",bodyText:"card-transaction-servicing-finance-payment-dashboard-unavailable-operation-retry-body-text",buttonText:"card-transaction-servicing-finance-payment-dashboard-retry",linkText:"card-transaction-servicing-finance-payment-dashboard-exit",footerButtonClick:t,footerLinkClick:a,veilClick:i,fullHeight:!1,hideContentPaddingTop:!0,modalType:"warning",titleIcon:q(),closeModalElements:["footer-button","footer-link"]},GETMICROLOAN_RETRY:{id:"getMicroloan",headerText:"card-transaction-servicing-finance-payment-dashboard-deferred-purchases",headerType:"modal",modalType:"modal",buttonText:"card-transaction-servicing-finance-payment-dashboard-retry",linkText:"card-transaction-servicing-finance-payment-dashboard-close",headerPrimaryClick:e,footerButtonClick:t,footerLinkClick:a,fullHeight:!0,hideContentPaddingTop:!0,fixedFooter:!0,closeModalElements:["footer-button","footer-link","header-right-primary"],panel:{microillustration:"error",heading:"card-transaction-servicing-finance-payment-dashboard-information-not-available",text:"card-transaction-servicing-finance-payment-dashboard-information-not-loaded"}},GETMICROLOANS_RETRY:{id:"getMicroloans",variant:"error",titleText:"",descriptionText:"card-transaction-servicing-finance-payment-dashboard-deferred-movement-information-error-message",linkText:"card-transaction-servicing-finance-payment-dashboard-retry"},POSTTRANSACTIONS_RETRY:{id:"postTransactions",variant:"error",titleText:"",descriptionText:"card-transaction-servicing-finance-payment-dashboard-deferrable-movement-information-error-message",linkText:"card-transaction-servicing-finance-payment-dashboard-retry"},GETFINANCINGDETAILS_EXIT:{titleText:"card-transaction-servicing-finance-payment-dashboard-unavailable-operation-retry-title",bodyText:"card-transaction-servicing-finance-payment-dashboard-unavailable-operation-exit-body-text",buttonText:"card-transaction-servicing-finance-payment-dashboard-exit",footerButtonClick:t,veilClick:i,fullHeight:!1,hideContentPaddingTop:!0,modalType:"warning",titleIcon:q(),closeModalElements:["footer-button"]},GETMICROLOAN_EXIT:{id:"getMicroloan",headerText:"card-transaction-servicing-finance-payment-dashboard-deferred-purchases",headerType:"modal",modalType:"modal",buttonText:"card-transaction-servicing-finance-payment-dashboard-close",headerPrimaryClick:e,footerButtonClick:t,fullHeight:!0,hideContentPaddingTop:!0,fixedFooter:!0,closeModalElements:["footer-button","footer-link","header-right-primary"],panel:{microillustration:"error",heading:"card-transaction-servicing-finance-payment-dashboard-information-not-available",text:"card-transaction-servicing-finance-payment-dashboard-information-not-loaded"}},GETMICROLOANS_EXIT:{id:"getMicroloans",variant:"error",titleText:"",descriptionText:"card-transaction-servicing-finance-payment-dashboard-deferred-movement-information-error-message-retry-later",linkText:"card-transaction-servicing-finance-payment-dashboard-exit"},POSTTRANSACTIONS_EXIT:{id:"postTransactions",variant:"error",titleText:"",descriptionText:"card-transaction-servicing-finance-payment-dashboard-deferrable-movement-information-error-message-retry-later",linkText:"card-transaction-servicing-finance-payment-dashboard-exit"}});class pt extends(T(me(he(r(o))))){static get is(){return"see-more-modal"}static get scopedElements(){const e=[k,j,H,...pt.configurationScopedElements()];return pt.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},operatives:{type:Object}}}static get styles(){return[it,z.light,B.light,m("see-more-modal-shared-styles")]}constructor(){super(),this.visible=!1,this.operatives={}}dispatchOperative(e){lt(this,"operative-select",e.detail),lt(this,"see-more-modal-close")}get showOperativesButtons(){const e=[];return this.operatives.map((({icon:t,label:a,id:i})=>e.push({icon:t,label:a,id:i}))),v`
      <bbva-button-row
        .options=${e}
        @button-row-item-click="${this.dispatchOperative}"
      ></bbva-button-row>
    `}render(){return v`
      ${super.render()}
      <bbva-help-modal
        full-height
        hide-content-padding-top
        header-text=" "
        ?visible="${this.visible}"
      >
        <div class="content" slot="slot-content">
          <bbva-header-category
            text="${this.t("card-transaction-servicing-finance-payment-dashboard-see-more-operative-header")}"
          ></bbva-header-category>
          ${this.showOperativesButtons}
        </div>
      </bbva-help-modal>
    `}}var vt=e`
:host {
  --_card-transaction-servicing-finance-payment-dashboard-bg-color-principal: var(--card-transaction-servicing-finance-payment-dashboard-dark-mode-bg-color-principal, var(--card-transaction-servicing-finance-payment-dashboard-bg-color-principal, var(--colorsSecondary100, ${t(i.secondary100)})));
  --_card-transaction-servicing-finance-payment-dashboard-bg-color-secondary: var(--card-transaction-servicing-finance-payment-dashboard-dark-mode-bg-color-secondary, var(--card-transaction-servicing-finance-payment-dashboard-bg-color-secondary, var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)})));
}

.wrapper {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-detail-wrapper-padding, 1rem 1rem);
  background-color: var(--_card-transaction-servicing-finance-payment-dashboard-bg-color-principal);
}
.wrapper.bg-secondary {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-detail-bg-secondary-padding, 0 1rem 1rem);
  background-color: var(--_card-transaction-servicing-finance-payment-dashboard-bg-color-secondary);
}

[data-tag-name=bbva-text].default-text-color {
  --bbva-text-color: var(--_card-transaction-servicing-finance-payment-dashboard-default--text-color);
}
[data-tag-name=bbva-text].success-text-color {
  --bbva-text-color: var(--_card-transaction-servicing-finance-payment-dashboard-success--text-color);
}

[data-tag-name=bbva-button-row] {
  padding-top: var(--card-transaction-servicing-finance-payment-dashboard-button-row-padding-top, 1rem);
  background-color: var(--_card-transaction-servicing-finance-payment-dashboard-bg-color-secondary, var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)}));
  --bbva-button-action-color: var(--card-transaction-servicing-finance-payment-dashboard-button-action-color, var(--colorsPrimaryMedium, ${t(i.primaryMedium)}));
}

[data-tag-name=bbva-data-visualization-bar] {
  --bbva-data-visualization-bar-color: var(--card-transaction-servicing-finance-payment-dashboard-data-visualization-bar-dark-mode-color, var(--card-transaction-servicing-finance-payment-dashboard-data-visualization-bar-color, var(--colorsPrimaryVariant, ${t(i.primaryVariant)})));
}

[data-tag-name=bbva-amount] {
  --bbva-amount-color: var(--_card-transaction-servicing-finance-payment-dashboard-primary-text-color, var(--colorsSecondary600, ${t(i.secondary600)}));
}

[data-tag-name=bbva-expandable-panel] {
  --bbva-expandable-panel-link-icon-color: var(--card-transaction-servicing-finance-payment-dashboard-expandable-panel-link-icon-color, var(--colorsPrimaryMedium, ${t(i.primaryMedium)}));
  --bbva-link-color: var(--card-transaction-servicing-finance-payment-dashboard-link-color, var(--colorsPrimaryMedium, ${t(i.primaryMedium)}));
}

.panel-process {
  display: flex;
  flex-direction: column;
  align-items: center;
  row-gap: 0.5rem;
}
.panel-process [data-tag-name=bbva-amount] {
  margin: var(--card-transaction-servicing-finance-payment-dashboard-detail-panel-process-amount-margin, 0.5rem 0);
  font-weight: 350;
}

.list-progress {
  display: flex;
  align-items: center;
  column-gap: 0.3125rem;
  margin: var(--card-transaction-servicing-finance-payment-dashboard-detail-list-progress-margin, 0.625rem 0);
}

.list-progress-visualization {
  margin: var(--card-transaction-servicing-finance-payment-dashboard-detail-list-progress-visualization-margin, 1rem auto 0);
}

.list-progress-details {
  display: flex;
  justify-content: space-between;
  margin: var(--card-transaction-servicing-finance-payment-dashboard-detail-list-progress-details-margin, 0.5rem 0);
}
.list-progress-details .list-progress-item {
  display: flex;
  align-items: center;
  column-gap: 0.25rem;
}

.list {
  margin-top: var(--card-transaction-servicing-finance-payment-dashboard-detail-list-margin-top, 1.75rem);
  display: flex;
  flex-direction: column;
  row-gap: 1rem;
}

.list-item {
  display: flex;
  justify-content: space-between;
}

.amount {
  font-weight: 500;
}

[data-tag-name=bbva-expandable-accordion] {
  padding-bottom: var(--card-transaction-servicing-finance-payment-dashboard-detail-expandable-accordion-padding-bottom, 0);
  --bbva-expandable-accordion-text-color: var(--card-transaction-servicing-finance-payment-dashboard-expandable-accordion-text-color, var(--colorsSecondary600, ${t(i.secondary600)}));
  --bbva-expandable-accordion-right-icon-color: var(--card-transaction-servicing-finance-payment-dashboard-expandable-accordion-right-icon-color, var(--colorsPrimaryCore, ${t(i.primaryCore)}));
  --bbva-expandable-accordion-header-bg-color-pressed: var(--card-transaction-servicing-finance-payment-dashboard-expandable-accordion-header-bg-color-pressed, var(--colorsSecondary100, ${t(i.secondary100)}));
}

.payments {
  display: flex;
  flex-direction: column;
  padding: var(--card-transaction-servicing-finance-payment-dashboard-detail-payments-padding, 1rem);
}
.payments .payments-item {
  display: flex;
  justify-content: space-between;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: --bbva-transition-container-padding;
}

.list-item-detail-left {
  margin-right: var(--card-transaction-servicing-finance-payment-dashboard-detail-list-item-detail-margin-right, 0.75rem);
}
.list-item-detail-right {
  margin-left: var(--card-transaction-servicing-finance-payment-dashboard-detail-list-item-detail-margin-left, 0.75rem);
}
`;class ut extends(T(me(he(r(o))))){static get is(){return"purchase-detail"}static get scopedElements(){const e=[c,Y,ve,ye,W,j,Le,J,H,Q];return ut.scopedElementsFromClasses(e)}static get properties(){return{language:{type:String},headerLabel:{type:String,attribute:"header-label"},accountName:{type:String,attribute:"account-name"},accountNumber:{type:String,attribute:"account-number"},responseMicroloans:{type:Array,attribute:"response-microloans"},operationNumber:{type:String,attribute:"operation-number"},responsePayments:{type:Array,attribute:"response-payments"},constantsIds:{type:Object,attribute:"constants-ids"},_statusType:{type:Object,state:!0},_isMultipurchase:{type:Boolean,state:!0},_viewMore:{type:Boolean,state:!0},_templateReceipt:{type:Object,state:!0}}}static get styles(){return[vt,V.light,pe.light,G.light,fe.light,B.light,p.light,U.light,z.light,m("purchase-detail-shared-styles")]}constructor(){super(),this.config={header:{text:this.headerLabel,iconLeftPrimary:X(),accessibilityTextIconLeftPrimary:this.t("card-transaction-servicing-finance-payment-dashboard-accessibility-icon-left-primary")},fixedHeader:!0},this.headerLabel="",this.language="",this.accountName="",this.accountNumber="",this.responseMicroloans=[],this.operationNumber="",this.responsePayments=[],this.constantsIds={},this._statusType={payments:{PAID:"card-transaction-servicing-finance-payment-dashboard-detail-paid",PENDING:"card-transaction-servicing-finance-payment-dashboard-detail-pending"},movements:{SETTLED:"card-transaction-servicing-finance-payment-dashboard-detail-completed",ACTIVE:"card-transaction-servicing-finance-payment-dashboard-in-progress"}},this._isMultipurchase=!1,this._viewMore=!1,this._templateReceipt={}}updated(e){super.updated(e),e.has("headerLabel")&&(this.config.header.text=this.headerLabel),e.has("responseMicroloans")&&(this._isMultipurchase=""===this.responseMicroloans.concept,this._dispatchPurchaseInformation()),e.has("operationNumber")&&""!==this.operationNumber&&this._getShareTemplateReceipt()}_dispatchPurchaseInformation(){if(void 0!==this.responseMicroloans.concept){var e,t,a;lt(this,"purchase-persist-data",{customFields:`diferimiento:${this._isMultipurchase?"multicompra":null===(e=this.responseMicroloans)||void 0===e||null===(t=e.concept)||void 0===t||null===(a=t.trimEnd())||void 0===a?void 0:a.toLowerCase()},estado diferimiento:${"SETTLED"===this.responseMicroloans.status?"completado":"en curso"}`,target:"purchase-detail"})}}_expandViewMore({detail:e}){this._viewMore=e}_getAmountsFormatted(){var e,t,a,i,n,s,r,o,c,d,l,m,h,p,v,u,g,b,f,y,_,x,$,T,S,M;const A=ot({amount:null===(e=this.responseMicroloans.specific[null===(t=this.constantsIds)||void 0===t||null===(a=t.specific)||void 0===a?void 0:a.microloanAmount][0])||void 0===e?void 0:e.amount,currency:null===(i=this.responseMicroloans.specific[null===(n=this.constantsIds)||void 0===n||null===(s=n.specific)||void 0===s?void 0:s.microloanAmount][0])||void 0===i?void 0:i.currency,language:this.language}),k=ot({amount:null===(r=this.responseMicroloans.fees[null===(c=this.constantsIds)||void 0===c||null===(d=c.fees)||void 0===d?void 0:d.microloanWithdrawalFee])||void 0===r||null===(o=r.AMOUNT)||void 0===o?void 0:o.amount,currency:null===(l=this.responseMicroloans.fees[null===(h=this.constantsIds)||void 0===h||null===(p=h.fees)||void 0===p?void 0:p.microloanWithdrawalFee])||void 0===l||null===(m=l.AMOUNT)||void 0===m?void 0:m.currency,language:this.language}),C=ot({amount:null===(v=this.responseMicroloans.fees[null===(g=this.constantsIds)||void 0===g||null===(b=g.fees)||void 0===b?void 0:b.installmentMonthlyAmountFee])||void 0===v||null===(u=v.AMOUNT)||void 0===u?void 0:u.amount,currency:null===(f=this.responseMicroloans.fees[null===(_=this.constantsIds)||void 0===_||null===(x=_.fees)||void 0===x?void 0:x.installmentMonthlyAmountFee])||void 0===f||null===(y=f.AMOUNT)||void 0===y?void 0:y.currency,language:this.language});return{specificAmount:ot({amount:null===($=this.responseMicroloans)||void 0===$||null===(T=$.microloanAmountWithoutFees)||void 0===T?void 0:T.amount,currency:null===(S=this.responseMicroloans)||void 0===S||null===(M=S.microloanAmountWithoutFees)||void 0===M?void 0:M.currency,language:this.language}),comissionAmount:k,monthlyPaymentAmount:C,totalAmount:A}}_getShareTemplateReceipt(){var e,t,a,i,n,s,r,o,c,d;const{specificAmount:l,comissionAmount:m,monthlyPaymentAmount:h,totalAmount:p}=this._getAmountsFormatted(),v=null===(e=this.responseMicroloans.fees[null===(a=this.constantsIds)||void 0===a||null===(i=a.fees)||void 0===i?void 0:i.microloanWithdrawalFee])||void 0===e||null===(t=e.PERCENTAGE)||void 0===t?void 0:t.percentage;this._templateReceipt={concept:""===this.responseMicroloans.concept?this.t("card-transaction-servicing-finance-payment-dashboard-concept-purchase"):this.responseMicroloans.concept,comissionLabel:this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-purchase-fee",{months:null===(n=this.responseMicroloans)||void 0===n||null===(s=n.terms)||void 0===s?void 0:s.number}),comissionAmount:this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-percentage",{percentage:100*v}),originAccount:`${this.accountName} •${this.accountNumber.slice(-4)}`,operationFolio:this.t("card-transaction-servicing-finance-payment-dashboard-detail-operation-number",{number:this.operationNumber}),operationDate:null===(r=this.responseMicroloans)||void 0===r?void 0:r.date,hour:this.t("card-transaction-servicing-finance-payment-dashboard-detail-diferrement-time",{time:null===(o=this.responseMicroloans)||void 0===o?void 0:o.time}),localAmount:{amount:l},additionalInfo:{deferCommission:m,totalAmount:p,term:this.t("card-transaction-servicing-finance-payment-dashboard-detail-months",{term:null===(c=this.responseMicroloans)||void 0===c||null===(d=c.terms)||void 0===d?void 0:d.number}),monthlyPaymentWithoutInterest:h},templateSelected:"deferredPurchaseDetail"},lt(this,"purchase-detail-template",this._templateReceipt)}get _historyPayment(){var e,t;let a=[];return(null===(e=this.responsePayments)||void 0===e?void 0:e.length)>0&&(a=this.responsePayments.map((e=>({labelLeft:e.date,labelRight:e.paymentAmount.amount,currency:e.paymentAmount.currency,status:this._statusType.payments[e.status]})))),v`
      <bbva-expandable-accordion
        id="payments-history"
        title-medium="true"
        row-title="${this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-purchase-history")}"
        @expandable-accordion-open-change="${this._manageAccordionOpenChange}"
      >
        <div>
          ${0===(null===(t=a)||void 0===t?void 0:t.length)?M:this._itemPay(a)}
        </div>
      </bbva-expandable-accordion>
    `}_itemPay(e){return e.map((e=>v`
        <div class="payments-wrapper">
          <bbva-divider></bbva-divider>
          <div class="payments">
            <div class="payments-item">
              <bbva-text
                size="M"
                font-weight="500"
                text="${e.labelLeft}"
                tag="span"
              ></bbva-text>
              <bbva-amount
                variant="l"
                amount="${e.labelRight}"
                currency-code="${e.currency}"
                local-currency="${e.currency}"
                language="${this.language}"
              ></bbva-amount>
            </div>
            <bbva-text
              size="S"
              font-weight="350"
              font-style="italic"
              class=${this.t(e.status)===this.t("card-transaction-servicing-finance-payment-dashboard-detail-paid")?"success-text-color":"default-text-color"}
              text="${this.t(e.status)}"
              tag="span"
            ></bbva-text>
          </div>
        </div>
      `))}static _listDetailCustomComponent({textLabelLeft:e,labelRight:t,currency:a,isTextOrAmount:i=!0,fontStyleRight:n="normal"}){return v`
      <div class="list-item">
          <div class="list-item-detail-left">
            <bbva-text
            tag="span"
            text="${e}"
            size="S" ></bbva-text>
          </div>
          <div class="list-item-detail-right">
            ${ut._listDetailFields({isTextOrAmount:i,labelRight:t,currency:a,fontStyleRight:n})}
          </div>
        </div>
      </div>
    `}static _listDetailFields({isTextOrAmount:e,labelRight:t,currency:a,fontStyleRight:i="normal"}){return e?v`
          <bbva-text
            font-style="${i}"
            font-weight="500"
            alignment="right"
            tag="span"
            text="${t}"
            class="detail-field-text"
            size="s"
          ></bbva-text>
        `:v`
          <bbva-amount
            variant="s"
            class="amount"
            amount="${t}"
            currency-code="${a}"
            local-currency="${a}"
          ></bbva-amount>
        `}get _listProgress(){var e,t,a,i,n,s,r,o,c,d,l,m,h,p,u,g,b,f,y,_,x,$,T,S,M,A;return v`
      <div class="list-progress">
        <bbva-text
          size="S"
          text="${this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-total-amount")}"
          tag="span"
        ></bbva-text>
        <bbva-amount
          variant="m"
          amount="${null===(e=this.responseMicroloans.specific[null===(t=this.constantsIds)||void 0===t||null===(a=t.specific)||void 0===a?void 0:a.microloanAmount][0])||void 0===e?void 0:e.amount}"
          currency-code="${null===(i=this.responseMicroloans.specific[null===(n=this.constantsIds)||void 0===n||null===(s=n.specific)||void 0===s?void 0:s.microloanAmount][0])||void 0===i?void 0:i.currency}"
          local-currency="${null===(r=this.responseMicroloans.specific[null===(o=this.constantsIds)||void 0===o||null===(c=o.specific)||void 0===c?void 0:c.microloanAmount][0])||void 0===r?void 0:r.currency}"
        ></bbva-amount>
      </div>
      <div class="list-progress-visualization">
        <bbva-data-visualization-bar
          current-value=${null===(d=this.responseMicroloans.custom)||void 0===d||null===(l=d.PAYMENTS_DETAIL)||void 0===l?void 0:l.paidAmount.amount}
          max-value="${null===(m=this.responseMicroloans.specific[null===(h=this.constantsIds)||void 0===h||null===(p=h.specific)||void 0===p?void 0:p.microloanAmount][0])||void 0===m?void 0:m.amount}"
        >
        </bbva-data-visualization-bar>
      </div>

      <div class="list-progress-details">
        <div class="list-progress-item">
          <bbva-text
            text="${this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-paid-amount")}"
            tag="span"
            size="S"
          ></bbva-text>
          <bbva-amount
            variant="S"
            amount="${null===(u=this.responseMicroloans.custom)||void 0===u||null===(g=u.PAYMENTS_DETAIL)||void 0===g?void 0:g.paidAmount.amount}"
            currency-code="${null===(b=this.responseMicroloans.custom)||void 0===b||null===(f=b.PAYMENTS_DETAIL)||void 0===f?void 0:f.paidAmount.currency}"
            local-currency="${null===(y=this.responseMicroloans.custom)||void 0===y||null===(_=y.PAYMENTS_DETAIL)||void 0===_?void 0:_.paidAmount.currency}"
            language="${this.language}"
          ></bbva-amount>
        </div>

        <div class="list-progress-item">
          <bbva-text
            text="card-transaction-servicing-finance-payment-dashboard-line-detail-pending-amount"
            tag="span"
            size="S"
          ></bbva-text>
          <bbva-amount
            variant="S"
            amount="${null===(x=this.responseMicroloans.custom)||void 0===x||null===($=x.PAYMENTS_DETAIL)||void 0===$?void 0:$.pendingAmount.amount}"
            currency-code="${null===(T=this.responseMicroloans.custom)||void 0===T||null===(S=T.PAYMENTS_DETAIL)||void 0===S?void 0:S.pendingAmount.currency}"
            local-currency="${null===(M=this.responseMicroloans.custom)||void 0===M||null===(A=M.PAYMENTS_DETAIL)||void 0===A?void 0:A.pendingAmount.currency}"
            language="${this.language}"
          ></bbva-amount>
        </div>
      </div>
    `}get _listTemplate(){var e,t,a,i,n,s,r,o,c,d,l,m,h,p,u,g,b,f,y,_,x,$,T,S,A,k;const C=null===(e=this.responseMicroloans)||void 0===e||null===(t=e.terms)||void 0===t?void 0:t.number,E=null===(a=this.responseMicroloans.fees[null===(n=this.constantsIds)||void 0===n||null===(s=n.fees)||void 0===s?void 0:s.microloanWithdrawalFee])||void 0===a||null===(i=a.PERCENTAGE)||void 0===i?void 0:i.percentage;return v`
      <div class="list">
        ${ut._listDetailCustomComponent({textLabelLeft:this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-term"),labelRight:this.t("card-transaction-servicing-finance-payment-dashboard-detail-months",{term:C})})}
        ${ut._listDetailCustomComponent({textLabelLeft:this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-purchase-fee",{months:C}),labelRight:this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-percentage",{percentage:100*E})})}
        ${ut._listDetailCustomComponent({textLabelLeft:this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-purchase-commission"),labelRight:null===(r=this.responseMicroloans.fees[null===(c=this.constantsIds)||void 0===c||null===(d=c.fees)||void 0===d?void 0:d.microloanWithdrawalFee])||void 0===r||null===(o=r.AMOUNT)||void 0===o?void 0:o.amount,currency:null===(l=this.responseMicroloans.fees[null===(h=this.constantsIds)||void 0===h||null===(p=h.fees)||void 0===p?void 0:p.microloanWithdrawalFee])||void 0===l||null===(m=l.AMOUNT)||void 0===m?void 0:m.currency,isTextOrAmount:!1})}
        ${ut._listDetailCustomComponent({textLabelLeft:this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-purchase-monthly-payment"),labelRight:null===(u=this.responseMicroloans.specific[null===(g=this.constantsIds)||void 0===g||null===(b=g.specific)||void 0===b?void 0:b.installmentMonthlyAmount][0])||void 0===u?void 0:u.amount,currency:null===(f=this.responseMicroloans.specific[null===(y=this.constantsIds)||void 0===y||null===(_=y.specific)||void 0===_?void 0:_.installmentMonthlyAmount][0])||void 0===f?void 0:f.currency,isTextOrAmount:!1})}
        ${ut._listDetailCustomComponent({textLabelLeft:this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-purchase-total"),labelRight:null===(x=this.responseMicroloans.specific[null===($=this.constantsIds)||void 0===$||null===(T=$.specific)||void 0===T?void 0:T.microloanAmount][0])||void 0===x?void 0:x.amount,currency:null===(S=this.responseMicroloans.specific[null===(A=this.constantsIds)||void 0===A||null===(k=A.specific)||void 0===k?void 0:k.microloanAmount][0])||void 0===S?void 0:S.currency,isTextOrAmount:!1})}
        ${this._viewMore?this._renderMoreSection():M}
      </div>
      <bbva-expandable-panel
        @expandable-panel-expand="${e=>this._expandViewMore(e)}"
      ></bbva-expandable-panel>
    `}_manageAccordionOpenChange({detail:e,target:t}){e&&lt(this,"purchase-persist-data",{target:t.id})}get _operativeButtons(){const e=[{icon:K(),label:this.t("card-transaction-servicing-finance-payment-dashboard-line-share"),id:"share-purchase-detail"}];return v`
      <bbva-button-row
        .options=${e}
        @button-row-item-click="${()=>this._sharePurchaseDetail()}"
      ></bbva-button-row>
    `}get _panelProcess(){var e,t,a,i,n,s,r,o;return v`
      <div class="panel-process">
        <bbva-text
          font-weight="500"
          size="XL"
          text="${""===this.responseMicroloans.concept?this.t("card-transaction-servicing-finance-payment-dashboard-concept-purchase"):this.responseMicroloans.concept}"
          tag="span"
          alignment="center"
        ></bbva-text>
        <bbva-amount
          variant="4xl"
          amount="${null===(e=this.responseMicroloans)||void 0===e||null===(t=e.microloanAmountWithoutFees)||void 0===t?void 0:t.amount}"
          currency-code="${null===(a=this.responseMicroloans)||void 0===a||null===(i=a.microloanAmountWithoutFees)||void 0===i?void 0:i.currency}"
          local-currency="${null===(n=this.responseMicroloans)||void 0===n||null===(s=n.microloanAmountWithoutFees)||void 0===s?void 0:s.currency}"
        ></bbva-amount>
        <bbva-text
          text="${this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-fees",{paid:null===(r=this.responseMicroloans.custom)||void 0===r||null===(o=r.INSTALLMENTS_DETAIL)||void 0===o?void 0:o.paidInstallments,total:this.responseMicroloans.totalInstallments})}"
          size="S"
          tag="span"
          alignment="center"
          font-style="italic"
        ></bbva-text>
        <bbva-text
          text="${this.t(this._statusType.movements[this.responseMicroloans.status])}"
          class=${this.t(this._statusType.movements[this.responseMicroloans.status])===this.t("card-transaction-servicing-finance-payment-dashboard-detail-completed")?"success-text-color":"default-text-color"}
          size="S"
          tag="span"
          alignment="center"
          font-style="italic"
        ></bbva-text>
      </div>
    `}_renderMoreSection(){var e,t;return v`
      ${ut._listDetailCustomComponent({textLabelLeft:this.t("card-transaction-servicing-finance-payment-dashboard-detail-diferrement-date"),labelRight:null===(e=this.responseMicroloans)||void 0===e?void 0:e.date,isTextOrAmount:!0,fontStyleRight:"italic"})}
      ${ut._listDetailCustomComponent({textLabelLeft:this.t("card-transaction-servicing-finance-payment-dashboard-detail-diferrement-time-title"),labelRight:this.t("card-transaction-servicing-finance-payment-dashboard-detail-diferrement-time",{time:null===(t=this.responseMicroloans)||void 0===t?void 0:t.time}),isTextOrAmount:!0,fontStyleRight:"italic"})}
      ${ut._listDetailCustomComponent({textLabelLeft:this.t("card-transaction-servicing-finance-payment-dashboard-detail-associated-account"),labelRight:`${this.accountName} •${this.accountNumber.slice(-4)}`})}
      ${ut._listDetailCustomComponent({textLabelLeft:this.t("card-transaction-servicing-finance-payment-dashboard-detail-operation-number-title"),labelRight:this.t("card-transaction-servicing-finance-payment-dashboard-detail-operation-number",{number:this.operationNumber})})}
    `}get _secondHistoryPayment(){const e=this.responseMicroloans.transactions.map((e=>({labelLeft:e.concept,labelRight:e.specificAmounts[0].amounts[0].amount,currency:e.specificAmounts[0].amounts[0].currency,status:"card-transaction-servicing-finance-payment-dashboard-filter-diferred"})));return v`
      <bbva-expandable-accordion
        id="deferred-purchases"
        title-medium="true"
        row-title="${this.t("card-transaction-servicing-finance-payment-dashboard-deferred-purchases-upper")}"
        @expandable-accordion-open-change="${this._manageAccordionOpenChange}"
      >
        <div>
          ${this._itemPay(e)}
        </div>
      </bbva-expandable-accordion>
    `}_sharePurchaseDetail(){lt(this,"purchase-persist-data",{interactionLevel:"",linkName:"compartir",linkUrl:"share",target:"share-button"}),lt(this,"share-purchase-detail",{operative:"deferredPurchaseDetail"})}render(){return""===this.operationNumber?M:v`
          ${super.render()}
          <div class="wrapper">
            ${this._panelProcess} ${this._listProgress} ${this._listTemplate}
          </div>
          ${this._isMultipurchase?this._secondHistoryPayment:M}
          <bbva-divider></bbva-divider>
          ${this._historyPayment}
          <bbva-divider></bbva-divider>
          ${this._operativeButtons}
        `}}var gt=e`
[data-tag-name=bbva-text] {
  --lineHeightTypeSmall: 24px ;
}

.list-default-render {
  display: flex;
  flex-direction: column;
  padding: var(--card-transaction-servicing-finance-payment-dashboard-line-detail-list-default-render-padding, 0.5rem 1rem);
}

.line-detail-section {
  margin: var(--card-transaction-servicing-finance-payment-dashboard-line-detail-list-default-section-margin, 1rem 0);
}
`;class bt extends(T(me(he(r(o))))){static get is(){return"line-detail"}static get scopedElements(){const e=[c,j,Le,W,Q];return bt.scopedElementsFromClasses(e)}static get properties(){return{lineDetail:{type:Object,attribute:"line-detail"},userName:{type:String,attribute:"user-name"},accountName:{type:String,attribute:"account-name"},accountNumber:{type:String,attribute:"account-number"},clabeId:{type:String,attribute:"clabe-id"}}}static get styles(){return[gt,G.light,B.light,p.light,m("line-detail-shared-styles")]}constructor(){super(),this.config={header:{text:this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-header"),iconLeftPrimary:X(),accessibilityTextIconLeftPrimary:this.t("card-transaction-servicing-finance-payment-dashboard-accessibility-icon-left-primary")},fixedHeader:!0},this.lineDetail={},this.userName="",this.accountName="",this.accountNumber="",this.clabeId=""}static _listDefaulRender({firstText:e,secondText:t}){return v`
      <div class="list-default-render">
        <bbva-text
          data-acoustic-obfuscate
          text="${e}"
          tag="span"
          font-weight="350"
          size="S"
        ></bbva-text>
        <bbva-text
          data-acoustic-obfuscate
          text="${t}"
          tag="span"
          font-weight="500"
          size="S"
        ></bbva-text>
      </div>
    `}get _renderPage(){var e,t;return v`
      <div class="line-detail-section">
        <bbva-header-category
          text="${this.t("card-transaction-servicing-finance-payment-dashboard-line-general")}"
        ></bbva-header-category>
        ${bt._listDefaulRender({firstText:this.t("card-transaction-servicing-finance-payment-dashboard-line-product"),secondText:this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-product-type")})}
        ${bt._listDefaulRender({firstText:this.t("card-transaction-servicing-finance-payment-dashboard-line-sub-product"),secondText:this.t("card-transaction-servicing-finance-payment-dashboard-deferred-purchases")})}
        ${bt._listDefaulRender({firstText:this.t("card-transaction-servicing-finance-payment-dashboard-line-product-number"),secondText:null===(e=this.lineDetail)||void 0===e?void 0:e.productNumber})}
        ${bt._listDefaulRender({firstText:this.t("card-transaction-servicing-finance-payment-dashboard-line-clabe"),secondText:null===(t=this.lineDetail)||void 0===t?void 0:t.format[this.clabeId]})}
      </div>
      <bbva-divider size="fit"></bbva-divider>
      <div class="line-detail-section">
        <bbva-header-category
          text="${this.t("card-transaction-servicing-finance-payment-dashboard-line-headline")}"
        ></bbva-header-category>
        ${bt._listDefaulRender({firstText:this.t("card-transaction-servicing-finance-payment-dashboard-line-user-name"),secondText:this.userName})}
      </div>
      <bbva-divider size="fit"></bbva-divider>
      <div class="content line-detail-section">
        <bbva-header-category
          text="${this.t("card-transaction-servicing-finance-payment-dashboard-line-account")}"
        ></bbva-header-category>
        ${bt._listDefaulRender({firstText:this.accountName,secondText:`•${this.accountNumber.slice(-4)}`})}
      </div>
    `}render(){return v`
      ${super.render()} ${this._renderPage}
    `}}var ft=e`
:host {
  display: block;
  box-sizing: border-box;
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

[data-tag-name=bbva-header-category] {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-header-category-padding, 0.5rem 0);
}

[data-tag-name=bbva-text] {
  margin: var(--card-transaction-servicing-finance-payment-dashboard-bbva-text-margin, 1rem 0 0.75rem 0);
}

[data-tag-name=bbva-form-checkbox] {
  --bbva-form-checkbox-checkbox-bg-color: var(--card-transaction-servicing-finance-payment-dashboard-checkbox-bg-color, var(--colorsSecondary100, ${t(i.secondary100)}));
  --bbva-form-checkbox-checkbox-border-color: var(--card-transaction-servicing-finance-payment-dashboard-checkbox-border-color, var(--colorsSecondary500, ${t(i.secondary500)}));
  --bbva-form-checkbox-check-color: var(--card-transaction-servicing-finance-payment-dashboard-check-color, var(--colorsPrimaryCore, ${t(i.primaryCore)}));
  --bbva-form-checkbox-color: var(--card-transaction-servicing-finance-payment-dashboard-checkbox-color, var(--colorsSecondary600, ${t(i.secondary600)}));
}

.filter-main {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.filter-container {
  flex-grow: 1;
  overflow-y: auto;
  display: flex;
  flex-direction: column;
  width: 100%;
  padding: var(--card-transaction-servicing-finance-payment-dashboard-filter-movements-container-padding, 1rem 1rem);
}

.filter-content {
  flex-grow: 1;
  display: flex;
  flex-direction: column;
  width: 100%;
  box-sizing: border-box;
  text-align: left;
}

.button-container {
  position: fixed;
  bottom: 0.25rem;
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--card-transaction-servicing-finance-payment-dashboard-filter-movements-button-container-padding, 1.5rem 0 0);
  padding-bottom: var(--card-transaction-servicing-finance-payment-dashboard-button-container-padding-bottom, 1.5rem);
}
`;class yt extends(T(me(he(r(o))))){static get is(){return"filter-menu"}static get scopedElements(){const e=[c,j,Le,te,W,ae,Q];return yt.scopedElementsFromClasses(e)}static get properties(){return{_disableFlag:{type:Boolean,state:!0},_params:{type:Array,state:!0},_resetChecks:{type:Boolean,state:!0}}}static get styles(){return[ft,Z.light,G.light,ee.light,B.light,p.light,m("filter-menu-shared-styles")]}constructor(){super(),this.config={header:{headerType:"modal",variant:"modal",hideReturnIcon:!0,iconRightPrimary:E(),text:this.t("card-transaction-servicing-finance-payment-dashboard-filter-movements-to-show"),accessibilityTextIconRightPrimary:this.t("card-transaction-servicing-finance-payment-dashboard-accessibility-icon-right-primary")},back:!1,fixedHeader:!0},this._params=[],this._disableFlag=!1,this._resetChecks=!1}firstUpdated(){super.firstUpdated(),this._params=["active","settled"]}reset(){this._params=["active","settled"],this._resetChecks=!1}update(e){super.update(e),e.has("_params")&&(this._disableFlag=0===this._params.length)}_buildFilterOptions(){const e=[];return this._params.map(((t,a)=>(e.push({index:a,name:"active"===t?this.t("card-transaction-servicing-finance-payment-dashboard-in-progress"):this.t("card-transaction-servicing-finance-payment-dashboard-detail-all-completed"),removable:!0}),t))),e}_filtersSelected(){const e=this._buildFilterOptions();lt(this,"filter-movements-navigate",{routeName:"filterResults",params:{filterParams:this._params,filterOptions:e}})}get _renderFilterTemplate(){return v`
      <div class="filter-main">
        <div class="filter-container">
          <bbva-header-category
            heading-level="2"
            text="${this.t("card-transaction-servicing-finance-payment-dashboard-filter-movements-status")}"
          ></bbva-header-category>
          <div class="filter-content">
            <bbva-text
              tag="span"
              alignment="left"
              size="M"
              text="${this.t("card-transaction-servicing-finance-payment-dashboard-filter-description")}"
            ></bbva-text>
            <bbva-form-checkbox
              id="active"
              label="${this.t("card-transaction-servicing-finance-payment-dashboard-in-progress")}"
              optional-label=" "
              ?checked="${!this._resetChecks}"
              @click="${this._validateParams}"
            ></bbva-form-checkbox>
            <bbva-divider></bbva-divider>
            <bbva-form-checkbox
              id="settled"
              label="${this.t("card-transaction-servicing-finance-payment-dashboard-detail-all-completed")}"
              optional-label=" "
              ?checked="${!this._resetChecks}"
              @click="${this._validateParams}"
            ></bbva-form-checkbox>
          </div>
        </div>
        <div class="button-container">
          <bbva-button-default
            text="${this.t("card-transaction-servicing-finance-payment-dashboard-operative-filter")}"
            ?disabled="${this._disableFlag}"
            @click="${this._filtersSelected}"
          ></bbva-button-default>
        </div>
      </div>
    `}_validateParams(e){e.stopPropagation(),e.target.checked?this._params=[...this._params,e.target.id]:this._params=this._params.filter((t=>t!==e.target.id))}render(){return v`
      ${super.render()} ${this._renderFilterTemplate}
    `}}var _t=e`
:host {
  --_card-transaction-servicing-finance-payment-dashboard-form-filter-bg-color: var(--card-transaction-servicing-finance-payment-dashboard-dark-mode-form-filter-bg-color, var(--card-transaction-servicing-finance-payment-dashboard-form-filter-bg-color, var(--colorsPrimaryCoreDarkened, ${t(i.primaryCoreDarkened)})));
}

.loader {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 3rem;
  margin: var(--card-transaction-servicing-finance-payment-dashboard-filter-results-loader-margin, 2rem 0 1rem 0);
  background-image: linear-gradient(-60deg, transparent 50%, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-bg);
  background-size: calc((169px * 2) + (16px/ 2)) 16px, calc((103px * 2) + (16px/ 2)) 16px, calc((72px * 2) + (16px/ 2)) 16px, calc((65px * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 100% 0, 0 30px, 100% 30px;
}
.loader .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 3rem;
  background: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-animated-layer-primary-bg);
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
[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
}

[data-tag-name=bbva-text].default-text-color {
  --bbva-text-color: var(--_card-transaction-servicing-finance-payment-dashboard-default--text-color);
}
[data-tag-name=bbva-text].success-text-color {
  --bbva-text-color: var(--_card-transaction-servicing-finance-payment-dashboard-success--text-color);
}

[data-tag-name=bbva-amount] {
  --bbva-amount-color: var(--_card-transaction-servicing-finance-payment-dashboard-primary-text-color, var(--colorsSecondary600, ${t(i.secondary600)}));
}

[data-tag-name=bbva-link] {
  --bbva-link-color: var(--card-transaction-servicing-finance-payment-dashboard-link-color, var(--colorsPrimaryMedium, ${t(i.primaryMedium)}));
}

.wrapper {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-filter-results-wrapper-padding, 0.25rem 1rem 1rem);
}

[data-tag-name=bbva-form-filter] {
  background-color: var(--_card-transaction-servicing-finance-payment-dashboard-form-filter-bg-color, var(--colorsPrimaryCoreDarkened, ${t(i.primaryCoreDarkened)}));
}

.movements [data-tag-name=bbva-text] {
  margin: var(--card-transaction-servicing-finance-payment-dashboard-filter-results-movements-text-margin, 1.25rem 0 1rem 0);
}
.movements .one-movement {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-filter-results-one-movement-padding, 1rem 0);
}
.movements .one-movement [data-tag-name=bbva-text] {
  margin: var(--card-transaction-servicing-finance-payment-dashboard-filter-results-one-movement-text-margin, 0);
}
.movements .one-movement .detail {
  display: flex;
  justify-content: space-between;
}
.movements .one-movement [data-tag-name=bbva-data-visualization-bar] {
  margin-top: var(--card-transaction-servicing-finance-payment-dashboard-filter-results-data-visualization-bar-margin-top, 0.625rem);
}
.movements .one-movement .resumen-detail {
  display: flex;
  align-items: center;
  column-gap: 0.25rem;
}
.movements .one-movement .resumen-detail .varian {
  display: flex;
  align-items: center;
  column-gap: 0.5rem;
}
.movements .one-movement .resume-detail-pending {
  display: flex;
  column-gap: 0.25rem;
}

.list-movements {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-filter-results-list-movements-padding, 1.25rem 0 2rem);
}
.list-movements .movements-detail {
  display: flex;
  justify-content: space-between;
  padding: var(--card-transaction-servicing-finance-payment-dashboard-filter-results-movements-detail-padding, 0 1rem);
}

.image {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-filter-results-image-padding, 1rem 1rem auto);
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: var(--card-transaction-servicing-finance-payment-dashboard-filter-results-img-margin, 0 auto 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: var(--card-transaction-servicing-finance-payment-dashboard-filter-results-span-margin, 1rem auto 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.empty-description {
  display: flex;
  flex-direction: column;
  row-gap: 1rem;
  text-align: center;
}
`;class xt extends(T(me(he(r(o))))){static get is(){return"filter-results"}static get scopedElements(){const e=[c,Y,W,Le,A,se,X,ve,re,xe,Q];return xt.scopedElementsFromClasses(e)}static get properties(){return{language:{type:String},loading:{type:Boolean},responseMicroloans:{type:Array,attribute:"response-microloans"},paginationMicroloans:{type:Object,attribute:"pagination-microloans"},filterOptions:{type:Object,attribute:"filter-options"},movements:{type:Object},filterParams:{type:Array,attribute:"filter-params"},constantsIds:{type:Object,attribute:"constants-ids"},_filteredMovements:{type:Array,state:!0},_params:{type:Array,state:!0}}}static get styles(){return[_t,_e.dark,p.light,ie.light,G.light,V.light,pe.light,m("filter-results-section-shared-styles")]}constructor(){super(),this.config={header:{text:this.t("card-transaction-servicing-finance-payment-dashboard-filter-results"),iconLeftPrimary:X(),accessibilityTextIconLeftPrimary:this.t("card-transaction-servicing-finance-payment-dashboard-accessibility-icon-left-primary")},fixedHeader:!0},this.language="",this.paginationMicroloans={},this.filterOptions={},this.movements={},this.loading=!1,this.filterParams=[],this._filteredMovements=[],this._params=[],this.addEventListener("header-main-icon-left-primary-click",(()=>this.reset())),this.addEventListener("form-filter-edit-click",(()=>this.reset()))}connectedCallback(){super.connectedCallback(),this.loading=!0}reset(){this._filteredMovements=[],this._params=[],this.loading=!0}updated(e){super.updated(e),e.has("paginationMicroloans")&&0!==Object.keys(this.paginationMicroloans).length&&0===this.responseMicroloans.length&&(this.loading=!1),e.has("responseMicroloans")&&this.responseMicroloans.length>0&&this._persistMovements(),e.has("responseMicroloans")&&0===this.responseMicroloans.length&&(this._filteredMovements=[],this.loading=!1),e.has("filterParams")&&(this._params=[...this.filterParams])}get _filter(){const e=[];return this.filterOptions.map((t=>(e.push({index:t.index,name:t.name,removable:1!==Object.keys(this.filterOptions).length}),t))),v`
      <bbva-form-filter
        ambient="dark400"
        .filters=${e}
        @form-filter-close-click="${this._manageFilterOptions}"
      ></bbva-form-filter>
    `}get _listFilters(){return this.loading?xt._renderLoaders():this._filteredMovements.length>0?v`
          <div class="movements">
            ${this._filteredMovements.map((({date:e,purchases:t})=>v`
                <bbva-text text=${e} font-weight="500" tag="span"></bbva-text>
                ${this._oneMovement(t)}
              `))}
          </div>
        `:this._responseEmpty()}_manageFilterOptions(e){e.stopPropagation(),this.filterOptions.splice(e.detail,1),this._params.splice(e.detail,1),this._filteredMovements=[],this.loading=!0,lt(this,"filter-movements-navigate",{params:{filterParams:this._params}})}_oneMovement(e){const t=this.movements.reduce(((e,t)=>{const a=t.id,i={...e};return i[a]||(i[a]=[]),i[a].push(t),i}),{});return this._loading?v``:e.map((e=>{var a,i,n,s,r,o,c,d,l,m,h,p,u,g,b,f,y,_,x,$,T,S,M,A,k,C,E,P,I,D,L,w,R;return v`
              <div class="one-movement">
                <div class="detail">
                  <bbva-link
                    id=${e.id}
                    @click="${t=>this._showPurchaseDetail(t,e)}"
                    >${""===e.concept?this.t("card-transaction-servicing-finance-payment-dashboard-concept-purchase"):e.concept}</bbva-link
                  >
                  <bbva-text
                    class=${this.t(t[e.status][0].name)===this.t("card-transaction-servicing-finance-payment-dashboard-detail-completed")?"success-text-color":"default-text-color"}
                    text="${t[e.status][0].name}"
                    tag="span"
                    font-style="italic"
                  ></bbva-text>
                </div>
                ${"SETTLED"===e.status?v`
                      <bbva-text
                        text="${this.t("card-transaction-servicing-finance-payment-dashboard-deferred-finish-status")}"
                        tag="span"
                        size="2XS"
                      ></bbva-text>
                    `:v`
                      <bbva-text
                        text="${this.t("card-transaction-servicing-finance-payment-dashboard-end-date-purchase",{date:e.end})}"
                        tag="span"
                        size="2XS"
                      ></bbva-text>
                    `}
                <bbva-data-visualization-bar
                  current-value="${null===(a=e.custom)||void 0===a||null===(i=a.PAYMENTS_DETAIL)||void 0===i||null===(n=i.paidAmount)||void 0===n?void 0:n.amount}"
                  max-value="${null===(s=e.specific[null===(r=this.constantsIds)||void 0===r||null===(o=r.specific)||void 0===o?void 0:o.microloanAmount][0])||void 0===s?void 0:s.amount}"
                  fill-color="#2ecccd"
                >
                </bbva-data-visualization-bar>
                <div class="detail">
                  <div class="resumen-detail">
                    <bbva-text
                      text="${this.t("card-transaction-servicing-finance-payment-dashboard-paid-purchase")}"
                      tag="span"
                      size="XS"
                    ></bbva-text>
                    <bbva-amount
                      variant="s"
                      amount="${null===(c=e.custom)||void 0===c||null===(d=c.PAYMENTS_DETAIL)||void 0===d||null===(l=d.paidAmount)||void 0===l?void 0:l.amount}"
                      currency-code="${null===(m=e.custom)||void 0===m||null===(h=m.PAYMENTS_DETAIL)||void 0===h||null===(p=h.paidAmount)||void 0===p?void 0:p.currency}"
                      local-currency="${null===(u=e.custom)||void 0===u||null===(g=u.PAYMENTS_DETAIL)||void 0===g||null===(b=g.paidAmount)||void 0===b?void 0:b.currency}"
                    ></bbva-amount>
                  </div>
                  <div class="resumen-detail">
                    <bbva-text
                      text="${this.t("card-transaction-servicing-finance-payment-dashboard-total-purchase")}"
                      tag="span"
                      size="XS"
                    ></bbva-text>
                    <bbva-amount
                      variant="s"
                      amount="${null===(f=e.specific[null===(y=this.constantsIds)||void 0===y||null===(_=y.specific)||void 0===_?void 0:_.microloanAmount][0])||void 0===f?void 0:f.amount}"
                      currency-code="${null===(x=e.specific[null===($=this.constantsIds)||void 0===$||null===(T=$.specific)||void 0===T?void 0:T.microloanAmount][0])||void 0===x?void 0:x.currency}"
                      local-currency="${null===(S=e.specific[null===(M=this.constantsIds)||void 0===M||null===(A=M.specific)||void 0===A?void 0:A.microloanAmount][0])||void 0===S?void 0:S.currency}"
                      language="${this.language}"
                    ></bbva-amount>
                  </div>
                </div>
                <div class="resumen-detail varian">
                  <div class="resume-detail-pending">
                    <bbva-text
                      text="${this.t("card-transaction-servicing-finance-payment-dashboard-pending-purchase")}"
                      tag="span"
                      size="XS"
                    ></bbva-text>
                    <bbva-amount
                      variant="s"
                      amount="${null===(k=e.custom)||void 0===k||null===(C=k.PAYMENTS_DETAIL)||void 0===C||null===(E=C.pendingAmount)||void 0===E?void 0:E.amount}"
                      currency-code="${null===(P=e.custom)||void 0===P||null===(I=P.PAYMENTS_DETAIL)||void 0===I?void 0:I.pendingAmount.currency}"
                      local-currency="${null===(D=e.custom)||void 0===D||null===(L=D.PAYMENTS_DETAIL)||void 0===L?void 0:L.pendingAmount.currency}"
                      language="${this.language}"
                    ></bbva-amount>
                  </div>
                  <bbva-text
                    text="${this.t("card-transaction-servicing-finance-payment-dashboard-installments-purchase",{paid:null===(w=e.custom)||void 0===w||null===(R=w.INSTALLMENTS_DETAIL)||void 0===R?void 0:R.paidInstallments,total:e.totalInstallments})}"
                    tag="span"
                    size="S"
                    font-weight="500"
                  ></bbva-text>
                </div>
              </div>
              <bbva-divider></bbva-divider>
            `}))}_persistMovements(){this.responseMicroloans.map((e=>(this._filteredMovements.push(e),e))),lt(this,"filter-movements-persist"),this.loading=!1,this.requestUpdate()}static _renderLoaders(){return v`
      <div>
        <div class="loader">
          <div class="skeleton"></div>
        </div>
        <bbva-divider></bbva-divider>
      </div>
    `}_responseEmpty(){return v`
      <div loading class="image">
        ${v`
          <span class="empty-state" aria-hidden="true">${ne}</span>
        `}
      </div>
      <div class="empty-description">
        <bbva-text
          tag="span"
          alignment="center"
          font-weight="500"
          size="L"
          text="${this.t("card-transaction-servicing-finance-payment-dashboard-filter-no-diferrements")}"
        ></bbva-text>
        <bbva-text
          tag="span"
          alignment="center"
          size="S"
          text="${this.t("card-transaction-servicing-finance-payment-dashboard-filter-info")}"
        ></bbva-text>
      </div>
    `}_showPurchaseDetail(e,t){e.stopPropagation(),lt(this,"show-purchase-detail",t)}render(){return v`
      ${super.render()} ${this._filter}
      <div class="wrapper">
        ${this._listFilters}
      </div>
    `}}var $t=e`
.loader {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 3rem;
  margin: var(--card-transaction-servicing-finance-payment-dashboard-deferred-movements-loader-margin, 2rem 1rem 1rem 1rem);
  background-image: linear-gradient(-60deg, transparent 50%, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-bg);
  background-size: calc((169px * 2) + (16px/ 2)) 16px, calc((103px * 2) + (16px/ 2)) 16px, calc((72px * 2) + (16px/ 2)) 16px, calc((65px * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 100% 0, 0 30px, 100% 30px;
}
.loader .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 3rem;
  background: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-animated-layer-bg);
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
[data-tag-name=bbva-text].default-text-color {
  --bbva-text-color: var(--_card-transaction-servicing-finance-payment-dashboard-default--text-color);
}
[data-tag-name=bbva-text].success-text-color {
  --bbva-text-color: var(--_card-transaction-servicing-finance-payment-dashboard-success--text-color);
}
[data-tag-name=bbva-text].end-date {
  --lineHeightTypeSmall: 24px;
  padding-bottom: var(--card-transaction-servicing-finance-payment-dashboard-text-end-date-padding-bottom, 0.625rem);
}

[data-tag-name=bbva-amount] {
  --bbva-amount-color: var(--_card-transaction-servicing-finance-payment-dashboard-primary-text-color, var(--colorsSecondary600, ${t(i.secondary600)}));
}

[data-tag-name=bbva-link] {
  --_link-color: var(--card-transaction-servicing-finance-payment-dashboard-link-color, var(--colorsPrimaryMedium, ${t(i.primaryMedium)}));
}

.movements [data-tag-name=bbva-text] {
  margin-top: var(--card-transaction-servicing-finance-payment-dashboard-deferred-movements-text-margin-top, 1.25rem 0 1rem 0);
}
.movements .one-movement {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-deferred-movements-one-movement-padding, 1rem 0);
}
.movements .one-movement [data-tag-name=bbva-text] {
  margin: var(--card-transaction-servicing-finance-payment-dashboard-deferred-movements-one-movement-text-margin, 0);
}
.movements .one-movement .detail {
  display: flex;
  justify-content: space-between;
}
.movements .one-movement [data-tag-name=bbva-data-visualization-bar] {
  margin-top: var(--card-transaction-servicing-finance-payment-dashboard-deferred-movements-one-movement-data-visualization-bar-margin-top, 0.625rem);
  --bbva-data-visualization-bar-color: var(--_card-transaction-servicing-finance-payment-dashboard-data-visualization-bar-dark-mode-color);
}
.movements .one-movement .resumen-detail {
  display: flex;
  align-items: center;
  column-gap: 0.25rem;
}
.movements .one-movement .resumen-detail .varian {
  display: flex;
  align-items: center;
  column-gap: 0.5rem;
}
.movements .one-movement .resume-detail-pending {
  display: flex;
  column-gap: 0.25rem;
}

.movements-list {
  margin: var(--card-transaction-servicing-finance-payment-dashboard-deferred-movements-list-margin, 0 1rem);
}
.movements-list [data-tag-name=bbva-text] {
  margin: var(--card-transaction-servicing-finance-payment-dashboard-deferred-movements-list-text-margin, 1rem 0);
}

.list-movements {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-deferred-movements-list-movements-padding, 1.25rem 0 2rem);
}
.list-movements .movements-detail {
  display: flex;
  justify-content: space-between;
  padding: var(--card-transaction-servicing-finance-payment-dashboard-deferred-movements-detail-padding, 0 1rem);
}

.list-movements-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin: var(--card-transaction-servicing-finance-payment-dashboard-deferred-movements-list-margin, 0.625rem 1rem);
}
`;class Tt extends(T(me(he(r(o))))){static get is(){return"deferred-movements"}static get scopedElements(){const e=[j,Le,W,Q,ve,c,Y,re];return Tt.scopedElementsFromClasses(e)}static get properties(){return{language:{type:String},microloansMovements:{type:Array,attribute:"microloans-movements"},movements:{type:Object},loading:{type:Boolean},constantsIds:{type:Object,attribute:"constants-ids"},_deferredMovements:{type:Array,state:!0}}}static get styles(){return[$t,V.light,pe.light,G.light,B.light,ie.light,p.light,m("deferred-movements-shared-styles")]}constructor(){super(),this.config={header:{text:this.t("card-transaction-servicing-finance-payment-dashboard-deferred-movements"),iconLeftPrimary:X(),accessibilityTextIconLeftPrimary:this.t("card-transaction-servicing-finance-payment-dashboard-accessibility-icon-left-primary")},fixedHeader:!0},this.language="",this.loading=!1,this.constantsIds={},this.movements={},this.microloansMovements=[],this._deferredMovements=[],this.addEventListener("header-main-icon-left-primary-click",(()=>{lt(this,"call-back",ct(Tt.is.replaceAll("-"," "))),this.reset()}))}reset(){this._deferredMovements=[]}updated(e){var t,a;super.updated(e),e.has("loading")&&this._renderLoaders(),e.has("microloansMovements")&&(null===(t=this.microloansMovements)||void 0===t?void 0:t.length)>0&&this._persistMovements(),e.has("microloansMovements")&&0===(null===(a=this.microloansMovements)||void 0===a?void 0:a.length)&&(this._deferredMovements=[])}_openFilterSection(e){e.stopPropagation(),lt(this,"show-filter-movements",{routeName:"filterMovements"})}_persistMovements(){this.microloansMovements.map((e=>(this._deferredMovements.push(e),e))),lt(this,"deferred-movements-persist",!0),this.requestUpdate()}_renderDeferredMovement(e){const t=this.movements.reduce(((e,t)=>{const a=t.id,i={...e};return i[a]||(i[a]=[]),i[a].push(t),i}),{});return e.map((e=>{var a,i,n,s,r,o,c,d,l,m,h,p,u,g,b,f,y,_,x,$,T,S,M,A,k,C,E,P,I,D,L,w,R,O,N;return v`
          <div class="one-movement">
            <div class="detail">
              <bbva-link
                ?loading="${this._loading}"
                id=${e.id}
                @click="${t=>this._showPurchaseDetail(t,e)}"
                >${""===e.concept?this.t("card-transaction-servicing-finance-payment-dashboard-concept-purchase"):e.concept}</bbva-link
              >
              <bbva-text
                class=${this.t(t[e.status][0].name)===this.t("card-transaction-servicing-finance-payment-dashboard-detail-completed")?"success-text-color":"default-text-color"}
                text="${t[e.status][0].name}"
                tag="span"
                font-style="italic"
              ></bbva-text>
            </div>
            ${"SETTLED"===e.status?v`
                  <bbva-text
                    text="${this.t("card-transaction-servicing-finance-payment-dashboard-deferred-finish-status")}"
                    tag="span"
                    size="S"
                    font-weight="350"
                    class="end-date"
                  ></bbva-text>
                `:v`
                  <bbva-text
                    text="${this.t("card-transaction-servicing-finance-payment-dashboard-end-date-purchase",{date:e.end})}"
                    tag="span"
                    size="S"
                    font-weight="350"
                    class="end-date"
                  ></bbva-text>
                `}
            <bbva-data-visualization-bar
              current-value="${null===(a=e.custom)||void 0===a||null===(i=a.PAYMENTS_DETAIL)||void 0===i||null===(n=i.paidAmount)||void 0===n?void 0:n.amount}"
              max-value="${null===(s=e.specific[null===(r=this.constantsIds)||void 0===r||null===(o=r.specific)||void 0===o?void 0:o.microloanAmount][0])||void 0===s?void 0:s.amount}"
            >
            </bbva-data-visualization-bar>

            <div class="detail">
              <div class="resumen-detail">
                <bbva-text
                  text="${this.t("card-transaction-servicing-finance-payment-dashboard-paid-purchase")}"
                  tag="span"
                  size="XS"
                ></bbva-text>
                <bbva-amount
                  variant="s"
                  amount="${null===(c=e.custom)||void 0===c||null===(d=c.PAYMENTS_DETAIL)||void 0===d||null===(l=d.paidAmount)||void 0===l?void 0:l.amount}"
                  currency-code="${null===(m=e.custom)||void 0===m||null===(h=m.PAYMENTS_DETAIL)||void 0===h||null===(p=h.paidAmount)||void 0===p?void 0:p.currency}"
                  local-currency="${null===(u=e.custom)||void 0===u||null===(g=u.PAYMENTS_DETAIL)||void 0===g||null===(b=g.paidAmount)||void 0===b?void 0:b.currency}"
                ></bbva-amount>
              </div>

              <div class="resumen-detail">
                <bbva-text
                  text="${this.t("card-transaction-servicing-finance-payment-dashboard-total-purchase")}"
                  tag="span"
                  size="XS"
                ></bbva-text>
                <bbva-amount
                  variant="s"
                  amount="${null===(f=e.specific[null===(y=this.constantsIds)||void 0===y||null===(_=y.specific)||void 0===_?void 0:_.microloanAmount][0])||void 0===f?void 0:f.amount}"
                  currency-code="${null===(x=e.specific[null===($=this.constantsIds)||void 0===$||null===(T=$.specific)||void 0===T?void 0:T.microloanAmount][0])||void 0===x?void 0:x.currency}"
                  local-currency="${null===(S=e.specific[null===(M=this.constantsIds)||void 0===M||null===(A=M.specific)||void 0===A?void 0:A.microloanAmount][0])||void 0===S?void 0:S.currency}"
                  language="${this.language}"
                ></bbva-amount>
              </div>
            </div>

            <div class="resumen-detail varian">
              <div class="resume-detail-pending">
                <bbva-text
                  text="${this.t("card-transaction-servicing-finance-payment-dashboard-pending-purchase")}"
                  tag="span"
                  size="XS"
                ></bbva-text>
                <bbva-amount
                  variant="s"
                  amount="${null===(k=e.custom)||void 0===k||null===(C=k.PAYMENTS_DETAIL)||void 0===C||null===(E=C.pendingAmount)||void 0===E?void 0:E.amount}"
                  currency-code="${null===(P=e.custom)||void 0===P||null===(I=P.PAYMENTS_DETAIL)||void 0===I||null===(D=I.pendingAmount)||void 0===D?void 0:D.currency}"
                  local-currency="${null===(L=e.custom)||void 0===L||null===(w=L.PAYMENTS_DETAIL)||void 0===w||null===(R=w.pendingAmount)||void 0===R?void 0:R.currency}"
                  language="${this.language}"
                ></bbva-amount>
              </div>
              <bbva-text
                text="${this.t("card-transaction-servicing-finance-payment-dashboard-installments-purchase",{paid:null===(O=e.custom)||void 0===O||null===(N=O.INSTALLMENTS_DETAIL)||void 0===N?void 0:N.paidInstallments,total:e.totalInstallments})}"
                tag="span"
                size="S"
                font-weight="500"
              ></bbva-text>
            </div>
          </div>
          <bbva-divider></bbva-divider>
        `}))}_renderLoaders(){return this.loading?v`
          <div>
            <div class="loader">
              <div class="skeleton"></div>
            </div>
            <bbva-divider></bbva-divider>
          </div>
        `:v``}get _renderMovementsList(){return v`
      <div class="list-movements-header">
        <bbva-text
          size="M"
          text="${this.t("card-transaction-servicing-finance-payment-dashboard-last-movements")}"
          font-weight="500"
        ></bbva-text>
        <bbva-link id="filter-link" @click="${e=>this._openFilterSection(e)}">
          ${this.t("card-transaction-servicing-finance-payment-dashboard-operative-filter")}
        </bbva-link>
      </div>
      <div class="movements">
        <div class="movements-list">
          ${this._deferredMovements.map((({date:e,purchases:t})=>v`
              <bbva-text size="S" text=${e} font-weight="500" tag="span"></bbva-text>
              ${this._renderDeferredMovement(t)}
            `))}
        </div>
      </div>
    `}_showPurchaseDetail(e,t){e.stopPropagation(),lt(this,"show-purchase-detail",t)}render(){return v`
      ${super.render()} ${this._renderMovementsList} ${this._renderLoaders()}
    `}}var St=e`
.loader {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 3rem;
  margin: var(--card-transaction-servicing-finance-payment-dashboard-deferrable-movements-loader-margin, 2rem 1rem 1rem 1rem);
  background-image: linear-gradient(-60deg, transparent 50%, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-quote-bg);
  background-size: calc((169px * 2) + (16px/ 2)) 16px, calc((103px * 2) + (16px/ 2)) 16px, calc((72px * 2) + (16px/ 2)) 16px, calc((65px * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 100% 0, 0 30px, 100% 30px;
}
.loader .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 3rem;
  background: var(--_card-transaction-servicing-finance-payment-dashboard-skeleton-animated-layer-bg);
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
[data-tag-name=bbva-link] {
  --bbva-link-color: var(--card-transaction-servicing-finance-payment-dashboard-link-color, var(--colorsPrimaryMedium, ${t(i.primaryMedium)}));
}

[data-tag-name=bbva-amount] {
  --bbva-amount-color: var(--_card-transaction-servicing-finance-payment-dashboard-primary-text-color, var(--colorsSecondary600, ${t(i.secondary600)}));
}

.detail-list [data-tag-name=bbva-text] {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-deferrable-movements-detail-list-padding, 0 1rem);
  margin: var(--card-transaction-servicing-finance-payment-dashboard-deferrable-movements-detail-list-margin, 1.25rem 0 1rem 0);
}

.list-movements {
  padding: var(--card-transaction-servicing-finance-payment-dashboard-deferrable-movements-list-movements-padding, 1.25rem 0 2rem);
}
.list-movements .movements-detail {
  display: flex;
  justify-content: space-between;
  padding: var(--card-transaction-servicing-finance-payment-dashboard-deferrable-movements-detail-padding, 0 1rem);
}
`;class Mt extends(T(me(he(r(o))))){static get is(){return"deferrable-movements"}static get scopedElements(){const e=[j,Le,W,Q,ve,c,Y,re];return Mt.scopedElementsFromClasses(e)}static get properties(){return{language:{type:String},responseTransactions:{type:Array,attribute:"response-transactions"},loading:{type:Boolean},constantsIds:{type:Object,attribute:"constants-ids"},_deferrableMovements:{type:Array,state:!0}}}static get styles(){return[St,V.light,pe.light,G.light,B.light,ie.light,p.light,m("deferrable-movements-shared-styles")]}constructor(){super(),this.config={header:{text:this.t("card-transaction-servicing-finance-payment-dashboard-deferrable-movements"),iconLeftPrimary:X(),accessibilityTextIconLeftPrimary:this.t("card-transaction-servicing-finance-payment-dashboard-accessibility-icon-left-primary")},fixedHeader:!0},this.language="",this.loading=!1,this.constantsIds={},this.responseTransactions=[],this._deferrableMovements=[],this.addEventListener("header-main-icon-left-primary-click",(()=>{lt(this,"call-back",ct(Mt.is.replaceAll("-"," "))),this.reset()}))}reset(){this._deferrableMovements=[]}updated(e){var t,a;super.updated(e),e.has("loading")&&this._renderLoaders(),e.has("responseTransactions")&&(null===(t=this.responseTransactions)||void 0===t?void 0:t.length)>0&&this._persistMovements(),e.has("responseTransactions")&&0===(null===(a=this.responseTransactions)||void 0===a?void 0:a.length)&&(this._deferrableMovements=[])}_persistMovements(){this.responseTransactions.map((e=>(this._deferrableMovements.push(e),e))),lt(this,"deferrable-movements-persist",!0),this.requestUpdate()}get _renderDeferrableMovements(){return v`
      ${this._deferrableMovements.map((({date:e,purchases:t})=>v`
          <div class="detail-list">
            <bbva-text font-weight="500" text=${e} tag="span"></bbva-text>
            ${this._renderListMovements(t)}
          </div>
        `))}
    `}_renderListMovements(e){return e.map(((t,a)=>{var i,n,s,r,o,c,d,l,m;return v`
        <div>
          <div class="list-movements">
            <div class="movements-detail">
              <bbva-link
                @click="${()=>{lt(this,"purchase-click",t.id)}}"
                >${t.name}</bbva-link
              >
              <bbva-amount
                variant="l"
                amount="${null===(i=t.amount[null===(n=this.constantsIds)||void 0===n||null===(s=n.specific)||void 0===s?void 0:s.totalAmount])||void 0===i?void 0:i.amounts[0].amount}"
                currency-code="${null===(r=t.amount[null===(o=this.constantsIds)||void 0===o||null===(c=o.specific)||void 0===c?void 0:c.totalAmount])||void 0===r?void 0:r.amounts[0].currency}"
                local-currency="${null===(d=t.amount[null===(l=this.constantsIds)||void 0===l||null===(m=l.specific)||void 0===m?void 0:m.totalAmount])||void 0===d?void 0:d.amounts[0].currency}"
                language="${this.language}"
              ></bbva-amount>
            </div>
          </div>
        </div>
        <bbva-divider size=${a===e.length-1?"full":"fit"}></bbva-divider>
      `}))}_renderLoaders(){return this.loading?v`
          <div>
            <div class="loader">
              <div class="skeleton"></div>
            </div>
            <bbva-divider></bbva-divider>
          </div>
        `:v``}render(){return v`
      ${super.render()} ${this._renderDeferrableMovements} ${this._renderLoaders()}
    `}}class At extends(T(me(he(r(o))))){static get is(){return"card-transaction-servicing-finance-payment-dashboard"}static get scopedElements(){const e=[We,Te,Se,Ae,Pe,Ie,Me,et,at,pt,ut,bt,yt,xt,Tt,Mt,Y,H,ve,W,j,Le,re,de,ke,c,Q,ae,le,C];return At.scopedElementsFromClasses(e)}static get properties(){return{host:{type:String,attribute:"host"},requiredToken:{type:String,attribute:"required-token"},native:{type:Boolean,attribute:"native"},financingData:{type:Object,attribute:"financing-data"},accountName:{type:String,attribute:"account-name"},accountNumber:{type:String,attribute:"account-number"},globalUser:{type:Object,attribute:"global-user"},userName:{type:String,attribute:"user-name"},language:{type:String,attribute:"language"},flexibleFinancingsApiVersion:{type:String,attribute:"flexible-financings-api-version"},customersApiVersion:{type:String,attribute:"customers-api-version"},maxRetries:{type:Number,attribute:"max-retries"},productId:{type:String,attribute:"product-id"},subProductId:{type:String,attribute:"sub-product-id"},constantsIds:{type:Object,attribute:"constants-ids"},pageSize:{type:Number,attribute:"page-size"},hideDeferPurchases:{type:Boolean,attribute:"hide-defer-purchases"},hideAdvancePayment:{type:Boolean,attribute:"hide-advance-payment"},hideAccountStatus:{type:Boolean,attribute:"hide-account-status"},hideMonthlyPayment:{type:Boolean,attribute:"hide-monthly-payment"},hideCancelLine:{type:Boolean,attribute:"hide-cancel-line"},hideOverduePayment:{type:Boolean,attribute:"hide-overdue-payment"},relatedContract:{type:String},_initialized:{type:Boolean,state:!0},_responseFinancingLine:{type:Object,state:!0},_responseMicroloan:{type:Object,state:!0},_responsePayments:{type:Array,state:!0},_responseTransactions:{type:Array,state:!0},_responseSettings:{type:Object,state:!0},_modalInfoConfig:{type:Object,state:!0},_modalInfoVisible:{type:Boolean,state:!0},_loading:{type:Boolean,state:!0},_settingsAmount:{type:Number,state:!0},_operatives:{type:Array,state:!0},_cantDefer:{type:Boolean,state:!0},_modalSeeMoreVisible:{type:Boolean,state:!0},_overduePayments:{type:Boolean,state:!0},_lineDetailVisible:{type:Boolean,state:!0},_retriesConfig:{type:Object,state:!0},_closeModalListeners:{type:Object,state:!0},_errorConfig:{type:Object,state:!0},_errorVisible:{type:Boolean,state:!0},_posttransactionsErrorVisible:{type:Boolean,state:!0},_getmicroloansErrorVisible:{type:Boolean,state:!0},_responseMicroloans:{type:Array,state:!0},_responseMicroloansFiltered:{type:Array,state:!0},_tabItems:{type:Array,state:!0},_getmicroloansLoadingMovements:{type:Boolean,state:!0},_posttransactionsLoadingMovements:{type:Boolean,state:!0},_deferredPaginationKey:{type:String,state:!0},_deferredPaginationKeyFilter:{type:String,state:!0},_deferrablePaginationKey:{type:String,state:!0},_movements:{type:Array,state:!0},_purchaseSelected:{type:Object,state:!0},_purchaseId:{type:String,state:!0},_operationNumber:{type:String,state:!0},_viewAllDeferredMovementsVisible:{type:Boolean,state:!0},_viewAllDeferrableMovementsVisible:{type:Boolean,state:!0},_filterMovementsVisible:{type:Boolean,state:!0},_filterResultsVisible:{type:Boolean,state:!0},_filterParams:{type:Array,state:!0},_filterOptions:{type:Array,state:!0},_microloansPagination:{type:Object,state:!0},_microloansPaginationFilter:{type:Object,state:!0},_transactionsPagination:{type:Object,state:!0},_isFilterMode:{type:Boolean,state:!0},_movementsSelectedVisible:{type:Number,state:!0},_scrollBottom:{type:Boolean,state:!0},_purchaseDetailHeader:{type:String,state:!0},_dataPersist:{type:Object,state:!0}}}static get styles(){return[Qe,V.light,Z.light,z.light,pe.light,G.light,B.light,ie.light,oe.light,$e.light,p.light,S.light,m("card-transaction-servicing-finance-payment-dashboard-shared-styles")]}constructor(){super(),this.config={header:{text:this.t("card-transaction-servicing-finance-payment-dashboard-deferred-purchases"),accessibilityTextIconLeftPrimary:this.t("card-transaction-servicing-finance-payment-dashboard-accessibility-icon-left-primary"),iconLeftPrimary:X(),position:"fixed"},headerFixed:!0},this._retriesConfig={GETFINANCINGDETAILS:0,GETMICROLOANS:0,GETMICROLOAN:0,POSTTRANSACTIONS:0},this._closeModalListeners={GETFINANCINGDETAILS_RETRY:()=>this.closeOperative(),GETFINANCINGDETAILS_EXIT:()=>this.closeOperative(),GETMICROLOAN_RETRY:()=>this.__resetProps({id:"GETMICROLOAN"}),GETMICROLOAN_EXIT:()=>this.__resetProps({id:"GETMICROLOAN"}),GETMICROLOANS_EXIT:()=>this.closeOperative(),POSTTRANSACTIONS_EXIT:()=>this.closeOperative()},this.host="",this.requiredToken="",this.native=!1,this.accountName="",this.accountNumber="",this.globalUser={},this.userName="",this.language="",this.flexibleFinancingsApiVersion="0",this.customersApiVersion="0",this.constantsIds={},this.pageSize=0,this._initialized=!1,this.relatedContract="",this.productId="",this.subProductId="",this.hideDeferPurchases=!1,this.hideAdvancePayment=!1,this.hideAccountStatus=!1,this.hideMonthlyPayment=!1,this.hideCancelLine=!1,this.hideOverduePayment=!1,this._responseMicroloan={},this._responsePayments=[],this._responseTransactions=[],this._responseSettings={},this._modalInfoConfig={},this._modalInfoVisible=!1,this._loading=!1,this._settingsAmount=0,this._operatives=[],this._cantDefer=!1,this._modalSeeMoreVisible=!1,this._overduePayments=!1,this._lineDetailVisible=!1,this._errorConfig={},this._errorVisible=!1,this._posttransactionsErrorVisible=!1,this._getmicroloansErrorVisible=!1,this.maxRetries=3,this._tabItems=[{title:this.t("card-transaction-servicing-finance-payment-dashboard-deferred")},{title:this.t("card-transaction-servicing-finance-payment-dashboard-deferrable")}],this._getmicroloansLoadingMovements=!1,this._posttransactionsLoadingMovements=!1,this._deferredPaginationKey="0",this._deferredPaginationKeyFilter="0",this._deferrablePaginationKey="0",this._movements=[{name:"card-transaction-servicing-finance-payment-dashboard-detail-completed",status:!0,id:"SETTLED"},{name:"card-transaction-servicing-finance-payment-dashboard-in-progress",status:!0,id:"ACTIVE"}],this._purchaseSelected={},this._purchaseId="",this._operationNumber="",this._viewAllDeferredMovementsVisible=!1,this._viewAllDeferrableMovementsVisible=!1,this._filterMovementsVisible=!1,this._filterResultsVisible=!1,this._filterParams=[],this._filterOptions=[],this._microloansPagination={},this._microloansPaginationFilter={},this._transactionsPagination={},this._isFilterMode=!1,this._movementsSelectedVisible=0,this.financingData={},this._scrollBottom=!1,this._purchaseDetailHeader="",this._dataPersist={}}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._loading=!0,this._getmicroloansLoadingMovements=!0,this._posttransactionsLoadingMovements=!0,this._addListeners()}closeOperative(){lt(this,"close-operative")}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._removeListeners()}async init(){var e;this._loading=!0,this._getmicroloansLoadingMovements=!0,this._posttransactionsLoadingMovements=!0,await this.updateComplete,this._initialized=!0,this.history=["paymentDashboard"],lt(this,"get-account-data",null===(e=this.financingData)||void 0===e?void 0:e.cardId)}reset(){this._retriesConfig={GETFINANCINGDETAILS:0,GETMICROLOANS:0,GETMICROLOAN:0,POSTTRANSACTIONS:0},this._initialized=!1,this.relatedContract="",this._responseMicroloans=[],this._responseMicroloansFiltered=[],this._responseMicroloan={},this._responsePayments=[],this._responseTransactions=[],this._responseSettings={},this._modalInfoConfig={},this._modalInfoVisible=!1,this._loading=!0,this._settingsAmount=0,this._operatives=[],this._cantDefer=!1,this._modalSeeMoreVisible=!1,this._overduePayments=!1,this._lineDetailVisible=!1,this._errorConfig={},this._errorVisible=!1,this._posttransactionsErrorVisible=!1,this._getmicroloansErrorVisible=!1,this.maxRetries=3,this._getmicroloansLoadingMovements=!0,this._posttransactionsLoadingMovements=!0,this._deferredPaginationKey="0",this._deferredPaginationKeyFilter="0",this._deferrablePaginationKey="0",this._purchaseSelected={},this._purchaseId="",this._operationNumber="",this._viewAllDeferredMovementsVisible=!1,this._viewAllDeferrableMovementsVisible=!1,this._filterMovementsVisible=!1,this._filterResultsVisible=!1,this._filterParams=[],this._filterOptions=[],this._microloansPagination={},this._microloansPaginationFilter={},this._transactionsPagination={},this._isFilterMode=!1,this._movementsSelectedVisible=0,this._scrollBottom=!1,this._purchaseDetailHeader="",this._dataPersist={}}updated(e){var t,a,i,n,s,r;(super.updated(e),e.has("financingData")&&Object.keys(this.financingData).length>0)&&(0!==Object.keys(this.globalUser).length?this.userName=`${null===(t=this.globalUser)||void 0===t?void 0:t.firstName} ${null===(a=this.globalUser)||void 0===a?void 0:a.lastName}`:this._customersDm.getCustomers());e.has("_initialized")&&this._initialized&&(this._financingLineDm.getFinancingLine(null===(i=this.financingData)||void 0===i?void 0:i.financingLineId),lt(this,"initialize"));e.has("_responseFinancingLine")&&0!==Object.keys(this._responseFinancingLine).length&&(this._loading=!1,this._overduePayments=(null===(n=this._responseFinancingLine.lineDetails[null===(s=this.constantsIds)||void 0===s||null===(r=s.lineDetails)||void 0===r?void 0:r.overdueBalance])||void 0===n?void 0:n.amount)>0);if(e.has("_responseSettings")&&0!==Object.keys(this._responseSettings).length){var o,c,d;const e=this._findMinimumBalance();this._settingsAmount=e.formats.minimumAmount.amount,this._cantDefer=(null===(o=this._responseFinancingLine.lineDetails[null===(c=this.constantsIds)||void 0===c||null===(d=c.lineDetails)||void 0===d?void 0:d.availableBalance])||void 0===o?void 0:o.amount)<this._settingsAmount}e.has("_responseMicroloans")&&this._responseMicroloans.length>0&&(this._getmicroloansLoadingMovements=!1),e.has("_purchaseId")&&""!==this._purchaseId&&this._microloanDm.getMicroloan(this._purchaseId,{expand:"transactions"}),e.has("_responseMicroloan")&&0!==Object.keys(this._responseMicroloan).length&&(this._purchaseDetailHeader=""!==this._purchaseSelected.concept?this._purchaseSelected.concept:this.t("card-transaction-servicing-finance-payment-dashboard-concept-purchase"),this._handleNavigationFlow({routeName:"purchaseDetail"}),this._microloanPaymentsDm.getMicroloanScheduledInstallments(this._purchaseId)),e.has("_responseTransactions")&&this._responseTransactions.length>0&&(this._posttransactionsLoadingMovements=!1)}_addListeners(){this.addEventListener("header-main-icon-left-primary-click",this._popLatestRoute)}_changeFilterOptions({detail:e}){this._deferredPaginationKeyFilter="0",this._filterParams=e.params.filterParams,this._getMicroloansMovementsFilter(this._filterParams)}static _cleanMicroloansDetail(e){return e.filter((e=>"CANCELLED"!==e.status.id))}_closeModal(e){this[`_${e}Visible`]=!1}_commonModalActions(e){return{veilClick:this._closeModalListeners[e],footerLinkClick:this._closeModalListeners[e],headerPrimaryClick:this._closeModalListeners[e]}}get _customersApi(){return v`
      <bbva-global-customers-api-dm
        id="customersDm"
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @customers-api-dm-fetch="${this._setGlobalUser}"
      >
      </bbva-global-customers-api-dm>
    `}get _customersDm(){return this.__customersDm||(this.__customersDm=this.shadowRoot.querySelector(`[data-tag-name="${We.is}"]`)),this.__customersDm}_deferrableMovementClick(e){var t,a,i;const n={id:e,financingLineId:null===(t=this.financingData)||void 0===t?void 0:t.financingLineId,financialId:null===(a=this.financingData)||void 0===a?void 0:a.financingId,cardId:null===(i=this.financingData)||void 0===i?void 0:i.cardId,settings:this._responseSettings};var s,r,o;this._cantDefer&&(n.availableBalance={amounts:null===(s=this._responseFinancingLine)||void 0===s?void 0:s.lineDetails[null===(r=this.constantsIds)||void 0===r||null===(o=r.lineDetails)||void 0===o?void 0:o.availableBalance]});lt(this,"deferrable-purchase-click",n)}_dispatchOperative({detail:e,target:t}){if("operatives-row"===t.id&&3===e)this._modalSeeMoreVisible=!0,lt(this,"more-operatives-open");else if(e!==this._operatives.length-1||this._overduePayments){var a,i,n;const t={operativeId:ct(this._operatives[e].id.replaceAll("-"," ")),financingLineId:null===(a=this.financingData)||void 0===a?void 0:a.financingLineId,financialId:null===(i=this.financingData)||void 0===i?void 0:i.financingId,cardId:null===(n=this.financingData)||void 0===n?void 0:n.cardId,settings:this._responseSettings};var s,r,o;if(0===this._responseTransactions.length||this._cantDefer)t.transactions=this._responseTransactions,t.availableBalance={amounts:null===(s=this._responseFinancingLine)||void 0===s?void 0:s.lineDetails[null===(r=this.constantsIds)||void 0===r||null===(o=r.lineDetails)||void 0===o?void 0:o.availableBalance]};lt(this,`financial-id-${this._operatives[e].id}`,t),lt(this,`financial-id-${this._operatives[e].id}-from-${this._modalSeeMoreVisible?"operatives":"detail"}`)}else this._handleNavigationFlow({routeName:"lineDetail"})}get _financingLineApi(){return v`
      <bbva-global-financing-line-api-dm
        id="financingLineDm"
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @financing-line-api-dm-fetch="${this._setResponseFinancingLine}"
        @financing-line-api-dm-fetch-error="${()=>this._manageError("GETFINANCINGDETAILS")}"
        @api-dm-error="${()=>this._manageError("GETFINANCINGDETAILS")}"
      >
      </bbva-global-financing-line-api-dm>
    `}get _financingLineDetail(){var e,t,a,i,n,s,r,o,c,d,l,m,h,p,u,g,b,f,y,_,x,$,T,S,M,A,k,C,E,P,I,D;return v`
      <div class="financing-line-detail ">
        <bbva-text
          tag="span"
          alignment="center"
          font-weight="500"
          text="${this.t("card-transaction-servicing-finance-payment-dashboard-line-title")}"
        >
        </bbva-text>
        <div class="data-visualitation-size">
          <bbva-data-visualization-bar
            accessibility-text="${this.t("card-transaction-servicing-finance-payment-dashboard-progress-bar-label")}"
            ?loading=${this._loading}
            current-value=${null===(e=this._responseFinancingLine)||void 0===e||null===(t=e.lineDetails[null===(a=this.constantsIds)||void 0===a||null===(i=a.lineDetails)||void 0===i?void 0:i.disposedBalance])||void 0===t?void 0:t.amount}
            max-value=${null===(n=this._responseFinancingLine)||void 0===n||null===(s=n.lineDetails[null===(r=this.constantsIds)||void 0===r||null===(o=r.lineDetails)||void 0===o?void 0:o.grantedAmount])||void 0===s?void 0:s.amount}
          >
          </bbva-data-visualization-bar>
        </div>

        <div class="financing-line-detail-amount">
          <div class="amounts-detail">
            <bbva-amount
              ?loading=${this._loading}
              variant="xl"
              amount=${null===(c=this._responseFinancingLine)||void 0===c||null===(d=c.lineDetails[null===(l=this.constantsIds)||void 0===l||null===(m=l.lineDetails)||void 0===m?void 0:m.disposedBalance])||void 0===d?void 0:d.amount}
              currency-code=${null===(h=this._responseFinancingLine)||void 0===h||null===(p=h.lineDetails[null===(u=this.constantsIds)||void 0===u||null===(g=u.lineDetails)||void 0===g?void 0:g.disposedBalance])||void 0===p?void 0:p.currency}
              local-currency=${null===(b=this._responseFinancingLine)||void 0===b||null===(f=b.lineDetails[null===(y=this.constantsIds)||void 0===y||null===(_=y.lineDetails)||void 0===_?void 0:_.disposedBalance])||void 0===f?void 0:f.currency}
              language=${this.language}
            ></bbva-amount>
            <div class="details-structure">
              <div class="romboide"></div>
              <bbva-text
                class="detail-text-color"
                size="M"
                tag="span"
                text="${this.t("card-transaction-servicing-finance-payment-dashboard-line-dispoused")}"
              ></bbva-text>
            </div>
          </div>

          <div class="amounts-detail">
            <bbva-amount
              ?loading=${this._loading}
              variant="xl"
              amount=${null===(x=this._responseFinancingLine)||void 0===x||null===($=x.lineDetails[null===(T=this.constantsIds)||void 0===T||null===(S=T.lineDetails)||void 0===S?void 0:S.availableBalance])||void 0===$?void 0:$.amount}
              currency-code=${null===(M=this._responseFinancingLine)||void 0===M||null===(A=M.lineDetails[null===(k=this.constantsIds)||void 0===k||null===(C=k.lineDetails)||void 0===C?void 0:C.availableBalance])||void 0===A?void 0:A.currency}
              local-currency=${null===(E=this._responseFinancingLine)||void 0===E||null===(P=E.lineDetails[null===(I=this.constantsIds)||void 0===I||null===(D=I.lineDetails)||void 0===D?void 0:D.availableBalance])||void 0===P?void 0:P.currency}
              language=${this.language}
            ></bbva-amount>
            <div class=" details-structure ">
              <div class="romboide color-gray"></div>
              <bbva-text
                class="detail-text-color"
                size="M"
                tag="span"
                text="${this.t("card-transaction-servicing-finance-payment-dashboard-line-available")}"
              ></bbva-text>
            </div>
          </div>
        </div>
      </div>
    `}get _financingLineDm(){return this.__financingLineDm||(this.__financingLineDm=this.shadowRoot.querySelector(`[data-tag-name="${Te.is}"]`)),this.__financingLineDm}_findMinimumBalance(){return this._responseSettings.find((e=>"PURCHASE_LIMITS_AMOUNT"===e.settingType))}__getErrorConfig({service:e,showRetries:t}){const a=`${e}${t?"_RETRY":"_EXIT"}`,i="GETMICROLOAN"===e;return ht({service:e,...this.__getErrorModalActions({configLabel:a,service:e,showRetries:t,noExit:i})})[a]}__getErrorModalActions({configLabel:e,service:t,showRetries:a,noExit:i=!1}){return{...this._commonModalActions(e),footerButtonClick:this._getFooterButtonAction(a,t,i,e)}}_getFooterButtonAction(e,t,a,i){return e?this._retryService.bind(this,t):a?this._closeModalListeners[i]:this.closeOperative.bind(this)}async _getMicroloansMovements(){var e;await this.updateComplete,this._isFilterMode=!1,this._microloansDm.getMicroloans({"financingLine.id":null===(e=this.financingData)||void 0===e?void 0:e.financingLineId,expand:"transactions",pageSize:this.pageSize,paginationKey:this._deferredPaginationKey})}async _getMicroloansMovementsFilter(e){var t;await this.updateComplete,this._isFilterMode=!0;const a={"financingLine.id":null===(t=this.financingData)||void 0===t?void 0:t.financingLineId,expand:"transactions",pageSize:this.pageSize,paginationKey:this._deferredPaginationKeyFilter};1===(null==e?void 0:e.length)&&Object.assign(a,{"status.id":e.toString().toUpperCase()}),this._microloansDm.getMicroloans(a)}_getSpecificDateLabel(e){let t="";return t=0===e?this.t("card-transaction-servicing-finance-payment-dashboard-detail-doesnt-apply"):1===e?this.t("card-transaction-servicing-finance-payment-dashboard-detail-month",{term:e}):this.t("card-transaction-servicing-finance-payment-dashboard-detail-months",{term:e}),t}async _getTransactionsMovements(){await this.updateComplete,this._transactionsSearchDm.postTransactionsSearch({contract:{id:this.relatedContract},orderBy:"operationDate",pageSize:this.pageSize,paginationKey:this._deferrablePaginationKey})}_handleNavigationFlow(e){const t=this.history[this.history.length-1];null!=e&&e.params&&this._loadNavigationParams(e.routeName,e.params),"paymentDashboard"===t?(this.history.push(e.routeName),this[`_${e.routeName}Visible`]=!0):(this[`_${t}Visible`]=!1,this.history.push(e.routeName),this[`_${e.routeName}Visible`]=!0),"lineDetail"===e.routeName&&lt(this,"line-detail-open"),"filterResults"===e.routeName&&lt(this,"filter-results-open")}_listDeferrableMovements(){return this._posttransactionsErrorVisible?this._renderNotificationMessage(this._errorConfig.id,this._errorConfig.variant,this._errorConfig.titleText,this._errorConfig.descriptionText,this._errorConfig.linkText):this._overduePayments?this._renderNotificationMessage("overdueMessage","error","","card-transaction-servicing-finance-payment-dashboard-overdue-payments-movements-message"):0===this._responseTransactions.length?this._responseEmpty(!1):v`
      <div class="deferrable-list-movements">
        ${this._responseTransactions.map((({date:e,purchases:t})=>t[0].index<=4?v`
                <div class="detail-list">
                  <bbva-text
                    font-weight="500"
                    font-style="italic"
                    size="S"
                    text=${e}
                    tag="span"
                  ></bbva-text>
                  ${this._renderDeferrableMovement(t)}
                </div>
              `:M))}
        ${this._transactionsPagination.totalElements>5?v`
              <div class="view-all-section">
                <bbva-link
                  id="view-all-deferrable-button"
                  @click="${()=>this._handleNavigationFlow({routeName:"viewAllDeferrableMovements"})}"
                  >${this.t("card-transaction-servicing-finance-payment-dashboard-movements-view-all")}</bbva-link
                >
              </div>
            `:M}
      </div>
    `}_listDeferredMovements(){var e,t;return this._getmicroloansErrorVisible?this._renderNotificationMessage(this._errorConfig.id,this._errorConfig.variant,this._errorConfig.titleText,this._errorConfig.descriptionText,this._errorConfig.linkText):0===(null===(e=this._responseMicroloans)||void 0===e?void 0:e.length)?this._responseEmpty(!0):v`
      <div class="list-movements-header">
        <bbva-text
          size="M"
          text="${this.t("card-transaction-servicing-finance-payment-dashboard-last-movements")}"
          font-weight="500"
        ></bbva-text>
        <bbva-link
          id="filter-link"
          @click="${()=>this._handleNavigationFlow({routeName:"filterMovements"})}"
        >
          ${this.t("card-transaction-servicing-finance-payment-dashboard-operative-filter")}
        </bbva-link>
      </div>
      <div class="movements">
        ${null===(t=this._responseMicroloans)||void 0===t?void 0:t.map((({date:e,purchases:t})=>t[0].index<=4?v`
                <bbva-text
                  size="S"
                  font-weight="500"
                  text=${e}
                  font-style="italic"
                  tag="span"
                ></bbva-text>
                ${this._renderDeferredMovement(t)}
              `:M))}
        ${this._microloansPagination.totalElements>5?v`
              <div class="view-all-section">
                <bbva-link
                  id="view-all-deferred-button"
                  @click="${()=>this._handleNavigationFlow({routeName:"viewAllDeferredMovements"})}"
                  >${this.t("card-transaction-servicing-finance-payment-dashboard-movements-view-all")}</bbva-link
                >
              </div>
            `:M}
      </div>
    `}_listSimpleDetail({id:e,textLabelLeft:t,textLabelRight:a,currency:i,isTextOrAmount:n,needButtonHelp:s}){return v`
      <div class="list-item">
        <div class="list-item-detail">
          <bbva-text tag="span" text="${t}" size="S"> </bbva-text>
          ${s?this._renderHelpIconButton(e):M}
        </div>
        ${this._listTextOrAmount({isTextOrAmount:n,textLabelRight:a,currency:i})}
      </div>
    `}_listTextOrAmount({isTextOrAmount:e,textLabelRight:t,currency:a}){return e?v`
          <bbva-text
            class="detail-field-text"
            ?loading=${this._loading}
            tag="span"
            text="${t}"
            size="M"
            font-weight="500"
            font-style="italic"
          ></bbva-text>
        `:v`
          <bbva-amount
            ?loading=${this._loading}
            variant="S"
            class="amount"
            amount="${t}"
            currency-code="${a}"
            local-currency="${a}"
          ></bbva-amount>
        `}_loadNavigationParams(e,t){({filterResults:()=>{this._filterParams=t.filterParams,this._filterOptions=t.filterOptions,this._isFilterMode=!0,this._getMicroloansMovementsFilter(this._filterParams)}})[e]()}_manageError(e){const t=this._retriesConfig[e]<this.maxRetries;"GETMICROLOANS"===e||"POSTTRANSACTIONS"===e?(this[`_${e.toLowerCase()}ErrorVisible`]=!0,this[`_${e.toLowerCase()}LoadingMovements`]=!1):this._errorVisible=!0,this._errorConfig=this.__getErrorConfig({service:e,showRetries:t}),this._retriesConfig[e]+=1}_manageMicroloansPagination({detail:e}){let t="";const a=Object.hasOwn(e.links,"next"),{totalElements:i}=e;if(a){let a=[];e.links.next.split("&").map((e=>(e.includes("paginationKey")&&(a=e.split("paginationKey=")),e))),t=a[a.length-1]}const n={totalElements:i,hasNextPage:a};this._isFilterMode?(this._microloansPaginationFilter=n,this._deferredPaginationKeyFilter=t):(this._microloansPagination=n,this._deferredPaginationKey=t)}_managePagination(e){e.stopPropagation();const{scrollTop:t}=e.detail.target;if(e.detail.target.scrollHeight-t<=e.detail.target.clientHeight+5&&this._scrollBottom){({filterResults:()=>{this._microloansPaginationFilter.hasNextPage&&this._getMicroloansMovementsFilter(this._filterParams)},viewAllDeferredMovements:()=>{this._microloansPagination.hasNextPage&&this._getMicroloansMovements()},viewAllDeferrableMovements:()=>{this._transactionsPagination.hasNextPage&&this._getTransactionsMovements()}})[ct(e.target.id.replaceAll("-"," "))](),this._scrollBottom=!1}}_manageRetryError(e){this._errorVisible=!1,this[`_${e.toLowerCase()}ErrorVisible`]=!1;this[{GETFINANCINGDETAILS:"__retryGetFinancingDetails",GETMICROLOANS:"__retryGetMicroloans",GETMICROLOAN:"__retryGetMicroloan",POSTTRANSACTIONS:"__retryPostTransactions"}[e.toUpperCase()]]()}_manageScrollBottom(e){this._scrollBottom=e.detail}_manageTransactionsPagination({detail:e}){const t=Object.hasOwn(e.links,"next"),{totalElements:a}=e;if(t){let t=[];e.links.next.replaceAll("?","&").split("&").map((e=>(e.includes("paginationKey")&&(t=e.split("paginationKey=")),e))),this._deferrablePaginationKey=t[t.length-1]}this._transactionsPagination={totalElements:a,hasNextPage:t,paginationKey:this._deferrablePaginationKey}}get _microloanApi(){return v`
      <bbva-global-microloan-api-dm
        id="microloanDm"
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @microloan-api-dm-fetch="${this._setMicroloan}"
        @microloan-api-dm-fetch-error="${()=>this._manageError("GETMICROLOAN")}"
        @api-dm-error="${()=>this._manageError("GETMICROLOAN")}"
      >
      </bbva-global-microloan-api-dm>
    `}get _microloansApi(){return v`
      <bbva-global-microloans-api-dm
        id="microloansDm"
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @microloans-api-dm-fetch="${this._setMicroloans}"
        @microloans-api-dm-pagination="${this._manageMicroloansPagination}"
        @microloans-api-dm-fetch-error="${()=>this._manageError("GETMICROLOANS")}"
        @api-dm-error="${()=>this._manageError("GETMICROLOANS")}"
      >
      </bbva-global-microloans-api-dm>
    `}get _microloanDm(){return this.__microloanDm||(this.__microloanDm=this.shadowRoot.querySelector(`[data-tag-name="${Pe.is}"]`)),this.__microloanDm}get _microloansDm(){return this.__microloansDm||(this.__microloansDm=this.shadowRoot.querySelector(`[data-tag-name="${Se.is}"]`)),this.__microloansDm}get _microloanPaymentsApi(){return v`
      <bbva-global-microloan-scheduled-installments-api-dm
        id="microloanPaymentsDm"
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @microloan-scheduled-installments-api-dm-fetch="${this._setPayments}"
      >
      </bbva-global-microloan-scheduled-installments-api-dm>
    `}get _microloanPaymentsDm(){return this.__microloanPaymentsDm||(this.__microloanPaymentsDm=this.shadowRoot.querySelector(`[data-tag-name="${Ie.is}"]`)),this.__microloanPaymentsDm}get _modalError(){return v`
      <error-modal
        ?visible="${this._errorVisible}"
        .modalConfig="${this._errorConfig}"
      ></error-modal>
    `}get _modalInfo(){var e,t;return v`
      <info-modal
        .modalConfig=${this._modalInfoConfig}
        .visible=${this._modalInfoVisible}
        .settingsAmount=${this._settingsAmount}
        .cutOffDay=${null===(e=this._responseFinancingLine)||void 0===e||null===(t=e.cutOffDate)||void 0===t?void 0:t.substring(0,2)}
        @help-modal-close=${()=>this._closeModal("modalInfo")}
      ></info-modal>
    `}_openModalInfo(e){this._modalInfoConfig=mt()[e],this._modalInfoVisible=!0,lt(this,`modal-info-${e}-open`)}get _operativesRow(){let e=[];return this._validateOperatives(this._overduePayments?"overdue":"commons"),e=this._translateOperatives(),e.length>3&&(e.splice(3,e.length),e.push({icon:ce(),label:this.t("card-transaction-servicing-finance-payment-dashboard-operative-more"),id:"show-more"})),v`
      <bbva-button-row
        id="operatives-row"
        ?loading=${this._loading}
        .options="${e}"
        @button-row-item-click="${this._dispatchOperative}"
      ></bbva-button-row>
    `}static _parseFinancingLine(e){const t=dt(e.cutOffDate,"DD MMM").replace(".",""),a=e.nextPaymentDate?dt(e.nextPaymentDate,"DD MMM").replace(".",""):"",{product:i}=e,n=e.number,s={};e.formats.map((e=>(s[e.numberType.id]=e.number,e)));const r={};e.balances.map((e=>(r[e.id]={amount:e.amounts[0].amount,currency:e.amounts[0].currency},e))),e.specificAmounts.map((e=>(r[e.id]={amount:e.amounts[0].amount,currency:e.amounts[0].currency},e)));const o={};return e.specificDates.map((e=>(o[e.specificDateType]={term:e.term,termType:e.termType},e))),{cutOffDate:t,nextPaymentDate:a,lineDetails:r,specificDates:o,product:i,productNumber:n,format:s}}get _paymentsDetail(){var e,t,a,i,n,s,r,o,c,d,l,m;return v`
      <div class="financial-statement">
        <bbva-header-category
          heading-level="2"
          text="${this.t("card-transaction-servicing-finance-payment-dashboard-payment-detail")}"
        ></bbva-header-category>
        <div class="financial-statement-details">
          ${this._listSimpleDetail({textLabelLeft:this.t("card-transaction-servicing-finance-payment-dashboard-payment-detail-amount"),textLabelRight:null===(e=this._responseFinancingLine)||void 0===e||null===(t=e.lineDetails[null===(a=this.constantsIds)||void 0===a||null===(i=a.lineDetails)||void 0===i?void 0:i.totalInstallmentMonthlyAmount])||void 0===t?void 0:t.amount,currency:null===(n=this._responseFinancingLine)||void 0===n||null===(s=n.lineDetails[null===(r=this.constantsIds)||void 0===r||null===(o=r.lineDetails)||void 0===o?void 0:o.totalInstallmentMonthlyAmount])||void 0===s?void 0:s.currency,isTextOrAmount:!1,needButtonHelp:!1})}
          ${this._listSimpleDetail({textLabelLeft:this.t("card-transaction-servicing-finance-payment-dashboard-detail-month-detail"),textLabelRight:this._getSpecificDateLabel(null===(c=this._responseFinancingLine)||void 0===c||null===(d=c.specificDates[null===(l=this.constantsIds)||void 0===l||null===(m=l.specificDates)||void 0===m?void 0:m.lastPaymentLength])||void 0===d?void 0:d.term),isTextOrAmount:!0,needButtonHelp:!1})}
        </div>
      </div>
    `}get _paymentsResume(){var e,t,a,i,n,s,r,o,c,d;return v`
      <div class="list">
        ${this._listSimpleDetail({needButtonHelp:!1,textLabelLeft:this.t("card-transaction-servicing-finance-payment-dashboard-list-credit-limit"),textLabelRight:null===(e=this._responseFinancingLine)||void 0===e||null===(t=e.lineDetails[null===(a=this.constantsIds)||void 0===a||null===(i=a.lineDetails)||void 0===i?void 0:i.grantedAmount])||void 0===t?void 0:t.amount,currency:null===(n=this._responseFinancingLine)||void 0===n||null===(s=n.lineDetails[null===(r=this.constantsIds)||void 0===r||null===(o=r.lineDetails)||void 0===o?void 0:o.grantedAmount])||void 0===s?void 0:s.currency,isTextOrAmount:!1})}
        ${this._listSimpleDetail({id:"cutOffDate",needButtonHelp:!0,textLabelLeft:this.t("card-transaction-servicing-finance-payment-dashboard-list-cut-of-date"),isTextOrAmount:!0,textLabelRight:null===(c=this._responseFinancingLine)||void 0===c?void 0:c.cutOffDate})}
        ${this._listSimpleDetail({id:"nextPaymentDate",needButtonHelp:!0,textLabelLeft:this.t("card-transaction-servicing-finance-payment-dashboard-list-next-payment-day"),isTextOrAmount:!0,textLabelRight:null===(d=this._responseFinancingLine)||void 0===d?void 0:d.nextPaymentDate})}
        <bbva-notification-help
          ?loading=${this._loading}
          data-acoustic-obfuscate
          icon=${se()}
          text=${this.t("card-transaction-servicing-finance-payment-dashboard-help-line",{number:this.accountNumber.slice(-4)})}
        ></bbva-notification-help>
        ${this._validateFinancingLineStatus()}
      </div>
    `}_persistData({detail:e}){Object.assign(this._dataPersist,e),lt(this,`${e.target}-interaction`,this._dataPersist)}_popLatestRoute(){if(void 0!==this.history&&this.history.length>0){if("paymentDashboard"===this.history[this.history.length-1])return void this.closeOperative();const e=this.history.pop(),t=this.history[this.history.length-1];this.__resetProps({id:e}),this[`_${e}Visible`]=!1,this[`_${t}Visible`]=!0}}_removeListeners(){this.removeEventListener("header-main-icon-left-primary-click",(()=>this._popLatestRoute()))}get _renderDashboard(){var e;return v`
      <div class="wrapper bg-color-principal">
        ${this._financingLineDetail} ${this._paymentsResume}
      </div>
      ${this._operativesRow}
      <bbva-divider></bbva-divider>
      ${this._paymentsDetail}
      <bbva-transition-container id="line-detail" ?visible="${this._lineDetailVisible}">
        <div slot="slot-content">
          <line-detail
            id="lineDetail"
            .lineDetail="${this._responseFinancingLine}"
            .userName="${this.userName}"
            .accountName="${this.accountName}"
            .accountNumber="${this.accountNumber}"
            .clabeId="${null===(e=this.constantsIds)||void 0===e?void 0:e.clabe}"
          ></line-detail>
        </div>
      </bbva-transition-container>
    `}_renderDeferrableMovement(e){return e.map(((t,a)=>{var i,n,s,r,o,c,d,l,m;return a<=4?v`
            <div>
              <div class="list-movements">
                <div class="movements-detail">
                  <bbva-link size="M" @click="${()=>this._deferrableMovementClick(t.id)}"
                    >${t.name}</bbva-link
                  >
                  <bbva-amount
                    variant="l"
                    amount="${null===(i=t.amount[null===(n=this.constantsIds)||void 0===n||null===(s=n.specific)||void 0===s?void 0:s.totalAmount])||void 0===i?void 0:i.amounts[0].amount}"
                    currency-code="${null===(r=t.amount[null===(o=this.constantsIds)||void 0===o||null===(c=o.specific)||void 0===c?void 0:c.totalAmount])||void 0===r?void 0:r.amounts[0].currency}"
                    local-currency="${null===(d=t.amount[null===(l=this.constantsIds)||void 0===l||null===(m=l.specific)||void 0===m?void 0:m.totalAmount])||void 0===d?void 0:d.amounts[0].currency}"
                    language="${this.language}"
                  ></bbva-amount>
                </div>
              </div>
            </div>
            <bbva-divider size=${a===e.length-1?"full":"fit"}></bbva-divider>
          `:M}))}_renderDeferredMovement(e){const t=this._movements.reduce(((e,t)=>{const a=t.id,i={...e};return i[a]||(i[a]=[]),i[a].push(t),i}),{});return e.map((e=>{var a,i,n,s,r,o,c,d,l,m,h,p,u,g,b,f,y,_,x,$,T,S,A,k,C,E,P,I,D,L,w,R,O,N,F;return e.index<=4?v`
            <div class="one-movement">
              <div class="detail">
                <bbva-link
                  id=${e.id}
                  @click="${()=>{this._setPurchaseSelected(e)}}"
                  >${""===e.concept?this.t("card-transaction-servicing-finance-payment-dashboard-concept-purchase"):e.concept}</bbva-link
                >
                <bbva-text
                  class=${this.t(t[e.status][0].name)===this.t("card-transaction-servicing-finance-payment-dashboard-detail-completed")?"success-text-color":"default-text-color"}
                  font-style="italic"
                  text="${t[e.status][0].name}"
                  tag="span"
                ></bbva-text>
              </div>
              ${"SETTLED"===e.status?v`
                    <bbva-text
                      text="${this.t("card-transaction-servicing-finance-payment-dashboard-deferred-finish-status")}"
                      tag="span"
                      size="S"
                      font-weight="350"
                      class="end-date"
                    ></bbva-text>
                  `:v`
                    <bbva-text
                      text="${this.t("card-transaction-servicing-finance-payment-dashboard-end-date-purchase",{date:e.end})}"
                      tag="span"
                      size="S"
                      font-weight="350"
                      class="end-date"
                    ></bbva-text>
                  `}
              <bbva-data-visualization-bar
                accessibility-text="${this.t("card-transaction-servicing-finance-payment-dashboard-progress-bar-label")}"
                current-value="${null===(a=e.custom)||void 0===a||null===(i=a.PAYMENTS_DETAIL)||void 0===i||null===(n=i.paidAmount)||void 0===n?void 0:n.amount}"
                max-value="${null===(s=e.specific[null===(r=this.constantsIds)||void 0===r||null===(o=r.specific)||void 0===o?void 0:o.microloanAmount][0])||void 0===s?void 0:s.amount}"
              >
              </bbva-data-visualization-bar>

              <div class="detail">
                <div class="resumen-detail">
                  <bbva-text
                    text="${this.t("card-transaction-servicing-finance-payment-dashboard-paid-purchase")}"
                    tag="span"
                    size="XS"
                  ></bbva-text>
                  <bbva-amount
                    variant="s"
                    amount="${null===(c=e.custom)||void 0===c||null===(d=c.PAYMENTS_DETAIL)||void 0===d||null===(l=d.paidAmount)||void 0===l?void 0:l.amount}"
                    currency-code="${null===(m=e.custom)||void 0===m||null===(h=m.PAYMENTS_DETAIL)||void 0===h||null===(p=h.paidAmount)||void 0===p?void 0:p.currency}"
                    local-currency="${null===(u=e.custom)||void 0===u||null===(g=u.PAYMENTS_DETAIL)||void 0===g||null===(b=g.paidAmount)||void 0===b?void 0:b.currency}"
                  ></bbva-amount>
                </div>

                <div class="resumen-detail">
                  <bbva-text
                    text="${this.t("card-transaction-servicing-finance-payment-dashboard-total-purchase")}"
                    tag="span"
                    size="XS"
                  ></bbva-text>
                  <bbva-amount
                    variant="s"
                    amount="${null===(f=e.specific[null===(y=this.constantsIds)||void 0===y||null===(_=y.specific)||void 0===_?void 0:_.microloanAmount][0])||void 0===f?void 0:f.amount}"
                    currency-code="${null===(x=e.specific[null===($=this.constantsIds)||void 0===$||null===(T=$.specific)||void 0===T?void 0:T.microloanAmount][0])||void 0===x?void 0:x.currency}"
                    local-currency="${null===(S=e.specific[null===(A=this.constantsIds)||void 0===A||null===(k=A.specific)||void 0===k?void 0:k.microloanAmount][0])||void 0===S?void 0:S.currency}"
                    language="${this.language}"
                  ></bbva-amount>
                </div>
              </div>

              <div class="resumen-detail variant">
                <div class="resume-detail-pending">
                  <bbva-text
                    text="${this.t("card-transaction-servicing-finance-payment-dashboard-line-detail-pending-amount")}"
                    tag="span"
                    size="XS"
                  ></bbva-text>
                  <bbva-amount
                    variant="s"
                    amount="${null===(C=e.custom)||void 0===C||null===(E=C.PAYMENTS_DETAIL)||void 0===E||null===(P=E.pendingAmount)||void 0===P?void 0:P.amount}"
                    currency-code="${null===(I=e.custom)||void 0===I||null===(D=I.PAYMENTS_DETAIL)||void 0===D||null===(L=D.pendingAmount)||void 0===L?void 0:L.currency}"
                    local-currency="${null===(w=e.custom)||void 0===w||null===(R=w.PAYMENTS_DETAIL)||void 0===R||null===(O=R.pendingAmount)||void 0===O?void 0:O.currency}"
                    language="${this.language}"
                  ></bbva-amount>
                </div>
                <bbva-text
                  font-weight="500"
                  text="${this.t("card-transaction-servicing-finance-payment-dashboard-installments-purchase",{paid:null===(N=e.custom)||void 0===N||null===(F=N.INSTALLMENTS_DETAIL)||void 0===F?void 0:F.paidInstallments,total:e.totalInstallments})}"
                  tag="span"
                  size="S"
                ></bbva-text>
              </div>
            </div>
            <bbva-divider></bbva-divider>
          `:M}))}get _renderGlobalApis(){return v`
      ${this._financingLineApi} ${this._settingsApi} ${this._microloansApi} ${this._microloanApi}
      ${this._microloanPaymentsApi} ${this._transactionsSerachApi}
    `}_renderHelpIconButton(e){return v`
      <bbva-button-default
        id="${e}"
        variant="icon no-background"
        icon-size="24"
        icon="${A()}"
        aria-label="${e}"
        @click="${()=>this._openModalInfo(e)}"
      ></bbva-button-default>
    `}get _renderListMovements(){var e,t;return v`
      ${this._renderTabOptions}
      <bbva-transition-container id="purchase-detail" ?visible="${this._purchaseDetailVisible}">
        <div slot="slot-content">
          <purchase-detail
            id="purchaseDetail"
            .headerLabel=${this._purchaseDetailHeader}
            .operationNumber=${this._operationNumber}
            .responsePayments="${this._responsePayments}"
            .responseMicroloans="${this._purchaseSelected}"
            .accountName="${this.accountName}"
            .accountNumber="${this.accountNumber}"
            .language="${this.language}"
            .constantsIds="${this.constantsIds}"
            @card-transaction-servicing-finance-payment-dashboard-share-purchase-detail="${this._getShareTemplate}"
            @card-transaction-servicing-finance-payment-dashboard-purchase-persist-data="${this._persistData}"
          >
          </purchase-detail>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="view-all-deferred-movements"
        ?visible="${this._viewAllDeferredMovementsVisible}"
        @transition-container-scroll="${e=>this._managePagination(e)}"
      >
        <div slot="slot-content">
          <deferred-movements
            id="viewAllDeferredMovements"
            ?loading="${null===(e=this._microloansPagination)||void 0===e?void 0:e.hasNextPage}"
            .movements="${this._movements}"
            .pagination="${this._microloansPagination}"
            .microloansMovements="${this._responseMicroloans}"
            .language="${this.language}"
            .constantsIds="${this.constantsIds}"
            @card-transaction-servicing-finance-payment-dashboard-deferred-movements-persist="${this._manageScrollBottom}"
            @card-transaction-servicing-finance-payment-dashboard-show-filter-movements="${e=>this._handleNavigationFlow(e.detail)}"
            @card-transaction-servicing-finance-payment-dashboard-show-purchase-detail="${e=>this._setPurchaseSelected(e.detail)}"
          ></deferred-movements>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="view-all-deferrable-movements"
        ?visible="${this._viewAllDeferrableMovementsVisible}"
        @transition-container-scroll="${e=>this._managePagination(e)}"
      >
        <div slot="slot-content">
          <deferrable-movements
            id="viewAllDeferrableMovements"
            ?loading="${null===(t=this._transactionsPagination)||void 0===t?void 0:t.hasNextPage}"
            .language="${this.language}"
            .responseTransactions="${this._responseTransactions}"
            .constantsIds="${this.constantsIds}"
            @card-transaction-servicing-finance-payment-dashboard-purchase-click="${({detail:e})=>this._deferrableMovementClick(e)}"
            @card-transaction-servicing-finance-payment-dashboard-deferrable-movements-persist="${this._manageScrollBottom}"
          ></deferrable-movements>
        </div>
      </bbva-transition-container>
      ${this._viewAllDeferrableMovements}
    `}static _renderLoaders(){return v`
      <div>
        <div class="loader">
          <div class="skeleton"></div>
        </div>
        <bbva-divider></bbva-divider>
      </div>
    `}_renderNotificationMessage(e,t,a,i,n=""){return v`
      <div class="${t}">
        <bbva-notification-message
          id="${e}"
          variant="${t}"
          message-title="${this.t(a)}"
          message="${this.t(i)}"
          link-title="${this.t(n)}"
          @notification-message-link-click="${()=>"error"===t?this._retryService(e):this._openModalInfo(e)}"
        ></bbva-notification-message>
      </div>
    `}get _renderTabOptions(){return this.hideDeferPurchases?v`
          <div class="wrapper bg-color-secondary">
            ${this._getmicroloansLoadingMovements?At._renderLoaders():this._listDeferredMovements()}
          </div>
        `:v`
          <bbva-tab-default .options=${this._tabItems} id="tab-default" selected="0">
            <div class="panel" role="tabpanel" id="content-0" aria-labelledby="tab-0">
              <div class="wrapper bg-color-secondary">
                ${this._getmicroloansLoadingMovements?At._renderLoaders():this._listDeferredMovements()}
              </div>
            </div>
            <div class="panel" role="tabpanel" id="content-1" aria-labelledby="tab-1">
              <div class="wrapper bg-color-secondary">
                ${this._posttransactionsLoadingMovements?At._renderLoaders():this._listDeferrableMovements()}
              </div>
            </div>
          </bbva-tab-default>
        `}__resetProps(e){({GETMICROLOAN:()=>{this._purchaseId="",this._operationNumber="",this._retriesConfig[e.id]=0,this._errorVisible=!1},FILTERMOVEMENTS:()=>{this._deferredPaginationKeyFilter="0",this._scrollBottom=!0,this._isFilterMode=!1},FILTERRESULTS:()=>{this._deferredPaginationKeyFilter="0",this._scrollBottom=!0,this._filterOptions=[],this._filterParams=[]},PURCHASEDETAIL:()=>{this._purchaseId="",this._operationNumber="",this._purchaseDetailHeader="",this._responseMicroloan={},this._purchaseDetailVisible=!1,this._dataPersist={}},LINEDETAIL:()=>{},VIEWALLDEFERREDMOVEMENTS:()=>{this._deferredPaginationKey="0",this._scrollBottom=!0,this._getmicroloansLoadingMovements=!0,this._getMicroloansMovements()},VIEWALLDEFERRABLEMOVEMENTS:()=>{this._deferrablePaginationKey="0",this._scrollBottom=!0,this._posttransactionsLoadingMovements=!0,this._getTransactionsMovements()},PAYMENTDASHBOARD:()=>{this.reset()}})[e.id.toUpperCase()]()}_responseEmpty(e){return v`
      <div class="image">
        ${v`
          <span class="empty-state" aria-hidden="true">
            <bbva-clip-microillustration
              microillustration="emptystateday"
              size="XL"
            ></bbva-clip-microillustration>
          </span>
        `}
      </div>
      <div class="empty-description">
        <bbva-text
          text="${e?this.t("card-transaction-servicing-finance-payment-dashboard-deferred-empty-header"):this.t("card-transaction-servicing-finance-payment-dashboard-deferrable-empty-header")}"
          font-weight="500"
          tag="span"
          alignment="center"
        ></bbva-text>
        <bbva-text
          text="${this.t("card-transaction-servicing-finance-payment-dashboard-movements-list-empty-text",{amount:this._settingsAmount})}"
          tag="span"
          alignment="center"
        ></bbva-text>
      </div>
    `}__retryGetFinancingDetails(){var e;this._financingLineDm.getFinancingLine(null===(e=this.financingData)||void 0===e?void 0:e.financingLineId)}__retryGetMicroloan(){this._microloanDm.getMicroloan(this._purchaseId,{expand:"transactions"})}__retryGetMicroloans(){this._getMicroloansMovements()}__retryPostTransactions(){this._getTransactionsMovements()}_retryService(e){if(!this[`_${e.toLowerCase()}ErrorVisible`]||"getMicroloans"!==e&&"postTransactions"!==e)this._manageRetryError(e);else{this[`_${e.toLowerCase()}LoadingMovements`]=!0;this._retriesConfig[e.toUpperCase()]<this.maxRetries+1?this._manageRetryError(e):this.closeOperative()}}get _seeMoreModal(){return v`
      <see-more-modal
        id="see-more-modal"
        .operatives="${this._translateOperatives()}"
        @help-modal-close="${()=>this._closeModal("modalSeeMore")}"
        @card-transaction-servicing-finance-payment-dashboard-see-more-modal-close="${()=>this._closeModal("modalSeeMore")}"
        @card-transaction-servicing-finance-payment-dashboard-operative-select="${this._dispatchOperative}"
        ?visible="${this._modalSeeMoreVisible}"
      >
      </see-more-modal>
    `}_setGlobalUser({detail:e}){this.userName=`${e.firstName} ${e.lastName}`}async _setMicroloan({detail:e}){var t,a,i,n,s,r,o,c;const d={};e.specificAmounts.map((e=>(d[e.id]=e,e))),Object.assign(this._purchaseSelected,{microloanAmountWithoutFees:{amount:null===(t=d[null===(i=this.constantsIds)||void 0===i||null===(n=i.fees)||void 0===n?void 0:n.microloanAmountWithoutFees])||void 0===t||null===(a=t.amounts[0])||void 0===a?void 0:a.amount,currency:null===(s=d[null===(o=this.constantsIds)||void 0===o||null===(c=o.fees)||void 0===c?void 0:c.microloanAmountWithoutFees])||void 0===s||null===(r=s.amounts[0])||void 0===r?void 0:r.currency}}),this._responseMicroloan=e,this._operationNumber=e.operationTracking.operationNumber.substring(6,24),await this.updateComplete}async _setMicroloans({detail:e}){if(null===e)this._getmicroloansLoadingMovements=!1,this._isFilterMode?this._responseMicroloansFiltered=[]:this._responseMicroloans=[];else{const t=At._cleanMicroloansDetail(e).map(((e,t)=>{const a=e.creationDate,i={},n={},s={};return e.customBalances.map((e=>(i[e.balanceType]=e,e))),e.specificAmounts.map((e=>(n[e.id]=e.amounts,e))),e.fees.itemizeFees.map((e=>(s[e.feeType]={},e.itemizeFeeUnits.map((t=>(s[e.feeType][t.unitType]=t,t))),e))),{index:t,id:e.id,date:dt(a,"DD MMMM YYYY"),time:dt(a,"HH:mm"),totalInstallments:e.terms.number,end:dt(e.maturityDate,"DD/MM/YY"),custom:i,specific:n,status:e.status.id,concept:e.transactions.length>1?"":e.transactions[0].concept,terms:e.terms,fees:s,transactions:e.transactions}})).reduce(((e,t)=>{const a=t.date,i={...e};return i[a]||(i[a]=[]),i[a].push(t),i}),{}),a=Object.keys(t),i=[];a.map((e=>(i.push({date:e,purchases:t[e]}),e))),this._isFilterMode?this._responseMicroloansFiltered=[...i]:this._responseMicroloans=[...i]}await this.updateComplete}async _setPayments({detail:e}){const t=[],a={};null!=e&&e.installments&&e.installments.map((e=>{var i,n,s,r,o,c,d,l,m,h,p,v;return e.specificAmounts.map((e=>(a[e.id]=e,e))),t.push({date:rt(dt(e.deadline,"LL").split(" ")[2]),status:e.status.id,paymentAmount:{amount:(null===(i=a[null===(n=this.constantsIds)||void 0===n||null===(s=n.specific)||void 0===s?void 0:s.paymentAmount])||void 0===i?void 0:i.amounts[0].amount)>0?null===(r=a[null===(o=this.constantsIds)||void 0===o||null===(c=o.specific)||void 0===c?void 0:c.paymentAmount])||void 0===r?void 0:r.amounts[0].amount:null===(d=a[null===(l=this.constantsIds)||void 0===l||null===(m=l.specific)||void 0===m?void 0:m.installmentAmount])||void 0===d?void 0:d.amounts[0].amount,currency:null===(h=a[null===(p=this.constantsIds)||void 0===p||null===(v=p.specific)||void 0===v?void 0:v.installmentAmount])||void 0===h?void 0:h.amounts[0].currency}}),e})),this._responsePayments=[...t],await this.updateComplete}_setPurchaseSelected(e){this._purchaseId=e.id,this._purchaseSelected=e}async _setResponseFinancingLine(e){if(Object.hasOwn(e.detail,"relatedContracts")){var t;const a={};e.detail.relatedContracts.map((e=>(a[e.relationType.id]=e,e))),this.relatedContract=null==a||null===(t=a.CHARGE_ACCOUNT)||void 0===t?void 0:t.id}this._responseFinancingLine=At._parseFinancingLine(e.detail),this._settingsDm.getSettings({"product.id":this.productId,"product.subproduct.id":this.subProductId}),this._getMicroloansMovements(),this._getTransactionsMovements(),lt(this,"financing-line-response",e.detail),await this.updateComplete}_setSettings({detail:e}){this._responseSettings=e}get _settingsApi(){return v`
      <bbva-global-settings-api-dm
        id="settingsDm"
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @settings-api-dm-fetch="${this._setSettings}"
      >
      </bbva-global-settings-api-dm>
    `}get _settingsDm(){return this.__settingsDm||(this.__settingsDm=this.shadowRoot.querySelector(`[data-tag-name="${Me.is}"]`)),this.__settingsDm}async _setTransactions({detail:e}){if(null===e)this._posttransactionsLoadingMovements=!1,this._responseTransactions=[];else{const t=[],a=e.map(((e,t)=>{const a=e.operationDate.split("T"),i={};return e.specificAmounts.forEach((e=>{i[e.id]=e})),{index:t,id:e.id,date:dt(a[0],"DD MMMM YYYY"),name:e.concept,amount:i}})).reduce(((e,t)=>{const a=t.date,i={...e};return i[a]||(i[a]=[]),i[a].push(t),i}),{});Object.keys(a).forEach((e=>{t.push({date:e,purchases:a[e]})})),this._responseTransactions=[...t]}await this.updateComplete}get _transactionsSerachApi(){return v`
      <bbva-global-transactions-search-api-dm
        id="transactionsSearchDm"
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @transactions-search-api-dm-fetch="${this._setTransactions}"
        @transactions-search-api-dm-pagination="${this._manageTransactionsPagination}"
        @transactions-search-api-dm-fetch-error="${()=>this._manageError("POSTTRANSACTIONS")}"
        @api-dm-error="${()=>this._manageError("POSTTRANSACTIONS")}"
      >
      </bbva-global-transactions-search-api-dm>
    `}get _transactionsSearchDm(){return this.__transactionsSearchDm||(this.__transactionsSearchDm=this.shadowRoot.querySelector(`[data-tag-name="${Ae.is}"]`)),this.__transactionsSearchDm}_translateOperatives(){const e=[];return this._operatives.map((({icon:t,label:a,id:i})=>(e.push({icon:t,label:this.t(a),id:i}),i))),e}_validateFinancingLineStatus(){let e={};return this._overduePayments&&(e={id:"overduePayments",variant:"error",titleText:"card-transaction-servicing-finance-payment-dashboard-notification-help-overdue-payments-error",descriptionText:"card-transaction-servicing-finance-payment-dashboard-notification-help-overdue-payments"}),this._cantDefer&&(e={id:"cantDefer",variant:"info",titleText:"",descriptionText:"card-transaction-servicing-finance-payment-dashboard-notification-help-know-more-info",linkText:"card-transaction-servicing-finance-payment-dashboard-notification-help-know-more"}),0!==Object.keys(e).length?this._renderNotificationMessage(e.id,e.variant,e.titleText,e.descriptionText,e.linkText):M}_validateOperatives(e){const t=st[e],a={postContracting:this.hideDeferPurchases,advancePayment:this.hideAdvancePayment,accountStatus:this.hideAccountStatus,monthlyPayment:this.hideMonthlyPayment,cancelLine:this.hideCancelLine,overduePayment:this.hideOverduePayment};return this._operatives=t.filter((e=>!a[ct(e.id.replaceAll("-"," "))])),this._operatives}render(){return v`
      ${super.render()} ${this._renderGlobalApis} ${this._renderDashboard}
      ${this._renderListMovements}
      <bbva-transition-container id="filter-movements" ?visible="${this._filterMovementsVisible}">
        <div slot="slot-content">
          <filter-menu
            id="filterMovements"
            @card-transaction-servicing-finance-payment-dashboard-filter-movements-navigate="${e=>this._handleNavigationFlow(e.detail)}"
            @header-main-icon-right-primary-click="${this._popLatestRoute}"
          >
          </filter-menu>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="filter-results"
        ?visible="${this._filterResultsVisible}"
        @transition-container-scroll="${e=>this._managePagination(e)}"
      >
        <div slot="slot-content">
          <filter-results
            id="filterResults"
            ?loading="${this._microloansPaginationFilter.hasNextPage}"
            .movements="${this._movements}"
            .responseMicroloans="${this._responseMicroloansFiltered}"
            .paginationMicroloans="${this._microloansPaginationFilter}"
            .filterOptions="${this._filterOptions}"
            .filterParams="${this._filterParams}"
            .language="${this.language}"
            .constantsIds="${this.constantsIds}"
            @card-transaction-servicing-finance-payment-dashboard-filter-movements-navigate="${e=>this._changeFilterOptions(e)}"
            @card-transaction-servicing-finance-payment-dashboard-filter-movements-persist="${this._manageScrollBottom}"
            @card-transaction-servicing-finance-payment-dashboard-show-purchase-detail="${e=>this._setPurchaseSelected(e.detail)}"
            @form-filter-edit-click="${this._popLatestRoute}"
          >
          </filter-results>
        </div>
      </bbva-transition-container>
      ${this._modalInfo} ${this._seeMoreModal} ${this._modalError}
    `}}customElements.define(At.is,At);
