import"./fc15786a.js";import{z as t,a8 as e,ac as a,ar as i,a9 as s,aa as o,a as n,ap as r,an as l,L as c,ag as h,F as d,b$ as u,ak as m,bx as p,b1 as g,h as b,i as v,aW as f,c0 as y,f as _,g as x,aZ as S,J as $,ab as k,ad as T,aJ as P,bU as L,b6 as C,ah as D,cU as E,ai as R,aN as I,dj as A,cS as M,bF as w,aV as O,av as B,b3 as q,aw as G,cp as H,cm as F,cH as V,aL as j,b5 as N,bG as z,cM as U,dA as X,dB as W,v as K,az as Q,aU as J,bW as Y,aX as Z,af as tt,cF as et,bv as at,aK as it,A as st,fe as ot,cT as nt,di as rt}from"./952f98a9.js";import{z as lt,bk as ct,a7 as ht,cC as dt,ba as ut}from"./7f3d7ca9.js";import{ay as mt}from"./216055dc.js";import"./93bb16ff.js";import"./6547a2ba.js";import{B as pt}from"./7306257d.js";import{B as gt}from"./e905e6bb.js";import{B as bt}from"./30ef6f1f.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./a6969bf4.js";import"./854beed0.js";import"./84dff06e.js";class vt extends lt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/installments/{installment-id}/refund`)}toString(){return super.toString("BGADPLoansLoanInstallmentsInstallmentRefundPostV2")}}const ft=new i;var yt=t`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${e(s.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
  --_bg-color-modal: var(--colorsPrimaryCore, ${e(s.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${e(s.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${e(s.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${e(s.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)})));
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
  padding-top: calc(((0.25 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 10) * 1em);
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${e(a.typeMedium)}));
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
  padding: 0 calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
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
${ft.mediaRules()}`;class _t extends(n(r(l(c)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":h,"bbva-icon":d,"bbva-badge-notification":u}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,a=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,i=Math.max(e,a);return i in t?t[i]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[yt,m("bbva-header-main-shared-styles"),p("button:focus"),g.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return b`<bbva-icon icon="${v(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return b`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,e,a,i){const s=_t.toCamelCase(t),o=`icon${s}`,n=`accessibilityTextIcon${s}`;return b`<button
      class="${e}"
      id="btn-${t}"
      aria-label="${v(this.t(this[n]))}"
      aria-expanded=${v(i)}
      ?hidden="${!this[o]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(o):this._icon(o)}
      ${this.showTextIcon?this._textIcon(a):""}
    </button>`}_textIcon(t){return b` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${v(this.t(t))}"
    >
    </bbva-text>`}_tplHeading(t){return b`
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
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:a,image:i,_hasMicroillustration:s,microillustration:o}=this;return b`
      <header class="header-main">
        <div class="header-icons ${t} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${e}"
          id="heading"
          aria-label=${(o||i)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(a)}
          tabindex="-1"
        >
          ${a&&" "!==a&&this._tplHeading(a)||""}
          <img src="${v(i)}" alt="" ?hidden="${!i}" id="image" aria-hidden="true" />

          <span class="${s}" ?hidden="${!o}" aria-hidden="true">
            ${this.microillustration&&f[this.microillustration]}
          </span>
        </h1>

        <div class="header-icons ${t} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}x("colors.primaryCoreLightened"),x("colors.cool80"),x("colors.cool70"),x("colors.primaryCoreLightened"),x("colors.cool100"),x("colors.tertiaryType6Darkened"),x("colors.tertiaryType4Darkened");class xt{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),i=a.length>>>0;if(0===i)return!1;let s=0|e,o=Math.max(s>=0?s:i-Math.abs(s),0);for(;o<i;){if((n=a[o])===(r=t)||"number"==typeof n&&"number"==typeof r&&isNaN(n)&&isNaN(r))return!0;o++}var n,r;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var a=[],i=0,s="",o=0,n=arguments.length;o!==n;++o){var r=+arguments[o];if(!(r<1114111&&r>>>0===r))throw RangeError("Invalid code point: "+r);r<=65535?i=a.push(r):(r-=65536,i=a.push(55296+(r>>10),r%1024+56320)),i>=16383&&(s+=t.apply(null,a),a.length=0)}return s+t.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",a=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${a&&a.message}`)}}class St extends xt{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}}const $t=0,kt=1,Tt="jwt",Pt="tsec",Lt="none";class Ct extends xt{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=$t,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new St,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Pt:this.requiredToken=Lt,this.requiresJWT=!1):this.requiredToken===Pt?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Tt?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Lt?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Pt)}_setJwtHandler(){this._setTokenHandler(Tt)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((a,i)=>{e=Object.assign(e,{resolve:a,reject:i}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let a=this._getRequestHeaders();Object.keys(a).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,a[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=S),t}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let a=t.replace(/[\{\}]+/g,""),i=e[a];return i?delete e[a]:this._error(9,`Missing ${a} param value`),i})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(e);a.length&&(t=[t,a.map((t=>{let a=e[t];return Array.isArray(a)&&this.paramArrayMode===kt?this._arrayToQueryParam(t,a):`${t}=${a}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(Pt,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(Tt,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var i=e.getItem(a);i&&"null"!==i&&(t[a]=i)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const a=window.sessionStorage;e=Object.keys(a).filter((e=>e.startsWith(t))).reduce(((e,i)=>(e[i.replace(t,"")]=a.getItem(i),e)),{})}return e}_getTokenForRequestHeaders(t,e){const a=`${t}Handler`,i=t===Tt?"JWT ":"",s=t===Tt?"Authorization":Pt;if(void 0===this[a]||null===this[a])this._error(11,`${t} handler is undefined`);else{const o=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let n=this[a].getItem(o);n?e[s]=e[s]||i+n:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((a=>{e.push(`${a}=${t[a]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(a){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(a){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let a;const i=new Promise(((t,e)=>{a=(a,i)=>{a?e(a):t(i)}}));return e.addEventListener("loadend",(function t(i){e.removeEventListener("loadend",t),i.error?a(i.error):a(null,e.result)})),e.readAsText(t),i}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let a=0;for(;a<t.length;){let i=t[a],s=0,o=0;if(i<=127?(s=0,o=255&i):i<=223?(s=1,o=31&i):i<=239?(s=2,o=15&i):i<=244&&(s=3,o=7&i),t.length-a-s>0){let e=0;for(;e<s;)i=t[a+e+1],o=o<<6|63&i,e+=1}else o=65533,s=t.length-a;e+=String.fromCodePoint(o),a+=s+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},a=t.trim().split(/[\r\n]+/);for(const t in a)if(a.hasOwnProperty(t)&&""!==a[t]){let i=": ",s=a[t].split(i);e[s.shift().toLowerCase()]=s.join(i)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,a,i){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(i)>=0&&(s=e.getResponseHeader(i));break;case this._NATIVE_XHR:e&&e.headers&&(s=JSON.parse(e.headers)[i])}if(s){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;t.getItem(e)!==s&&(t.setItem(e,s),this._emitTokenUpdate(a,s))}}_emitTokenUpdate(t,e){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,a,i,s,o;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),a=t.getResponseHeader("AuthenticationData"),i=t.getResponseHeader("AuthenticationState"),s=t.getResponseHeader("AuthenticationChallenge"),o=t.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(t.headers);e=n.authenticationtype,a=n.authenticationdata||null,i=n.authenticationstate,s=n.authenticationchallenge,o=n.authenticationresponse}return{type:e,data:a,state:i,challenge:s,response:o}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",a=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const i=this._getSignatureData(t,e,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",a="",i=""){let s;if("object"==typeof t&&t){const o=this._getSignatureData(t.signatureType,e,a);s=this._makeKeyValuePairFromObject(o,t.signatureValue),t.challenge&&(s+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(s,t.signatureType,i)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(s=`password=${t}`,this._buildSignatureHeaders(s,"2",i)):(s=`${a}=${t}`,this._buildSignatureHeaders(s,e,i)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let a,i=t.split(",");if(i.length>1){a=i.map((t=>`${t}=${e[t]}`)).join(",")}else a=`${t}=${e}`;return a}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:o,data:n,state:r,challenge:l,response:c}=this._extractSignatureResponseHeaders(t),h=this._getRequestMetadata(t);if(s)this._notifySignatureInvalid(h),a=!0;else if(o)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,h,o,n,r,l,c),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(h,o,n,r,l,c),a=!0}return a}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let a=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),s=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),o=this._getRequestMetadata(t);s&&(this._notifyWaitingForProcessResponse(o),a=!0)}return a}_notifySignatureRequiredFirstStep(t,e,a,i){this._defineSignatureType(e,a),this._defineSignatureValue(e,a,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:a,metadata:t}}))}_notifySignatureRequired(t,e,a,i,s,o){this._defineSignatureValue(e,a,i);const n={type:e,data:a,challenge:s,metadata:t};o&&(n.response=o),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:a}=t;return{path:this._path,method:this.method,url:e,status:a}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",a=""){const i=e.split(";").findIndex((e=>e===t));return a?a.split(";")[i]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,a,i,s,o){i?this._notifySignatureRequired(t,e,a,i,s,o):this._notifySignatureRequiredFirstStep(t,e,a,i)}_notifySignatureTypeUsingErrorCode(t,e,a,i,s,o,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,a,i,s):this._notifySignatureRequired(e,a,i,s,o,n)}}class Dt extends Ct{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}}class Et extends Ct{constructor(t=null){super(Object.assign(t||{},{method:"PATCH"}))}toString(t=""){return super.toString(t||"BGADPRequestPATCH")}}class Rt extends Ct{constructor(t=null){super(Object.assign(t||{},{method:"POST"}))}toString(t=""){return super.toString(t||"BGADPRequestPOST")}}class It extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/commissions`)}toString(){return super.toString("BGADPLoansLoanCommissionsGetV0")}}class At extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/balances`)}toString(){return super.toString("BGADPLoansBalancesGetV1")}}class Mt extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans`)}toString(){return super.toString("BGADPLoansGetV1")}}class wt extends Rt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans`)}toString(){return super.toString("BGADPLoansPostV1")}}class Ot extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}`)}toString(){return super.toString("BGADPLoansLoanGetV1")}}class Bt extends Et{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}`)}toString(){return super.toString("BGADPLoansLoanPatchV1")}}class qt extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/financial-statements`)}toString(){return super.toString("BGADPLoansLoanFinancialStatementsGetV1")}}class Gt extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/indicators`)}toString(){return super.toString("BGADPLoansLoanIndicatorsGetV1")}}class Ht extends Et{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/indicators/{indicator-id}`)}toString(){return super.toString("BGADPLoansLoanIndicatorsIndicatorPatchV1")}}class Ft extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/installments`)}toString(){return super.toString("BGADPLoansLoanInstallmentsGetV1")}}class Vt extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/installments/{installment-id}`)}toString(){return super.toString("BGADPLoansLoanInstallmentsInstallmentGetV1")}}class jt extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/offers/{offer-id}`)}toString(){return super.toString("BGADPLoansLoanOffersOfferGetV1")}}class Nt extends Rt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/payment-amortizations`)}toString(){return super.toString("BGADPLoansLoanPaymentAmortizationsPostV1")}}class zt extends Rt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/payment-amortizations/simulate`)}toString(){return super.toString("BGADPLoansLoanPaymentAmortizationsSimulatePostV1")}}class Ut extends Rt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/payment-installments`)}toString(){return super.toString("BGADPLoansLoanPaymentInstallmentsPostV1")}}class Xt extends Rt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/payment-installments/simulate`)}toString(){return super.toString("BGADPLoansLoanPaymentInstallmentsSimulatePostV1")}}class Wt extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/related-contracts`)}toString(){return super.toString("BGADPLoansLoanRelatedContractsGetV1")}}class Kt extends Rt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/relocate`)}toString(){return super.toString("BGADPLoansLoanRelocatePostV1")}}class Qt extends Rt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/request-cancel`)}toString(){return super.toString("BGADPLoansLoanRequestCancelPostV1")}}class Jt extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/transactions`)}toString(){return super.toString("BGADPLoansLoanTransactionsGetV1")}}class Yt extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/loans/{loan-id}/transactions/{transaction-id}`)}toString(){return super.toString("BGADPLoansLoanTransactionsTransactionGetV1")}}class Zt extends Rt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/merchant-options-installments`)}toString(){return super.toString("BGADPLoansMerchantOptionsInstallmentsPostV1")}}class te extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/offers/{offer-id}`)}toString(){return super.toString("BGADPLoansOffersOfferGetV1")}}class ee extends Rt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/offers/{offer-id}/quotations`)}toString(){return super.toString("BGADPLoansOffersOfferQuotationsPostV1")}}class ae extends Rt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/offers/{offer-id}/quotations/simulate`)}toString(){return super.toString("BGADPLoansOffersOfferQuotationsSimulatePostV1")}}class ie extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/proposals`)}toString(){return super.toString("BGADPLoansProposalsGetV1")}}class se extends Rt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/proposals`)}toString(){return super.toString("BGADPLoansProposalsPostV1")}}class oe extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/proposals/{proposal-id}`)}toString(){return super.toString("BGADPLoansProposalsProposalGetV1")}}class ne extends Et{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/proposals/{proposal-id}`)}toString(){return super.toString("BGADPLoansProposalsProposalPatchV1")}}class re extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/proposals/{proposal-id}/goods`)}toString(){return super.toString("BGADPLoansProposalsProposalGoodsGetV1")}}class le extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/proposals/{proposal-id}/merchants`)}toString(){return super.toString("BGADPLoansProposalsProposalMerchantsGetV1")}}class ce extends Rt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/quotations`)}toString(){return super.toString("BGADPLoansQuotationsPostV1")}}class he extends Rt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/quotations/{quotation-id}/simulations`)}toString(){return super.toString("BGADPLoansQuotationsQuotationSimulationsPostV1")}}class de extends($(c)){static get is(){return"bbva-dataprovider-loans"}static get properties(){return{apiVersion:{type:String,attribute:"api-version"},offerId:{type:String},loanId:{type:String},loan:{type:Object},loans:{type:Array},balances:{type:Array},installments:{type:Array},installmentDetail:{type:Object},transactions:{type:Array},transactionId:{type:String},transactionDetail:{type:Object},offer:{type:Object},loanTypeHeader:{type:String},loanTypeHeaderDescription:{type:String},loanRelatedContracts:{type:Array},proposalId:{type:String},loadPagesUntilEmptyPage:{type:Boolean},emptyPageReached:{type:Boolean},emptyLastResponse:{type:Boolean},nextPageIsNeeded:{type:Boolean}}}constructor(){super(),this.apiVersion="0",this.requiredToken="tsec",this.native=!1,this.headers={},this.timeout=120,this.requiredOTP=!1,this.htmlContext=this,this.offerId="",this.loanId="",this.loan={},this.loans=[],this.balances=[],this.installments=[],this.installmentDetail={},this.transactions=[],this.transactionId="",this.transactionDetail={},this.offer={},this.loanTypeHeader="",this.loanTypeHeaderDescription="",this.loanRelatedContracts=[],this.proposalId="",this.loadPagesUntilEmptyPage=!1,this.emptyPageReached=!1,this.emptyLastResponse=!1,this.nextPageIsNeeded=!1}static get services(){return{BGADPLoansLoanCommissionsGetV0:It,BGADPLoansGetV1:Mt,BGADPLoansLoanGetV1:Ot,BGADPLoansLoanRelatedContractsGetV1:Wt,BGADPLoansBalancesGetV1:At,BGADPLoansLoanPatchV1:Bt,BGADPLoansLoanInstallmentsGetV1:Ft,BGADPLoansLoanInstallmentsInstallmentGetV1:Vt,BGADPLoansOffersOfferGetV1:te,BGADPLoansOffersOfferQuotationsPostV1:ee,BGADPLoansOffersOfferQuotationsSimulatePostV1:ae,BGADPLoansLoanPaymentInstallmentsPostV1:Ut,BGADPLoansLoanInstallmentsInstallmentRefundPostV2:vt,BGADPLoansPostV1:wt,BGADPLoansQuotationsPostV1:ce,BGADPLoansQuotationsQuotationSimulationsPostV1:he,BGADPLoansProposalsGetV1:ie,BGADPLoansProposalsPostV1:se,BGADPLoansProposalsProposalGetV1:oe,BGADPLoansProposalsProposalGoodsGetV1:re,BGADPLoansProposalsProposalMerchantsGetV1:le,BGADPLoansProposalsProposalPatchV1:ne,BGADPLoansLoanRequestCancelPostV1:Qt,BGADPLoansLoanTransactionsGetV1:Jt,BGADPLoansLoanTransactionsTransactionGetV1:Yt,BGADPLoansLoanFinancialStatementsGetV1:qt,BGADPLoansLoanIndicatorsGetV1:Gt,BGADPLoansLoanIndicatorsIndicatorPatchV1:Ht,BGADPLoansMerchantOptionsInstallmentsPostV1:Zt,BGADPLoansLoanOffersOfferGetV1:jt,BGADPLoansPostV2:pt}}static get propertiesWithChangeNotification(){return["loan","loans","balances","installments","installmentDetail","transactions","transactionDetail","offer","loanTypeHeader","loanTypeHeaderDescription"]}updated(t){de.propertiesWithChangeNotification.filter((e=>t.has(e))).forEach((t=>{const e=t.split(/(?=[A-Z])/).join("-").toLowerCase();this._dispatchEvent(`${e}-changed`,{value:this[t]})}))}getLoans(t){const e=this._getServiceParams(t),a=this._getService("BGADPLoansGet",e);this.addEventListener("success-on-get-loans",(t=>{t.stopPropagation();const e=this._parseResponse(a.getLastResponse());this.loans=e,this._dispatchEvent("set-loans",e)})),this._generateGetService(a,{customEvent:"success-on-get-loans",errorFireEventHandler:"error-on-get-loans"})}getLoan(t,e={}){const a=this._getServiceParams({"loan-id":t,...e}),i=this._getService("BGADPLoansLoanGet",a);this.addEventListener("success-on-get-loan",(t=>{t.stopPropagation();const e=this._parseResponse(i.getLastResponse());this.loan=e,this._dispatchEvent("set-loan",e)})),this._generateGetService(i,{customEvent:"success-on-get-loan",errorFireEventHandler:"error-on-get-loan"})}getRelatedContracts(t,e){const a=this._getServiceParams({"loan-id":t,...e}),i=this._getService("BGADPLoansLoanRelatedContractsGet",a);this.addEventListener("success-on-get-loan-related-contracts",(t=>{t.stopPropagation();const e=this._parseResponse(i.getLastResponse())||[];this.loanRelatedContracts=e,this._dispatchEvent("set-loan-related-contracts",e)})),this._generateGetService(i,{customEvent:"success-on-get-loan-related-contracts",errorFireEventHandler:"error-on-get-loan-related-contracts"})}getLoansBalances(){const t=this._getServiceParams(),e=this._getService("BGADPLoansBalancesGet",t);this.addEventListener("success-on-get-loans-balances",(t=>{t.stopPropagation();const a=this._parseResponse(e.getLastResponse())||[];this.balances=a,this._dispatchEvent("set-loans-balances",a)})),this._generateGetService(e,{customEvent:"success-on-get-loans-balances",errorFireEventHandler:"error-on-get-loans-balances"})}patchLoanAlias(t){const e=this._getServiceParams({"loan-id":this.loanId},{alias:t}),a=this._getService("BGADPLoansLoanPatch",e);this.addEventListener("success-on-patch-loan",(e=>{e.stopPropagation();const i=this._parseResponse(a.getLastResponse());this.loan=i,this._dispatchEvent("patch-alias",t),this._dispatchEvent("patch-loan",i)})),this._generateGetService(a,{customEvent:"success-on-patch-loan",errorFireEventHandler:"error-on-patch-loan"})}getLoanInstallments(t){const e=this._getServiceParams({"loan-id":this.loanId,...t}),a=this._getService("BGADPLoansLoanInstallmentsGet",e);this.addEventListener("success-on-get-loans-installments",(t=>{t.stopPropagation();const e=this._parseResponse(a.getLastResponse())||[],i=a.getLastResponseHeaders();i&&i.responsewarningcode&&(this.loanTypeHeader=i.responsewarningcode,this.loanTypeHeaderDescription=i.responsewarningdescription),this.installments=e,this._dispatchEvent("set-loans-installments",e)})),this._generateGetService(a,{customEvent:"success-on-get-loans-installments",errorFireEventHandler:"error-on-get-loans-installments"})}getLoanInstallmentDetail(t){const e=this._getServiceParams({"loan-id":this.loanId,...t}),a=this._getService("BGADPLoansLoanInstallmentsInstallmentGet",e);this.addEventListener("success-on-get-loans-installment-detail",(t=>{t.stopPropagation();const e=this._parseResponse(a.getLastResponse()),i=a.getLastResponseHeaders();i&&i.responsewarningcode&&(this.loanTypeHeader=i.responsewarningcode,this.loanTypeHeaderDescription=i.responsewarningdescription),this.installmentDetail=e,this._dispatchEvent("set-loans-installment-detail",e)})),this._generateGetService(a,{customEvent:"success-on-get-loans-installment-detail",errorFireEventHandler:"error-on-get-loans-installment-detail"})}getOfferDetail(t){const e=this._getServiceParams({"offer-id":this.offerId||t}),a=this._getService("BGADPLoansOffersOfferGet",e);this.addEventListener("success-on-get-loan-offer-detail",(t=>{t.stopPropagation();const e=this._parseResponse(a.getLastResponse());this.offer=e,this._dispatchEvent("set-offer-detail",e)})),this._generateGetService(a,{customEvent:"success-on-get-loan-offer-detail",errorFireEventHandler:"error-on-get-loan-offer-detail"})}getCommissions(t){const e=this._getServiceParams({"loan-id":t}),a=this._getService("BGADPLoansLoanCommissionsGet",e);this._generateGetService(a,{customEvent:"success-commissions-get",errorFireEventHandler:"error-on-get-commissions"})}postOfferDetailQuotations(t){const e=this._getServiceParams({"offer-id":this.offerId},t),a=this._getService("BGADPLoansOffersOfferQuotationsPost",e);this._generateGetService(a,{customEvent:"get-offer-detail-quotations",errorFireEventHandler:"error-on-post-loan-offer-detail-quotations"})}postOfferDetailQuotationsSimulate(t){const e=Object.hasOwn(t,"offerId")?null==t?void 0:t.requestBody:t,a=this._getServiceParams({"offer-id":this.offerId||(null==t?void 0:t.offerId)},e),i=this._getService("BGADPLoansOffersOfferQuotationsSimulatePost",a);this._generateGetService(i,{customEvent:"get-offer-detail-quotations-simulate",errorFireEventHandler:"error-on-post-loan-offer-detail-quotations-simulate"})}getLoanOffer(t){const e=this._getServiceParams({...t,"offer-id":this.offerId,"loan-id":this.loanId}),a=this._getService("BGADPLoansLoanOffersOfferGet",e);this._generateGetService(a,{customEvent:"get-loan-offer-v1-success",errorFireEventHandler:"get-loan-offer-v1-error"})}postLoanPaymentInstallments(t,e){const a=this._getServiceParams({"loan-id":t},e),i=this._getService("BGADPLoansLoanPaymentInstallmentsPost",a);this._generateGetService(i,{customEvent:"post-loans-payment-installments",errorFireEventHandler:"error-on-post-loans-payment-installments"})}postLoanInstallmentsRefund({loanId:t,paymentInstallmentId:e,requestBody:a}={}){const i={"loan-id":t,"installment-id":e},s=this._getServiceParams(i,a),o=this._getService("BGADPLoansLoanInstallmentsInstallmentRefundPost",s);this._generateGetService(o,{customEvent:"post-loans-installments-refund",errorFireEventHandler:"error-on-post-loans-installments-refund"})}postLoan(t={}){const e=t.body||t,a=t.headers||{},i=this._getServiceParams({},e);i.version=(null==t?void 0:t.version)||this.version;const s=this._getService("BGADPLoansPost",i,i.version);Object.keys(a).length&&(s.headers={...s.headers,...a});this._generateGetService(s,{customEvent:"post-loans",errorFireEventHandler:"error-on-post-loan"})}patchLoan(t={}){const e=null==t?void 0:t.body,a=this._getServiceParams({"loan-id":t.loanId},e),i=this._getService("BGADPLoansLoanPatch",a);this._generateGetService(i,{customEvent:"patch-loans",errorFireEventHandler:"error-on-patch-loan"})}postQuotation(t){const e=this._getServiceParams({},t),a=this._getService("BGADPLoansQuotationsPost",e);this.addEventListener("success-on-post-quotations",(t=>{t.stopPropagation();const e=a.getLastResponseHeaders();let i=null;if(e.location){i=e.location.split("/").pop()}this._dispatchEvent("post-quotations",i)})),this._generateGetService(a,{customEvent:"success-on-post-quotations",errorFireEventHandler:"error-on-post-quotations"})}postQuotationSimulation(t,e){const a=this._getServiceParams({"quotation-id":t},e),i=this._getService("BGADPLoansQuotationsQuotationSimulationsPost",a);this._generateGetService(i,{customEvent:"post-quotations-simulation",errorFireEventHandler:"error-on-post-quotations-simulation"})}getProposals(t,e){const a=t?{"loanType.id":t,expand:"goods"}:{},i=this._getServiceParams(a,e),s=this._getService("BGADPLoansProposalsGet",i);this._generateGetService(s,{customEvent:"get-proposals",errorFireEventHandler:"error-on-get-proposals"})}postProposal(t){const e=this._getServiceParams({},t),a=this._getService("BGADPLoansProposalsPost",e);this._generateGetService(a,{customEvent:"post-proposal",errorFireEventHandler:"error-on-post-proposal"})}getProposal(t){const e=this._getServiceParams({"proposal-id":this.proposalId,...t}),a=this._getService("BGADPLoansProposalsProposalGet",e);this._generateGetService(a,{customEvent:"get-proposal",errorFireEventHandler:"error-on-get-proposal"})}getProposalGoods(t){const e=this._getServiceParams({"proposal-id":this.proposalId,...t}),a=this._getService("BGADPLoansProposalsProposalGoodsGet",e);this._generateGetService(a,{customEvent:"get-proposal-goods",errorFireEventHandler:"error-on-get-proposal-goods"})}getProposalMerchants(t){const e=this._getServiceParams({"proposal-id":this.proposalId,...t}),a=this._getService("BGADPLoansProposalsProposalMerchantsGet",e);this._generateGetService(a,{customEvent:"get-proposal-merchants",errorFireEventHandler:"error-on-get-proposal-merchants"})}patchProposal(t={}){const e=this._getServiceParams(t.params),a=this._getService("BGADPLoansProposalsProposalPatch",e);this._generateGetService(a,{customEvent:"patch-proposal",errorFireEventHandler:"error-on-patch-proposal"})}postCancelLoan(t,e){const a=this._getServiceParams({"loan-id":t},e),i=this._getService("BGADPLoansLoanRequestCancelPost",a);this._generateGetService(i,{customEvent:"post-cancel-loan",errorFireEventHandler:"error-on-post-cancel-loan"})}getTransactions(t){const e=this._getServiceParams({"loan-id":this.loanId,...t}),a=this._getService("BGADPLoansLoanTransactionsGet",e);this.addEventListener("success-on-get-transactions",(t=>{t.stopPropagation();const e=this._parseResponse(a.getLastResponse())||[],i=0===e.length;return this.nextPageIsNeeded&&this._dispatchEvent("empty-next-page",!!this.nextKey),this.emptyLastResponse&&i?this._onEmptyPageReached():(this.transactions=e,this._dispatchEvent("set-loan-transactions",e)),e})),this._generateGetService(a,{customEvent:"success-on-get-transactions",errorFireEventHandler:"error-on-get-transactions"})}getMoreTransactions(t){this.page&&(this.pagination||{}).page===this.page||this._generatePagination(this.pagination||{page:0}),this._checkEmptyPageReached();const e=this.loadPagesUntilEmptyPage||this.page<=this.totalPages;if(!this.emptyPageReached&&this.pagination&&e&&this.nextKey){this._dispatchEvent("get-more-data",!0);const e=Object.assign(t||{},{expand:`&paginationKey=${this.nextKey}`});this.getTransactions(e)}}getTransactionDetail(){const t={"loan-id":this.loanId,"transaction-id":this.transactionId},e=this._getServiceParams(t),a=this._getService("BGADPLoansLoanTransactionsTransactionGet",e);this.addEventListener("success-on-get-transaction-detail",(t=>{t.stopPropagation();const e=this._parseResponse(a.getLastResponse())||{};return this.transactionDetail=e,this._dispatchEvent("set-loan-transaction-detail",e),e})),this._generateGetService(a,{customEvent:"success-on-get-transaction-detail",errorFireEventHandler:"error-on-get-transaction-detail"})}getLoanFinancialStatements(t,e={}){const a=this._getServiceParams({"loan-id":t,...e}),i=this._getService("BGADPLoansLoanFinancialStatementsGet",a);this._generateGetService(i,{customEvent:"set-loan-financial-statements",errorFireEventHandler:"error-on-get-loan-financial-statements"})}postLoanRequestCancel(t,e){const a=this._getServiceParams({"loan-id":t},e),i=this._getService("BGADPLoansLoanRequestCancelPost",a);this._generateGetService(i,{customEvent:"post-loan-request-cancel",errorFireEventHandler:"error-on-post-request-cancel"})}getLoanIndicators({id:t=0,params:e={}}={}){const a=this._getServiceParams({"loan-id":t,...e}),i=this._getService("BGADPLoansLoanIndicatorsGet",a);this.addEventListener("success-on-get-loan-indicators",(t=>{t.stopPropagation();const e=this._parseResponse(i.getLastResponse());this._dispatchEvent("set-loan-indicators",e),this._dispatchEvent("set-loan-full-response-indicators",i.getLastResponse())})),this._generateGetService(i,{customEvent:"success-on-get-loan-indicators",errorFireEventHandler:"error-on-get-loan-indicators"})}patchLoanIndicatorsIndicator({id:t=0,params:e={},body:a={}}={}){const i=this._getServiceParams({"loan-id":t,"indicator-id":e.id},a),s=this._getService("BGADPLoansLoanIndicatorsIndicatorPatch",i);this._generateGetService(s,{customEvent:"set-loan-indicators-indicator",errorFireEventHandler:"error-on-patch-loan-indicators-indicator"})}getOfferDetailBGADP(t){const e={"offer-id":this.offerId||t},a=this._getServiceParams(e),i=this._getService("BGADPLoansOffersOfferGet",a);this.addEventListener("success-on-get-loan-offer-detail",(t=>{t.stopPropagation();const e=this._parseResponse(i.getLastResponse());this._dispatchEvent("set-offer-detail",e),this.offer=e})),this._generateGetService(i,{customEvent:"success-on-get-loan-offer-detail",errorFireEventHandler:"error-on-get-loan-offer-detail"})}createMerchantOptionsInstallment(t){const e=this._getServiceParams({},t),a=this._getService("BGADPLoansMerchantOptionsInstallmentsPost",e);this._generateGetService(a,{customEvent:"set-loan-merchant-options-installments",errorFireEventHandler:"error-on-post-loan-merchant-options-installments"})}postLoanPaymentAmortizationsSimulate({id:t,requestBody:e}){const a={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,body:e,params:{"loan-id":t},htmlContext:this.htmlContext},i=de._serviceLoanPaymentAmortizationsSimulatePostV1(a);this._generateGetService(i,{customEvent:"post-loan-payment-amortizations-simulation",errorFireEventHandler:"error-on-post-loan-payment-amortizations-simulation"})}postLoanPaymentAmortizations({id:t,requestBody:e}){const a={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,body:e,params:{"loan-id":t},htmlContext:this.htmlContext},i=de._serviceLoansLoanPaymentAmortizationsPostV1(a);this.requiredOTP=!0,this._generateGetService(i,{customEvent:"post-loan-payment-amortizations",errorFireEventHandler:"error-on-post-loan-payment-amortizations"})}postPaymentInstallmentSimulate(t){const e={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,params:{"loan-id":this.loanId},body:t,htmlContext:this.htmlContext},a=de._serviceLoanPaymentInstallmentsSimulatePostV1(e);this._generateGetService(a,{customEvent:"post-payment-installment-simulate-v1-success",errorFireEventHandler:"post-payment-installment-simulate-v1-error"})}postPaymentInstallment(t){const e={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,params:{"loan-id":this.loanId},body:t,htmlContext:this.htmlContext},a=de._serviceLoanPaymentInstallmentsPostV1(e);this.requiredOTP=!0,this._generateGetService(a,{customEvent:"post-payment-installment-v1-success",errorFireEventHandler:"post-payment-installment-v1-error"})}getLoanDetail(t){const e={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,params:{"loan-id":this.loanId||t},htmlContext:this.htmlContext},a=de._serviceLoansLoanGetV1(e);this._generateGetService(a,{customEvent:"get-loan-detail-v1-success",errorFireEventHandler:"get-loan-detail-v1-error"})}postInstallments(t){const e={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,body:t.body,params:{"loan-id":(null==t?void 0:t.loanId)||this.loanId,"offer-id":(null==t?void 0:t.offerId)||this.offerId},htmlContext:this.htmlContext},a=de._serviceLoansLoanOffersOfferInstallmentPlansPostV2(e);this.requiredOTP=!0,this._generateGetService(a,{customEvent:"post-loan-installments-v2-success",errorFireEventHandler:"post-loan-installments-v2-error"})}postLoanRelocateSimulate({params:t,requestBody:e}){const a={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,params:t,body:e,htmlContext:this.htmlContext},i=de._serviceLoansLoanRelocatePostV1(a);this._generateGetService(i,{customEvent:"post-loan-relocate-simulate-v1-success",errorFireEventHandler:"post-loan-relocate-simulate-v1-error"})}static _serviceLoanPaymentAmortizationsSimulatePostV1(t){return new zt(t)}static _serviceLoansLoanPaymentAmortizationsPostV1(t){return new Nt(t)}static _serviceLoansLoanOffersOfferInstallmentPlansPostV2(t){return new ct(t)}static _serviceLoansLoanGetV1(t){return new Ot(t)}static _serviceLoanPaymentInstallmentsSimulatePostV1(t){return new Xt(t)}static _serviceLoanPaymentInstallmentsPostV1(t){return new Ut(t)}static _serviceLoansLoanRelocatePostV1(t){return new Kt(t)}_getService(t,e,a=this.version){return new de.services[`${t}V${a}`](e)}_onEmptyPageReached(){this.emptyPageReached=!0,this.loading=!1,this._dispatchEvent("empty-page-reached")}_checkEmptyPageReached(){this.loadPagesUntilEmptyPage&&this.pagination.totalElements<this.pagination.pageSize&&this._onEmptyPageReached()}}const ue=new i;var me=t`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  box-sizing: border-box;
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
  position: relative;
  background-color: var(--bbva-notification-message-dark-mode-background-color, var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${e(s.primarySubduedLight)})));
  --_notification-message-icon-color: var(--bbva-notification-message-dark-mode-icon-color, var(--bbva-notification-message-icon-color, var(--colorsPrimaryCoreDark, ${e(s.primaryCoreDark)})));
  --_notification-message-information-icon-color: var(--bbva-notification-message-dark-mode-information-icon-color, var(--bbva-notification-message-information-icon-color, var(--colorsTertiaryType3Dark, ${e(s.tertiaryType3Dark)})));
  --_notification-message-success-icon-color: var(--bbva-notification-message-dark-mode-success-icon-color, var(--bbva-notification-message-success-icon-color, var(--colorsTertiaryType6Dark, ${e(s.tertiaryType6Dark)})));
  --_notification-message-error-icon-color: var(--bbva-notification-message-dark-mode-error-icon-color, var(--bbva-notification-message-error-icon-color, var(--colorsTertiaryType1Dark, ${e(s.tertiaryType1Dark)})));
  --_notification-message-sustainability-icon-color: var(--bbva-notification-message-dark-mode-sustainability-icon-color, var(--bbva-notification-message-sustainability-icon-color, var(--colorsPrimaryVariantDark, ${e(s.primaryVariantDark)})));
  --_notification-message-information-background-color: var(--bbva-notification-message-dark-mode-information-background-color, var(--bbva-notification-message-information-background-color, var(--colorsTertiaryType3Lightened, ${e(s.tertiaryType3Lightened)})));
  --_notification-message-success-background-color: var(--bbva-notification-message-dark-mode-success-background-color, var(--bbva-notification-message-success-background-color, var(--colorsTertiaryType6Lightened, ${e(s.tertiaryType6Lightened)})));
  --_notification-message-error-background-color: var(--bbva-notification-message-dark-mode-error-background-color, var(--bbva-notification-message-error-background-color, var(--colorsTertiaryType5Lightened, ${e(s.tertiaryType5Lightened)})));
  --_notification-message-sustainability-background-color: var(--bbva-notification-message-dark-mode-sustainability-background-color, var(--bbva-notification-message-sustainability-background-color, var(--colorsPrimaryVariantLightened, ${e(s.primaryVariantLightened)})));
  --_notification-message-title-color: var(--bbva-notification-message-dark-mode-title-color, var(--bbva-notification-message-title-color, var(--colorsSecondary600, ${e(s.secondary600)})));
  --_notification-message-paragraph-color: var(--bbva-notification-message-dark-mode-paragraph-color, var(--bbva-notification-message-paragraph-color, var(--colorsSecondary600, ${e(s.secondary600)})));
  --_text-weight: var(--bbva-notification-message-dark-mode-text-weight, var(--bbva-notification-message-text-weight, var(--fontFacePrimaryBookFontWeight, ${e(k.book.fontWeight)})));
  --skeleton-quote-color: var(--bbva-notification-message-dark-mode-skeleton-color, var(--bbva-notification-message-skeleton-color, var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)})));
  --skeleton-quote-bg: var(--bbva-notification-message-dark-mode-skeleton-bg-color, var(--bbva-notification-message-skeleton-bg-color, var(--colorsPrimarySubduedLight, ${e(s.primarySubduedLight)})));
  --_notification-message-skeleton-animated-layer-bg: var(--bbva-notification-message-dark-mode-skeleton-animated-layer-bg-color, var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)}));
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
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-size: var(--bbva-notification-message-title-size, var(--typographyTypeLarge, ${e(a.typeLarge)}));
}

.paragraph {
  color: var(--_notification-message-paragraph-color);
  font-weight: var(--bbva-notification-message-paragraph-weight, var(--_text-weight));
  font-size: var(--bbva-notification-message-paragraph-size, var(--typographyTypeSmall, ${e(a.typeSmall)}));
  line-height: var(--bbva-notification-message-line-height, var(--lineHeightTypeSmall, ${e(T.typeSmall)}));
}
.paragraph:not(.no-space) {
  padding: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

:host([hide-bottom-padding-paragraph]) > .paragraph {
  padding: 0;
}

.description {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(k.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(k.medium.fontWeight)});
}

:host([description][description-text-italic]) > .description {
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${e(k.mediumItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${e(k.mediumItalic.fontWeight)});
}

[data-tag-name=bbva-icon] {
  margin: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  --bbva-icon-color: var(--_notification-message-icon-color);
}

[data-tag-name=bbva-link]:not(.no-space) {
  padding: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
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
  background-color: var(--bbva-notification-message-dark-mode-background-color, var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${e(s.primarySubduedLight)})));
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
${ue.mediaRules()}`;class pe extends(n(l(P(c)))){static get is(){return"bbva-notification-message"}static get scopedElements(){return{"bbva-button-default":L,"bbva-link":C,"bbva-icon":d,"bbva-text":h}}static get properties(){return{iconSize:{type:Number,attribute:"icon-size"},icon:{type:String,attribute:"icon"},messageTitle:{type:String,attribute:"message-title"},message:{type:String},description:{type:String},tagTitle:{type:String,attribute:"tag-title"},linkTitle:{type:String,attribute:"link-title"},linkIcon:{type:String,attribute:"link-icon"},buttonText:{type:String,attribute:"button-text"},href:{type:String},loading:{type:Boolean,reflect:!1},variant:{type:String,reflect:!0},iconClose:{type:Boolean,attribute:"icon-close"},hideBottomPaddingParagraph:{type:Boolean,attribute:"hide-bottom-padding-paragraph"},hideBottomPaddingLink:{type:Boolean,attribute:"hide-bottom-padding-link"},descriptionTextItalic:{type:Boolean,attribute:"description-text-italic"},accessibilityLinkLabel:{type:String,attribute:"accessibility-link-label"}}}constructor(){super(),this.iconClose=!1,this.iconSize=24,this.variant="default",this._types={default:D(),information:E(),success:R(),error:I(),sustainability:A()},this.hideBottomPaddingParagraph=!1,this.hideBottomPaddingLink=!1,this.descriptionTextItalic=!1,this.loading=!1,this.accessibilityLinkLabel="bbva-notification-message-accessibility-link-label",this._accessibilityTextIcon="bbva-notification-message-accessibility-icon-text-",this.tagTitle="p"}static get styles(){return[super.styles,me,m("bbva-notification-message-shared-styles"),M.light]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.isRoleAlert?this.setAttribute("role","alert"):this.setAttribute("role","status"),this.disabledTabindex=!0}get isRoleAlert(){return"error"===this.variant}get _icon(){return this.icon?this.icon:this._types[this.variant]||D()}get _closeIcon(){return this.iconClose&&"default"===this.variant?b`
          <bbva-button-default
            variant="icon no-background"
            .icon="${w()}"
            @click="${this._iconClick}"
            aria-label="${this.t("bbva-notification-message-close")}"
          >
          </bbva-button-default>
        `:O}get _title(){return this.messageTitle?b`
          <bbva-text
            .tag="${this.tagTitle}"
            alignment="center"
            .text="${this.messageTitle}"
            class="title"
            unset
            size="M"
          ></bbva-text>
        `:O}get _paragraph(){return b`<div
      class="paragraph
            ${B({"no-space":!this.buttonText&&!this.linkTitle})}"
    >
      ${this.message?b`<bbva-text alignment="center" text=${this.message} unset size="S"></bbva-text> `:b`<slot></slot>`}
    </div>`}get _description(){return this.description?b` <bbva-text
          class="description"
          alignment="center"
          .text=${this.description}
          unset
          size="S"
        ></bbva-text>`:O}get _link(){return this.linkTitle?b`
          <bbva-link
            aria-label="${this.t(this.accessibilityLinkLabel)}"
            class="${B({"no-space":!this.buttonText})}"
            variant="message"
            .href="${this.href}"
            @click="${this._linkClick}"
            .icon="${this.linkIcon}"
          >
            <span>${this.linkTitle}</span>
          </bbva-link>
        `:O}get _button(){return this.buttonText?b`
          <bbva-button-default
            ambient="light"
            data-tag-name="bbva-button-default"
            text="${this.buttonText}"
            @click="${this._buttonClick}"
          ></bbva-button-default>
        `:O}get _accessibilityIconDescription(){return`${this._accessibilityTextIcon}${this.variant}`}_iconClick(){this.dispatchEvent(new CustomEvent("notification-message-icon-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("notification-message-link-click",{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){this.dispatchEvent(new CustomEvent("notification-message-button-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return b`${this.loading?b`<div class="skeleton"></div> `:b` ${this._closeIcon}
          <bbva-icon
            data-tag-name="bbva-icon"
            role="img"
            aria-label=${this.t(this._accessibilityIconDescription)}
            .icon="${this._icon}"
            .size="${this.iconSize}"
          ></bbva-icon>
          ${this._title} ${this._paragraph} ${this._description} ${this._link} ${this._button}`}`}}customElements.define(pe.is,pe);const ge=new i;var be=t`[divider] {
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
  background-color: var(--bbva-divider-dark-mode-color, var(--bbva-divider-color, var(--colorsSecondary300, ${e(s.secondary300)})));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}
${ge.mediaRules()}`;const ve=new i;var fe=t`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${e(s.secondary300)});
}
${ve.mediaRules()}`;const ye=new i;const _e={dark:t`
    ${t`[ambient^=dark] {
  --bbva-divider-color: var(--colorsSecondary300, ${e(s.secondary300)});
}
${ye.mediaRules()}`}
  `,light:t`
    ${fe}
  `};class xe extends(n(c)){static get is(){return"bbva-divider"}static get properties(){return{size:{type:String}}}constructor(){super(),this.size="full"}firstUpdated(){this.setAttribute("aria-hidden",!0)}static get styles(){return[be,_e.light,_e.dark,m("bbva-divider-shared-styles")]}render(){return b` <hr divider="${this.size}" /> `}}x("colors.cool40");var Se=t`:host {
  display: block;
  box-sizing: border-box;
}

:host [data-tag-name=bbva-form-input] [data-tag-name=bbva-form-amount] .slot-input::slotted(input) {
  background-color: var(--colorsTertiaryType1Dark, ${e(s.tertiaryType1Dark)});
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

.center-item {
  display: table;
  margin: 0 auto 1rem auto;
}

.default-padding {
  padding: 1rem;
}
`;class $e extends(ht(q(l(c)))){static get is(){return"loan-relocation-input"}static get scopedElements(){const t=[bt,h];return $e.scopedElementsFromClasses(t)}static get properties(){return{maxAmount:{type:Number},minAmount:{type:Number},multiplo:{type:Number},localCurrency:{type:String},textPayment:{type:String},infoMessage:{type:String},errorMessage:{type:String},currencyCode:{type:String},label:{type:String},_invalidAmount:{type:Boolean},amount:{type:Number}}}constructor(){super(),this.amount=0,this.multiplo=0,this.maxAmount=0,this.minAmount=0,this.currencyCode="",this.localCurrency="",this.textPayment="",this.errorMessage="",this.infoMessage="",this.label="",this._amount=0,this._invalidAmount=!1,this._isNotFirstValidation=!1}reset(){this.multiplo=0,this.maxAmount=0,this.minAmount=0,this.localCurrency="",this.textPayment="",this.errorMessage="",this.infoMessage="",this.label="",this._amount=0,this._invalidAmount=!1,this._isNotFirstValidation=!1}resetInput(){this._amount=0,this._invalidAmount=!1,this._isNotFirstValidation=!1,this.loanInput.clearInput(),this.requestUpdate()}_inputChanged(t){t.stopPropagation();const{detail:{value:e}}=t;this._setPropertiesInput(e),this.dispatchEvent(new CustomEvent(`${$e.is}-changed`,{detail:{amount:this._amount,invalid:this._invalidAmount},bubbles:!0,composed:!0}))}_setPropertiesInput(t){this._amount=Number(t.replaceAll(",",""));const e=this._amount>this.maxAmount||this._amount<this.minAmount;this._isNotFirstValidation?this._amount?this._invalidAmount=e||this._amount%this.multiplo:this._invalidAmount=!0:this._invalidAmount=!1,this._isNotFirstValidation=!0,this.requestUpdate()}_setErrorMessage(t,e,a){return t?e:a}_setInfoMessage(t,e){return e?"":t}get loanInput(){return this._loanFormAmount||(this._loanFormAmount=this.shadowRoot.querySelector('[data-tag-name="bbva-form-input"]').shadowRoot.querySelector('[data-tag-name="bbva-form-amount"]')),this._loanFormAmount}static get styles(){return[Se,m("loan-relocation-input-shared-styles")]}render(){return b`
      <bbva-form-input
        clear-accessible-text="${this.t("bbva-feature-loan-relocation-input-clean-aria-label")}"
        class = "default-padding"
        type = "amount"
        .amount = ${this.amount}
        .label = ${this.label}
        .maxAmount = ${this.maxAmount}
        .minAmount = ${this.minAmount}
        .multiplo = ${this.multiplo}
        .currencyCode = ${this.currencyCode}
        .localCurrency = ${this.localCurrency}
        .language = ${this.language}
        ?invalid = ${this._invalidAmount}
        .errorMessage = ${this._setErrorMessage(this._amount,this.errorMessage,this.infoMessage)}
        .infoMessage = ${this._setInfoMessage(this.infoMessage,this._invalidAmount)}
        @form-amount-input-change = ${this._inputChanged}}
      >
      </bbva-form-input>
    `}}customElements.define($e.is,$e);var ke=t`:host {
  display: block;
  box-sizing: border-box;
}

.textList {
  display: flex;
  padding: 0 1rem;
}

[data-tag-name=bbva-text] {
  margin: -0.5rem 0;
}

.text {
  flex-grow: 1;
}
`;class Te extends(ht(q(l(c)))){static get is(){return"loan-relocation-list"}static get scopedElements(){const t=[h];return Te.scopedElementsFromClasses(t)}static get styles(){return[ke,m("loan-relocation-list-shared-styles")]}static get properties(){return{text:{type:String},secondText:{type:String,attribute:"second-text"},thirdText:{type:String,attribute:"third-text"},size:{type:String}}}constructor(){super(),this.text="",this.secondText="",this.thirdText="",this.size=""}render(){return b`
    <div class = textList>
      <bbva-text
        class = "text"
        .text = ${this.text}
        .size = ${this.size}
      ></bbva-text>
      <bbva-text
        class = "list"
        .text = ${this.secondText}
        alignment = "right"
        .size = ${this.size}
      ></bbva-text>
      <bbva-text
        .text = ${this.thirdText}
        alignment = "right"
        .size = ${this.size}
        font-weight = "500"
      ></bbva-text>
    </div>
    `}}customElements.define(Te.is,Te);var Pe=t`:host {
  display: block;
  box-sizing: border-box;
}

.vignettes {
  width: 0.1rem;
  margin-right: 0.5rem;
  margin-left: 1.5rem;
  padding: 0.4rem;
  font-size: italic;
  background-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  color: var(--colorsSecondary600, ${e(s.secondary600)});
  box-shadow: -0.05rem 0.05rem 0.1rem black;
}

.text {
  margin-top: -2rem;
  padding-left: 3rem;
}

.percentage {
  margin-top: -2.5rem;
  padding-right: 1.3rem;
}
`;class Le extends(ht(q(l(c)))){static get is(){return"loan-relocation-ordered-list"}static get scopedElements(){const t=[h,G];return Le.scopedElementsFromClasses(t)}static get styles(){return[Pe,m("loan-relocation-ordered-list-shared-styles")]}static get properties(){return{text:{type:String},secondText:{type:String,attribute:"second-text"},percentage:{type:String,attribute:"percentage"},secondPercentage:{type:String,attribute:"second-percentage"},size:{type:String}}}constructor(){super(),this.text="",this.secondText="",this.percentage="",this.secondPercentage="",this.size=""}render(){return b`
      <div class = "ordered-list">
        <p class = "vignettes"></p>
        <bbva-text
          class = "text"
          size = "M"
          .text = ${this.text}>
        </bbva-text>
        <bbva-text
          class = "percentage"
          text = ${this.percentage}
          alignment = "right"
          .size = ""
          font-weight = "500"
        ></bbva-text>
      </div>
      <div class = "ordered-list">
        <p class = "vignettes"></p>
        <bbva-text
          class = "text"
          size = "M"
          font-weight = "500"
          .text = ${this.secondText}>
        </bbva-text>
        <bbva-text
          class = "percentage"
          text = ${this.secondPercentage}
          alignment = "right"
          .size = ""
          font-weight = "500"
        ></bbva-text>
      </div>
    `}}customElements.define(Le.is,Le);const Ce=new i;var De=t`:host {
  box-sizing: border-box;
  position: absolute;
  bottom: 0rem;
  left: 0;
  z-index: 0;
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

:host(sticky) {
  box-shadow: none;
}

:host([sticky]) {
  padding: 0.5rem 0;
  position: sticky;
  display: block;
  bottom: 0rem;
  box-shadow: none;
  transform: translateY(10%);
  background: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  animation: sticky-in-animation 500ms cubic-bezier(0, 0, 0.1, 1) 1s 1 normal forwards;
  animation-fill-mode: forwards;
}

:host([sticky][shadowed]) {
  box-shadow: 0 -0.28rem 0.28rem -0.2rem rgba(18, 18, 18, 0.45);
}

@keyframes sticky-in-animation {
  from {
    transform: translateY(10%);
  }
  to {
    transform: translateY(20%);
  }
}
.text-margin {
  margin-bottom: -0.8rem;
}

.icon-info {
  margin-left: 0.8rem;
  margin-right: 0.5rem;
}

.icon-text {
  display: flex;
  margin-top: -1rem;
  width: 20rem;
  margin-left: auto;
  margin-right: auto;
}

.icon-text [data-tag-name=bbva-text] {
  margin-top: -0.7rem;
  margin-bottom: 1.5rem;
}
${Ce.mediaRules()}`;class Ee extends(n(l(P(c)))){static get is(){return"loan-relocation-fixed"}static get scopedElements(){const t=[G,d,F,h];return Ee.scopedElementsFromClasses(t)}static get properties(){return{sticky:{type:Boolean,reflect:!0},text:{type:String},principalAmount:{type:Number,attribute:"principal-amount"},label:{type:String},message:{type:String},localCurrency:{type:String},language:{type:String},currencyCode:{type:String}}}constructor(){super(),this.text="",this.sticky=!1,this.principalAmount=0,this.label="",this.message="",this.localCurrency="",this.language="",this.currencyCode=""}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.sticky&&(this._observer=new IntersectionObserver((([t])=>{t.target.toggleAttribute("shadowed",t.intersectionRatio<1)}),{threshold:1}),this._observer.observe(this))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._observer&&this._observer.unobserve(this)}static get styles(){return[De,m("loan-relocation-fixed-shared-styles"),H.dark]}render(){return b`
    <div class = "footer">
      <bbva-text
        class = "text-margin"
        alignment = "center"
        .text = ${this.text}
      ></bbva-text>

      <bbva-amount
        class = "text-margin"
        variant = "4xl"
        .amount = ${this.principalAmount}
        currency-code = ${this.currencyCode}
        language = ${this.language}
        local-currency = ${this.localCurrency}
      ></bbva-amount>

      <bbva-text
        font-style = "italic"
        alignment = "center"
        .text = ${this.label}
      ></bbva-text>

      <div class = "icon-text">
        <bbva-icon
          class = "icon-info"
          icon = ${D()}
          icon-color = "#043263"
        ></bbva-icon>
        <bbva-text
          alignment = "center"
          .text = ${this.message}
          size = "2XS"
        ></bbva-text>
      </div>
    </div>
    `}}customElements.define(Ee.is,Ee);var Re=t`:host {
  display: block;
  box-sizing: border-box;
  --bbva-help-modal-footer-bg-color: transparent;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Ie extends(ht(q(l(c)))){static get is(){return"loan-relocation-modal-manager"}static get scopedElements(){const t=[V,h];return Ie.scopedElementsFromClasses(t)}static get styles(){return[Re,m("loan-relocation-modal-manager-shared-styles")]}static get properties(){return{_modalId:{type:String},_fullHeightModal:{type:Boolean},_hideContentPaddingTopModal:{type:Boolean},_fixedFooterModal:{type:Boolean},_headerTypeModal:{type:String},_modalType:{type:String},_iconRightPrimaryHeaderModal:{type:String},_iconRightSecondaryHeaderModal:{type:String},_iconLeftPrimaryHeaderModal:{type:String},_iconLeftSecondaryHeaderModal:{type:String},_headerTextModal:{type:String},_titleIconModal:{type:String},_titleTextModal:{type:String},_listTextModal:{type:Array},_bodyTextModal:{type:String},_buttonTextModal:{type:String},_linkTextModal:{type:String},_modalHelp:{type:Object},_divModal:{type:String},isLoading:{type:Boolean}}}constructor(){super(),this._modalId="",this._fullHeightModal=!1,this._hideContentPaddingTopModal=!1,this._fixedFooterModal=!1,this._headerTypeModal="",this._modalType="",this._iconRightPrimaryHeaderModal="",this._iconRightSecondaryHeaderModal="",this._iconLeftPrimaryHeaderModal="",this._iconLeftSecondaryHeaderModal="",this._headerTextModal="",this._titleIconModal="",this._titleTextModal="",this._listTextModal=[],this._bodyTextModal="",this._buttonTextModal="",this._linkTextModal="",this._divModal="",this.isLoading=!1}openWithSettings(t){this.reset(),this._divModal=t.divModal,this._modalId=t.modalId,this._fullHeightModal=t.fullHeightModal,this._hideContentPaddingTopModal=t.hideContentPaddingTopModal,this._fixedFooterModal=t.fixedFooterModal,this._headerTypeModal=t.headerTypeModal,this._modalType=t.modalType,this._iconRightPrimaryHeaderModal=t.iconRightPrimaryHeaderModal,this._iconRightSecondaryHeaderModal=t.iconRightSecondaryHeaderModal,this._iconLeftPrimaryHeaderModal=t.iconLeftPrimaryHeaderModal,this._iconLeftSecondaryHeaderModal=t.iconLeftSecondaryHeaderModal,this._headerTextModal=t.headerTextModal,this._titleIconModal=t.titleIconModal,this._titleTextModal=t.titleTextModal,this._listTextModal=t.listTextModal,this._bodyTextModal=t.bodyTextModal,this._buttonTextModal=t.buttonTextModal,this._linkTextModal=t.linkTextModal,this._bbvaHelpModalClass=t.bbvaHelpModalClass,this.requestUpdate(),this.open()}reset(){this._modalId="",this._fullHeightModal=!1,this._hideContentPaddingTopModal=!1,this._fixedFooterModal=!1,this._headerTypeModal="",this._modalType="",this._iconRightPrimaryHeaderModal="",this._iconRightSecondaryHeaderModal="",this._iconLeftPrimaryHeaderModal="",this._iconLeftSecondaryHeaderModal="",this._headerTextModal="",this._titleIconModal="",this._titleTextModal="",this._listTextModal=[],this._bodyTextModal="",this._buttonTextModal="",this._linkTextModal="",this._divModal=""}open(){this.isLoading&&(this._fireEvent(`${Ie.is}-open-modal`,this._modalId),this._bbvaHelpModal.open(),this._fireEvent(`${Ie.is}-fire-mark`,this._modalId))}_fireEvent(t="",e={}){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}close(){this._bbvaHelpModal.close()}_fireModalEvents(t){this.dispatchEvent(new CustomEvent(`${Ie.is}-${t}-${this._modalId}`,{bubbles:!0,composed:!0,detail:!0}))}get _bbvaHelpModal(){return this._modalHelp||(this._modalHelp=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]')),this._modalHelp}render(){return b`
      <bbva-help-modal
        ?isLoading = ${this.isLoading}
        class = ${this._bbvaHelpModalClass}
        ?full-height = ${this._fullHeightModal}
        ?hide-content-padding-top = ${this._hideContentPaddingTopModal}
        ?fixed-footer = ${this._fixedFooterModal}
        header-type = ${v(this._headerTypeModal)}
        modal-type = ${v(this._modalType)}
        icon-right-primary = ${v(this._iconRightPrimaryHeaderModal)}
        icon-right-secondary = ${v(this._iconRightSecondaryHeaderModal)}
        icon-left-primary = ${v(this._iconLeftPrimaryHeaderModal)}
        icon-left-secondary = ${v(this._iconLeftSecondaryHeaderModal)}
        header-text = ${v(this._headerTextModal)}
        title-icon = ${v(this._titleIconModal)}
        title-text = ${v(this._titleTextModal)}
        body-text = ${v(this._bodyTextModal)}
        button-text = ${v(this._buttonTextModal)}
        link-text = ${v(this._linkTextModal)}
        @help-modal-header-left-primary-click = ${()=>this._fireModalEvents("header-left-primary")}
        @help-modal-footer-button-click = ${()=>this._fireModalEvents("accept-button")}
        @help-modal-footer-link-click = ${()=>this._fireModalEvents("link-button")}>
        ${this._divModal?b`
          <div class = "content" slot = "slot-content">
            <bbva-text
              alignment = "center"
              text = ${this.t(this._divModal,{newLine:"<br>",openDiv:"<div>",closeDiv:"</div>",openParagraph:"<p>",closeParagraph:"</p>",highlight:'<span class = "highlight">',endHighlight:"</span>"})}>
            </bbva-text>
          </div>`:O}
      </bbva-help-modal>
    `}}customElements.define(Ie.is,Ie);var Ae=t`:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-header-main] {
  background-color: var(--colorsPrimaryCore, ${e(s.primaryCore)});
}

.header, .text {
  background-color: var(--colorsPrimaryCore, ${e(s.primaryCore)});
  --_highlight-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  padding-bottom: 0.5rem;
}

[data-tag-name=bbva-expandable-step] {
  --bbva-expandable-step-defauld-content-max-height: (max-height-expandable-step, 960rem);
  padding-bottom: 0.5rem;
}

[data-tag-name=bbva-expandable-step] [data-tag-name=loan-relocation-list] {
  --bbva-text-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
}

[data-tag-name=bbva-notification-message] {
  margin: 0 1rem -2rem 1rem;
}

[data-tag-name=bbva-list-bullet] {
  text-align: left;
}

[data-tag-name=bbva-header-category] {
  padding: 1rem 1rem 0 1rem;
}

.description, .text {
  padding: 0 1rem;
}

.bbvatextmargin {
  margin-bottom: -0.8rem;
}

[data-tag-name=bbva-text].list {
  margin-top: -3.5rem;
}

div .terminos [data-tag-name=bbva-text] {
  margin: -2.5rem 0 1.5rem 2rem;
}

.check {
  text-align: left;
  margin-bottom: 0.5rem;
}

.amountStep[data-tag-name=bbva-amount], p {
  color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  text-align: left;
  display: block;
  margin-top: -1rem;
  margin-bottom: 0.8rem;
  padding-left: 1rem;
}

[data-tag-name=bbva-badge-icon] {
  margin-top: -2rem;
}

.terms {
  margin-bottom: 1.5rem;
  text-align: left;
}

.step-disabled {
  filter: grayscale(80);
}

.links {
  display: flex;
  flex-direction: column;
}

.divider {
  margin-top: 0.3rem;
  margin-bottom: 0.3rem;
}

.button-one {
  margin-top: 1.5rem;
}

#footer {
  background: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  padding: 1.5rem 0;
  width: 100%;
}

.checks {
  display: flex;
}

.textCheck {
  margin-top: -0.3rem;
}

.content {
  margin-top: -1rem;
}

.badge-icon {
  padding-top: 1rem;
}

.secondary-cmb-link {
  margin: 1rem 0;
}

.summary-cmb-link {
  margin: 1rem 0 0;
}
`;class Me extends(ht(q(l(c)))){static get is(){return"bbva-feature-loan-relocation-detail"}static get scopedElements(){const t=[_t,j,h,xe,N,$e,F,z,G,L,U,Ee,Le,C,d,X,W,Te,pe,K,Ie,...Me.configurationScopedElements()];return Me.scopedElementsFromClasses(t)}static get styles(){return[Ae,H.dark]}static get properties(){return{amount:{type:Number},iva:{type:String},term:{type:String},liquidated:{type:String},available:{type:String},lifeInsurance:{type:String},monthlyInterest:{type:String},annualInterest:{type:String},cat:{type:String},account:{type:String},interestNow:{type:Number},commission:{type:Number},commissionNow:{type:Number},secondAccount:{type:String},errorMessage:{type:String},iconClose:{type:String},minAmount:{type:Number},maxAmount:{type:Number},multiplo:{type:Number},checksAcceptedCaseOne:{type:Array},checksAcceptedCaseTwo:{type:Array},disabled:{type:Boolean},flaglifeinsurance:{type:Boolean},flagUnemployment:{type:Boolean},flagUninsured:{type:Boolean},flagCommission:{type:Boolean},flagImprovedInterest:{type:Boolean},flagFiredTermsConditionsAnalytics:{type:Boolean},flagLifeInsuranceBestInterest:{type:Boolean},cases:{type:Object},offerDetail:{type:Object},loanDetail:{type:Object},initialAmount:{type:Number},loading:{type:Boolean},flagInit:{type:Boolean},localCurrency:{type:String},language:{type:String},showFlujo:{type:Boolean,reflect:!0},isStepTwoDisable:{type:Boolean},callMeBackHeaderBtn:{type:String,attribute:"call-me-back-header-btn"},callMeBackSecondaryBtnText:{type:String,attribute:"call-me-back-secondary-btn-text"},callMeBackSummaryBtnText:{type:String,attribute:"call-me-back-summary-btn-text"},currencyCode:{type:String},errosLoanRelocate:{type:Object},_isStepOneCompleted:{type:Boolean},_isStepTwoCompleted:{type:Boolean},_isEnabledCheck:{type:Boolean,reflect:!0},_loanRelocationModalManagerElement:{type:Object},_catCalculationDate:{type:String},_dateOptions:{type:Object},_catCalculationDateEnd:{type:String},_analyticsDynamicData:{type:Object},_errorLoanRelocateCatalog:{type:Object},_flagAppStartedFired:{type:Boolean},_flagPageVisitFired:{type:Boolean},isLoading:{type:Boolean}}}constructor(){super(),this.flagInit=!1,this.amount=0,this.maxAmount=0,this.minAmount=0,this.multiplo=100,this.iva=0,this.term="",this.liquidated="",this.available="",this.lifeInsurance="",this.monthlyInterest="",this.annualInterest="",this.interestNow="",this.commission="",this.commissionNow="",this.cat="",this.secondAccount="",this.errorMessage="",this.callMeBackHeaderBtn="",this.callMeBackSecondaryBtnText="",this.callMeBackSummaryBtnText="",this._isStepOneCompleted=!1,this._isStepTwoCompleted=!1,this.isStepTwoDisable=!1,this.showFlujo=!1,this.iconHelp="bbva:help",this.iconClose="bbva:close",this.disabled=!1,this._isEnabledCheck=!1,this.checksAcceptedCaseOne=[],this.checksAcceptedCaseTwo=[],this.flaglifeinsurance=!1,this.flagUnemployment=!1,this.flagUninsured=!1,this.flagLifeInsuranceBestInterest=!1,this.flagCommission=!1,this.flagCommissionInterestRate=!1,this.flagCommissionBestInterest=!1,this.flagImprovedInterest=!1,this.flagFiredTermsConditionsAnalytics=!1,this.infoCheck=[],this.infoCheck2=[],this._bullets1=[{bullet:"bbva-feature-loan-relocation-benefits-liquidate"},{bullet:"bbva-feature-loan-relocation-benefits-anticipated"},{bullet:"bbva-feature-loan-relocation-benefits-payments"},{bullet:"bbva-feature-loan-relocation-benefits-renovate-loan"},{bullet:"bbva-feature-loan-relocation-benefits-charge-single"}],this._bullets2=[{bullet:"bbva-feature-loan-relocation-benefits-anticipated"},{bullet:"bbva-feature-loan-relocation-benefits-liquidate"},{bullet:"bbva-feature-loan-relocation-benefits-payments"},{bullet:"bbva-feature-loan-relocation-benefits-renovate-loan"}],this.offerDetail={},this.loanDetail={},this.initialAmount=0,this.loading=!1,this.currencyCode="",this._catCalculationDate="",this._catCalculationDateEnd="",this._dateOptions={day:"2-digit",month:"long",year:"numeric"},this._analyticsDynamicData={},this._errorLoanRelocateCatalog={technicalError:"rechazo por servicio",creditProfileError:"rechazo por perfil",previousCreditError:"rechazo por credito"},this._flagAppStartedFired=!1,this._flagPageVisitFired=!1,this.errosLoanRelocate={technicalError:["UGE5202","UGE5201","functionalError"],creditProfileError:["UGE5206","UGE5205"],previousCreditError:["UGE5207","UGE5208","UGE5770"]},this.isLoading=!1}updated(t){t.has("flagInit")&&this.flagInit&&(this.infoCheck2=[{label:"bbva-feature-loan-relocation-check-accept-terms-conditions"},{label:"bbva-feature-loan-relocation-check-accept-liquidate-balance",params:{liquidated:this.liquidated,account:this.secondAccount}},{label:"bbva-feature-loan-relocation-check-credit-record"}],this.infoCheck=[{label:"bbva-feature-loan-relocation-check-accept-terms-conditions"},{label:"bbva-feature-loan-relocation-check-accept-liquidate-balance",params:{liquidated:this.liquidated,account:this.secondAccount}},{label:"bbva-feature-loan-relocation-check-accept-contract-insurance",params:{lifeInsurance:this.lifeInsurance}},{label:"bbva-feature-loan-relocation-check-credit-record"}],this.flagInit=!1),t.has("_isStepOneCompleted")&&!0===this._isStepOneCompleted&&(this.currentStep=2,this.indentifyStep(this.currentStep)),t.has("_isStepTwoCompleted")&&!0===this._isStepTwoCompleted&&(this.currentStep=3,this.indentifyStep(this.currentStep))}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t)}init(){this.offerDetail.fees.itemizeFees.length&&(this.flagCommission=!0),"SEGURO DE VIDA Y DESEMPLEO"===this.offerDetail.details.additionalProducts[0].id&&(this.flagUnemployment=!0),"SEGURO DE VIDA"===this.offerDetail.details.additionalProducts[0].id&&(this.flaglifeinsurance=!0),this._fillData(this.offerDetail,this.loanDetail),this.initialAmount=this.amount,this.flagInit=!0,this.requestUpdate();const t=this.loanDetail.product.name.includes("PPI")?"prestamo personal inmediato":"prestamo nomina";this._persitAnalyticsData({productName:t,typology:this.flaglifeinsurance||this.flagUnemployment?"con seguro":"sin seguro"}),this._flagPageVisitFired||(this._dispatchCustomEvent("oc-loan-relocation-analytics-app-page-visit",this._analyticsDynamicData),this._flagPageVisitFired=!0),this.currentStep=1}reset(){this._isStepOneCompleted=!1,this._isStepTwoCompleted=!1,this.isStepTwoDisable=!1,this.showFlujo=!1,this._isEnabledCheck=!1,this.checksAcceptedCaseOne=this.checksAcceptedCaseOne.map((()=>!1)),this.checksAcceptedCaseTwo=this.checksAcceptedCaseTwo.map((()=>!1)),this._pageInicial(),this.currentStep=0,this._flagAppStartedFired=!1,this._flagPageVisitFired=!1,this.errosLoanRelocate={}}_persitAnalyticsData(t){Object.assign(this._analyticsDynamicData,t),this._fireEvent(`${Me.is}-persit-analytics-data`,this._analyticsDynamicData)}handleErrorLoanRelocateAnalytics(t){var e,a;let i;const s={technicalError:["UGE5202","UGE5201","functionalError"],creditProfileError:["UGE5206","UGE5205"],previousCreditError:["UGE5207","UGE5208","UGE5770"]},o=null==t||null===(e=t.detail)||void 0===e||null===(a=e.messages[0])||void 0===a?void 0:a.code;s.technicalError.includes(o)?i="technicalError":s.creditProfileError.includes(o)?i="creditProfileError":s.previousCreditError.includes(o)&&(i="previousCreditError"),this._persitAnalyticsData({userSegmentProfile:void 0!==i?this._errorLoanRelocateCatalog[i]:""}),this._dispatchCustomEvent("oc-loan-relocation-analytics-app-completed-rejected",this._analyticsDynamicData)}indentifyStep(t){this._persitAnalyticsData({applicationAmount:this.amount,applicationPaymentAmount:this.iva,paymentDuration:this.offerDetail.details.allowedTerms[0].number,allowedTermsFrecuency:this.frequencyValue,productInterestRate:parseFloat(this.cat),serviceCharge:parseFloat(this.commission||0),offer:this.flagCommission?"con revire":"sin revire"}),t&&2===t?!this.flagFiredTermsConditionsAnalytics&&this.isStepTwoDisable&&(this._fireEvent("oc-loan-relocation-analytics-app-step-2-terms-and-conditions",this._analyticsDynamicData),this.flagFiredTermsConditionsAnalytics=!0):t&&3===t&&this._fireEvent("oc-loan-relocation-analytics-app-step-3-confirmation",this._analyticsDynamicData)}getLastDijist(t,e,a){return e.length<a?e:`${t}-${e.substring(e.length-a)}`}openModalHelpManager(t){this.loanRelocationModalManager.openWithSettings(t)}setModalTerms(){const t={modalId:"help-modal-terms",fullHeightModal:!0,fixedFooterModal:!0,iconLeftPrimaryHeaderModal:this.iconClose,headerTextModal:this.t("bbva-feature-loan-relocation-modal-terms-document-header-text"),titleTextModal:this.t("bbva-feature-loan-relocation-modal-terms-document-title-text",{newLine:"<br>"}),bodyTextModal:this.t("bbva-feature-loan-relocation-modal-terms-document-body-text"),buttonTextModal:this.t("bbva-feature-loan-relocation-modal-terms-document-button-text"),titleIconModal:this.iconHelp,headerTypeModal:"modal-three-level"};this.openModalHelpManager(t)}setModalUnemployment(){const t={divModal:this.t("bbva-feature-loan-relocation-modal-life-insurance-unemployment-body-text",{newLine:"<br>",highlight:'<span class = "highlight">',timeLimit:"30",endHighlight:"</span>",refundTime:"5"}),modalId:"help-modal-unemployment",headerTextModal:this.t("bbva-feature-loan-relocation-modal-life-insurance-unemployment-header-text"),titleTextModal:this.t("bbva-feature-loan-relocation-modal-life-insurance-unemployment-title-text"),buttonTextModal:this.t("bbva-feature-loan-relocation-modal-life-insurance-button-text"),fullHeightModal:!0,iconLeftPrimaryHeaderModal:this.iconClose,titleIconModal:this.iconHelp,headerTypeModal:"modal-three-level"};this.openModalHelpManager(t)}setModalWarning(){const t={modalId:"warning-modal",modalType:"warning",buttonTextModal:this.t("bbva-feature-loan-relocation-modal-warning-button-text"),bodyTextModal:this.t("bbva-feature-loan-relocation-modal-warning-body-text"),linkTextModal:this.t("bbva-feature-loan-relocation-modal-warning-link-text"),titleIconModal:I(),headerTypeModal:"modal-three-level"};this.openModalHelpManager(t)}setModalOfferError(){const t={modalId:"error-modal",modalType:"warning",titleTextModal:this.t("bbva-feature-loan-relocation-modal-error-title-text"),buttonTextModal:this.t("Reintentar"),bodyTextModal:this.t("bbva-feature-loan-relocation-modal-error-body-text"),linkTextModal:this.t("bbva-feature-loan-relocation-modal-error-link-text"),titleIconModal:I(),headerTypeModal:"modal-three-level"};this.openModalHelpManager(t)}setModalDataError(){const t={modalId:"error-modal-two",modalType:"warning",titleTextModal:this.t("bbva-feature-loan-relocation-modal-error-title-text"),buttonTextModal:this.t("bbva-feature-loan-relocation-modal-error-link-text"),bodyTextModal:this.t("bbva-feature-loan-relocation-modal-error-body-two-text"),titleIconModal:I(),headerTypeModal:"modal-three-level"};this._dispatchCustomEvent("oc-loan-relocation-analytics-app-communication-error"),this.openModalHelpManager(t)}setModalTechnicalError(){const t={modalId:"error-modal-three",modalType:"warning",titleTextModal:this.t("bbva-feature-loan-relocation-modal-error-three-title-text"),buttonTextModal:this.t("bbva-feature-loan-relocation-modal-error-button-text"),bodyTextModal:this.t("bbva-feature-loan-relocation-modal-error-three-body-text"),linkTextModal:this.t("bbva-feature-loan-relocation-modal-error-link-text"),titleIconModal:I(),headerTypeModal:"modal-three-level"};this.openModalHelpManager(t)}setModalOperationError(){const t={modalId:"error-modal-four",modalType:"warning",titleTextModal:this.t("bbva-feature-loan-relocation-modal-error-four-title-text"),buttonTextModal:this.t("bbva-feature-loan-relocation-modal-error-link-text"),bodyTextModal:this.t("bbva-feature-loan-relocation-modal-error-four-body-text"),titleIconModal:I(),headerTypeModal:"modal-three-level"};this.openModalHelpManager(t)}setModalTechLoanError(){const t={modalId:"error-modal-five",modalType:"warning",titleTextModal:this.t("bbva-feature-loan-relocation-modal-error-five-title-text"),buttonTextModal:this.t("bbva-feature-loan-relocation-modal-error-link-text"),bodyTextModal:this.t("bbva-feature-loan-relocation-modal-error-five-body-text"),titleIconModal:I(),headerTypeModal:"modal-three-level"};this.openModalHelpManager(t)}setModalInterest(){const t={divModal:"bbva-feature-loan-relocation-modal-interest-rate-body-text",modalId:"help-modal-interest",headerTextModal:this.t("bbva-feature-loan-relocation-modal-interest-rate-header-text"),titleTextModal:this.t("bbva-feature-loan-relocation-modal-interest-rate-title-text",{newLine:"<br>"}),buttonTextModal:this.t("bbva-feature-loan-relocation-modal-life-insurance-button-text"),fullHeightModal:!0,iconLeftPrimaryHeaderModal:this.iconClose,titleIconModal:this.iconHelp,headerTypeModal:"modal-three-level"};this.openModalHelpManager(t)}setModalComission(){const t={divModal:"bbva-feature-loan-relocation-modal-commission-body-text",modalId:"help-modal-commission",headerTextModal:this.t("bbva-feature-loan-relocation-modal-commission-header-text"),titleTextModal:this.t("bbva-feature-loan-relocation-modal-commission-title-text"),buttonTextModal:this.t("bbva-feature-loan-relocation-modal-commission-button-text"),fullHeightModal:!0,fixedFooterModal:!0,iconLeftPrimaryHeaderModal:this.iconClose,titleIconModal:this.iconHelp,headerTypeModal:"modal-three-level"};this.openModalHelpManager(t)}setModalHelp(){const t={divModal:"bbva-feature-loan-relocation-modal-life-insurance-body-text",modalId:"help-modal",headerTextModal:this.t("bbva-feature-loan-relocation-modal-life-insurance-header-text"),titleTextModal:this.t("bbva-feature-loan-relocation-modal-life-insurance-header-text"),buttonTextModal:this.t("bbva-feature-loan-relocation-modal-life-insurance-button-text"),fullHeightModal:!0,iconLeftPrimaryHeaderModal:this.iconClose,titleIconModal:this.iconHelp,headerTypeModal:"modal-three-level"};this.openModalHelpManager(t)}closeModalGeneric(){this.loanRelocationModalManager.close()}closeModalWarning(){this._fireEvent("component-reset",!0)}formatAmount(t){return new Intl.NumberFormat(this.language,{style:"currency",currency:this.localCurrency}).format(t)}checksTermsLoan(){const t=this.checksAcceptedCaseOne.every((t=>!0===t));this.checksAcceptedCaseOne.length===this.infoCheck.length&&(this._isEnabledCheck=!!t&&!this._isEnabledCheck)}checksTermsLoanInsurance(){const t=this.checksAcceptedCaseTwo.every((t=>!0===t));this.checksAcceptedCaseTwo.length===this.infoCheck2.length&&(this._isEnabledCheck=!!t&&!this._isEnabledCheck)}_headerCategory(t,e){return b`
      <bbva-header-category
        accessible-text = ${t}
        id = "header-category"
        text = ${t}
        has-help
        icon-help = ${this.iconHelp}
        @header-category-help-click = ${e}
      ></bbva-header-category>
    `}multistep(){return b`
      <bbva-expandable-multistep
        class = "scrollable"
        has-confirm-animation
        hide-step-numbers = "">
        <div slot = "content">
          ${this._stepLoanRenewalSummary()}
          ${this._stepTermsConditions()}
        </div>
        <div class = "wrapper" slot = "confirmation" id = "footer">
          <bbva-button-default
            fullwidth = ""
            class = "button"
            variant = "positive"
            text = ${this.t("bbva-feature-loan-relocation-summary-page-button")}
            @click = ${this._requestRelocate}>
          </bbva-button-default>
          ${this.callMeBackSummaryBtnText?b`
              <br>
              <bbva-link
                class="summary-cmb-link"
                icon="${Q()}"
                @click="${this._handleCallMeBackBtnClick}">
                <span>${this.t(this.callMeBackSummaryBtnText)}</span>
              </bbva-link>`:null}
        </div>
      </bbva-expandable-multistep>
    `}get loanRelocationModalManager(){return this._loanRelocationModalManagerElement||(this._loanRelocationModalManagerElement=this.shadowRoot.querySelector('[data-tag-name = "loan-relocation-modal-manager"]')),this._loanRelocationModalManagerElement}_comparativeList(t,e,a,i){return b`
      <loan-relocation-ordered-list
        text = ${t}
        second-text = ${a}
        percentage = ${e}
        second-percentage = ${i}
      ></loan-relocation-ordered-list>
    `}_fireEvent(t,e={}){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_fillData(t,e){if(this.secondAccount=`•${e.number.slice(-5)}`,this.liquidated=this.formatAmount(e.pendingAmount.totals[0].amount),"MONTHLY"===t.details.allowedTerms[0].frequency?this.term=`${t.details.allowedTerms[0].number} ${this.t("bbva-feature-loan-relocation-months")}`:this.term=`${t.details.allowedTerms[0].number} ${this.t("bbva-feature-loan-relocation-biweekly")}`,this.flaglifeinsurance||this.flagUnemployment){const a=t.details.additionalProducts[0].amount.amount;this.lifeInsurance=this.formatAmount(a),this.available=this.formatAmount(t.details.suggestedAmount.amount-e.pendingAmount.totals[0].amount-t.details.additionalProducts[0].amount.amount)}if(this.flagCommission){const a=t.details.suggestedAmount.amount*t.fees.itemizeFees[1].percentage/100,i=16;let s=0;e.product.name.includes("PPI")&&(s=a/100*i),this.commission=`${t.fees.itemizeFees[1].percentage.toFixed(2)}%`,this.available=this.formatAmount(t.details.suggestedAmount.amount-e.pendingAmount.totals[0].amount-a-s)}this.minAmount=t.details.minimumAmount.amount,this.maxAmount=t.details.maximumAmount.amount,this.amount=t.details.suggestedAmount.amount;const{rates:a}=t;a.forEach((t=>{"CAT"===t.rateType.id?(this.cat=`${t.unit.percentage.toFixed(2)}%`,this._catCalculationDate=this._formatDate(t.calculationDate),this._catCalculationDateEnd=this._formatDate(t.calculationDate,!0)):"TASA_ANUAL"===t.rateType.id?this.annualInterest=`${t.unit.percentage.toFixed(2)}%`:"TASA_MENSUAL"===t.rateType.id&&(this.monthlyInterest=`${t.unit.percentage.toFixed(2)}%`)}));const{details:{loanBreakDown:i}}=t;i.forEach((t=>{"INSTALLMENT"===t.id&&(this.iva=t.amount)})),this.frequencyValue="","MONTHLY"===t.details.allowedTerms[0].frequency&&(this.frequencyValue="mensual")}_formatDate(t,e=!1){const[a,,i]=t.split("-");let[,s]=t.split("-");e&&(s=new Date(t).getUTCMonth()+7);const o=new Date(a,s-1,i),n=new Intl.DateTimeFormat(this.language,{year:this._dateOptions.year}).format(o),r=new Intl.DateTimeFormat(this.language,{month:this._dateOptions.month}).format(o);return`${new Intl.DateTimeFormat(this.language,{day:this._dateOptions.day}).format(o)} ${r} ${n}`}_clickCheckboxs(t){this.infoCheck.forEach(((e,a)=>{`check-${a}`===t.target.id&&(this.checksAcceptedCaseOne[a]=t.target.checked,this.checksTermsLoan())}))}_clickCheckboxs2(t){this.infoCheck2.forEach(((e,a)=>{`check-${a}`===t.target.id&&(this.checksAcceptedCaseTwo[a]=t.target.checked,this.checksTermsLoanInsurance())}))}_onMultistep(){this.showFlujo=!this.showFlujo,this._isStepOneCompleted=!this._isStepOneCompleted,this.isStepTwoDisable=!this.isStepTwoDisable,this.disabledLink=!this.disabledLink,this._isEnabledCheck=!1,this.checksAcceptedCaseOne=this.checksAcceptedCaseOne.map((()=>!1)),this.checksAcceptedCaseTwo=this.checksAcceptedCaseTwo.map((()=>!1)),this._isStepTwoCompleted=!1,this.currentStep=1,this._appStartedIwantIt(),this.requestUpdate()}_updateStepTwo(){this._isStepTwoCompleted=!this._isStepTwoCompleted,this.currentStep=2}_handleCallMeBackBtnClick(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-feature-loan-relocation-click-call-me-back",{detail:!0,bubbles:!0,composed:!0}))}_handleHeaderRightIconClick(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-feature-loan-relocation-click-header-right-icon",{detail:!0,bubbles:!0,composed:!0}))}_fireAppStartedAnalytic(){this._flagAppStartedFired||(this._fireEvent("oc-loan-relocation-analytics-app-started",this._analyticsDynamicData),this._flagAppStartedFired=!0)}_reloctionList(t,e,a){return b`
      <loan-relocation-list
        text = ${t}
        second-text = ${e}
        third-text = ${a}
      >
      </loan-relocation-list>
    `}_reloctionListDivider(t,e){return b`
      <loan-relocation-list
        class = "divider"
        text = ${t}
        second-text = ${e}
      >
      </loan-relocation-list>
    `}_Bullets({bullet:t}){return b`
      <bbva-list-bullet
        text = ${t}
      ></bbva-list-bullet>
    `}_pageInicial(){return b`
      <div class = "header">
        <bbva-clip-microillustration
          microillustration = "relocationloandollardark">
        </bbva-clip-microillustration>
        ${this.flaglifeinsurance||this.flagUnemployment||this.flagUninsured||this.flagCommission?b`
            <bbva-text
              id="textInsurance"
              class = "text"
              text-color = "#FFFFFF"
              alignment = "center"
              text = ${this.t("bbva-feature-loan-relocation-title-description",{highlight:'<span class="">',endHighlight:"</span>"})}>
            </bbva-text>`:b``}
        ${this.flagLifeInsuranceBestInterest||this.flagCommissionInterestRate?b`
            <bbva-text
              id = "textComission"
              class = "text"
              text-color = "#FFFFFF"
              alignment = "center"
              text = ${this.t("bbva-feature-loan-relocation-title-description-annual-rate",{annualInterest:this.annualInterest,interestNow:this.interestNow,highlight:'<span class = "highlight">',endHighlight:"</span>"})}>
            </bbva-text>`:b``}
        ${this.flagCommissionBestInterest?b`
            <bbva-text
              id = "textBestInterest"
              class = "text"
              text-color = "#FFFFFF"
              alignment = "center"
              text = ${this.t("bbva-feature-loan-relocation-title-description-improved-commission",{highlight:'<span class = "highlight">',endHighlight:"</span>",commission:this.commission,commissionNow:this.commissionNow})}>
            </bbva-text>`:b``}
        ${this.flagImprovedInterest?b`
            <bbva-text
              id = "textImprovedInterest"
              class = "text"
              text-color = "#FFFFFF"
              alignment = "center"
              text = ${this.t("bbva-feature-loan-relocation-title-description-improved-interest",{highlight:'<span class = "highlight">',endHighlight:"</span>",annualInterest:this.annualInterest,interestNow:this.interestNow,commission:this.commission,commissionNow:this.commission_Now})}>
            </bbva-text>`:b``}
      </div>

      <bbva-header-category
        accessible-text = ${this.t("bbva-feature-loan-relocation-initial-page-header")}
        text = ${this.t("bbva-feature-loan-relocation-initial-page-header")}>
      </bbva-header-category>

      <bbva-text
        class = "description"
        text = ${this.t("bbva-feature-loan-relocation-title-description-simulates-renovation",{highlight:'<span class = "highlight">',endHighlight:"</span>",secondAccount:this.secondAccount})}>
      </bbva-text>

      <loan-relocation-input
        minAmount = '${this.minAmount}'
        maxAmount = '${this.maxAmount}'
        multiplo = '${this.multiplo}'
        label = ${this.t("bbva-feature-loan-relocation-initial-page-header-input-text")}
        amount = '${this.amount}'
        localCurrency = ${this.localCurrency}
        currencyCode = '${this.localCurrency}'
        language = ${this.language}
        .errorMessage = ${this.errorMessage}
        infomessage = ${this.t("bbva-feature-loan-relocation-input-message",{minAmount:this.formatAmount(this.minAmount),maxAmount:this.formatAmount(this.maxAmount)})}
        @form-field-input-blur = ${this._dataUpdate}
        @form-field-input-focus = ${this._onFocusInput}>
      </loan-relocation-input>

      ${this._reloctionList(this.t("bbva-feature-loan-relocation-term-loan"),this.term,"")}
      ${this._reloctionList(this.t("bbva-feature-loan-relocation-liquidate-balance"),this.liquidated,"")}

      <bbva-header-category
        accessible-text = ${this.t("bbva-feature-loan-relocation-initial-page-bullets-text")}
        text = ${this.t("bbva-feature-loan-relocation-initial-page-bullets-text")}>
      </bbva-header-category>

      ${this.flaglifeinsurance||this.flagUnemployment||this.flagLifeInsuranceBestInterest?b`${this._bullets1.map((t=>this._Bullets(t)))}`:b`${this._bullets2.map((t=>this._Bullets(t)))}`}

      ${this.flaglifeinsurance||this.flagLifeInsuranceBestInterest?b`${this._headerCategory(this.t("bbva-feature-loan-relocation-header-life-insurance"),this.setModalHelp)}
          ${this._reloctionList(this.t("bbva-feature-loan-relocation-life-insurance-charge"),this.lifeInsurance,"")}`:b``}

      ${this.flagUnemployment?b`${this._headerCategory(this.t("bbva-feature-loan-relocation-header-life-insurance-unemployment"),this.setModalUnemployment)}
          ${this._reloctionList(this.t("bbva-feature-loan-relocation-life-insurance-charge"),this.lifeInsurance,"")}`:b``}

      ${this.flagCommission||this.flagCommissionInterestRate?b`${this._headerCategory(this.t("bbva-feature-loan-relocation-header-commission"),this.setModalComission)}
          ${this._reloctionList(this.t("bbva-feature-loan-relocation-opening-commission-text"),this.commission,"")}`:b``}

      ${this.flagCommissionBestInterest||this.flagImprovedInterest?b`${this._headerCategory(this.t("bbva-feature-loan-relocation-header-commission"),this.setModalComission)}
          ${this._reloctionList(this.t("bbva-feature-loan-relocation-opening-commission-text"),"","")}
          ${this._comparativeList("bbva-feature-loan-relocation-best-interest-before",this.commission,"bbva-feature-loan-relocation-best-interest-now",this.commissionNow)}`:b``}

      ${this.flaglifeinsurance||this.flagUnemployment||this.flagUninsured||this.flagCommission||this.flagCommissionBestInterest?b`${this._headerCategory(this.t("bbva-feature-loan-relocation-header-interest-rates"),this.setModalInterest)}
          ${this._reloctionList(this.t("bbva-feature-loan-relocation-interest-monthly"),"",this.monthlyInterest)}
          ${this._reloctionList(this.t("bbva-feature-loan-relocation-interest-annual"),"",this.annualInterest)}`:b``}

      ${this.flagImprovedInterest||this.flagLifeInsuranceBestInterest||this.flagCommissionInterestRate?b`${this._headerCategory(this.t("bbva-feature-loan-relocation-header-interest-rates"),this.setModalInterest)}
          ${this._reloctionList(this.t("bbva-feature-loan-relocation-interest-monthly"),"",this.monthlyInterest)}
          ${this._reloctionList(this.t("bbva-feature-loan-relocation-interest-annual"),"","")}
          ${this._comparativeList("bbva-feature-loan-relocation-best-interest-before",this.annualInterest,"bbva-feature-loan-relocation-best-interest-now",this.interestNow)}`:b``}

      <bbva-text
        class = "description"
        alignment = "left"
        text = ${this.t("bbva-feature-loan-relocation-cat-message-payroll",{highlight:'<span class = "highlight">',endHighlight:"</span>",CAT:this.cat,catCalculationDate:this._catCalculationDate,catCalculationDateEnd:this._catCalculationDateEnd})}>
      </bbva-text>

      <bbva-notification-message
        message = ${this.t("bbva-feature-loan-relocation-info-message-payroll")}>
      </bbva-notification-message>

      ${this.flaglifeinsurance||this.flagUnemployment||this.flagLifeInsuranceBestInterest?b`
          <loan-relocation-fixed
            sticky
            text = ${this.t("bbva-feature-loan-relocation-sticky-message-monthly-IVA")}
            principal-amount = '${this.iva}'
            .currencyCode = ${this.currencyCode}
            .language = ${this.language}
            .localCurrency = ${this.localCurrency}
            label = ${this.t("bbva-feature-loan-relocation-total-available-sticky",{available:this.available})}
            message = ${this.t("bbva-feature-loan-relocation-sticky-message-insurance")}>
          </loan-relocation-fixed>`:b``}
      ${this.flagUninsured?b`
          <loan-relocation-fixed
            sticky
            text = ${this.t("bbva-feature-loan-relocation-sticky-message-monthly-IVA")}
            principal-amount = '${this.iva}'
            .currencyCode = ${this.currencyCode}
            label = ${this.t("bbva-feature-loan-relocation-total-available-sticky",{available:this.available})}
            message = ${this.t("bbva-feature-loan-relocation-sticky-message-liquidate")}
            .localCurrency = ${this.localCurrency}
            .language = ${this.language}>
          </loan-relocation-fixed>`:b``}
      ${this.flagCommission||this.flagCommissionBestInterest||this.flagCommissionInterestRate||this.flagImprovedInterest?b`
          <loan-relocation-fixed
            sticky
            text = ${this.t("bbva-feature-loan-relocation-sticky-message-monthly-IVA")}
            principal-amount = '${this.iva}'
            .currencyCode = ${this.currencyCode}
            label = ${this.t("bbva-feature-loan-relocation-total-available-sticky",{available:this.available})}
            message = ${this.t("bbva-feature-loan-relocation-sticky-message-commision")}
            .localCurrency = ${this.localCurrency}
            .language = ${this.language}>
          </loan-relocation-fixed>`:b``}

      <bbva-button-default
        class = "button-one"
        variant = "positive"
        text = ${this.t("bbva-feature-loan-relocation-initial-page-button-text")}
        .disabled = ${this.disabled}
        @click = ${this._onMultistep}>
      </bbva-button-default>
      ${this.callMeBackSecondaryBtnText?b`
            <br>
            <bbva-link
              class="secondary-cmb-link"
              icon="${Q()}"
              @click="${this._handleCallMeBackBtnClick}">
              <span>${this.t(this.callMeBackSecondaryBtnText)}</span>
            </bbva-link>`:null}
      ${this._stepTermsConditions()}`}_stepLoanRenewalSummary(){return b`
      <bbva-expandable-step
        id = "step-1"
        hide-padding-left
        hide-padding-right
        header = ${this.t("bbva-feature-loan-relocation-summary-page-header")}
        disabled-target = ".action"
        step = "1"
        total-steps = "3"
        current-step-label = ${`1 ${this.t("")} 3`}
        ?completed = '${this._isStepOneCompleted}'
        edit-label = ${this.t("bbva-feature-loan-relocation-summary-label-step-one")}
        @expandable-step-edit-step = ${this._onMultistep}
        >

        <div class = "summary" slot = "summary" ambient = "dark">
          <p>${this.t("bbva-feature-loan-relocation-initial-page-header-input-text")}</p>
          <bbva-amount
            class = "amountStep"
            variant = "4xl"
            .amount = ${this.amount}
            currency-code = ${this.localCurrency}
            language = ${this.language}
            local-currency = ${this.localCurrency}
            >
          </bbva-amount>

          <bbva-divider size= "small"></bbva-divider>

          ${this._reloctionList(this.t("bbva-feature-loan-relocation-term-loan"),this.term,"")}
          ${this._reloctionList(this.t("bbva-feature-loan-relocation-monthly-payment"),this.formatAmount(this.iva),"")}
          ${this._reloctionList(this.t("bbva-feature-loan-relocation-liquidate-balance"),this.liquidated,"")}
          ${this._reloctionListDivider(this.t("bbva-feature-loan-relocation-total-available"),this.available,"")}

          <bbva-divider size= "small"></bbva-divider>

          ${this.flaglifeinsurance||this.flagUnemployment||this.flagLifeInsuranceBestInterest?b`
              ${this._reloctionListDivider(this.t("bbva-feature-loan-relocation-life-insurance-charge"),this.lifeInsurance,"")}`:b``}
          ${this.flagCommission||this.flagCommissionInterestRate?b`
              ${this._reloctionList(this.t("bbva-feature-loan-relocation-opening-commission-text"),this.commission,"")}`:b``}
          ${this.flagCommissionBestInterest||this.flagImprovedInterest?b`
              ${this._reloctionList(this.t("bbva-feature-loan-relocation-opening-commission-text"),this.commissionNow,"")}`:b``}

          ${this._reloctionList(this.t("bbva-feature-loan-relocation-interest-monthly"),"",this.monthlyInterest)}
          ${this._reloctionList(this.t("bbva-feature-loan-relocation-interest-annual"),"",this.annualInterest)}
          ${this._reloctionList(this.t("bbva-feature-loan-relocation-cat"),"",this.cat)}
        </div>
      </bbva-expandable-step>
    `}_stepTermsConditions(){return b`
      <bbva-expandable-step
        id = "step-2"
        header = ${this.t("bbva-feature-loan-relocation-expandable-multistep-init-page-header")}
        disabled-target = ".action"
        ?completed = '${this._isStepTwoCompleted}'
        edit-label = ${this.t("bbva-feature-loan-relocation-summary-label-step-two")}
        @expandable-step-edit-step = ${this._updateStepTwo}
        hide-step-number = ""
        ?disabled = '${!this.isStepTwoDisable}'
        >
        <div class = "content">
          <bbva-text
            text = ${this.t("bbva-feature-loan-relocation-terms-page-header")}>
          </bbva-text>

          <div class= "links">
            <bbva-link
              id="contrato"
              class = "terms ${this.isStepTwoDisable?"":"step-disabled"}"
              icon-size = "24"
              icon = ${J()}
              text = ${this.t("bbva-feature-loan-relocation-check-terms-conditions-pdf")}
              aria-label = ${this.t("bbva-feature-loan-relocation-check-terms-conditions-pdf")}
              @click = ${()=>this._openDocumentLink("CONTRATO")}
            ></bbva-link>

            ${this.flaglifeinsurance||this.flagUnemployment||this.flagLifeInsuranceBestInterest?b`
                <bbva-link
                  id="poliza"
                  class = "terms ${this.isStepTwoDisable?"":"step-disabled"}"
                  icon-size = "24"
                  icon = ${J()}
                  text = ${this.t("bbva-feature-loan-relocation-check-loan-insurance-pdf")}
                  aria-label = ${this.t("bbva-feature-loan-relocation-check-loan-insurance-pdf")}
                  @click = ${()=>this._openDocumentLink("POLIZA")}
                ></bbva-link>`:b``}

                <bbva-link
                  class = "terms ${this.isStepTwoDisable?"":"step-disabled"}"
                  icon-size = "24"
                  icon = ${Y()}
                  text = ${this.t("bbva-feature-loan-relocation-check-credit-record-modal")}
                  aria-label = ${this.t("bbva-feature-loan-relocation-check-credit-record-modal")}
                  @click = ${this.setModalTerms}
                ></bbva-link>
          </div>

          ${this.flaglifeinsurance||this.flagUnemployment||this.flagLifeInsuranceBestInterest?b`
              ${this.infoCheck.map(((t,e)=>b`
                <div class="checks">
                  <bbva-form-checkbox
                    link-accessibility-text=${this.getLastDijist("check",t.label,10)}
                    aria-label=${this.getLastDijist("check",t.label,10)}
                    id="check-${e}"
                    class="check"
                    @click=${this._clickCheckboxs}
                    optional-label=" ">
                  </bbva-form-checkbox>
                  <bbva-text
                    text=${this.t(t.label,{highlight:'<span class="highlight">',endHighlight:"</span>",newLine:"<br>",...t.params})}>
                  </bbva-text>
                </div >`))}`:b`${this.infoCheck2.map(((t,e)=>b`
                <div class = "checks">
                  <bbva-form-checkbox
                    link-accessibility-text=${this.getLastDijist("check",t.label,10)}
                    aria-label=${this.getLastDijist("check",t.label,10)}
                    id="check-${e}"
                    class="check"
                    @click=${this._clickCheckboxs2}
                    optional-label=" ">
                  </bbva-form-checkbox>
                  <bbva-text
                    class="textCheck"
                    text=${this.t(t.label,{highlight:'<span class="highlight">',endHighlight:"</span>",newLine:"<br>",...t.params})}>
                  </bbva-text>
                </div >`))}`}

          <bbva-button-default
            variant = "positive"
            text = ${this.t("bbva-feature-loan-relocation-modal-warning-link-text")}
            ?disabled = ${!this._isEnabledCheck}
            @click = ${this._updateStepTwo}>
          </bbva-button-default>
        </div>

        <div class = "summary" slot = "summary" >
          <bbva-badge-icon
            class = "badge-icon"
            ambient = "dark"
            status = "checked"
            description = ${this.t("bbva-feature-loan-relocation-terms-page-text-checks")}>
          </bbva-badge-icon>
        </div>
      </bbva-expandable-step>
    `}_requestRelocate(){this._fireEvent("link-clicked-detail-progress-success",{initialAmount:this.amount,termsNumber:this.offerDetail.details.allowedTerms[0].number,termFrequency:this.offerDetail.details.allowedTerms[0].frequency,offerId:this.offerDetail.id,currentBalance:this.loanDetail.pendingAmount.totals[0].amount,available:this.available}),this._fireEvent("oc-loan-relocation-analytics-app-step-4-otp",this._analyticsDynamicData)}_componentHeader(){return b`
      <bbva-header-main
        text = ${this.t("bbva-feature-loan-relocation-header-title")}
        accessibility-text-icon-left-primary = ${this.t("bbva-feature-loan-relocation-header-title")}
        icon-left-primary = ${this.iconClose}
        accessibility-text-icon-right-primary="${this.t("bbva-feature-loan-relocation-header-icon-call-me-back")}"
        icon-right-primary="${this.callMeBackHeaderBtn?Q():""}"
        @header-main-icon-left-primary-click = ${this.setModalWarning}
        @header-main-icon-right-primary-click="${this._handleHeaderRightIconClick}"
      ></bbva-header-main>
    `}_openDocumentLink(t){this._fireEvent("show-ofer-document-link",t)}_dataUpdate(){this.initialAmount!==this.amount&&(this.initialAmount=this.amount,this._fireEvent("data-update-input",{amount:this.amount,subproduct:this.offerDetail.details.subproduct.id,termNumber:this.offerDetail.details.allowedTerms[0].number,termFrequency:this.offerDetail.details.allowedTerms[0].frequency}))}identifyModalId(t){const{detail:e}=t;let a;"help-modal"===e||"help-modal-unemployment"===e?a="info seguro":"help-modal-commission"!==e&&"help-modal-interest"!==e||(a="info interes"),this._persitAnalyticsData({applicationStep:a}),this._fireAppStartedAnalytic()}identifyPageView(t){const{detail:e}=t;let a="oc-loan-relocation-analytics-app-mark-";"help-modal-interest"===e?a+="interest":"help-modal"!==e&&"help-modal-unemployment"!==e||(a+="life-insurance"),this._fireEvent(a)}_onFocusInput(){this._persitAnalyticsData({applicationStep:"importe a solicitar"}),this._fireAppStartedAnalytic()}_appStartedIwantIt(){this._persitAnalyticsData({applicationStep:"lo quiero"}),this._fireAppStartedAnalytic()}render(){return b`
      ${this.loading?b`<bbva-progress-content visible></bbva-progress-content>`:b`
          <div class = "wrapper">
            ${this._componentHeader()}
            ${this.showFlujo?this.multistep():b` ${this._pageInicial()}`}
          </div>`}

      <loan-relocation-modal-manager
        ?isLoading = ${this.isLoading}
        @loan-relocation-modal-manager-accept-button-help-modal-terms = ${this.closeModalGeneric}
        @loan-relocation-modal-manager-link-button-help-modal-terms = ${this.closeModalGeneric}
        @loan-relocation-modal-manager-accept-button-help-modal-unemployment = ${this.closeModalGeneric}
        @loan-relocation-modal-manager-link-button-help-modal-unemployment = ${this.closeModalGeneric}
        @loan-relocation-modal-manager-accept-button-help-modal-commission = ${this.closeModalGeneric}
        @loan-relocation-modal-manager-link-button-help-modal-commission = ${this.closeModalGeneric}
        @loan-relocation-modal-manager-link-button-help-modal = ${this.closeModalGeneric}
        @loan-relocation-modal-manager-accept-button-help-modal-interest = ${this.closeModalGeneric}
        @loan-relocation-modal-manager-link-button-help-modal-interest = ${this.closeModalGeneric}
        @loan-relocation-modal-manager-accept-button-error-modal = ${()=>{this._fireEvent("retry-init")}}
        @loan-relocation-modal-manager-link-button-error-modal = ${()=>{this._fireEvent("link-clicked-finish")}}
        @loan-relocation-modal-manager-accept-button-error-modal-two = ${()=>{this._fireEvent("link-clicked-finish")}}
        @loan-relocation-modal-manager-link-button-error-modal-three = ${()=>{this._fireEvent("link-clicked-finish")}}
        @loan-relocation-modal-manager-accept-button-error-modal-three = ${()=>{this._fireEvent("retry-init")}}
        @loan-relocation-modal-manager-accept-button-error-modal-four = ${()=>{this._fireEvent("link-clicked-finish")}}
        @loan-relocation-modal-manager-accept-button-warning-modal = ${this.closeModalWarning}
        @loan-relocation-modal-manager-header-left-primary-help-modal-commission = ${this.closeModalGeneric}
        @loan-relocation-modal-manager-header-left-primary-help-modal-interest = ${this.closeModalGeneric}
        @loan-relocation-modal-manager-header-left-primary-help-modal-unemployment = ${this.closeModalGeneric}
        @loan-relocation-modal-manager-header-left-primary-help-modal-terms = ${this.closeModalGeneric}
        @loan-relocation-modal-manager-header-left-primary-help-modal = ${this.closeModalGeneric}
        @loan-relocation-modal-manager-open-modal = ${this.identifyModalId}
        @loan-relocation-modal-manager-fire-mark = ${this.identifyPageView}>
      </loan-relocation-modal-manager>
    `}}var we=t`[ambient^=light] {
  --bbva-date-color: initial;
  --bbva-date-skeleton-color: initial;
}
${(new i).mediaRules()}`;const Oe=new i;var Be=t`[ambient^=dark] {
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-date-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${e(s.primaryCoreDark)});
}
${Oe.mediaRules()}`;const qe={dark:t`
    ${g.dark}
    ${Be}
  `,light:t`
    ${g.light}
    ${we}
  `},Ge=new i;var He=t`:host {
  display: inline-block;
  box-sizing: border-box;
  position: relative;
  --bbva-text-color: var(--bbva-date-dark-mode-color, var(--bbva-date-color, token("foundations.colors.secondary600")));
  --skeleton-quote-color: var(--bbva-date-dark-mode-skeleton-quote-color, var(--bbva-date-skeleton-quote-color, var(--colorsSecondary200, ${e(s.secondary200)})));
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
${Ge.mediaRules()}`;class Fe extends(n(l(P(c)))){static get is(){return"bbva-date"}static get scopedElements(){return{"bbva-text":h}}static get properties(){return{date:{type:Date,converter:t=>new Date(t)},locale:{type:String},options:{type:Object},utc:{type:Boolean},clockSuffix:{type:String,attribute:"clock-suffix"},loading:{type:Boolean,reflect:!0},dateRange:{type:Array,attribute:"date-range"}}}constructor(){super(),this.date=new Date,this.locale="es-ES",this.utc=!1,this.clockSuffix="h",this.loading=!1,this.disabledTabindex=!0,this.options={day:"2-digit",month:"long",year:"numeric"}}static get styles(){return[super.styles,He,m("bbva-date-shared-styles"),qe.light,qe.dark]}updated(t){var e,a;super.updated&&super.updated(t),0===(null===(e=this.dateRange)||void 0===e?void 0:e.length)&&(this.date=""),!this.isValidRange&&this.date&&this._dateFormat(this.date)!==this._currentDate&&(this._currentDate=this._dateFormat(this.date),this._handleChange()),(null===(a=this.dateRange)||void 0===a?void 0:a.length)>0&&this._fromToDateFormat(this.dateRange)!==this._currentDate&&(this._currentDate=this._fromToDateFormat(this.dateRange).join(""),this._handleChange())}_handleChange(){this.dispatchEvent(new CustomEvent("date-change",{composed:!0,bubbles:!0,detail:{value:this._currentDate}}))}get isValid(){return this.date&&"Invalid Date"!==this.date.toLocaleDateString()}get isValidRange(){var t;return(null===(t=this.dateRange)||void 0===t?void 0:t.length)>0&&"Invalid Date"!==this._fromToDateFormat(this.dateRange)}_dateFormat(t){const e=this.utc?{...this.options,timeZone:"UTC"}:this.options,a=e.day||e.month||e.year;return e.hour&&e.minute&&!a?t.toLocaleTimeString(this.locale,e).concat(` ${this.clockSuffix}`):t.toLocaleDateString(this.locale,e)}_fromToDateFormat(t){return[new Date(t[0]),new Date(t[1])].map(((t,e)=>t.toLocaleDateString(this.locale,this.options).concat(0===e?" - ":"")))}_fromToDateFormatA11y(t){const e=new Date(t[0]),a=new Date(t[1]),i={...this.options};return i.month="long",[e,a].map(((t,e)=>t.toLocaleDateString(this.locale,i).concat(0===e?` ${this.t("bbva-date-to-the")} `:""))).join("")}get _tplDate(){return this.isValid&&this.date&&!this.isValidRange&&b` <bbva-text
          unset
          text="${this._dateFormat(this.date)}"
          font-weight="500"
          font-style="italic"
          size="S"
        >
        </bbva-text>`||O}get _tplDateRange(){var t;return this.isValidRange&&(null===(t=this.dateRange)||void 0===t?void 0:t.length)>0&&b`
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
        `||O}render(){return b` ${this._tplDate} ${this._tplDateRange} `}}x("colors.primaryCoreLightened"),x("colors.cool50");var Ve=t`
:host {
  --_bg-color: var(--bbva-web-clip-box-bg-color, var(--colorsPrimaryMediumLight, ${e(s.primaryMediumLight)}));
  --_fill-color: var(--bbva-web-clip-box-fill-color, var(--colorsPrimaryMedium, ${e(s.primaryMedium)}));
  --_color: var(--bbva-web-clip-box-color, var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)}));
  --_pattern-1-bg-color: var(--bbva-web-clip-box-pattern-1-bg-color, var(--colorsPrimaryMediumLight, ${e(s.primaryMediumLight)}));
  --_pattern-1-fill-color: var(--bbva-web-clip-box-pattern-1-fill-color, var(--colorsPrimaryMedium, ${e(s.primaryMedium)}));
  --_pattern-2-bg-color: var(--bbva-web-clip-box-pattern-2-bg-color, var(--colorsPrimaryVariantMedium, ${e(s.primaryVariantMedium)}));
  --_pattern-2-fill-color: var(--bbva-web-clip-box-pattern-2-fill-color, var(--colorsPrimaryVariantDark, ${e(s.primaryVariantDark)}));
  --_pattern-3-bg-color: var(--bbva-web-clip-box-pattern-3-bg-color, var(--colorsTertiaryType4Medium, ${e(s.tertiaryType4Medium)}));
  --_pattern-3-fill-color: var(--bbva-web-clip-box-pattern-3-fill-color, var(--colorsTertiaryType4Dark, ${e(s.tertiaryType4Dark)}));
  --_pattern-4-bg-color: var(--bbva-web-clip-box-pattern-4-bg-color, var(--colorsTertiaryType8Medium, ${e(s.tertiaryType8Medium)}));
  --_pattern-4-fill-color: var(--bbva-web-clip-box-pattern-4-fill-color, var(--colorsTertiaryType8Dark, ${e(s.tertiaryType8Dark)}));
  flex: none;
  display: block;
  box-sizing: border-box;
  width: 3rem;
  height: 3rem;
  background-color: var(--_bg-color);
  fill: var(--_fill-color);
  color: var(--_color);
  font-size: var(--typographyTypeLarge, ${e(a.typeLarge)});
  line-height: var(--lineHeightTypeLarge, ${e(T.typeLarge)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(k.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(k.book.fontStyle)});
  text-transform: uppercase;
  border-radius: 50%;
  position: relative;
  overflow: hidden;
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

.fill {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  transform: rotate(-45deg);
}

.content {
  position: relative;
  display: flex;
  width: 100%;
  height: 100%;
  justify-content: center;
  align-items: center;
}

.icon {
  width: 1.5rem;
  height: 1.5rem;
}
:host([size="3xl"]) .icon, :host([size="2xl"]) .icon, :host([size=xl]) .icon {
  width: 2rem;
  height: 2rem;
}
:host([size=s]) .icon {
  width: 1rem;
  height: 1rem;
}

.image {
  width: 100%;
  height: 100%;
}

:host([size="3xl"]) {
  width: 6rem;
  height: 6rem;
  font-size: var(--typographyType3XLarge, ${e(a.type3XLarge)});
  line-height: var(--lineHeightType3XLarge, ${e(T.type3XLarge)});
}

:host([size="2xl"]) {
  width: 4.5rem;
  height: 4.5rem;
  font-size: var(--typographyType3XLarge, ${e(a.type3XLarge)});
  line-height: var(--lineHeightType3XLarge, ${e(T.type3XLarge)});
}

:host([size=xl]) {
  width: 4rem;
  height: 4rem;
  font-size: var(--typographyType2XLarge, ${e(a.type2XLarge)});
  line-height: var(--lineHeightType2XLarge, ${e(T.type2XLarge)});
}

:host([size=m]) {
  width: 2.5rem;
  height: 2.5rem;
  font-size: var(--typographyTypeMedium, ${e(a.typeMedium)});
  line-height: var(--lineHeightTypeMedium, ${e(T.typeMedium)});
}

:host([size=s]) {
  width: 2rem;
  height: 2rem;
  font-size: var(--typographyType3XSmall, ${e(a.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${e(T.type3XSmall)});
}

:host([color-pattern="1"]:not([variant])) {
  background-color: var(--_pattern-1-bg-color);
  fill: var(--_pattern-1-fill-color);
}

:host([color-pattern="2"]:not([variant])),
:host([variant=aqua]) {
  background-color: var(--_pattern-2-bg-color);
  fill: var(--_pattern-2-fill-color);
}

:host([color-pattern="3"]:not([variant])),
:host([variant=sand]) {
  background-color: var(--_pattern-3-bg-color);
  fill: var(--_pattern-3-fill-color);
}

:host([color-pattern="4"]:not([variant])),
:host([variant=purple]) {
  background-color: var(--_pattern-4-bg-color);
  fill: var(--_pattern-4-fill-color);
}
`;const je=at`
  <svg class="fill" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 10 10">
    <rect width="10" height="5" y="5"></rect>
  </svg>
`;class Ne extends(Z(c)){static get is(){return"bbva-web-clip-box"}static get scopedElements(){return{"bbva-core-icon":tt,"bbva-core-image":et}}static get properties(){return{size:{type:String,reflect:!0},icon:{type:String},image:{type:String},initials:{type:String},label:{type:String},randomBg:{type:Boolean,attribute:"random-bg"},availablePatterns:{type:Number,attribute:"available-patterns"}}}constructor(){super(),this.label="",this.initials="",this.availablePatterns=4}updated(t){super.updated&&super.updated(t);["initials","randomBg","randomBgLength"].some((e=>t.has(e)))&&this._updateColorPattern()}static get styles(){return[Ve,m("bbva-web-clip-box-shared-styles")]}render(){return b`
      <div class="bg" aria-hidden="true">${je}</div>
      <div
        class="content"
        role="img"
        aria-label="${v(this.label?this.label:void 0)}"
        aria-hidden="${""===this.label}"
      >
        <slot name="content"> ${this._contentTpl} </slot>
      </div>
    `}get _contentTpl(){return this.image?this._imageTpl:this.icon?this._iconTpl:this._textTpl}get _iconTpl(){return b` <bbva-core-icon class="icon" .icon="${this.icon}"></bbva-core-icon> `}get _textTpl(){return b` <span class="text">${this.initials}</span> `}get _imageTpl(){return b`
      <bbva-core-image sizing="cover" src="${this.image}" class="image"></bbva-core-image>
    `}_updateColorPattern(){if(this.randomBg&&this.initials){const t=this.initials.split("").reduce(((t,e)=>t+e.charCodeAt(0)),0)%this.availablePatterns+1;this.setAttribute("color-pattern",t)}else this.removeAttribute("color-pattern")}}var ze=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-header-main] {
  background: var(--colorsTertiaryType6Dark, ${e(s.tertiaryType6Dark)});
}

[data-tag-name=bbva-amount] {
  color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
}

[data-tag-name=bbva-list-simple] {
  --_list-simple-label-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --_list-simple-description-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
}

[data-tag-name=bbva-web-list-item-simple] {
  --_color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  margin: 1rem;
}

[data-tag-name=bbva-clip-box] {
  margin: -1.5rem 0 0 43%;
}

[data-tag-name=bbva-text].mgb {
  margin-bottom: -15px;
  padding: 0 1rem;
}

[data-tag-name=bbva-notification-message] {
  margin: 1em;
}

.header {
  background: var(--colorsTertiaryType6Dark, ${e(s.tertiaryType6Dark)});
  padding-top: 1px;
  padding-bottom: 2em;
  text-align: center;
  color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
}

.header p {
  margin-bottom: 2px;
}

.clip {
  margin: -2.2rem 0 0 40%;
  border-radius: 50%;
  background: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  width: 70px;
  height: 70px;
}

.container {
  display: flex;
  justify-content: center;
}

.btn-center {
  margin: 1em auto 1em auto;
}

[data-tag-name=bbva-text].list {
  margin-top: -2.5rem;
}

[data-tag-name=loan-relocation-list] {
  --bbva-text-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
}
`;class Ue extends(ht(q(l(c)))){static get is(){return"bbva-feature-loan-relocation-success"}static get scopedElements(){const t=[_t,dt,j,h,N,ut,it,Ne,z,st,G,L,Te,xe,C,Fe,d,pe,...Ue.configurationScopedElements()];return Ue.scopedElementsFromClasses(t)}static get styles(){return[ze]}static get properties(){return{date:{type:String},amount:{type:Number},iva:{type:String},liquidated:{type:String},available:{type:String},lifeInsurance:{type:String},monthlyInterest:{type:String},annualInterest:{type:String},cat:{type:String},account:{type:String},term:{type:String},liquidatedContract:{type:String},contractNumber:{type:String},folio:{type:String},email:{type:String},localCurrency:{type:String},language:{type:String},relocationDetail:{type:Object},accountNumber:{type:String},currencyCode:{type:String},analyticsData:{type:Object}}}constructor(){super(),this.amount=0,this.liquidated="",this.available="",this.date="",this.iva="",this.lifeInsurance="",this.monthlyInterest="",this.annualInterest="",this.account="",this.term="",this.contractNumber="",this.liquidatedContract="",this.folio="",this.email="",this.localCurrency="",this.language="",this.currencyCode="",this.analyticsData={}}headerTmpl(){return b`
      <bbva-header-main
        text="bbva-feature-loan-relocation-header-title"
        accessibility-text-icon-right-primary = ${this.t("bbva-feature-loan-relocation-exit-button")}
        icon-right-primary = ${w()}
        @click = ${()=>{this._fireEvent("link-clicked-finish")}}>
      </bbva-header-main>
    `}panelInfo(){const t={day:"2-digit",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit",timeZone:this.date};return b`
      <div class = "header">
        <bbva-text
          text-color = "FFFFFF"
          size = "XL"
          alignment = "center"
          font-weight = "500"
          text = ${this.t("bbva-feature-loan-relocation-successful-contract")}
          >
        </bbva-text>

        <bbva-date
          utc = ""
          .options = ${t}
          clock-suffix = "'h'"
          >
        </bbva-date>
        <p>${this.t("bbva-feature-loan-relocation-amount-requested")}</p>
        <bbva-amount
          variant = "3xl"
          .amount = ${this.amount}
          currency-code = ${this.currencyCode}
          local-currency = ${this.localCurrency}
          language = ${this.language}
          text-color = "FFFFFF"
          >
        </bbva-amount>
        ${this._ReloctionList(this.t("bbva-feature-loan-relocation-monthly-payment"),this.iva)}
        ${this._ReloctionList(this.t("bbva-feature-loan-relocation-settled-balance"),this.formatAmount(this.liquidated))}
        ${this._ReloctionList(this.t("bbva-feature-loan-relocation-total-available"),this.available)}

        <bbva-divider size = "small"></bbva-divider>

        ${this.lifeInsurance?b`
            ${this._ReloctionList(this.t("bbva-feature-loan-relocation-life-insurance-charge"),this.lifeInsurance)}`:O}
        ${this._ReloctionList(this.t("bbva-feature-loan-relocation-interest-monthly"),this.monthlyInterest)}
        ${this._ReloctionList(this.t("bbva-feature-loan-relocation-interest-annual"),this.annualInterest)}
      </div>
      <div class = "clip">${ot}</div>
    `}infoTmpl(){return b`
      ${this._BbvaText(this.t("bbva-feature-loan-relocation-success-info-loan-account"),this.account)}
      ${this._BbvaText(this.t("bbva-feature-loan-relocation-term-loan"),this.term)}
      ${this._BbvaText("bbva-feature-loan-relocation-success-info-loan-liquidated",this.liquidatedContract)}
      ${this._BbvaText("bbva-feature-loan-relocation-success-info-loan-contract",this.contractNumber)}
      ${this._BbvaText("bbva-feature-loan-relocation-success-info-loan-folio",this.folio)}
      ${this._BbvaText("",this.t("bbva-feature-loan-relocation-bank-name"))}
      ${this._BbvaNotify(this.t("bbva-feature-loan-relocation-success-message-payments"))}
      ${this._BbvaText(this.t("bbva-feature-loan-relocation-success-text-email"),this.email)}
      ${this._BbvaText(this.t("bbva-feature-loan-relocation-success-text-consult"),"")}

      <bbva-button-row
        variant = "simple"
        options = ${JSON.stringify([{icon:nt(),label:this.t("bbva-feature-loan-relocation-share-button")},{icon:J(),label:this.t("bbva-feature-loan-relocation-amortization-table")}])}>
      </bbva-button-row>

      <div class = "container">
        <bbva-button-default
          variant = "primary"
          text = ${this.t("bbva-feature-loan-relocation-exit-button")}
          class = "btn-center"
          @click = ${()=>{this._fireEvent("link-clicked-finish")}}>
        </bbva-button-default>
      </div>
    `}init(){var t,e,a,i,s,o,n,r,l;"SEGURO DE VIDA Y DESEMPLEO"!==(null===(t=this.relocationDetail)||void 0===t||null===(e=t.additionalProducts)||void 0===e||null===(a=e[0])||void 0===a?void 0:a.id)&&"SEGURO DE VIDA"!==(null===(i=this.relocationDetail)||void 0===i||null===(s=i.additionalProducts)||void 0===s||null===(o=s[0])||void 0===o?void 0:o.id)||(this.lifeInsurance=null===(n=this.relocationDetail)||void 0===n||null===(r=n.additionalProducts)||void 0===r||null===(l=r[0])||void 0===l?void 0:l.number);"MONTHLY"===this.relocationDetail.terms.frequency?this.term=`${this.relocationDetail.terms.number} ${this.t("bbva-feature-loan-relocation-months")}`:this.term=`${this.relocationDetail.terms.number} ${this.t("bbva-feature-loan-relocation-biweekly")}`,this.amount=this.relocationDetail.initialAmount.amount;const{rates:c}=this.relocationDetail;c.forEach((t=>{"TASA_ANUAL"===t.rateType.id?this.annualInterest=`${t.unit.percentage.toFixed(2)}%`:"TASA_MENSUAL"===t.rateType.id&&(this.monthlyInterest=`${t.unit.percentage.toFixed(2)}%`)}));const{loanBreakDown:h}=this.relocationDetail;h.forEach((t=>{"INSTALLMENT"===t.id&&(this.iva=t.amount)})),this.liquidated=this.relocationDetail.currentBalance.amount,this.liquidatedContract=this.relocationDetail.relatedContract.number,this.contractNumber=this.relocationDetail.number,this.folio=this.relocationDetail.operationNumber,this.account=`${this.relocationDetail.paymentMethod.name} •${this.accountNumber.slice(-5)}`,Object.assign(this.analyticsData,{operationNumber:this.folio}),this._fireEvent("oc-loan-relocation-analytics-app-completed",this.analyticsData)}formatAmount(t){return new Intl.NumberFormat(this.language,{style:"currency",currency:this.localCurrency}).format(t)}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_ReloctionList(t,e){return b`
      <loan-relocation-list
        text = ${t}
        second-text = ${e}
        size = "M">
      </loan-relocation-list>
    `}_BbvaText(t,e){return b`
      <bbva-text
        text = ${t}
        alignment = "center"
        class = "mgb"
      ></bbva-text>
      <bbva-text
        text = ${e}
        alignment = "center"
        font-weight = "500"
        line-height = "S"
      ></bbva-text>
    `}_BbvaNotify(t){return b`
    <bbva-notification-message
      message-title = ""
      message = ${t}
    ></bbva-notification-message>
    `}render(){return b`
      <div class = "wrapper">
        ${this.headerTmpl()}
        ${this.panelInfo()}
        ${this.infoTmpl()}
      </div>
    `}}var Xe=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding:0rem;
}
`;class We extends(ht(q(l(c)))){static get is(){return"bbva-feature-loan-relocation"}static get scopedElements(){const t=[Me,Ue,mt,j,h,L,G,_t,rt,de,K,gt,...We.configurationScopedElements()];return We.scopedElementsFromClasses(t)}static get styles(){return[Xe,m("bbva-feature-loan-relocation-shared-styles")]}static get properties(){return{offerId:{type:String},productId:{type:String},apiVersion:{type:String},offerDetail:{type:Object},loanDetail:{type:Object},amount:{type:Number},minAmount:{type:Number},maxAmount:{type:Number},multiplo:{type:Number},errorMessage:{type:String},loading:{type:Boolean},requiredOTP:{type:Boolean},relocationDetail:{type:Object},localCurrency:{type:String},available:{type:String},email:{type:String},callMeBackHeaderBtn:{type:String,attribute:"call-me-back-header-btn"},callMeBackSecondaryBtnText:{type:String,attribute:"call-me-back-secondary-btn-text"},callMeBackSummaryBtnText:{type:String,attribute:"call-me-back-summary-btn-text"},_isOCLoanRelocationDetailVisible:{type:Boolean},_isOCLoanRelocationSuccessVisible:{type:Boolean},_loansDm:{type:Object},_isEnabled:{type:Boolean},_loanRelocationDetail:{type:Object},_loanRelocationSuccess:{type:Object},_bussinesDocumentsDm:{type:Object},_offerDocumentsList:{type:Array},_countInit:{type:Number},_countErrorRelocate:{type:Number},currencyCode:{type:String},_analyticsData:{type:Object}}}constructor(){super(),this._isOCLoanRelocationDetailVisible=!1,this._isOCLoanRelocationSuccessVisible=!1,this._loansDm=null,this.host="",this.apiVersion="1",this.native=!1,this.requiredToken="tsec",this.amount=0,this.maxAmount=0,this.minAmount=0,this.multiplo=100,this.errorMessage="",this.callMeBackHeaderBtn="",this.callMeBackSecondaryBtnText="",this.callMeBackSummaryBtnText="",this._isEnabled=!1,this.loading=!1,this._offerDocumentsList=[],this.requiredOTP=!1,this.email="",this._countInit=0,this._countErrorRelocate=0,this.localCurrency="",this.language="",this.available="",this.currencyCode="",this._analyticsData={}}get getLoanRelocationDetail(){return this._loanRelocationDetail||(this._loanRelocationDetail=this.shadowRoot.querySelector('[data-tag-name="bbva-feature-loan-relocation-detail"]')),this._loanRelocationDetail}get getLoansDm(){return this._loansDm||(this._loansDm=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-loans"]')),this._loansDm}get getBussinesDocumentsDm(){return this._bussinesDocumentsDm||(this._bussinesDocumentsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-business-documents"]')),this._bussinesDocumentsDm}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this.loading=!0,this._loanRelocationDetail=this.getLoanRelocationDetail}init(){this.getLoansDm.getLoanDetail(this.productId)}openDocumentSuccess(){this._fireEvent("open-document-success",!0)}reset(){this.requiredOTP=!1,this.offerDetail=null,this.loanDetail=null,this._isOCLoanRelocationDetailVisible=!1,this.loading=!0,this.available="",this._loanRelocationDetail.reset(),this._analyticsData={},this._dispatchCustomEvent("loan-dashboard")}formatAmount(t){return new Intl.NumberFormat(this.language,{style:"currency",currency:this.localCurrency}).format(t)}getEmail(t){this.email=t.replace(/[*]+/,"•")}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_getDataProviderLoansDM(){return b`
      <bbva-dataprovider-loans
        id = "bbvaDataProviderLoans"
        .host = ${this.host}
        .apiVersion = ${this.apiVersion}
        .version = ${this.apiVersion}
        ?native = ${this.native}
        .requiredToken = ${this.requiredToken}
        ?requiredOTP = ${this.requiredOTP}
        @set-offer-detail = ${this._handleSuccessOfferDetail}
        @error-on-get-loan-offer-detail = ${this._handleErrorCount}
        @get-loan-detail-v1-success = ${this._handleSuccessLoanDetail}
        @get-loan-detail-v1-error = ${this._handleErrorCount}
        @post-offer-detail-quotations-simulate-v1-success = ${this._handleSucccessLoanSimulate}
        @post-offer-detail-quotations-simulate-v1-error = ${()=>this.getLoanRelocationDetail.setModalOperationError()}
        @get-offer-detail-quotations-simulate = ${this._handleSucccessLoanSimulate}
        @error-on-post-loan-offer-detail-quotations-simulate = ${()=>this.getLoanRelocationDetail.setModalOperationError()}
        @post-loan-relocate-simulate-v1-success = ${this._handleSuccesLoanRelocate}
        @post-loan-relocate-simulate-v1-error = ${this._handleErrorLoanRelocate}>
      </bbva-dataprovider-loans>
    `}_bussinesDocumentsDM(){return b`
      <bbva-dataprovider-business-documents
        .host = ${this.host}
        api-version = "0"
        ?native = '${this.native}'
        required-token = ${this.requiredToken}
        @get-business-documents-v0-success = ${this._formatDocumentsList}
        @get-business-documents-v0-error = ${()=>this.getLoanRelocationDetail.setModalTechLoanError}>
      </bbva-dataprovider-business-documents>
    `}_isFullData(){this.minAmount=this.offerDetail.details.minimumAmount.amount,this.maxAmount=this.offerDetail.details.maximumAmount.amount,setTimeout((()=>{this.loading=!1,this._isOCLoanRelocationDetailVisible=!0,this._loanRelocationDetail.init()}),1e3)}_linkClickedDetailProgressSuccess(t){this.available=t.detail.available,this.getLoansDm.requiredOTP=!0;const e={"loan-id":this.productId},a=this._requestBodyRelocate(t.detail);this.getLoansDm.postLoanRelocateSimulate({params:e,requestBody:a})}_linkClickedFinish(){this._isOCLoanRelocationVisible=!1,this._isOCLoanRelocationDetailVisible=!1,this._isOCLoanRelocationSuccessVisible=!1,this.reset()}_requestBody(t){const{amount:e,subproduct:a,termNumber:i,termFrequency:s}=t;return this.getLoansDm.offerId=this.offerId,{initialAmount:{amount:e,currency:this.localCurrency},product:{subproduct:{id:a}},terms:{number:i,frequency:s}}}_requestBodyRelocate(t){const{initialAmount:e,termsNumber:a,termFrequency:i,offerId:s,currentBalance:o}=t;return{loanType:{id:"CONSUME_PERSONAL",name:"Préstamo Personal"},initialAmount:{amount:e,currency:this.localCurrency},currencies:[{currency:this.localCurrency,isMajor:!0}],terms:{number:a,frequency:i},relatedContract:{numberType:{id:"SIMPLE_ACCOUNT"},product:{id:"0REC",productType:{id:"ACCOUNTS"}},relationType:{id:"LINKED_WITH"}},offerId:s,currentBalance:{amount:o,currency:this.localCurrency}}}_receiveAmount({detail:t}){const{amount:e,invalid:a}=t;this.errorMessage="",a?(e%this.multiplo&&(this.errorMessage=`${this.t("bbva-feature-loan-relocation-multiplo")} ${this.multiplo}`),e>this.maxAmount&&(this.errorMessage=`${this.t("bbva-feature-loan-relocation-max-amount")} ${this.formatAmount(this.maxAmount)}`),e<this.minAmount&&(this.errorMessage=`${this.t("bbva-feature-loan-relocation-min-amount")} ${this.formatAmount(this.minAmount)}`),this._isEnabled=!0):(this.amount=e,this._isEnabled=!(e>0)||a,this.requestUpdate())}_fillSimulate(t){const e=t.additionalProducts[0].amount.amount;this.offerDetail.details.suggestedAmount.amount=t.initialAmount.amount,this.offerDetail.details.loanBreakDown[0].amount=t.loanBreakDown[0].amount,this.offerDetail.details.loanBreakDown[2].amount=t.loanBreakDown[2].amount,this.offerDetail.details.additionalProducts[0].amount.amount=e,setTimeout((()=>{this._loanRelocationDetail.loading=!1,this._loanRelocationDetail.init()}),1e3)}_requestUpdate(t){this.amount>this.minAmount&&this.amount<this.maxAmount&&(this._loanRelocationDetail.loading=!0,this.getLoansDm.requiredOTP=!1,this.getLoansDm.postOfferDetailQuotationsSimulate(this._requestBody(t.detail)))}_handleSuccessOfferDetail(t){this.offerDetail=t.detail,this._getOfferDocumentsList(this.offerDetail.details.additionalProducts[0].name),this._isFullData()}_handleSuccessLoanDetail(t){this.loanDetail=t.detail,this.getLoansDm.getOfferDetail(this.offerId)}_handleSucccessLoanSimulate(t){this._fillSimulate(t.detail)}_handleSuccesLoanRelocate(t){this.relocationDetail=t.detail,this._loanRelocationSuccess=this.shadowRoot.querySelector('[data-tag-name= "bbva-feature-loan-relocation-success"]'),this._loanRelocationSuccess.relocationDetail=this.relocationDetail,this._loanRelocationSuccess.init(),this._isOCLoanRelocationVisible=!1,this._isOCLoanRelocationDetailVisible=!1,this._isOCLoanRelocationSuccessVisible=!0}_handleErrorLoanRelocate(t){this._countErrorRelocate+=1,this._countErrorRelocate<3?this._loanRelocationDetail.setModalTechnicalError():this._loanRelocationDetail.setModalDataError(),this.getLoanRelocationDetail.handleErrorLoanRelocateAnalytics(t)}_handleErrorCount(){this._countInit+=1,this._countInit<3?this._loanRelocationDetail.setModalOfferError():this._loanRelocationDetail.setModalDataError()}_retry(){this.init()}_getOfferDocumentsList(t){const e={productId:"CONSUMO",subproductId:t};this.getBussinesDocumentsDm.getBusinessDocuments(e)}_formatDocumentsList(t){this._offerDocumentsList=t.detail.map((t=>({name:t.documentTemplate.id,id:t.id})))}_showOfferDocument({detail:t}){const[{id:e}]=this._offerDocumentsList.filter((e=>e.name.includes(t)));this._showPdfDocument(e,{CONTRATO:"Términos y condiciones de contratación",POLIZA:"Seguro del préstamo"}[t])}_showAmortizationTableDocument(){const t=this.relocationDetail.number;this._showPdfDocument(t,"Tabla de amortización")}_showPdfDocument(t,e){this._fireEvent("open-document",{value:`${this.host}/business-documents/v0/business-documents`,mimeType:"application/pdf",method:"post",headers:{"Content-Type":"application/json"},body:{documentTemplate:{id:t,templateType:{id:"PDF"}}},title:e,headerColor:"FFFFFFFF",tintColor:"FF072146",canShare:!0,titleColor:"FF072146",blackStatusBar:!1,formatter:"no-op"})}_handleSuccessActionButtons(t){1===t.detail&&this._showAmortizationTableDocument()}confirmExitFlow(){this._loanRelocationDetail.setModalWarning()}_persitAnalyticsData(t){const e=t.detail;this._analyticsData={...this._analyticsData,...e}}render(){var t;return b`
      ${this._bussinesDocumentsDM()}
      ${this._getDataProviderLoansDM()}
      <bbva-progress-content ?visible = '${this.loading}'></bbva-progress-content>

      <bbva-transition-container id = "oc-loan-relocation-detail" ?visible = ${this._isOCLoanRelocationDetailVisible}>
        <div slot = "slot-content" class = "container">
          <bbva-feature-loan-relocation-detail
            id = "bbva-feature-loan-relocation-detail"
            ?isLoading = ${this._isOCLoanRelocationDetailVisible}
            .offerDetail = ${this.offerDetail}
            .loanDetail = ${this.loanDetail}
            .multiplo = ${this.multiplo}
            .amount = ${this.amount}
            .errorMessage = ${this.errorMessage}
            ?disabled = ${this._isEnabled}
            ?native = ${this.native}
            .currencyCode = ${this.currencyCode}
            .localCurrency = ${this.localCurrency}
            .language = ${this.language}
            call-me-back-header-btn="${this.callMeBackHeaderBtn}"
            call-me-back-secondary-btn-text="${this.callMeBackSecondaryBtnText}"
            call-me-back-summary-btn-text="${this.callMeBackSummaryBtnText}"
            @loan-relocation-input-changed = ${this._receiveAmount}
            @link-clicked-detail-progress-success = ${this._linkClickedDetailProgressSuccess}
            @link-clicked-finish = ${this._linkClickedFinish}
            @data-update-input = ${this._requestUpdate}
            @component-reset = ${this.reset}
            @show-ofer-document-link = ${this._showOfferDocument}
            @retry-init = ${this._retry}
            @bbva-feature-loan-relocation-detail-persit-analytics-data = ${this._persitAnalyticsData}
          ></bbva-feature-loan-relocation-detail>
        </div>
      </bbva-transition-container>

      <bbva-transition-container id = "oc-loan-relocation-success" ?visible = ${this._isOCLoanRelocationSuccessVisible}>
        <div slot = "slot-content" class = "container">
          <bbva-feature-loan-relocation-success
            id = "bbva-feature-loan-relocation-success"
            .relocationDetail = ${this.relocationDetail}
            .accountNumber=${null===(t=this.loanDetail)||void 0===t?void 0:t.number}
            ?native = ${this.native}
            .currencyCode = ${this.currencyCode}
            .localCurrency = ${this.localCurrency}
            .language = ${this.language}
            .email = ${this.email}
            .available = ${this.available}
            .analyticsData = ${this._analyticsData}
            @link-clicked-finish = ${()=>{this._linkClickedFinish()}}
            @component-reset = ${this.reset}
            @button-row-item-click = ${this._handleSuccessActionButtons}
          ></bbva-feature-loan-relocation-success>
        </div>
      </bbva-transition-container>
    `}}class Ke extends We{static get is(){return"bbva-feature-loan-relocation-mx"}static get properties(){return{}}}customElements.define(Ke.is,Ke);
