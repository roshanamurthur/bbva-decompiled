import{z as e,a8 as t,a9 as i,aX as s,an as n,L as a,ak as r,h as o,i as c,bF as l,J as d,aZ as u,a7 as h,dC as p,dD as m,dE as y,a as g,b,b7 as _,V as v,dk as f,dp as E,aV as S,de as R,aY as T,ff as C,bW as A,ai as P,cT as x}from"./952f98a9.js";import{M as $,L as O,a2 as I,P as D,G as w,D as N,K as M,a4 as k,e as q,h as F,Q as j,R as H,S as B,f as V,Z as L,I as G,F as z,x as U,H as K,N as X,a3 as J,an as W}from"./216055dc.js";import{B as Y,a as Q}from"./a0b89eb0.js";import{B as Z,a as ee}from"./4eb8d874.js";import{B as te}from"./40b41b3c.js";import{B as ie,a as se}from"./a4e2d801.js";import"./f89161ad.js";import{B as ne}from"./4861c1f7.js";import{B as ae}from"./077d7438.js";import{B as re}from"./459fa8f1.js";import"./28fb68d0.js";import{bP as oe,bf as ce,bg as le}from"./7f3d7ca9.js";import{B as de}from"./d335c75d.js";import{B as ue}from"./84dff06e.js";import{B as he}from"./2b04e291.js";import{B as pe}from"./e905e6bb.js";import{B as me}from"./c69d5cda.js";import"./ff18b1dc.js";import"./6d48045c.js";var ye=e`
  :host {
    display: block;
    box-sizing: border-box;
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

  .order-online-components {
    display: flex;
    justify-content: space-between;
    margin-bottom: 1rem;
  }

  .middle-content-color-text {
    --bbva-type-text--_ambient-color: var(
      --colorsPrimaryCoreLightened,
      ${t(i.primaryCoreLightened)}
    );
    --bbva-type-amount--_ambient--text-color: var(
      --colorsPrimaryCoreLightened,
      ${t(i.primaryCoreLightened)}
    );
  }
`;class ge extends(s($(O(n(a))))){static get is(){return"summary-insurance-info-element"}static get scopedElements(){const e=[I,D,w,...ge.configurationScopedElements()];return ge.scopedElementsFromClasses(e)}static get properties(){return{listContentData:{type:Object},listContentFake:{type:Object},loading:{type:Boolean,reflect:!0},styleClass:{type:Boolean,attribute:"style-class"}}}constructor(){super(),this.loading=!1,this.listContentData=[],this.listContentFake=[],this.styleClass=!1}static get styles(){return[ye,r("summary-insurance-info-element-shared-styles")]}update(e){super.update(e)}_generateTypeText(e,t,i=void 0){return o`
      <bbva-type-text
        alignment="${t?"right":""}"
        text="${e||t?e||t:""}"
        size="S"
        tag="span"
        class="text-style"
        ?loading="${this.loading}"
        font-weight="${t?500:null}"
        font-style="${c(i)}"
      ></bbva-type-text>
    `}_generateTypeAmount({amount:e,currency:t}){return o`
      <bbva-type-amount
        amount="${e}"
        currency-code="${t}"
        decimal-digits="2"
        group-char=","
        separator-char="."
        symbol-left
        symbol="$"
        type="bold"
        variant="m"
        ?loading=${this.loading}
      ></bbva-type-amount>
    `}_generateTypeDate({date:e}){return o`
      <bbva-type-date
        date="${e}"
        font-weight="500"
        font-style="italic"
        ?loading=${this.loading}
      ></bbva-type-date>
    `}get _insuranceDetails(){var e,t,i;return null!==(e=this.listContentData)&&void 0!==e&&e.length?o`
      <div class="middle-content ${this.styleClass?"middle-content-color-text":""}">
        ${null===(t=this.listContentData)||void 0===t?void 0:t.map((e=>o`
            <div class="order-online-components">
              ${null!=e&&e.label?this._generateTypeText(e.label,null):null}
              ${null!=e&&e.amount?this._generateTypeAmount(e):null}
              ${null!=e&&e.description?this._generateTypeText(null,e.description,null==e?void 0:e.fontStyle):null}
              ${null!=e&&e.date?this._generateTypeDate(e):null}
            </div>
          `))}
      </div>
    `:o`
        <div class="middle-content">
          ${null===(i=this.listContentFake)||void 0===i?void 0:i.map((()=>o`
              <div class="order-online-components">
                ${this._generateTypeText("")} ${this._generateTypeText("")}
              </div>
            `))}
        </div>
      `}render(){return o`
      ${this._insuranceDetails}
      <slot></slot>
    `}}var be=e`
  :host {
    display: block;
    box-sizing: border-box;
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

  .top-content {
    padding: 1rem 0 1rem 0;
  }

  .top-content-header {
    padding: 0.5rem 0 1rem 0;
  }

  .bottom-content {
    padding: 1rem 0;
  }

  .content {
    padding: 0 1rem;
  }

  [data-tag-name='bbva-help-modal'] {
    --bbva-help-modal-padding: 0;
  }
`;class _e extends(s($(O(n(a))))){static get is(){return"insurance-payment-onboarding-page"}static get scopedElements(){const e=[M,k,q,F,j,w,ge];return _e.scopedElementsFromClasses(e)}static get properties(){return{billResponse:{type:Object},loading:{type:Boolean,attribute:"loading"},subsidiary:{type:Object},visible:{type:Boolean},_listData:{type:Array}}}constructor(){super(),this.billResponse={},this.loading=!1,this.subsidiary={},this.visible=!1,this._listData=["insurance-transaction-servicing-insurance-delayed-payment-summary-insurance-element-outstanding-amount","insurance-transaction-servicing-insurance-delayed-payment-summary-insurance-element-policy-number","insurance-transaction-servicing-insurance-delayed-payment-summary-insurance-element-insurance-type","insurance-transaction-servicing-insurance-delayed-payment-summary-insurance-element-validity-period","insurance-transaction-servicing-insurance-delayed-payment-summary-insurance-element-payment-frequency"]}static get styles(){return[be,N.primaryAlt,r("insurance-payment-onboarding-page-shared-styles")]}update(e){super.update(e),Object.keys(this.billResponse)&&(this.loading=!!Object.keys(this.billResponse).length)}changeVisibility(e,t=!0){this.dispatchEvent(new CustomEvent(`insurance-transaction-servicing-insurance-delayed-payment-onboarding-page-${e}`,{detail:t,bubbles:!0,composed:!0}))}get handlerData(){const{amount:e,currency:t,period:i,policeNumber:s,productName:n,startDate:a}=this.billResponse,[r,o,c,l,d]=this._listData;if(null!=a&&a.length){var u;const h=a.split("-").reverse(),p=parseInt(h.splice(1,1).toString(),10),m=this.t(null===(u=this.configModal)||void 0===u?void 0:u.months.find(((e,t)=>t+1===p)));return h.splice(1,0,m),this.date=h.join(" "),[{label:this.t(r),amount:e,currency:t},{label:this.t(o),description:s},{label:this.t(c),description:n},{label:this.t(l),description:this.date,fontStyle:"italic"},{label:this.t(d),description:i}]}return!1}get slotContent(){return o`
      <div div slot="slot-content">
        <div class="top-content">
          <bbva-clip-microillustration
            microillustration="walletmoney"
            size="M"
            ?loading="${!this.loading}"
          ></bbva-clip-microillustration>
          <bbva-type-text
            size="S"
            text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-onboarding-description")}"
            ?loading="${!this.loading}"
          ></bbva-type-text>
        </div>

        <div class="top-content-header">
          <bbva-header-category
            text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-summary-insurance-element-header-category-title")}"
            ?loading="${!this.loading}"
          ></bbva-header-category>
        </div>

        <summary-insurance-info-element
          .listContentData=${this.handlerData}
          .listContentFake=${this._listData}
          ?loading="${!this.loading}"
        ></summary-insurance-info-element>

        <bbva-notification-message
          variant="caution"
          message-title="${this.t("insurance-transaction-servicing-insurance-delayed-payment-onboarding-notification-message-title")}"
          message="${this.t("insurance-transaction-servicing-insurance-delayed-payment-onboarding-notification-message-description",{label:this.subsidiary.timeLimit})}"
          ?loading="${!this.loading}"
        ></bbva-notification-message>

        <div class="bottom-content">
          <bbva-type-text
            text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-onboarding-bottom-text",{label:this.billResponse.company,comName:this.billResponse.name})}"
            text-color="#666666"
            size="2XS"
            tag="span"
            ?loading="${!this.loading}"
          ></bbva-type-text>
        </div>
      </div>
    `}get _renderModalOnboarding(){const e=[{id:"btn-close",icon:l(),accessibilityText:"card-transaction-servicing-finance-transaction-advanced-payments-accessibility-close-button"}];return o`
      <bbva-help-modal
        full-height
        ?visible="${this.visible}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?disabled-button="${!this.loading}"
        hide-content-padding-top
        ambient="primary-alt"
        fixed-footer
        button-text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-onboarding-button")}"
        @help-modal-footer-button-click="${()=>this.changeVisibility("send-data-visibility-change",this.handlerData)}"
      >
        <div slot="slot-content-header">
          <bbva-header-main
            text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-onboarding-header")}"
            variant="modal-initial"
            .buttons="${c(e)}"
            @header-main-icon-click="${()=>{this.changeVisibility("close-onboarding-modal")}}"
          ></bbva-header-main>
        </div>
        <div class="content" slot="slot-content">${this.slotContent}</div>
      </bbva-help-modal>
    `}render(){return o` ${this._renderModalOnboarding} `}}class ve extends(d(a)){_mappingIndicators(e){e.map((e=>{this._removeFields(["name"],e),this._renameProperty(e,"indicatorId","id")}));for(let t=0;t<e.length;t++)"DESTINATION_IMMEDIATE_DEBIT"==e[t].id&&e.splice(t,1),"CAN_BE_ASSOCIATED_TO_A_CUSTODY_ACCOUNT"==e[t].id&&e.splice(t,1);return e}}let fe=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let n=0|t,a=Math.max(n>=0?n:s-Math.abs(n),0);for(;a<s;){if((r=i[a])===(o=e)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;a++}var r,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,n="",a=0,r=arguments.length;a!==r;++a){var o=+arguments[a];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?s=i.push(o):(o-=65536,s=i.push(55296+(o>>10),o%1024+56320)),s>=16383&&(n+=e.apply(null,i),i.length=0)}return n+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}},Ee=class extends fe{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}};const Se=0,Re=1,Te="jwt",Ce="tsec",Ae="none";let Pe=class extends fe{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Se,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Ee,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Ce:this.requiredToken=Ae,this.requiresJWT=!1):this.requiredToken===Ce?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Te?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Ae?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Ce)}_setJwtHandler(){this._setTokenHandler(Te)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=u),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===Re?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(Ce,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Te,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===Te?"JWT ":"",n=e===Te?"Authorization":Ce;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let r=this[i].getItem(a);r?t[n]=t[n]||s+r:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],n=0,a=0;if(s<=127?(n=0,a=255&s):s<=223?(n=1,a=31&s):s<=239?(n=2,a=15&s):s<=244&&(n=3,a=7&s),e.length-i-n>0){let t=0;for(;t<n;)s=e[i+t+1],a=a<<6|63&s,t+=1}else a=65533,n=e.length-i;t+=String.fromCodePoint(a),i+=n+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",n=i[e].split(s);t[n.shift().toLowerCase()]=n.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let n=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(n=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(n=JSON.parse(t.headers)[s])}if(n){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==n&&(e.setItem(t,n),this._emitTokenUpdate(i,n))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,n,a;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),n=e.getResponseHeader("AuthenticationChallenge"),a=e.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(e.headers);t=r.authenticationtype,i=r.authenticationdata||null,s=r.authenticationstate,n=r.authenticationchallenge,a=r.authenticationresponse}return{type:t,data:i,state:s,challenge:n,response:a}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let n;if("object"==typeof e&&e){const a=this._getSignatureData(e.signatureType,t,i);n=this._makeKeyValuePairFromObject(a,e.signatureValue),e.challenge&&(n+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(n,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(n=`password=${e}`,this._buildSignatureHeaders(n,"2",s)):(n=`${i}=${e}`,this._buildSignatureHeaders(n,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),n=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:a,data:r,state:o,challenge:c,response:l}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(n)this._notifySignatureInvalid(d),i=!0;else if(a)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,d,a,r,o,c,l),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,a,r,o,c,l),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),n=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),a=this._getRequestMetadata(e);n&&(this._notifyWaitingForProcessResponse(a),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,n,a){this._defineSignatureValue(t,i,s);const r={type:t,data:i,challenge:n,metadata:e};a&&(r.response=a),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,n,a){s?this._notifySignatureRequired(e,t,i,s,n,a):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,n,a,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,n):this._notifySignatureRequired(t,i,s,n,a,r)}},xe=class extends Pe{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}},$e=class extends Pe{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}};class Oe extends xe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsGetV0")}}class Ie extends $e{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsPostV0")}}class De extends xe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/financial-statements`)}toString(){return super.toString("BGADPAccountsAccountFinancialStatementsGetV0")}}class we extends xe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/financial-statements/{financial-statement-id}`)}toString(){return super.toString("BGADPAccountsAccountFinancialStatementsFinancialStatementGetV0")}}class Ne extends xe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/limits`)}toString(){return super.toString("BGADPAccountsAccountLimitsGetV0")}}class Me extends xe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/transactions`)}toString(){return super.toString("BGADPAccountsAccountTransactionsGetV0")}}class ke extends ve{static get is(){return"bbva-global-accounts-base-api-dm"}resetAccounts(){this.accounts=[]}getAccounts(e){this._paramsMapping(e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}postAccounts(e){this._requestMapping(e),this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping),this.resetAccounts()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}Accounts`,this._getBgadp(s))}_getBgadp(e){return{getAccountsV1:()=>new te(e),getAccountsV0:()=>new Oe(e),postAccountsV0:()=>new Ie(e),postAccountsV1:()=>new Z(e),getAccountsV2:()=>new Y(e),default:()=>"BGADP does not exist."}}_renameQueryParam(e,t,i){t in e&&(e[i]=e[t],delete e[t])}_paramsMapping(e){if("0"==this.version&&Object.keys(e).length){const t=["ANNULLED","CHARGE_OFF","INACTIVE","PROPOSAL"],i=["ORIGIN_TO_TRANSPORT_RECHARGE","DESTINATION_TO_MERCHANT_QR","SPI_ACTIVE_PAYMENTS"];e["status.id"]&&t.includes(e["status.id"])&&this._removeFields(["status.id"],e),e["indicators.id"]&&i.includes(e["indicators.id"])&&this._removeFields(["indicators.id"],e),this._renameProperty(e,"currency","currencies.currency"),this._renameQueryParam(e,"indicators.id","indicators.indicatorId")}return"0"!=this.version&&"1"!=this.version||this._renameQueryParam(e,"expand.id","expand"),e}_responseMapping(e){if(Array.isArray(e)&&e.length>0){if("0"==this.version)for(let t=0;t<e.length;t++){this._renameProperty(e[t],"accountId","id"),this._renameProperty(e[t],"title","product");["COMMON","CREDIT"].includes(e[t].accountType.id)||this._removeFields(["accountType"],e[t]),this._removeFields(["subType"],e[t].accountType),this._removeFields(["previousMonthAverageBalances"],e[t].availableBalance),"DORMANT"===e[t].status.id&&this._removeFields(["status"],e[t]),this._removeFields(["reason","reasonDescription","situation"],e[t].status),e[t].indicators&&e[t].indicators.length&&(e[t].indicators=this._mappingIndicators(e[t].indicators)),this._removeFields(["clabe","bank","accountFamily","commercialPackage","joint","openingDate","currencies","disposedBalance","image","meta","offerId","delivery","accountAgreement","cardInformation","petitionerBusinessAgent"],e[t])}else if("1"==this.version)for(let t=0;t<e.length;t++)e[t].product&&this._removeFields(["subProduct"],e[t].product),this._removeFields(["bank","joint","participants","isPayrollAccount"],e[t]),e[t].indicators&&e[t].indicators.length&&(e[t].indicators=this._mappingIndicators(e[t].indicators));return e}return this._postResponseMapping(e)}_postResponseMapping(e){if("0"==this.version&&Object.keys(e).length){this._renameProperty(e,"accountId","id"),e.customizedFormats&&e.customizedFormats.forEach((e=>{this._renameProperty(e,"customizedFormatId","id")})),this._renameProperty(e,"joint","jointSignatureType"),this._renameProperty(e,"title","product"),e.bank&&(this._renameProperty(e.bank,"bankId","id"),this._renameProperty(e.bank.branch,"branchId","id")),e.status.reason&&(e.status.reason={id:e.status.reason});["COMMON","CREDIT","CREDIT_EXTENSION","SAVINGS","MONEY_MARKET","SAVINGS_EXTENSION"].includes(e.accountType.id)||this._removeFields(["accountType"],e),e.participants.forEach((e=>{this._renameProperty(e,"participantId","id"),"NATURAL_PERSON"===e.personType||Object.keys(e).some((e=>"firstName"===e))?(e.customDetails={personType:"NATURAL_UNKNOWN"},e.firstName&&(e.customDetails={...e.customDetails,firstName:e.firstName}),e.middleName&&(e.customDetails={...e.customDetails,middleName:e.middleName}),e.lastName&&(e.customDetails={...e.customDetails,lastName:e.lastName}),e.secondLastName&&(e.customDetails={...e.customDetails,secondLastName:e.secondLastName}),e.identityDocument&&(e.customDetails.identityDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}],"NIE"===e.customDetails.identityDocuments[0].documentType.id&&this._removeFields(["documentType"],e.customDetails.identityDocuments[0])),this._removeFields(["personType","firstName","middleName","lastName","secondLastName","identityDocument"],e)):("LEGAL_PERSON"===e.personType||Object.keys(e).some((e=>"legalName"===e)))&&(e.customDetails={personType:"LEGAL_UNKNOWN"},e.legalName&&(e.customDetails={...e.customDetails,legalName:e.legalName}),e.identityDocument&&(e.customDetails.businessDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}],"NIE"===e.customDetails.businessDocuments[0].documentType.id&&this._removeFields(["documentType"],e.customDetails.businessDocuments[0])),this._removeFields(["personType","legalName","identityDocument"],e)),e.participantType.order&&(e.order=e.participantType.order,this._removeFields(["order"],e.participantType)),this._removeFields(["suffix","documents"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"conditionId","id"),this._removeFields(["period","facts","outcomes"],e)})),e.delivery&&(e.deliveries=e.delivery,this._removeFields(["delivery"],e),e.deliveries.forEach((e=>{"VIRTUAL"===e.deliveryType?e.method="DIGITAL":"PHYSICAL"===e.deliveryType&&(e.method="STANDARD"),e.address&&this._renameProperty(e.address,"addressType","deliveryAddressType"),e.destination&&e.destination.branch&&(e.destination.bank={branch:e.destination.branch},this._removeFields(["branch"],e.destination)),e.contactDetails&&e.contactDetails[0].contactDetail&&e.contactDetails[0].contactDetail.contactDetailId&&(e.contactDetails={id:e.contactDetails[0].contactDetail.contactDetailId,deliveryContactType:"STORED"}),this._removeFields(["documentType","deliveryType"],e)}))),e.fees&&e.fees.itemizeFees.forEach((e=>{this._renameProperty(e,"name","description"),e.itemizeFeeUnits=[{unitType:"AMOUNT",amount:e.feeAmount.amount,currency:e.feeAmount.currency}],e.feeAmount.percentage&&e.itemizeFeeUnits.push({unitType:"PERCENTAGE",percentage:e.feeAmount.percentage}),this._removeFields(["feeAmount"],e)})),e.rates&&e.rates.forEach((e=>{e.itemizeRates=[{rateType:e.rateType.id,itemizeRateUnits:[e.unit]}],this._renameProperty(e.itemizeRates[0].itemizeRateUnits[0],"mode","unitType"),e.rateType.name&&(e.itemizeRates=[{...e.itemizeRates[0],description:e.rateType.name}]),this._removeFields(["rateType","unit"],e)})),e.operationNumber&&(e.operationTracking={operationNumber:e.operationNumber}),e.relatedContracts&&e.relatedContracts.forEach((e=>{this._renameProperty(e.relationType,"name","description"),e.contractDetails={number:e.number,contractType:"INTERNAL_CONTRACT"},this._removeFields(["number"],e)})),this._removeFields(["businessType","operationNumber","accountFamily","billingInformation"],e)}return e}_requestMapping(e){return"0"==this.version&&(e.bank&&(this._renameProperty(e.bank,"id","bankId"),this._renameProperty(e.bank.branch,"id","branchId")),this._renameProperty(e,"jointSignatureType","joint"),this._renameProperty(e,"product","title"),this._removeFields(["subproduct"],e.title),e.status&&this._removeFields(["name"],e.status),e.limits&&e.limits.forEach((e=>{this._renameProperty(e,"id","limitId")})),e.indicators&&e.indicators.forEach((e=>{this._renameProperty(e,"id","indicatorId")})),e.participants.forEach((e=>{["GUARANTOR","COLLATERAL_GUARANTOR","CLIENT_AGENT","PROVIDER_AGENT","CONTRACTOR","LEGAL_REPRESENTATIVE","INSPECTOR"].includes(e.participantType.id)&&this._removeFields(["participantType"],e),e.order&&(e.participantType={...e.participantType,order:e.order},this._removeFields(["order"],e)),e.customDetails.firstName&&(e.firstName=e.customDetails.firstName),e.customDetails.lastName&&(e.lastName=e.customDetails.lastName),e.customDetails.secondLastName&&(e.secondLastName=e.customDetails.secondLastName);const t=["DNI","NIE","NIF","CIF","PASSPORT"];e.customDetails.identityDocuments&&e.customDetails.identityDocuments.forEach((i=>{t.includes(i.documentType.id)&&(e.identityDocument={documentNumber:i.documentNumber,documentType:i.documentType.id})})),this._removeFields(["customDetails"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"id","conditionId"),this._removeFields(["isNegotiable","conditionType","formats"],e)})),e.relatedContracts&&e.relatedContracts.forEach((e=>{"INTERNAL_CONTRACT"===e.contractDetails.contractType&&(e.contractId=e.contractDetails.contractId),this._removeFields(["contractDetails"],e)})),e.deliveries&&(e.delivery=e.deliveries,this._removeFields(["deliveries"],e),e.delivery.forEach((e=>{if(this._renameProperty(e,"method","deliveryType"),"DIGITAL"===e.deliveryType?e.deliveryType="VIRTUAL":"STANDARD"===e.deliveryType?e.deliveryType="PHYSICAL":this._removeFields(["deliveryType"],e),"DIGITAL_CONTACT"===e.destination.id&&this._removeFields(["id"],e.destination),e.destination.bank&&(e.destination={...e.destination,branch:e.destination.bank.branch},this._removeFields(["bank"],e.destination)),e.contactDetails&&"STORED"===e.contactDetails.deliveryContactType){let t=[{contactDetail:{contactDetailId:e.contactDetails.id}}];e.contactDetails=t}else this._removeFields(["contactDetails"],e);e.address&&"STORED"===e.address.deliveryAddressType?this._renameProperty(e.address,"deliveryAddressType","addressType"):this._removeFields(["address"],e),this._removeFields(["deliverySchedules","serviceType","packagingType"],e)})))),e}_paginationMapping(e){return e}}h(ke,"GET_EVENTS",{customEvent:"accounts-api-dm-fetch",paginationEvent:"accounts-api-dm-pagination",errorFireEventHandler:"accounts-api-dm-fetch-error"}),h(ke,"POST_EVENTS",{customEvent:"accounts-api-dm-create",errorFireEventHandler:"accounts-api-dm-create-error"}),customElements.define(ke.is,ke);class qe extends ve{static get is(){return"bbva-global-accounts-api-dm"}static get properties(){return{accounts:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.accounts=[],this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","accounts"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./1444b080.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}Accounts`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaAccounts${e}ApiDm`;(0,this._modules[e])().then((async e=>{const i=e[t].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-accounts-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-accounts-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=ke.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetAccounts(){await this.module.updateComplete,this.module.resetAccounts()}async getAccounts(e={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({params:e}):this._requestParams={get:[{params:e}]}}async _getAccounts(){await this.module.updateComplete,Object.keys(this.accounts).length||(this._requestParams.get.forEach((e=>{this.module.getAccounts(e.params)})),delete this._requestParams.get)}async postAccounts(e){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:e}):this._requestParams={post:[{body:e}]}}async _postAccounts(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postAccounts(e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return o` ${this._module?this._module:""}`}}class Fe extends ve{static get is(){return"bbva-global-account-transactions-base-api-dm"}resetAccountTransactions(){this.accountTransactions=[]}getAccountTransactions(e,t){this._paramsMapping(t),t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountTransactions`,this._getBgadp(s))}_getBgadp(e){return{getAccountTransactionsV2:()=>new p(e),getAccountTransactionsV0:()=>new Me(e),default:()=>"BGADP does not exist."}}_paramsMappingCanonical(e){if("0"==this.version){this._removeFields(["customerId"],e),e["transactionType.id"]&&(e["transactionType.id"]=e["transactionType.id"].toString()),e["status.id"]&&(e["status.id"]=e["status.id"].toString());let t=Object.keys(e);for(let i=0;i<t.length;i++){let s=t[i];if("operationAmount.id"===s&&"LOCAL_AMOUNT"===e[s])for(let i=0;i<t.length;i++)"operationAmount.fromAmount"===t[i]?this._renameQueryParam(e,"operationAmount.fromAmount","fromLocalAmount.amount"):"operationAmount.toAmount"===t[i]?this._renameQueryParam(e,"operationAmount.toAmount","toLocalAmount.amount"):"operationAmount.currency"===t[i]&&this._renameQueryParam(e,"operationAmount.currency","localAmount.currency");this._removeFields(["operationAmount.id","operationAmount.fromAmount","operationAmount.toAmount","operationAmount.currency"],e)}}return e}_renameQueryParam(e,t,i){t in e&&(e[i]=e[t],delete e[t])}_paramsMapping(e){return this._paramsMappingCanonical(e),e}responseMappingCanonical(e){if("0"==this.version&&Object.keys(e).length)for(let t=0;t<e.length;t++){this._renameProperty(e[t],"valuationDate","valueDate"),this._renameProperty(e[t].contract.numberType,"name","description"),this._removeFields(["category","exchangeRate","fundsOrigin"],e[t]),this._removeFields(["product","bank"],e[t].contract),this._removeFields(["description"],e[t].transactionType),this._removeFields(["updateDate"],e[t].status);const i=e[t].classification;i&&(this._removeFields(["pfmId","customName"],i),this._removeFields(["customName"],i.category),this._removeFields(["customName"],i.category.subcategory));const s=e[0].additionalInformation;this._removeFields(["postedBalance","reportingBalance","authorizedBalance","hold"],s),s&&s.branch&&(e[t].branch={id:s.branch.id,name:s.branch.name},this._removeFields(["branch"],s)),s&&s.updatedBalance&&(s.balances=[{id:"UPDATED_BALANCE",amount:s.updatedBalance.amount,currency:s.updatedBalance.currency}],this._removeFields(["updatedBalance"],s)),e[t].localAmount&&(e[t].operationAmounts=[{id:"LOCAL_AMOUNT",amount:e[t].localAmount.amount,currency:e[t].localAmount.currency}],this._removeFields(["localAmount"],e[t]));const n=e[t].operationAmounts[0];e[t].originAmount&&(e[t].operationAmounts=[n,{id:"ORIGIN_AMOUNT",amount:e[t].originAmount.amount,currency:e[t].originAmount.currency}],this._removeFields(["originAmount"],e[t]))}return e}_responseMapping(e){return this.responseMappingCanonical(e),e}}h(Fe,"GET_EVENTS",{customEvent:"account-transactions-api-dm-fetch",paginationEvent:"account-transactions-api-dm-pagination",errorFireEventHandler:"account-transactions-api-dm-fetch-error"}),customElements.define(Fe.is,Fe);class je extends ve{static get is(){return"bbva-global-account-participants-base-api-dm"}resetAccountParticipants(){this.accountParticipants=[]}getAccountParticipants(e,t={}){this._paramsMapping(t),t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}postAccountParticipants(e,t){const i={"account-id":e};this._generateGetService(this._getService("post",t,i),this.constructor.POST_EVENTS),this.resetAccountParticipants()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountParticipants`,this._getBgadp(s))}_getBgadp(e){return{getAccountParticipantsV2:()=>new ie(e),getAccountParticipantsV1:()=>new m(e),postAccountParticipantsV1:()=>new y(e),default:()=>"BGADP does not exist."}}_paramsMapping(e){return"1"==this.version&&(e={}),e}_responseMapping(e){return"1"==this.version&&e.length>0&&e.forEach((e=>{"NATURAL_KNOWN"==e.customDetails.personType?this._removeFields(["nonCustomerId","suffix","birthDate","identityDocuments","relationType","participationPercentage"],e.customDetails):"LEGAL_KNOWN"==e.customDetails.personType||this._removeFields(["customDetails"],e),this._removeFields(["description"],e.participantType)})),e}}h(je,"GET_EVENTS",{customEvent:"account-participants-api-dm-fetch",errorFireEventHandler:"account-participants-api-dm-fetch-error"}),h(je,"POST_EVENTS",{customEvent:"account-participants-api-dm-create",errorFireEventHandler:"account-participants-api-dm-create-error"}),customElements.define(je.is,je);const He={0:"notCategorizable",1:"cash",2:"saving",3:"taxes",4:"associations",6:"health",7:"shopping",8:"education",9:"bank",10:"home",11:"leisure",15:"transportation",16:"travel",17:"paycheck",18:"check",19:"otherIncome",20:"investment",21:"financing",999:"notCategorizable",9999:"toCategorize"},Be={notCategorizable:["0","998","999"],cash:["42","44","46","51"],bizum:["78"],toCategorize:["9998","9999"],paycheck:["41","96","97"],check:["98","99"],otherIncome:["43","50","100","101","102"],saving:["4","10","103","104"],investment:["6","11","105","106","107","110"],financing:["7"],taxes:["1","2","3"],associations:["12","13","81"],health:["23","64","65","7","69"],shopping:["24","25","27","28","30","63","87","88","109"],education:["31","32","33","34","82"],bank:["14","16","18","19","21","35","59","61","62","70","77","108"],home:["36","37","38","39","40","68","76","83","84","85"],leisure:["52","53","54","55","56","86"],transportation:["67","72","73","74","75","92","93","94","95"],travel:["57","58","71","89","90","91"]};class Ve extends(g(Fe)){static get is(){return"bbva-account-transactions-es-api-dm"}static get properties(){return{_financingTypeId:{type:String}}}static get scopedElements(){const e=[b];return Ve.scopedElementsFromClasses(e)}render(){return o` ${this.accountTransactionsDM} `}constructor(){super(),this._financingTypeId=""}get accountTransactionsDM(){return o`
      <bbva-core-generic-dp
        id="accountTransactions"
        requiresToken
        cross-domain
        .host="${this.host}"
        .cacheKey="${this.cacheKey}"
        .cacheType="${this.cacheType}"
        .path="${this.path}"
        headers="${c(((e,t)=>{let i={};if(e.includes("ASO")){const e="x-dm-local-",t=window.sessionStorage;i=Object.keys(t).filter((t=>t.startsWith(e))).reduce(((i,s)=>(i[s.replace(e,"")]=t.getItem(s),i)),{})}return JSON.stringify({...t,...i})})(this.host,this.headers))}"
        method="${this.method}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}_handleLocalDMSuccess(e){const t=this._formatData(e.detail);this.dispatchEvent(new CustomEvent("account-transactions-api-dm-fetch",{bubbles:!0,composed:!0,detail:t})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(e){this._handleError("account-transactions-api-dm-fetch-error",this.shadowRoot.getElementById("accountTransactions"))(e.detail)}_requestAccountTransactions(e,t){const i=this.shadowRoot.getElementById("accountTransactions"),s=t.moneyFlow?{INCOME:"IN",EXPENSE:"OUT"}[t.moneyFlow.id]:"BOTH";this._financingTypeId=null==t?void 0:t["financingType.id"],this._setGenericRequest({dm:i,path:"accountTransactions/V02/accountTransactionsAdvancedSearch",method:"post",params:t.pagination?`?paginationKey=${t.pagination}`:`?paginationKey=0&pageSize=${t.pageSize?t.pageSize:40}`,body:{accountContracts:[{contract:{id:e}}],customer:{id:this.localCustomProperties.customerId},filter:{dates:{from:t.filterDateFrom,to:t.filterDateTo},operationType:[s]},searchType:"SEARCH"}})}_filterFinancingData(e){const t={FINANCING_AVAILABLE:"SF"};return t[this._financingTypeId]?e.filter((e=>{var i;return(null==e||null===(i=e.financingData)||void 0===i?void 0:i.customizableIndicator)===t[this._financingTypeId]})):e}_formatingOperationAmounts(e){const t="ORIGIN_AMOUNT",i=null==e?void 0:e.amount;let s={};var n,a;i&&(s={id:"EUR"===(null===(n=i.currency)||void 0===n?void 0:n.code)?"CONTRACT_AMOUNT":t,amount:null==i?void 0:i.amount,currency:null==i||null===(a=i.currency)||void 0===a?void 0:a.id});let r={};if(null!=e&&e.wireTransactionDetail){const{wireTransactionDetail:i}=e;r={id:t,amount:i.payment.amount,currency:i.payment.currency.id}}const o=0===Object.keys(s).length,c=0===Object.keys(r).length;return o&&c?null:o?[r]:c?[s]:[s,r]}_formatData(e){const t=this._filterFinancingData(e.accountTransactions).map((e=>{var t,i;return{id:e.id,operationAmounts:this._formatingOperationAmounts(e),contract:{id:e.contract.id},moneyFlow:{id:(null==e||null===(t=e.amount)||void 0===t?void 0:t.amount)<0?"EXPENSE":"INCOME",name:(null==e||null===(i=e.amount)||void 0===i?void 0:i.amount)<0?"expense":"income"},classification:this._formatClassification(e),operationDate:e.transactionDate,valueDate:e.valueDate,concept:this._formatConcept(e.humanConceptName)}}));return e.pagination&&(e.pagination={links:{first:e.pagination.firstPage,...void 0!==e.pagination.lastPage&&{last:e.pagination.lastPage},...void 0!==e.pagination.previousPage&&{previous:e.pagination.previousPage},...void 0!==e.pagination.nextPage&&{next:e.pagination.nextPage}},page:e.pagination.page,totalPages:e.pagination.total,totalElements:e.totalResults,pageSize:e.pagination.pageSize}),this.dispatchEvent(new CustomEvent("account-transactions-api-dm-pagination",{bubbles:!0,composed:!0,detail:e.pagination})),t}_formatConcept(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_formatClassification(e){var t,i;const s=null==e||null===(t=e.humanCategory)||void 0===t?void 0:t.id,n=null==e||null===(i=e.humanSubcategory)||void 0===i?void 0:i.id,a=He[s];var r;return{id:s,name:a,category:{id:s,name:a,subcategory:{id:n,name:(r=n,Object.keys(Be).find((e=>Be[e].includes(r))))}}}}async getAccountTransactions(e,t){this._requestAccountTransactions(e,t)}_setGenericRequest({dm:e,path:t,method:i,params:s,body:n}){return e.native=!1,e.requiresToken=!0,e.path=`${t}${s}`,e.method=i,e.body=n,e.generateRequest(!0)}}customElements.define(Ve.is,Ve);class Le extends ve{static get is(){return"bbva-global-account-limits-base-api-dm"}resetAccountLimits(){this.accountLimits=[]}getAccountLimits(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountLimits`,this._getBgadp(s))}_getBgadp(e){return{getAccountLimitsV0:()=>new Ne(e),getAccountLimitsV2:()=>new ee(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return this._responseMappingCanonical(e),e}_responseMappingCanonical(e){"0"==this.version&&Object.keys(e).length&&e.map((e=>{this._renameProperty(e,"limitId","id"),this._removeFields(["name"],e)}))}}h(Le,"GET_EVENTS",{customEvent:"account-limits-api-dm-fetch",errorFireEventHandler:"account-limits-api-dm-fetch-error"}),customElements.define(Le.is,Le);class Ge extends ve{static get is(){return"bbva-global-accounts-opening-child-account-base-api-dm"}postAccountsOpeningChildAccount(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountsOpeningChildAccount`,this._getBgadp(s))}_getBgadp(e){return{postAccountsOpeningChildAccountV3:()=>new se(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}h(Ge,"POST_EVENTS",{customEvent:"accounts-opening-child-account-api-dm-create",errorFireEventHandler:"accounts-opening-child-account-api-dm-create-error"}),customElements.define(Ge.is,Ge);class ze extends ve{static get is(){return"bbva-global-account-financial-statement-base-api-dm"}resetAccountFinancialStatement(){this.accountFinancialStatement={}}getAccountFinancialStatement(e,t,i){i=Object.assign({"account-id":e,"financial-statement-id":t},i),this._generateGetService(this._getService("get",{},i),this.constructor.GET_EVENTS,i.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountFinancialStatement`,this._getBgadp(s))}_getBgadp(e){return{getAccountFinancialStatementV0:()=>new we(e),default:()=>"BGADP does not exist."}}}h(ze,"GET_EVENTS",{customEvent:"account-financial-statement-api-dm-fetch",errorFireEventHandler:"account-financial-statement-api-dm-fetch-error"}),customElements.define(ze.is,ze);class Ue extends ve{static get is(){return"bbva-global-account-financial-statements-base-api-dm"}resetAccountFinancialStatements(){this.accountFinancialStatements=[]}getAccountFinancialStatements(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountFinancialStatements`,this._getBgadp(s))}_getBgadp(e){return{getAccountFinancialStatementsV0:()=>new De(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}h(Ue,"GET_EVENTS",{customEvent:"account-financial-statements-api-dm-fetch",paginationEvent:"account-financial-statements-api-dm-pagination",errorFireEventHandler:"account-financial-statements-api-dm-fetch-error"}),customElements.define(Ue.is,Ue);class Ke extends ve{static get is(){return"bbva-global-accounts-account-related-contracts-base-api-dm"}resetAccountRelatedContracts(){this.accountRelatedContracts=[]}getAccountRelatedContracts(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountRelatedContracts`,this._getBgadp(s))}_getBgadp(e){return{getAccountRelatedContractsV2:()=>new Q(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}h(Ke,"GET_EVENTS",{customEvent:"account-related-contracts-api-dm-fetch",errorFireEventHandler:"account-related-contracts-api-dm-fetch-error"}),customElements.define(Ke.is,Ke);class Xe extends(d(a)){}class Je{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let n=0|t,a=Math.max(n>=0?n:s-Math.abs(n),0);for(;a<s;){if((r=i[a])===(o=e)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;a++}var r,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,n="",a=0,r=arguments.length;a!==r;++a){var o=+arguments[a];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?s=i.push(o):(o-=65536,s=i.push(55296+(o>>10),o%1024+56320)),s>=16383&&(n+=e.apply(null,i),i.length=0)}return n+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class We extends Je{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const Ye=0,Qe=1,Ze="jwt",et="tsec",tt="none";class it extends Je{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Ye,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new We,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=et:this.requiredToken=tt,this.requiresJWT=!1):this.requiredToken===et?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Ze?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===tt?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(et)}_setJwtHandler(){this._setTokenHandler(Ze)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=u),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===Qe?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(et,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Ze,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===Ze?"JWT ":"",n=e===Ze?"Authorization":et;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let r=this[i].getItem(a);r?t[n]=t[n]||s+r:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],n=0,a=0;if(s<=127?(n=0,a=255&s):s<=223?(n=1,a=31&s):s<=239?(n=2,a=15&s):s<=244&&(n=3,a=7&s),e.length-i-n>0){let t=0;for(;t<n;)s=e[i+t+1],a=a<<6|63&s,t+=1}else a=65533,n=e.length-i;t+=String.fromCodePoint(a),i+=n+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",n=i[e].split(s);t[n.shift().toLowerCase()]=n.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let n=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(n=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(n=JSON.parse(t.headers)[s])}if(n){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==n&&(e.setItem(t,n),this._emitTokenUpdate(i,n))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,n,a;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),n=e.getResponseHeader("AuthenticationChallenge"),a=e.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(e.headers);t=r.authenticationtype,i=r.authenticationdata||null,s=r.authenticationstate,n=r.authenticationchallenge,a=r.authenticationresponse}return{type:t,data:i,state:s,challenge:n,response:a}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let n;if("object"==typeof e&&e){const a=this._getSignatureData(e.signatureType,t,i);n=this._makeKeyValuePairFromObject(a,e.signatureValue),e.challenge&&(n+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(n,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(n=`password=${e}`,this._buildSignatureHeaders(n,"2",s)):(n=`${i}=${e}`,this._buildSignatureHeaders(n,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),n=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:a,data:r,state:o,challenge:c,response:l}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(n)this._notifySignatureInvalid(d),i=!0;else if(a)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,d,a,r,o,c,l),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,a,r,o,c,l),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),n=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),a=this._getRequestMetadata(e);n&&(this._notifyWaitingForProcessResponse(a),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,n,a){this._defineSignatureValue(t,i,s);const r={type:t,data:i,challenge:n,metadata:e};a&&(r.response=a),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,n,a){s?this._notifySignatureRequired(e,t,i,s,n,a):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,n,a,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,n):this._notifySignatureRequired(t,i,s,n,a,r)}}class st extends it{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class nt extends it{constructor(e=null){super(Object.assign(e||{},{method:"PATCH"}))}toString(e=""){return super.toString(e||"BGADPRequestPATCH")}}class at extends it{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class rt extends st{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`insurances-contracts/v${this.version}/bills/{bill-id}`)}toString(){return super.toString("BGADPInsurancesContractsBillsBillGetV1")}}class ot extends at{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`insurances-contracts/v${this.version}/bills/{bill-id}/realize-payment`)}toString(){return super.toString("BGADPInsurancesContractsBillsBillRealizePaymentPostV1")}}class ct extends st{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`insurances-contracts/v${this.version}/insurances-contracts/{insurance-contract-id}`)}toString(){return super.toString("BGADPInsurancesContractsInsuranceContractGetV1")}}class lt extends nt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`insurances-contracts/v${this.version}/insurances-contracts/{insurance-contract-id}`)}toString(){return super.toString("BGADPInsurancesContractsInsuranceContractPatchV1")}}class dt extends at{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`insurances-contracts/v${this.version}/insurances-contracts/{insurance-contract-id}/cancellations`)}toString(){return super.toString("BGADPInsurancesContractsInsuranceContractCancellationsPostV1")}}class ut extends at{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`insurances-contracts/v${this.version}/insurances-contracts/{insurance-contract-id}/cancellations/validate`)}toString(){return super.toString("BGADPInsurancesContractsInsuranceContractCancellationsValidatePostV1")}}class ht extends Xe{static get is(){return"bbva-global-insurances-contracts-bill-base-api-dm"}getBill(e,t){t=Object.assign({"bill-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}Bill`,this._getBgadp(s))}_getBgadp(e){return{getBillV1:()=>new rt(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}h(ht,"GET_EVENTS",{customEvent:"bill-api-dm-fetch",errorFireEventHandler:"bill-api-dm-fetch-error"}),customElements.define(ht.is,ht);class pt extends Xe{static get is(){return"bbva-global-bill-api-dm"}static get properties(){return{bill:{type:Object,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.bill={},this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","maxRetries","pendingTimeOut","bill"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./c3f56723.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}Bill`]()}))}))}get lastResponse(){return this.module.lastResponse}get lastResponseHeaders(){return this.module.lastResponseHeaders}get lastResponseRaw(){return this.module.lastResponseRaw}get lastRequest(){return this.module.lastRequest}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaInsurancesContractsBill${e}ApiDm`;(0,this._modules[e])().then((async e=>{const i=e[t].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-bill-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-bill-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=ht.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}resetBill(){this.bill={}}async getBill(e,t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({billId:e,params:t}):this._requestParams={get:[{billId:e,params:t}]}}async _getBill(){await this.module.updateComplete,Object.keys(this.bill).length||(this._requestParams.get.forEach((e=>{this.module.getBill(e.billId,e.params)})),delete this._requestParams.get)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return o` ${this._module?this._module:""}`}}class mt extends Xe{static get is(){return"bbva-global-insurances-contracts-bill-realize-payment-base-api-dm"}postBillRealizePayment(e,t){const i={"bill-id":e};this._generateGetService(this._getService("post",t,i),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}BillRealizePayment`,this._getBgadp(s))}_getBgadp(e){return{postBillRealizePaymentV1:()=>new ot(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}h(mt,"POST_EVENTS",{customEvent:"bill-realize-payment-api-dm-create",errorFireEventHandler:"bill-realize-payment-api-dm-create-error"}),customElements.define(mt.is,mt);class yt extends Xe{static get is(){return"bbva-global-bill-realize-payment-api-dm"}static get properties(){return{country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","maxRetries","pendingTimeOut"],this._loaded=!1,this._requestParams={}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}BillRealizePayment`]()}))}))}get lastResponse(){return this.module.lastResponse}get lastResponseHeaders(){return this.module.lastResponseHeaders}get lastResponseRaw(){return this.module.lastResponseRaw}get lastRequest(){return this.module.lastRequest}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaInsurancesContractsBillRealizePayment${e}ApiDm`;(0,this._modules[e])().then((async e=>{const i=e[t].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-bill-realize-payment-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-bill-realize-payment-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=mt.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async postBillRealizePayment(e,t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({billId:e,body:t}):this._requestParams={post:[{billId:e,body:t}]}}async _postBillRealizePayment(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postBillRealizePayment(e.billId,e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return o` ${this._module?this._module:""}`}}class gt extends Xe{static get is(){return"bbva-global-insurances-contracts-insurance-contract-base-api-dm"}getInsuranceContract(e,t){t=Object.assign({"insurance-contract-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}patchInsuranceContract(e,t){const i={"insurance-contract-id":e};this._generateGetService(this._getService("patch",t,i),this.constructor.PATCH_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}InsuranceContract`,this._getBgadp(s))}_getBgadp(e){return{getInsuranceContractV1:()=>new ct(e),patchInsuranceContractV1:()=>new lt(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}h(gt,"GET_EVENTS",{customEvent:"insurance-contract-api-dm-fetch",errorFireEventHandler:"insurance-contract-api-dm-fetch-error"}),h(gt,"PATCH_EVENTS",{customEvent:"insurance-contract-api-dm-update",errorFireEventHandler:"insurance-contract-api-dm-update-error"}),customElements.define(gt.is,gt);class bt extends Xe{static get is(){return"bbva-global-insurances-contracts-insurance-contract-cancellations-validate-base-api-dm"}postInsuranceContractCancellationsValidate(e,t){const i={"insurance-contract-id":e};this._generateGetService(this._getService("post",t,i),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}InsuranceContractCancellationsValidate`,this._getBgadp(s))}_getBgadp(e){return{postInsuranceContractCancellationsValidateV1:()=>new ut(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}h(bt,"POST_EVENTS",{customEvent:"insurance-contract-cancellations-validate-api-dm-fetch",errorFireEventHandler:"insurance-contract-cancellations-validate-api-dm-fetch-error"}),customElements.define(bt.is,bt);class _t extends Xe{static get is(){return"bbva-global-insurances-contracts-insurance-contract-cancellations-base-api-dm"}postInsuranceContractCancellations(e,t){const i={"insurance-contract-id":e};this._generateGetService(this._getService("post",t,i),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}InsuranceContractCancellations`,this._getBgadp(s))}_getBgadp(e){return{postInsuranceContractCancellationsV1:()=>new dt(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}h(_t,"POST_EVENTS",{customEvent:"insurance-contract-cancellations-api-dm-create",errorFireEventHandler:"insurance-contract-cancellations-api-dm-create-error"}),customElements.define(_t.is,_t);const{moment:vt}=window;class ft extends(s($(O(n(a))))){static get is(){return"insurance-transaction-servicing-insurance-delayed-payment-dm"}static get scopedElements(){const e=[qe,pt,yt,_,ne,ae,re,...ft.configurationScopedElements()];return ft.scopedElementsFromClasses(e)}static get properties(){return{accountsApiVersion:{type:String,attribute:"account-api-version"},billId:{type:String,attribute:"bill-id"},cardsApiVersion:{type:String,attribute:"card-api-version"},cardsResponse:{type:Array},customersApiVersion:{type:String,attribute:"customers-api-version"},customerId:{type:String,attribute:"customer-id"},documentsApiVersion:{type:String,attribute:"documents-api-version"},documentTemplate:{type:String,attribute:"document-template"},insurancesContractsApiVersion:{type:String,attribute:"insurace-contracts-api-version"},localCustomProperties:{type:Object,attribute:"local-custom-properties"},maxRetries:{type:Number,attribute:"max-retries"},paymentSelected:{type:Object},productId:{type:String,attribute:"product-id"},productSelected:{type:Object},userEmail:{type:String,attribute:"user-email"},accountsResponse:{type:Array},_billResponse:{type:Object},_insuranceService:{type:Boolean},_periods:{type:Array},_retriesConfig:{type:Object,state:!0}}}constructor(){super(),this.accountsApiVersion="",this.billId="",this.cardsApiVersion="",this.cardsResponse=[],this.customersApiVersion="",this.customerId="",this.documentsApiVersion="0",this.documentTemplate="",this.insurancesContractsApiVersion="",this.localCustomProperties={},this.maxRetries=0,this.paymentSelected={},this.productId="",this.productSelected={},this.userEmail="",this.accountsResponse=[],this._billResponse={},this._insuranceService=!1,this._periods={MONTHLY:"insurance-transaction-servicing-insurance-delayed-payment-dm-frecuency-month",QUARTERLY:"insurance-transaction-servicing-insurance-delayed-payment-dm-frecuency-quartertly",HALF_YEAR:"insurance-transaction-servicing-insurance-delayed-payment-dm-frecuency-half-year",ANNUAL:"insurance-transaction-servicing-insurance-delayed-payment-dm-frecuency-annual"},this._retriesConfig={BILL:0,BILLPAYMENT:0}}firstUpdated(){this._accountsDM=this.shadowRoot.querySelector(`[data-tag-name="${qe.is}"]`),this._cardsDM=this.shadowRoot.getElementById("cardsDM"),this._billDm=this.shadowRoot.getElementById("billDm"),this._billRealizePaymentDm=this.shadowRoot.getElementById("billRealizePaymentDm"),this._customersDm=this.shadowRoot.getElementById("customersDm"),this._customerContactDetailsDm=this.shadowRoot.getElementById("customerContactDetailsDm"),this._documentFileDm=this.shadowRoot.getElementById("documentFileDm")}getAC(){0===this.cardsResponse.length?this._cardsDM.getCards({"cardType.id":"CREDIT_CARD"}):this._fireEvent("customer-cards",this.cardsResponse),0===this.accountsResponse.length?this._accountsDM.getAccounts():this._fireEvent("customer-accounts",this.accountsResponse)}getContract(){this._documentFileDm.getDocumentFile(this.documentTemplate)}insurancePayment(){if(this._insuranceService=!1,this._validateData()){const e={insuranceContract:{id:this._billResponse.id},holder:{id:this.customerId.substring(0,9)},isDirectDebit:this.productSelected.endorsementFlag,paymentMethod:{paymentType:this.paymentSelected.type,relatedContract:{id:this.paymentSelected.element.id}}};this.productSelected.endorsementFlag&&Object.assign(e,{documentTemplate:{id:this.documentTemplate}}),this._billRealizePaymentDm.postBillRealizePayment(this.billId,e)}}static maskNumber(e){return v(e,"•",!0,4)}reTryBill(){this._billDm.getBill(this.billId)}reset(){this.accountsResponse=[],this.billId="",this.cardsResponse=[],this.paymentSelected={},this.productSelected={},this.userEmail="",this._billResponse={},this._insuranceService=!1,this._retriesConfig={BILL:0,BILLPAYMENT:0}}updated(e){e.has("_insuranceService")&&!0===this._insuranceService&&this.insurancePayment(),e.has("billId")&&""!==this.billId&&this._billDm.getBill(this.billId)}_fireEvent(e,t=!0){const i=`insurance-transaction-servicing-insurance-delayed-payment-dm-${e}`;this.dispatchEvent(new CustomEvent(i,{detail:t,bubbles:!0,composed:!0}))}_filterAccounts(e){if(!Object.keys(e).length)return;const t=e.filter((e=>"ACTIVATED"===e.status.id));this.accountsResponse=t.map((e=>({id:e.accountId,name:e.alias,amount:e.availableBalance.currentBalances[0].amount,currency:e.availableBalance.currentBalances[0].currency,number:ft.maskNumber(e.number)}))),this._fireEvent("customer-accounts",this.accountsResponse)}_filterBill(e){this._billResponse={id:e.insuranceContract.id,amount:e.specificAmounts.find((e=>"PAYMENT_AMOUNT"===e.id)).amounts[0].amount,currency:e.specificAmounts.find((e=>"PAYMENT_AMOUNT"===e.id)).amounts[0].currency,policeNumber:e.insuranceContract.policyNumber,productName:e.insuranceContract.productType.id,startDate:vt(e.insuranceContract.validityPeriod.startDate).format("DD MMM YYYY"),period:this.t(this._periods[e.insuranceContract.validityPeriod.unit]),name:e.insuranceContract.bank.name,company:e.insuranceCompany.name},this._fireEvent("bill-response",this._billResponse)}_filterBillError(e){this._fireEvent(`bill-response-${{expiredTime:"expired-time",paymentAnotherOperation:"payment-another-operation",functionalError:"functional-error"}[e.messages[0].code]}`,this._billResponse)}_filterBillRealizePayment(e){const t=e.operationDetail;this._billResponsePayment={operationDate:vt(t.date).format("DD MMM YYYY h:mm A"),amount:t.amount.amount,currency:t.amount.currency,policeNumber:this._billResponse.policeNumber,startDate:this._billResponse.startDate,productName:this._billResponse.productName,period:this._billResponse.period,productType:t.description,productPaymenth:this.paymentSelected.type,folio:t.folio,id:ft.maskNumber(t.paymentMethod.relatedContract.id)},this._fireEvent("bill-response-payment",this._billResponsePayment)}_filterCards(e){if(!Object.keys(e).length)return;const t=e.filter((e=>"OPERATIVE"===e.status.id)).filter((e=>e.product.id!==this.productId));this.cardsResponse=t.map((e=>({id:e.id,name:e.alias?e.alias:e.product.name,amount:e.availableBalance.currentBalances[0].amount,currency:e.availableBalance.currentBalances[0].currency,number:ft.maskNumber(e.number),image:e.images[0].url}))),this._fireEvent("customer-cards",this.cardsResponse)}_setAccounts(e){e.stopPropagation(),this._filterAccounts(null==e?void 0:e.detail)}_setBill(e){e.stopPropagation(),this._filterBill(null==e?void 0:e.detail)}_setBillError(e){e.stopPropagation(),this._filterBillError(null==e?void 0:e.detail)}_setBillRealizePayment(e){e.stopPropagation(),this._filterBillRealizePayment(null==e?void 0:e.detail)}_setCards(e){e.stopPropagation(),this._filterCards(null==e?void 0:e.detail)}_manageError(e){this._retriesConfig[e]<this.maxRetries?this._fireEvent("error-retry",e):this._fireEvent("error-exit"),this._retriesConfig[e]+=1}_validateData(){return""===this.customerId?(this._customersDm.getCustomers(),!1):""===this.userEmail?(this._customerContactDetailsDm.getCustomerContactDetails(this.customerId),!1):(this._insuranceService=!1,!0)}get _accounts(){return o`
      <bbva-global-accounts-api-dm
        id="accountsDM"
        .host="${this.host}"
        .version="${this.accountsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @accounts-api-dm-fetch="${this._setAccounts}"
      ></bbva-global-accounts-api-dm>
    `}get _bill(){return o`
      <bbva-global-bill-api-dm
        id="billDm"
        .host="${this.host}"
        .version="${this.insurancesContractsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        @bill-api-dm-fetch="${this._setBill}"
        @api-dm-error="${()=>this._manageError("BILL")}"
        @bill-api-dm-fetch-error="${this._setBillError}"
      >
      </bbva-global-bill-api-dm>
    `}get _billRealizePayment(){return o`
      <bbva-global-bill-realize-payment-api-dm
        id="billRealizePaymentDm"
        .host="${this.host}"
        .version="${this.insurancesContractsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        requiredOTP
        .country="${this.country}"
        @bill-realize-payment-api-dm-create="${this._setBillRealizePayment}"
        @bill-realize-payment-api-dm-create-error="${this._setBillError}"
        @api-dm-error="${()=>this._manageError("BILLPAYMENT")}"
      >
      </bbva-global-bill-realize-payment-api-dm>
    `}get _cards(){return o`
      <bbva-global-cards-api-dm
        id="cardsDM"
        .host="${this.host}"
        .version="${this.cardsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @cards-api-dm-fetch="${this._setCards}"
      >
      </bbva-global-cards-api-dm>
    `}get _customers(){return o`
      <bbva-global-customers-api-dm
        id="customersDm"
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @customers-api-dm-fetch=${e=>{e.stopPropagation(),this.customerId=e.detail[0].customerId,this._insuranceService=!0}}
      >
      </bbva-global-customers-api-dm>
    `}get _customersDetail(){return o`
      <bbva-global-customer-contact-details-api-dm
        id="customerContactDetailsDm"
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @customer-contact-details-api-dm-fetch="${e=>{e.stopPropagation();const t=e.detail.find((({contact:e})=>"EMAIL"===e.contactDetailType));this.userEmail=t.contact.address,this._fireEvent("user-email",this.userEmail),this._insuranceService=!0}}"
      >
      </bbva-global-customer-contact-details-api-dm>
    `}get _documentContract(){return o`
      <bbva-global-document-file-api-dm
        id="documentFileDm"
        .host="${this.host}"
        .version="${this.documentsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .localCustomProperties="${this.localCustomProperties}"
        .country="${this.country}"
        @document-file-api-dm-fetch="${e=>{this._fireEvent("document-success",e.detail)}}"
      >
      </bbva-global-document-file-api-dm>
    `}get _renderApis(){return o`
      ${this._accounts} ${this._cards} ${this._bill} ${this._billRealizePayment} ${this._customers}
      ${this._customersDetail} ${this._documentContract}
    `}render(){return o` ${super.render()} ${this._renderApis} `}}var Et=e`
  :host {
    display: block;
    box-sizing: border-box;
    --bbva-help-modal-padding: 0;
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

  .confirm-step {
    background-color: var(
      --_insurance-transaction-servicing-insurance-delayed-payment-confirmation-bg
    );
    width: auto;
    padding-right: 1rem 0;
  }

  .panel-summary {
    padding: 2rem 1rem 2rem 0;
  }
`,St=e`
  :host {
    --_insurance-transaction-servicing-insurance-delayed-payment-confirmation-bg: var(
      --insurance-transaction-servicing-insurance-delayed-payment--_ambient--confirmation-bg,
      var(
        --insurance-transaction-servicing-insurance-delayed-payment--custom--primary-ambient--confirmation-bg,
        ${H("colorPrimarySurfaceAmbientDefault",B)}
      )
    );
  }
`,Rt=e`
  :host {
    display: block;
    box-sizing: border-box;
    --bbva-progress-content-z-index: 11;
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
`;class Tt extends(s($(O(n(a))))){static get is(){return"insurance-detail"}static get scopedElements(){const e=[ge,...Tt.configurationScopedElements()];return Tt.scopedElementsFromClasses(e)}static get properties(){return{insuranceDataDetail:{type:Array}}}constructor(){super(),this.insuranceDataDetail=[]}static get styles(){return[Rt,r("insurance-detail-styles")]}render(){return o` <summary-insurance-info-element
      .listContentData="${this.insuranceDataDetail}"
      style-class
    ></summary-insurance-info-element>`}}var Ct=e`
  :host {
    display: block;
    box-sizing: border-box;
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

  .product-payment-button {
    padding-top: 1rem;
  }

  .center-text-box {
    position: relative;
    left: -16px;
  }
`;class At extends(s($(O(n(a))))){static get is(){return"insurance-product-payment"}static get scopedElements(){const e=[w,de,V,...At.configurationScopedElements()];return At.scopedElementsFromClasses(e)}static get properties(){return{paymentMethod:{type:String,attribute:"payment-method"},_currentOption:{type:String,state:!0},endorsmentText:{type:String,attribute:"endorsment-text"}}}constructor(){super(),this.paymentMethod="",this._currentOption="",this.endorsmentText=""}static get styles(){return[Ct,r("insurance-detail-styles")]}_handleChanged(e){this._currentOption=e}reset(){this._currentOption=""}_fireEvent(e,t){const i="complete"===e?e:`insurance-transaction-servicing-insurance-delayed-payment-product-${e}`;this.dispatchEvent(new CustomEvent(i,{detail:t,bubbles:!0,composed:!0}))}_isCardPayment(){return"CARD"===this.paymentMethod}_isPendingPaymentChecked(){return"pending-payment"===this._currentOption}get _renderPendingPaymentOption(){return o`
      <bbva-form-radio-button
        class="center-text-box"
        id="pendingPayment"
        divider="full"
        ?checked=${this._isPendingPaymentChecked()}
        @input=${()=>this._handleChanged("pending-payment")}
      >
        ${this.t("insurance-transaction-servicing-insurance-delayed-payment-product-payment-form-pending-payment")}
      </bbva-form-radio-button>
    `}get _renderEndorsmentPaymentOption(){const e=this._isCardPayment(),t="endorsment-"+(e?"card-payment":"account-payment");this.endorsmentText=`insurance-transaction-servicing-insurance-delayed-payment-product-payment-form-${t}`;const i=e?"insurance-transaction-servicing-insurance-delayed-payment-product-payment-form-endorsment-card-payment-info-message":"",s=e?"info message":"";return o`
      <bbva-form-radio-button
        id="endorsmentPayment"
        class="center-text-box"
        ?checked=${!this._isPendingPaymentChecked()&&this._currentOption.length>0}
        info-message="${i}"
        accessibility-icon-info-notification="${s}"
        @input=${()=>{this._fireEvent("flag-fire",!0),this._handleChanged(t)}}
      >
        ${this.t(this.endorsmentText)}
      </bbva-form-radio-button>
    `}get _renderForm(){return o`
      <bbva-type-text
        text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-product-payment-form-pending-payment-label")}"
        tag="span"
        font-weight="500"
      >
      </bbva-type-text>
      ${this._renderPendingPaymentOption} ${this._renderEndorsmentPaymentOption}
      <div class="product-payment-button">
        <bbva-button-default
          ?disabled=${this._currentOption.length<1}
          text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-onboarding-button")}"
          fullwidth
          @click="${()=>{this._fireEvent("complete"),this._fireEvent("select",{endorsementFlag:!this._isPendingPaymentChecked()&&this._currentOption.length>0,text:!this._isPendingPaymentChecked()&&this._currentOption.length>0?this.endorsmentText:"insurance-transaction-servicing-insurance-delayed-payment-product-payment-form-pending-payment"})}}"
        >
        </bbva-button-default>
      </div>
    `}render(){return o` ${this._renderForm} `}}var Pt=e`
  :host {
    display: block;
    box-sizing: border-box;
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
`;class xt extends(s($(O(n(a))))){static get is(){return"insurance-product-payment-collapsed"}static get scopedElements(){const e=[w,...xt.configurationScopedElements()];return xt.scopedElementsFromClasses(e)}static get properties(){return{paymentMethodName:{type:String,attribute:"payment-method-name"}}}constructor(){super(),this.paymentMethodName=""}static get styles(){return[Pt,r("insurance-detail-styles")]}get _renderMethodName(){return o`
      <bbva-type-text tag="span" ambient="secondary" text=${this.t(this.paymentMethodName)}>
      </bbva-type-text>
    `}render(){return o` ${this._renderMethodName} `}}var $t=e`
  :host {
    display: block;
    box-sizing: border-box;
    --bbva-help-modal-padding: 16px;
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

  .num-card {
    display: flex;
    align-items: center;
    column-gap: 0.5rem;
    margin-bottom: 1rem;
  }

  .align-items {
    display: flex;
    justify-content: space-between;
  }

  .product-content {
    padding-bottom: 1rem;
  }

  .notification-help-product {
    padding-bottom: 0.5rem;
  }
`;class Ot extends(s($(O(n(a))))){static get is(){return"insurance-payment-method-card-account-modal"}static get scopedElements(){const e=[q,L,ue,G,z,I,U,K,w,...Ot.configurationScopedElements()];return Ot.scopedElementsFromClasses(e)}static get properties(){return{_accountEntity:{type:Array},billAmount:{type:Number,attribute:"bill-amount"},productResponse:{type:Array},typeProduct:{type:String,attribute:"type-product"},visible:{type:Boolean}}}constructor(){super(),this._accountEntity=[{icon:f(),size:"xs",accessibilityText:"account-transaction-servicing-scheduled-bill-payments-accounts"}],this.billAmount=0,this.productResponse=[],this.typeProduct="",this.visible=!1}static get styles(){return[$t,r("insurance-payment-method-card-account-modal-shared-styles")]}get _typeHeaderProduct(){return"CARD"===this.typeProduct?this.t("insurance-transaction-servicing-insurance-delayed-payment-method-card-account-modal-header-cards"):this.t("insurance-transaction-servicing-insurance-delayed-payment-method-card-account-modal-header-accounts")}_eventCloseModal(e,t){this.dispatchEvent(new CustomEvent(`insurance-transaction-servicing-insurance-delayed-payment-card-account-modal-${e}`,{detail:t,bubbles:!0,composed:!0}))}_handlerClickEvent(e){this.billAmount<e.amount&&this._sendProductData({element:e,modalVisble:!1,type:this.typeProduct},"method-select")}_sendProductData(e,t){this.dispatchEvent(new CustomEvent(`insurance-transaction-servicing-insurance-delayed-payment-card-account-modal-${t}`,{detail:e,bubbles:!0,composed:!0}))}_renderAccountOrCardImage(e,t){return"CARD"===e?o`
          <bbva-clip-card logo="bbva" card-type="visa" card-image="${null==t?void 0:t.image}" size="xs">
          </bbva-clip-card>
        `:o`
          <bbva-clip-box ambient="primary-alt" .group=${this._accountEntity}> </bbva-clip-box>
        `}get _renderListProduct(){return o`
      <div slot="slot-content">
        ${this.productResponse.map(((e,t)=>o`
            <div
              @click="${()=>{this._handlerClickEvent(e)}}"
              @keyDown="${()=>{}}"
            >
              <div class="align-items">
                <bbva-type-link id="${t}"> ${e.name} </bbva-type-link>
                <bbva-type-amount
                  type="bold"
                  amount="${e.amount}"
                  currency-code="${e.currency}"
                  local-currency="${e.currency}"
                >
                </bbva-type-amount>
              </div>

              <div class="align-items">
                <div class="num-card">
                  ${this._renderAccountOrCardImage(this.typeProduct,e)}
                  <bbva-type-text
                    data-acoustic-obfuscate
                    ambient="primary-alt"
                    inherit=""
                    font-style="${E.fontStyle20}"
                    text="${e.number}"
                    tag="p"
                    unset
                  >
                  </bbva-type-text>
                </div>
                <bbva-type-text
                  inherit
                  text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-step-payment-method-open-available-balance-accordion")}"
                  tag="p"
                  unset
                >
                </bbva-type-text>
              </div>
            </div>

            ${e.amount<this.billAmount?o` <bbva-notification-help
                  class="notification-help-product"
                  accessibility-label-icon="Alert"
                  variant="alert"
                  text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-step-payment-method-open-insufficient-balance-accordion")}"
                ></bbva-notification-help>`:S}
            ${t+1===this.productResponse.length?null:o`<div class="product-content">
                  <bbva-divider-default size="full"></bbva-divider-default>
                </div> `}
          `))}
      </div>
    `}get _bodyProductType(){var e;return o`
      <bbva-help-modal
        class="modal-products"
        scrollable
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?fixed-footer="${null===(e=this.configModal)||void 0===e?void 0:e.fixedFooter}"
        ?visible=${this.visible}
        header-text="${this._typeHeaderProduct}"
        @help-modal-header-click="${()=>this._eventCloseModal("header-button-click",!1)}"
        @help-modal-veil-click="${()=>this._eventCloseModal("veil-click",!1)}"
        @help-modal-swipe-close="${({detail:e})=>this._eventCloseModal("exit-scroll",e)}"
        ambient="primary"
      >
        ${this._renderListProduct}
      </bbva-help-modal>
    `}render(){return o` ${this._bodyProductType} `}}var It=e`
  .header-accordion {
    display: flex;
  }

  .content-card-title {
    margin-top: 1rem;
    display: flex;
    flex-direction: column;
  }

  .num-card {
    display: flex;
    align-items: center;
    column-gap: 0.5rem;
    margin-bottom: 1rem;
  }

  .origin-info {
    display: flex;
    align-items: center;
  }

  .button-link {
    margin-top: 1rem;
  }

  [data-tag-name='bbva-tab-default'] {
    --tab-default-group-padding: 0;
  }

  .align-items {
    display: flex;
    align-items: baseline;
    justify-content: space-between;
  }

  .button-content {
    margin: 1rem 0;
  }

  .icon-center {
    margin-block: auto;
    margin-right: 0.5rem;
  }

  .notification-help-product {
    padding-bottom: 0.5rem;
  }
`;class Dt extends(s($(O(n(a))))){static get is(){return"insurance-payment-method"}static get scopedElements(){const e=[w,I,z,L,ue,k,he,U,K,G,Ot,...Dt.configurationScopedElements()];return Dt.scopedElementsFromClasses(e)}static get properties(){return{accountsResponse:{type:Array},billAmount:{type:Number,attribute:"bill-amount"},cardsResponse:{type:Array},_accountEntity:{type:Array},_accountFlag:{type:Boolean},_cardFlag:{type:Boolean},modalFillResponse:{type:Array},typeProduct:{type:String,attribute:"type-product"},visible:{type:Boolean}}}constructor(){super(),this.accountsResponse=[],this.billAmount=0,this.cardsResponse=[],this._accountEntity=[{icon:f(),size:"xs",accessibilityText:"account-transaction-servicing-scheduled-bill-payments-accounts"}],this._accountFlag=!1,this._cardFlag=!1,this.modalFillResponse=[],this.typeProduct="",this.visible=!1}static get styles(){return[It,r("insurance-payment-method-styles")]}fireEvent(e,t=!0){const i="complete"===e?e:`insurance-transaction-servicing-insurance-delayed-payment-method-${e}`;this.dispatchEvent(new CustomEvent(i,{detail:t,bubbles:!0,composed:!0}))}_renderAccountOrCardImage(e,t){return"CARD"===e?o`
          <bbva-clip-card logo="bbva" card-type="visa" card-image="${null==t?void 0:t.image}" size="xs">
          </bbva-clip-card>
        `:o`
          <bbva-clip-box ambient="primary-alt" .group=${this._accountEntity}> </bbva-clip-box>
        `}_renderListDetail(e,t){return t.slice(0,3).map(((t,i)=>o`
        <bbva-type-link
          class="content-card-title"
          @click="${i=>{i.stopPropagation(),this.billAmount<t.amount&&(this.fireEvent("complete"),this.fireEvent("payment-select",{element:t,type:e}))}}"
        >
          <div class="align-items">
            ${t.amount<this.billAmount?o` <bbva-type-text
                  id="${i}"
                  text="${t.name}"
                  font-weight="500"
                  unset
                ></bbva-type-text>`:o`<bbva-type-link id="${i}"> ${t.name} </bbva-type-link>`}
            <bbva-type-amount
              type="bold"
              amount="${t.amount}"
              currency-code="${t.currency}"
              local-currency="${t.currency}"
            >
            </bbva-type-amount>
          </div>
          <div class="align-items">
            <div class="num-card">
              ${this._renderAccountOrCardImage(e,t)}
              <bbva-type-text
                data-acoustic-obfuscate
                ambient="primary-alt"
                inherit=""
                font-style="${E.fontStyle20}"
                text="${t.number}"
                tag="p"
                unset
              >
              </bbva-type-text>
            </div>
            <bbva-type-text
              inherit
              text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-step-payment-method-open-available-balance-accordion")}"
              tag="p"
              unset
            >
            </bbva-type-text>
          </div>
        </bbva-type-link>
        ${t.amount<this.billAmount?o` <bbva-notification-help
              class="notification-help-product"
              accessibility-label-icon="Alert"
              variant="alert"
              text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-step-payment-method-open-insufficient-balance-accordion")}"
            ></bbva-notification-help>`:S}
        <bbva-divider-default size="full"></bbva-divider-default>
      `))}get _accordionAccount(){return this.accountsResponse.length>0?o`
          <bbva-expandable-accordion
            id="accordionA"
            @expandable-accordion-open-change="${e=>{this._accountFlag=e.detail}}"
          >
            <div slot="header">
              <div class="header-accordion">
                <bbva-type-icon
                  ambient="primary"
                  class="icon-center"
                  icon="${R()}"
                  size="24"
                  icon-color=${this._accountFlag?"#121212":"#1464A5"}
                ></bbva-type-icon>
                <bbva-type-text
                  ambient="primary"
                  text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-step-payment-method-open-header-accordion-accounts")}"
                  text-color=${this._accountFlag?"#121212":"#1464A5"}
                  size="M"
                  font-weight="700"
                ></bbva-type-text>
              </div>
            </div>
            <div slot="content">
              <div class="align-items">
                <bbva-type-text
                  text-color="${i.secondary500}"
                  font-weight="${T.fontWeight40}"
                  text="Cuentas"
                  tag="p"
                >
                </bbva-type-text>
                ${this.accountsResponse.length>3?o`<bbva-type-link
                      class="button-link"
                      ambient="primary-alt"
                      @click="${e=>{e.stopPropagation();const t={modalFillResponse:this.accountsResponse,typeProduct:"ACCOUNT",visible:!0,billAmount:this.billAmount};this.fireEvent("card-account-all-open",t)}}"
                    >
                      ${this.t("insurance-transaction-servicing-insurance-delayed-payment-step-payment-method-open-link-see-all-accordion")}
                    </bbva-type-link>`:S}
              </div>
              ${this._renderListDetail("ACCOUNT",this.accountsResponse)}
            </div>
          </bbva-expandable-accordion>
        `:S}get _accordionCard(){return this.cardsResponse.length>0?o`
          <bbva-expandable-accordion
            id="accordionC"
            @expandable-accordion-open-change="${e=>{this._cardFlag=e.detail}}"
          >
            <div slot="header">
              <div class="header-accordion">
                <bbva-type-icon
                  ambient="primary"
                  class="icon-center"
                  icon="${C()}"
                  size="24"
                  icon-color=${this._cardFlag?"#121212":"#1464A5"}
                ></bbva-type-icon>
                <bbva-type-text
                  ambient="primary"
                  text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-step-payment-method-open-header-accordion-cards")}"
                  size="M"
                  font-weight="700"
                  text-color=${this._cardFlag?"#121212":"#1464A5"}
                ></bbva-type-text>
              </div>
            </div>
            <div slot="content">
              <div class="align-items">
                <bbva-type-text
                  text-color="${i.secondary500}"
                  font-weight="${T.fontWeight40}"
                  text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-step-payment-method-open-title-accordion-cards")}"
                  tag="p"
                >
                </bbva-type-text>
                ${this.cardsResponse.length>3?o`<bbva-type-link
                      class="button-link"
                      ambient="primary-alt"
                      @click="${e=>{e.stopPropagation();const t={modalFillResponse:this.cardsResponse,typeProduct:"CARD",visible:!0,billAmount:this.billAmount};this.fireEvent("card-account-all-open",t)}}"
                    >
                      ${this.t("insurance-transaction-servicing-insurance-delayed-payment-step-payment-method-open-link-see-all-accordion")}
                    </bbva-type-link>`:S}
              </div>
              ${this._renderListDetail("CARD",this.cardsResponse)}
            </div>
          </bbva-expandable-accordion>
        `:S}get _infoStep(){return o`
      <bbva-type-text
        text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-step-payment-method-open-info")}"
      ></bbva-type-text>
    `}render(){return o`${this._infoStep} ${this._accordionCard}
      <bbva-divider-default size="full"></bbva-divider-default>
      ${this._accordionAccount}
      <bbva-divider-default size="full"></bbva-divider-default>`}}var wt=e`
  .content-account,
  .description-account {
    display: flex;
    justify-content: space-between;
    align-items: center;
  }

  .num-account {
    display: flex;
    align-items: center;
    column-gap: 0.5rem;
  }
`;class Nt extends(s($(O(n(a))))){static get is(){return"insurance-payment-method-collapsed"}static get scopedElements(){const e=[w,I,L,ue,...Nt.configurationScopedElements()];return Nt.scopedElementsFromClasses(e)}static get properties(){return{paymenthSelected:{type:Object}}}constructor(){super(),this.paymenthSelected={}}static get styles(){return[wt,r("insurance-payment-method-styles")]}static _imageCard(e){return o`
      <bbva-clip-card
        ambient="secondary"
        logo="bbva"
        card-type="visa"
        card-image="${e}"
        size="s"
      >
      </bbva-clip-card>
    `}static get _entityAccount(){return o`
      <bbva-clip-box
        ambient="secondary"
        .group="${[{icon:f(),size:"xs",accessibilityText:"account-transaction-servicing-scheduled-bill-payments-accounts"}]}"
      >
      </bbva-clip-box>
    `}render(){var e,t,i,s;return o`
      <div class="content-account">
        <bbva-type-text
          ambient="secondary"
          font-weight="${T.fontWeight40}"
          text="${null===(e=this.paymenthSelected)||void 0===e?void 0:e.name}"
          tag="span"
          inherit
        >
        </bbva-type-text>
        <bbva-type-amount
          ambient="secondary"
          type="bold"
          amount="${null===(t=this.paymenthSelected)||void 0===t?void 0:t.amount}"
          currency-code="${null===(i=this.paymenthSelected)||void 0===i?void 0:i.currency}"
          local-currency="${null===(s=this.paymenthSelected)||void 0===s?void 0:s.currency}"
        >
        </bbva-type-amount>
      </div>
      <div class="description-account" ambient="secondary">
        <div class="num-account">
          ${"image"in this.paymenthSelected?Nt._imageCard(this.paymenthSelected.image):Nt._entityAccount}
          <bbva-type-text
            data-acoustic-obfuscate
            unset
            font-style="${E.fontStyle20}"
            text="${this.paymenthSelected.number}"
            tag="span"
          >
          </bbva-type-text>
        </div>
        <bbva-type-text
          unset
          text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-step-payment-method-open-available-balance-accordion")}"
          tag="span"
        >
        </bbva-type-text>
      </div>
    `}}var Mt=e`
  :host {
    --_list-file-file-size-color: var(
      --bbva-list-file-file-size-color,
      var(--colorsSecondary500, ${t(i.secondary500)})
    );
  }

  .link {
    align-items: flex-start;
    text-align: left;
    padding: 0.5rem 0;
  }

  .file-size {
    color: var(--_list-file-file-size-color);
  }

  .confirm-step {
    margin-top: 2rem;
  }

  .main {
    display: flex;
    flex-direction: column;
    flex-grow: 1;
  }

  .content {
    display: flex;
    justify-content: start;
  }

  .center-text-box {
    position: relative;
    left: -16px;
  }
`;class kt extends(s($(O(n(a))))){static get is(){return"insurance-payment-conditions"}static get scopedElements(){const e=[oe,K,V,...kt.configurationScopedElements()];return kt.scopedElementsFromClasses(e)}static get properties(){return{billResponse:{type:Object},fileType:{type:Object},paymentMethod:{type:String,attribute:"payment-method"},summaryAccountNumber:{type:String,attribute:"summary-account-number"},_buttonFlag:{type:Boolean},_checkedFlag:{type:Boolean}}}constructor(){super(),this.billResponse={},this.fileType={CARD:"insurance-transaction-servicing-insurance-delayed-payment-insurance-payment-conditions-filename-card",ACCOUNT:"insurance-transaction-servicing-insurance-delayed-payment-insurance-payment-conditions-filename-account"},this.paymentMethod="",this.summaryAccountNumber="",this._buttonFlag=!1,this._checkedFlag=!1}static get styles(){return[Mt,r("insurance-payment-conditions-styles")]}_fireEvent(e,t=!0){const i="complete"===e?e:`insurance-transaction-servicing-insurance-delayed-payment-conditions-${e}`;this.dispatchEvent(new CustomEvent(i,{detail:t,bubbles:!0,composed:!0}))}get _getPaymentAmount(){return`$${this.billResponse.amount}`}_getVariableData(){var e;return{insuranceBill:this._getPaymentAmount,period:null===(e=this.billResponse)||void 0===e?void 0:e.period,typeAccount:this.t(`insurance-transaction-servicing-insurance-delayed-payment-lower-${this.paymentMethod}`),accountNumber:this.summaryAccountNumber}}reset(){this._buttonFlag=!1,this._checkedFlag=!1}_showConditions(){this.dispatchEvent(new CustomEvent("insurance-transaction-servicing-insurance-delayed-payment-payment-conditions-step-modal-show",{detail:!0,bubbles:!0,composed:!0}))}render(){return o`
      <div class="main">
        <bbva-type-link
          id="bbvaDocument"
          class="link"
          .icon="${A()}"
          icon-size="24"
          @click="${e=>{e.stopPropagation(),this._fireEvent("document-show")}}"
        >
          <span>${this.t(this.fileType[this.paymentMethod])}</span>
        </bbva-type-link>
        <div>
          <span class="file-size"
            >${this.t("insurance-transaction-servicing-insurance-delayed-payment-terms-and-conditions-file-size")}</span
          >
        </div>
      </div>
      <bbva-form-checkbox
        ?checked="${this._checkedFlag}"
        class="center-text-box"
        ?bubble-event=${!0}
        label=${this.t("insurance-transaction-servicing-insurance-delayed-payment-terms-and-conditions",this._getVariableData())}
        @bbva-form-checkbox-input="${e=>{this._buttonFlag=e.detail.checked,this._checkedFlag=e.detail.checked}}"
      ></bbva-form-checkbox>
      <bbva-type-link
        id="moreInfoDocument"
        @click="${this._showConditions}"
        text=${this.t("insurance-transaction-servicing-insurance-delayed-payment-insurance-payment-conditions-more-info")}
      ></bbva-type-link>
      <bbva-button-default
        class="confirm-step"
        text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-step-button")}"
        fullwidth
        ?disabled="${!this._buttonFlag}"
        @click="${()=>{this._fireEvent("complete")}}"
      >
      </bbva-button-default>
    `}}var qt=e`
  :host {
    display: block;
    box-sizing: border-box;
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

  .conditions-container {
    display: flex;
    align-items: center;
    gap: 0.5rem;
  }
`;class Ft extends(s($(O(n(a))))){static get is(){return"insurance-payment-conditions-collapsed"}static get scopedElements(){const e=[w,U,...Ft.configurationScopedElements()];return Ft.scopedElementsFromClasses(e)}static get properties(){return{}}static get styles(){return[qt,r("insurance-payment-conditions-collapsed-styles")]}render(){return o`
      <div class="conditions-container">
        <bbva-type-icon icon="${P()}"></bbva-type-icon>
        <bbva-type-text
          tag="span"
          text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-insurance-payment-conditions-success-check")}"></bbva-type-text>
        </bbva-type-text>
      </div>
    `}}class jt{constructor(){this.configs=[{id:"exitProcessModal",fullHeight:!1,titleIcon:"bbva:caution",modalType:"caution",styleIcon:"caution-style",fixedFooter:!0,headerText:"insurance-transaction-servicing-insurance-delayed-payment-exit-process-modal-header-text",bodyText:"insurance-transaction-servicing-insurance-delayed-payment-exit-process-modal-content-text",buttonText:"insurance-transaction-servicing-insurance-delayed-payment-exit-process-modal-button-text",linkText:"insurance-transaction-servicing-insurance-delayed-payment-exit-process-modal-link-text",headerClick:{typeEvent:"header-button-click",detail:!1},buttonClick:{typeEvent:"footer-button-click",detail:{modalVisible:!1,fromExitModal:!0}},linkClick:{typeEvent:"footer-link-click",detail:!1},veilClick:{typeEvent:"veil-click",detail:!1}},{id:"importantInfo",fullHeight:!1,hideContentPaddingTop:!0,headerText:"insurance-transaction-servicing-insurance-delayed-payment-important-info-modal-header-text",bodyText:"insurance-transaction-servicing-insurance-delayed-payment-important-info-modal-content-text",headerClick:{typeEvent:"header-button-click",detail:!1},veilClick:{typeEvent:"veil-click",detail:!1}},{id:"paidPolicy",fullHeight:!1,titleIcon:"bbva:caution",headerText:"insurance-transaction-servicing-insurance-delayed-payment-paid-policy-modal-header-text",bodyText:"insurance-transaction-servicing-insurance-delayed-payment-paid-policy-modal-content-text",headerClick:{typeEvent:"exit",detail:!1},veilClick:{typeEvent:"exit",detail:!1}},{id:"errorServicesFail",fullHeight:!1,titleIcon:"bbva:warning",modalType:"warning",styleIcon:"warning-style",fixedFooter:!0,headerText:"insurance-transaction-servicing-insurance-delayed-payment-error-services-fail-modal-header-text",bodyText:"insurance-transaction-servicing-insurance-delayed-payment-error-services-fail-modal-content-text",buttonText:"insurance-transaction-servicing-insurance-delayed-payment-error-services-fail-modal-button-text",linkText:"insurance-transaction-servicing-insurance-delayed-payment-error-services-fail-modal-link-text",headerClick:{typeEvent:"exit",detail:!1},buttonClick:{typeEvent:"error-retry",detail:{modalVisible:!1,fromExitModal:!1}},linkClick:{typeEvent:"exit",detail:!1},veilClick:{typeEvent:"exit",detail:!1}},{id:"errorServices",fullHeight:!1,titleIcon:"bbva:warning",modalType:"warning",styleIcon:"warning-style",fixedFooter:!0,headerText:"insurance-transaction-servicing-insurance-delayed-payment-error-services-modal-header-text",bodyText:"insurance-transaction-servicing-insurance-delayed-payment-error-services-modal-content-text",buttonText:"insurance-transaction-servicing-insurance-delayed-payment-error-services-modal-button-text",headerClick:{typeEvent:"exit",detail:!1},buttonClick:{typeEvent:"exit",detail:{modalVisible:!1,fromExitModal:!1}},veilClick:{typeEvent:"exit",detail:!1}},{id:"offerExpired",fullHeight:!0,microillustration:"caution",microillustrationSize:"M",fixedFooter:!0,headerText:"insurance-transaction-servicing-insurance-delayed-payment-offer-expired-modal-header-text",titleText:"insurance-transaction-servicing-insurance-delayed-payment-offer-expired-modal-title-text",bodyText:"insurance-transaction-servicing-insurance-delayed-payment-offer-expired-modal-content-text",buttonText:"insurance-transaction-servicing-insurance-delayed-payment-offer-expired-modal-button-text",headerClick:{typeEvent:"exit",detail:!1},buttonClick:{typeEvent:"exit",detail:{modalVisible:!1,fromExitModal:!1}}},{id:"errorReviewingSummary",fullHeight:!0,microillustration:"error",microillustrationSize:"M",fixedFooter:!0,headerText:"insurance-transaction-servicing-insurance-delayed-payment-error-review-summary-modal-header-text",titleText:"insurance-transaction-servicing-insurance-delayed-payment-error-review-summary-modal-title-text",bodyText:"insurance-transaction-servicing-insurance-delayed-payment-error-review-summary-modal-content-text",buttonText:"insurance-transaction-servicing-insurance-delayed-payment-error-review-summary-modal-button-text",headerClick:{typeEvent:"exit",detail:!1},buttonClick:{typeEvent:"exit",detail:{modalVisible:!1,fromExitModal:!1}}}]}getConfigModal(e){return this.configs.find((t=>e===t.id))}}var Ht=e`
  :host {
    display: block;
    box-sizing: border-box;
    --bbva-help-modal-padding: 0 1rem;
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
`;class Bt extends(s($(O(n(a))))){static get MODES(){return{exitProcessModal:"exitProcessModal",importantInfo:"importantInfo",paidPolicy:"paidPolicy",errorServicesFail:"errorServicesFail",errorServices:"errorServices",offerExpired:"offerExpired",errorReviewingSummary:"errorReviewingSummary"}}static get is(){return"insurance-transaction-servicing-insurance-delayed-payment-custom-modal"}static get scopedElements(){const e=[M,q,k,j,w,...Bt.configurationScopedElements()];return Bt.scopedElementsFromClasses(e)}static get properties(){return{configModal:{type:Object,attribute:"config-modal"},subsidiary:{type:Object,attribute:"subsidiary"},visible:{type:Boolean},mode:{type:String}}}constructor(){super(),this.configModal={},this.iOSFixedHeader=!1,this.visible=!1,this.subsidiary={},this.mode=""}static get styles(){return[Ht,X.primaryAlt,J.primaryAlt,N.primaryAlt,r("insurance-transaction-servicing-insurance-delayed-payment-custom-modal-shared-styles")]}update(e){e.has("mode")&&(this._resetConfigs(),this._configs()),super.update(e)}_configs(){this.mode&&Object.assign(this.configModal,(new jt).getConfigModal(this.mode))}_eventModalClick(e){this.dispatchEvent(new CustomEvent(`insurance-transaction-servicing-insurance-delayed-payment-custom-modal-${null==e?void 0:e.typeEvent}`,{detail:null==e?void 0:e.detail,bubbles:!0,composed:!0}))}_resetConfigs(){this.configModal={}}get slotContent(){var e,t,i,s;const{schedule:n,phoneNumber:a}=this.subsidiary,r="offerExpired"===(null===(e=this.configModal)||void 0===e?void 0:e.id)?`${this.t("insurance-transaction-servicing-insurance-delayed-payment-offer-expired-modal-content-text")} ${a} ${n}`:`${this.t("insurance-transaction-servicing-insurance-delayed-payment-error-review-summary-modal-content-text")} ${a} ${n} ${this.t("insurance-transaction-servicing-insurance-delayed-payment-error-review-summary-modal-content-text-final-complement")}`;return o`
      <div slot="slot-content">
        <bbva-clip-microillustration
          microillustration="${null===(t=this.configModal)||void 0===t?void 0:t.microillustration}"
          size="${null===(i=this.configModal)||void 0===i?void 0:i.microillustrationSize}"
        ></bbva-clip-microillustration>
        <bbva-type-text text="${this.t(null===(s=this.configModal)||void 0===s?void 0:s.titleText)}" tag="h2"></bbva-type-text>
        <bbva-type-text text="${r}" tag="span"></bbva-type-text>
      </div>
    `}get _renderModal(){var e,t,i,s,n,a,r,l,d;return o`
      <bbva-help-modal
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?full-height="${null===(e=this.configModal)||void 0===e?void 0:e.fullHeight}"
        ?fixed-footer="${null===(t=this.configModal)||void 0===t?void 0:t.fixedFooter}"
        title-icon="${c(null===(i=this.configModal)||void 0===i?void 0:i.titleIcon)}"
        modal-type="${c(null===(s=this.configModal)||void 0===s?void 0:s.modalType)}"
        ?visible=${this.visible}
        header-text="${this.t(null===(n=this.configModal)||void 0===n?void 0:n.headerText)}"
        body-text="${this.t(null===(a=this.configModal)||void 0===a?void 0:a.bodyText)}"
        button-text="${c(this.t(null===(r=this.configModal)||void 0===r?void 0:r.buttonText))}"
        link-text="${c(this.t(null===(l=this.configModal)||void 0===l?void 0:l.linkText))}"
        ?hide-content-padding-top="${c(null===(d=this.configModal)||void 0===d?void 0:d.hideContentPaddingTop)}"
        @help-modal-header-click="${()=>{var e;return this._eventModalClick(null===(e=this.configModal)||void 0===e?void 0:e.headerClick)}}"
        @help-modal-footer-button-click="${()=>{var e;return this._eventModalClick(null===(e=this.configModal)||void 0===e?void 0:e.buttonClick)}}"
        @help-modal-veil-click="${()=>{var e;return this._eventModalClick(null===(e=this.configModal)||void 0===e?void 0:e.veilClick)}}"
        @help-modal-footer-link-click="${()=>{var e;return this._eventModalClick(null===(e=this.configModal)||void 0===e?void 0:e.linkClick)}}"
        @help-modal-swipe-close="${({detail:e})=>{this._eventModalClick({typeEvent:"exit-scroll",detail:e})}}"
        ambient="primary-alt"
      >
        ${this.configModal.microillustration?this.slotContent:S}
      </bbva-help-modal>
    `}render(){return o` ${super.render()} ${this._renderModal} `}}class Vt extends(s($(O(n(a))))){static get is(){return"insurances-payments-multistep"}static get scopedElements(){const e=[ce,le,q,F,V,Tt,At,xt,Dt,Nt,kt,Ft,Bt,Ot,...Vt.configurationScopedElements()];return Vt.scopedElementsFromClasses(e)}static get properties(){return{accountsResponse:{type:Array},billResponse:{type:Object},billAmount:{type:Number,attribute:"bill-amount"},cardsResponse:{type:Array},paymenthSelected:{type:Object},paymentMethod:{type:String,attribute:"payment-method"},selectedPaymentMode:{type:Object},showMultistep:{type:Boolean,attribute:"show-multistep"},typeProduct:{type:String,attribute:"type-product"},modalFillResponse:{type:Array},_modalAccountCardVisible:{type:Boolean},_modalVisible:{type:Boolean},_typeModal:{type:String},headerType:{type:String,attribute:"header-type"},_headerVariant:{type:Object},_hideAnimation:{type:Boolean},hideDivider:{type:Boolean,attribute:"hide-divider"},_changeSelected:{type:Boolean}}}constructor(){super(),this.accountsResponse=[],this.billResponse={},this.cardsResponse=[],this.modalFillResponse=[],this._modalVisible=!1,this._modalAccountCardVisible=!1,this._changeSelected=!1,this._typeModal="",this.paymenthSelected={},this.paymentMethod="",this.iOSFixedHeader=!1,this.selectedPaymentMode={},this.showMultistep=!1,this.typeProduct="",this.billAmount=0,this.headerType="modal-initial-secondary",this._headerVariant={initial:"modal-initial",secondary:"modal-initial-secondary"},this._hideAnimation=!1,this.hideDivider=!1}static get styles(){return[Et,St,r("insurances-payments-multistep-shared-styles")]}firstUpdated(){this._multistep=this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]'),this._headerMain=this.shadowRoot.getElementById("headerMain")}updated(e){e.has("paymentMethod")&&""!==this.paymentMethod&&this._changeSelected&&(this._multistep.querySelector("#step-3").completed=!1,this._multistep.querySelector("#step-3").active=!0,this._changeSelected=!1)}summaryButtonHandleEvent(e){e.stopPropagation(),this._fire("insurance-transaction-servicing-insurance-delayed-payment-payment-multistep-bill-pay")}_dynamicSteps(){!0===this.selectedPaymentMode.endorsementFlag?this._multistep.activeSteps=["step-1","step-2","step-3","step-4"]:(this._multistep.activeSteps=["step-1","step-2","step-3"],this.hideDivider=!0)}_fire(e,t={}){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}reset(){this._resetPreperties(),this._multistep.querySelector("#step-3").querySelector("#insuranceProductPayment").reset(),this._multistep.querySelector("#step-4").querySelector("#insurancePaymentConditions").reset(),this._changeSelected=!1;const e=this._multistep.querySelectorAll('[data-tag-name="bbva-expandable-step"]');e.forEach(((t,i)=>{e[i].completed=!1,e[i].disabled=!0,e[i].active=!1}));const t=e[0];t.disabled=!1,t.active=!0,t.completed=!0,t.prefilled=!0}_resetPreperties(){this._modalVisible=!1,this.accountsResponse=[],this.billResponse={},this.cardsResponse=[],this.paymenthSelected={},this.paymentMethod="",this.selectedPaymentMode={},this.headerType="modal-initial-secondary"}_getVariableStepInfo(e){return{step:e,total:this.selectedPaymentMode.endorsementFlag?3:2}}closeMultistepProcess(){this._modalVisible=!0,this._typeModal=Bt.MODES.exitProcessModal}_showModalCondition(e){this._modalVisible=e,this._typeModal=Bt.MODES.importantInfo}get _renderInsuranceDetail(){return o`
      <bbva-expandable-step
        id="step-1"
        header=${this.t("insurance-transaction-servicing-insurance-delayed-payment-insurance-detail-header")}
        prefilled
      >
        <div class="summary" slot="summary">
          <insurance-detail .insuranceDataDetail="${this.insuranceDataDetail}"> </insurance-detail>
        </div>
      </bbva-expandable-step>
    `}get _renderInsuranceProductPayment(){return o`
      <bbva-expandable-step
        id="step-3"
        ?hide-divider="${this.hideDivider}"
        is-dynamic-handler
        header="${this.t("insurance-transaction-servicing-insurance-delayed-payment-product-payment-header")}"
        current-step-label="${this.t("insurance-transaction-servicing-insurance-delayed-payment-steps-label",this._getVariableStepInfo(2))}"
        edit-label="insurance-transaction-servicing-insurance-delayed-payment-step-edit"
        show-link
      >
        <div class="content">
          <insurance-product-payment
            id="insuranceProductPayment"
            payment-method="${this.paymentMethod}"
            @insurance-transaction-servicing-insurance-delayed-payment-product-select="${e=>{this.selectedPaymentMode=e.detail,this._dynamicSteps()}}"
          >
          </insurance-product-payment>
        </div>
        <div class="summary" slot="summary">
          <insurance-product-payment-collapsed
            id="insuranceProductPaymentCollapsed"
            payment-method-name="${this.selectedPaymentMode.text}"
          >
          </insurance-product-payment-collapsed>
        </div>
      </bbva-expandable-step>
    `}get _renderInsurancePaymentCondition(){var e;return o`
      <bbva-expandable-step
        id="step-4"
        show-link
        current-step-label="${this.t("insurance-transaction-servicing-insurance-delayed-payment-steps-label",this._getVariableStepInfo(3))}"
        edit-label="${this.t("insurance-transaction-servicing-insurance-delayed-payment-step-check-conditions")}"
        header="${this.t("insurance-transaction-servicing-insurance-delayed-payment-insurance-payment-conditions-header")}"
      >
        <div class="content">
          <insurance-payment-conditions
            id="insurancePaymentConditions"
            .billResponse="${this.billResponse}"
            summary-account-number="${null===(e=this.paymenthSelected)||void 0===e?void 0:e.number}"
            payment-method="${this.paymentMethod}"
            @insurance-transaction-servicing-insurance-delayed-payment-payment-conditions-step-modal-show="${({detail:e})=>this._showModalCondition(e)}"
          >
          </insurance-payment-conditions>
        </div>
        <div class="summary" slot="summary">
          <insurance-payment-conditions-collapsed> </insurance-payment-conditions-collapsed>
        </div>
      </bbva-expandable-step>
    `}get _renderInsurancePaymentMethod(){return o`
      <bbva-expandable-step
        show-link
        edit-label="insurance-transaction-servicing-insurance-delayed-payment-step-edit"
        id="step-2"
        header="${this.t("insurance-transaction-servicing-insurance-delayed-payment-insurance-payment-method-header")}"
        current-step-label="${this.t("insurance-transaction-servicing-insurance-delayed-payment-steps-label",this._getVariableStepInfo(1))}"
      >
        <div class="content">
          <insurance-payment-method
            id="insurancePaymentMethod"
            .accountsResponse="${this.accountsResponse}"
            .cardsResponse="${this.cardsResponse}"
            bill-amount="${this.billResponse.amount}"
            @insurance-transaction-servicing-insurance-delayed-payment-method-payment-select="${e=>{this.paymentMethod=e.detail.type,this.paymenthSelected=e.detail.element,this._hideAnimation=!0}}"
            @insurance-transaction-servicing-insurance-delayed-payment-method-card-account-all-open="${({detail:e})=>{this.modalFillResponse=e.modalFillResponse,this.typeProduct=e.typeProduct,this.billAmount=e.billAmount,this._modalAccountCardVisible=e.visible}}"
          >
          </insurance-payment-method>
        </div>
        <div class="summary" slot="summary">
          <insurance-payment-method-collapsed
            .paymenthSelected="${this.paymenthSelected}"
          ></insurance-payment-method-collapsed>
        </div>
      </bbva-expandable-step>
    `}get _renderMultistep(){return o`
      <bbva-expandable-multistep
        ?hide-animation=${!this._hideAnimation}
        @expandable-multistep-specific-step-scroll="${e=>{this._hideAnimation||(this._hideAnimation=!0),this.headerType=e.detail.completed?this._headerVariant.secondary:this._headerVariant.initial}}"
        @expandable-step-edit-step="${()=>{this._changeSelected="step-2"===this._multistep.currentStep.id,this._dynamicSteps()}}"
      >
        <div slot="content">
          ${this._renderInsuranceDetail} ${this._renderInsurancePaymentMethod}
          ${this._renderInsuranceProductPayment} ${this._renderInsurancePaymentCondition}
        </div>
        <div class="confirm-step" slot="confirmation" ambient="primary-alt">
          <div class="panel-summary">
            <bbva-button-default
              fullwidth
              variant="positive"
              text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-multistep-button-default")}"
              @click=${this.summaryButtonHandleEvent}
            >
            </bbva-button-default>
          </div>
        </div>
      </bbva-expandable-multistep>
    `}get _halfCardAccountModal(){return o`
      <insurance-payment-method-card-account-modal
        .productResponse="${this.modalFillResponse}"
        type-product="${this.typeProduct}"
        bill-amount="${this.billAmount}"
        ?visible="${this._modalAccountCardVisible}"
        @insurance-transaction-servicing-insurance-delayed-payment-card-account-modal-header-button-click="${e=>{this._modalAccountCardVisible=e.detail}}"
        @insurance-transaction-servicing-insurance-delayed-payment-card-account-modal-exit-scroll="${e=>{this._modalAccountCardVisible=!e.detail}}"
        @insurance-transaction-servicing-insurance-delayed-payment-card-account-modal-veil-click="${e=>{this._modalAccountCardVisible=e.detail}}"
        @insurance-transaction-servicing-insurance-delayed-payment-card-account-modal-method-select="${({detail:e})=>{const{modalVisible:t,element:i,type:s}=e;this.billAmount<i.amount&&(this._fire("insurance-transaction-servicing-insurance-delayed-payment-method-payment-select",{element:i,type:s}),this.shadowRoot.querySelector('[data-tag-name="insurance-payment-method"]').fireEvent("complete"),this.paymentMethod=s,this.paymenthSelected=i,this._hideAnimation=!0),this._modalAccountCardVisible=t}}"
      ></insurance-payment-method-card-account-modal>
    `}get _renderModal(){const e=[{id:"btn-close",icon:l(),accessibilityText:"Close"}];return o`
      <bbva-help-modal
        full-height
        header-type="modal"
        hide-content-padding-top
        ?visible=${this.showMultistep}
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
      >
        <div slot="slot-content">
          <div class="header">
            <bbva-header-main
              text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-multistep-header")}"
              variant="${this.headerType}"
              .buttons="${c(e)}"
              @header-main-icon-click="${e=>{e.stopPropagation(),this._fire("insurance-transaction-servicing-insurance-delayed-payment-payment-multistep-exit-proces"),this.closeMultistepProcess()}}"
            ></bbva-header-main>
          </div>
          ${this._renderMultistep}
          <insurance-transaction-servicing-insurance-delayed-payment-custom-modal
            id="multiStepModal"
            ?visible="${this._modalVisible}"
            .mode="${this._typeModal}"
            @insurance-transaction-servicing-insurance-delayed-payment-custom-modal-header-button-click=${({detail:e})=>{this._modalVisible=e}}
            @insurance-transaction-servicing-insurance-delayed-payment-custom-modal-veil-click=${({detail:e})=>{this._modalVisible=e}}
            @insurance-transaction-servicing-insurance-delayed-payment-custom-modal-footer-link-click=${({detail:e})=>{this._modalVisible=e}}
            @insurance-transaction-servicing-insurance-delayed-payment-custom-modal-exit-scroll=${({detail:e})=>{this._modalVisible=!e}}
          ></insurance-transaction-servicing-insurance-delayed-payment-custom-modal>
          ${this._halfCardAccountModal}
        </div>
      </bbva-help-modal>
    `}render(){return o` ${super.render()} ${this._renderModal} `}}var Lt=e`
  :host {
    display: block;
    box-sizing: border-box;
    --bbva-button-action--_ambient--oval-background-color: var(
      --colorsSecondary100,
      ${t(i.secondary100)}
    );
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

  .top-content,
  .content-description {
    padding: 0.5rem 0;
  }

  .message-content,
  .table-content {
    padding: 0.5rem 0 1rem;
  }
`;class Gt extends(s($(O(n(a))))){static get is(){return"insurance-payment-successful-payment"}static get scopedElements(){const e=[W,M,q,j,I,w,ge,...Gt.configurationScopedElements()];return Gt.scopedElementsFromClasses(e)}static get properties(){return{billResponsePayment:{type:Object},visible:{type:Boolean},icon:{type:Array},userEmail:{type:String,attribute:"user-email"}}}constructor(){super(),this.billResponsePayment={},this.visible=!1,this.icon=[{icon:x(),label:this.t("insurance-transaction-servicing-insurance-delayed-payment-succssesful-payment-button-action"),id:"button-1"}],this.userEmail=""}static get styles(){return[Lt,r("insurance-payment-successful-payment-shared-styles")]}get _storeTopContentText(){return[{description:this.t("insurance-transaction-servicing-insurance-delayed-payment-succssesful-payment-top-content-main-text"),size:"3XL",fontWeight:T.fontWeight40},{description:this.t("insurance-transaction-servicing-insurance-delayed-payment-succssesful-payment-top-content-secondary-text"),size:"",fontWeight:""}]}get _listData(){var e,t,i,s,n,a,r,o,c;return[{label:this.t("insurance-transaction-servicing-insurance-delayed-payment-succssesful-payment-date-time-transaction"),description:null===(e=this.billResponsePayment)||void 0===e?void 0:e.operationDate,fontStyle:"italic"},{label:this.t("insurance-transaction-servicing-insurance-delayed-payment-succssesful-payment-policy-number"),description:null===(t=this.billResponsePayment)||void 0===t?void 0:t.policeNumber},{label:this.t("insurance-transaction-servicing-insurance-delayed-payment-succssesful-payment-insurance-type"),description:null===(i=this.billResponsePayment)||void 0===i?void 0:i.productName},{label:this.t("insurance-transaction-servicing-insurance-delayed-payment-succssesful-payment-validity-period"),description:null===(s=this.billResponsePayment)||void 0===s?void 0:s.startDate,fontStyle:"italic"},{label:this.t("insurance-transaction-servicing-insurance-delayed-payment-succssesful-payment-payment-frequency"),description:null===(n=this.billResponsePayment)||void 0===n?void 0:n.period},{label:this.t("insurance-transaction-servicing-insurance-delayed-payment-succssesful-payment-operation-type"),description:null===(a=this.billResponsePayment)||void 0===a?void 0:a.productType},{label:this.t("insurance-transaction-servicing-insurance-delayed-payment-succssesful-payment-payment-method"),description:this.t(`insurance-transaction-servicing-insurance-delayed-payment-capital-${null===(r=this.billResponsePayment)||void 0===r?void 0:r.productPaymenth}`,{number:null===(o=this.billResponsePayment)||void 0===o?void 0:o.id})},{label:this.t("insurance-transaction-servicing-insurance-delayed-payment-succssesful-payment-operation-folio"),description:null===(c=this.billResponsePayment)||void 0===c?void 0:c.folio}]}get _getUserEmail(){return`•${this.userEmail.split("*").filter((e=>""!==e))}`}get _topContent(){return o`
      <div class="top-content">
        <bbva-clip-microillustration
          microillustration="success"
          size="M"
        ></bbva-clip-microillustration>

        ${this._storeTopContentText.map((e=>o`
            <div class="content-description">
              <bbva-type-text
                text="${e.description}"
                size="${e.size}"
                tag="span"
                font-weight="${e.fontWeight}"
              >
              </bbva-type-text>
            </div>
          `))}
        <bbva-type-amount
          amount="${this.billResponsePayment.amount}"
          currency-code="${this.billResponsePayment.currency}"
          local-currency="${this.billResponsePayment.currency}"
          decimal-digits="2"
          group-char=","
          separator-char="."
          symbol="$"
          symbol-left
          variant="3xl"
          type="bold"
        ></bbva-type-amount>
      </div>
    `}get _tableContent(){return o`
      <div class="table-content">
        <summary-insurance-info-element
          .listContentData="${this._listData}"
        ></summary-insurance-info-element>
      </div>
    `}get _bottomContent(){return o`
      <div class="bottom-content">
        <div class="message-content">
          <bbva-notification-message
            message-title=${this.t("insurance-transaction-servicing-insurance-delayed-payment-succssesful-payment-bottom-content-message-title")}
            book-title
          >
            <bbva-type-text
              text="${this._getUserEmail}"
              font-Weight="${T.fontWeight40}"
              tag="span"
            ></bbva-type-text>
          </bbva-notification-message>
        </div>

        <bbva-button-row
          @button-row-item-click="${e=>{e.stopPropagation(),this.dispatchEvent(new CustomEvent("insurance-transaction-servicing-insurance-delayed-payment-conditions-receipt-share",{bubbles:!0,composed:!0}))}}"
          .options=${this.icon}
        ></bbva-button-row>
      </div>
    `}get slotContent(){return o`
      <div slot="slot-content">
        ${this._topContent} ${this._tableContent} ${this._bottomContent}
      </div>
    `}get _renderModalSuccessful(){return o`
      <bbva-help-modal
        full-height
        ?visible=${this.visible}
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        hide-content-padding-top
        header-text="${this.t("insurance-transaction-servicing-insurance-delayed-payment-multistep-header")}"
        ambient="primary-alt"
      >
        ${this.slotContent}
      </bbva-help-modal>
    `}render(){return o` ${this._renderModalSuccessful} `}}var zt=e`
  :host {
    display: block;
    box-sizing: border-box;
    --bbva-progress-content-z-index: 11;
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
`;class Ut extends(s($(O(n(a))))){static get is(){return"insurance-transaction-servicing-insurance-delayed-payment"}static get scopedElements(){const e=[ft,Gt,_e,Vt,Bt,...Ut.configurationScopedElements()];return Ut.scopedElementsFromClasses(e)}static get properties(){return{accountsApiVersion:{type:String,attribute:"account-api-version"},billId:{type:String,attribute:"bill-id"},cardsApiVersion:{type:String,attribute:"card-api-version"},customersApiVersion:{type:String},customerId:{type:String,attribute:"customer-id"},documentsApiVersion:{type:String,attribute:"documents-api-version"},documentTemplate:{type:String,attribute:"document-template"},localCustomProperties:{type:Object,attribute:"local-custom-properties"},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},userEmail:{type:String,attribute:"user-email"},insurancesContractsApiVersion:{type:String,attribute:"insurace-contracts-api-version"},headerType:{type:String,attribute:"header-type"},maxRe:{type:Number,attribute:"max-re"},productId:{type:String,attribute:"product-id"},subsidiary:{type:Object,attribute:"subsidiary"},_accountsResponse:{type:Array},_billResponse:{type:Object},_billResponsePayment:{type:Object},_cardsResponse:{type:Array},_flagService:{type:Boolean},_modalVisible:{type:Boolean},_paymentSelected:{type:Object},_productSelected:{type:Object},_retryService:{type:String},_showMultistep:{type:Boolean},_showSuccessfulPayment:{type:Boolean},_showOnBoarding:{type:Boolean}}}constructor(){super(),this.accountsApiVersion="1",this.billId="",this.cardsApiVersion="1",this.customersApiVersion="",this.config={loader:!0},this.documentsApiVersion="0",this.documentTemplate="",this.insuranceDataDetail=[],this.headerType="modal-initial-secondary",this.localCustomProperties={},this.userEmail="",this.insurancesContractsApiVersion="1",this.iOSFixedHeader=!1,this.maxRe=3,this.productId="DX",this.subsidiary={},this._accountsResponse=[],this._billResponse={},this._billResponsePayment={},this.customerId="",this._cardsResponse=[],this._modalVisible=!1,this._paymentSelected={},this._productSelected={},this._retryService="",this._showMultistep=!1,this._showSuccessfulPayment=!1,this._showOnBoarding=!0,this._typeModal="",this._flagService=!0}static get styles(){return[zt,r("insurance-transaction-servicing-insurance-delayed-payment-shared-styles")]}async dashboardAccounts(e){await this.updateComplete,this._accountsResponse=e[0].products.map((e=>({id:e.id,name:e.name,amount:e.primaryAmount.amount,currency:e.primaryAmount.currency,number:ft.maskNumber(e.number)})))}async dashboardCards(e){await this.updateComplete;const{products:t}=e[0],i=t.filter((e=>"CREDIT_CARD"===e.subProductType)).filter((e=>"operative"===e.status));this._cardsResponse=i.map((e=>{var t,i;return{id:e.id,name:e.name,amount:null===(t=e.primaryAmount)||void 0===t?void 0:t.amount,currency:null===(i=e.primaryAmount)||void 0===i?void 0:i.currency,number:ft.maskNumber(e.description.value),image:e.imgSrc}}))}async updatedFlag(){await this.updateComplete,this._flagService=!0}firstUpdated(){this._insuranceDM=this.shadowRoot.getElementById("insuranceDM"),this._insuranceMultistep=this.shadowRoot.getElementById("insuranceMultistep")}closeOtp(){this._showMultistep=!0,this.clearLoader()}exitProcess(){this._insuranceMultistep.reset(),this._insuranceDM.reset(),this._reset(),this.dispatchEvent(new CustomEvent("insurance-transaction-servicing-insurance-delayed-payment-exit-feature",{bubbles:!0,composed:!0}))}showMultiStep(){this._showMultistep=!0,this._showOnBoarding=!1}_reset(){this.billId="",this.insuranceDataDetail=[],this.userEmail="",this.customerId="",this.maxRe=3,this.headerType="modal-initial-secondary",this._accountsResponse=[],this._billResponse={},this._billResponsePayment={},this._cardsResponse=[],this._flagService=!0,this._paymentSelected={},this._productSelected={},this._showMultistep=!1,this._showSuccessfulPayment=!1,this._showOnBoarding=!0,this._typeModal="",this._modalVisible=!1}get _renderDM(){return o`
      <insurance-transaction-servicing-insurance-delayed-payment-dm
        id="insuranceDM"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        account-api-version="${this.accountsApiVersion}"
        documents-api-version="${this.documentsApiVersion}"
        card-api-version="${this.cardsApiVersion}"
        customers-api-version="${this.customersApiVersion}"
        bill-id="${this.billId}"
        customer-id="${this.customerId}"
        user-email="${this.userEmail}"
        .productSelected="${this._productSelected}"
        .localCustomProperties="${this.localCustomProperties}"
        .paymentSelected="${this._paymentSelected}"
        insurace-contracts-api-version="${this.insurancesContractsApiVersion}"
        .cardsResponse="${this._cardsResponse}"
        .accountsResponse="${this._accountsResponse}"
        document-template="${this.documentTemplate}"
        max-retries="${this.maxRe}"
        product-id="${this.productId}"
        @document-file-api-dm-fetch="${()=>{this.updatedFlag()}}"
        @insurance-transaction-servicing-insurance-delayed-payment-dm-bill-response=${({detail:e})=>{this._billResponse=e}}
        @insurance-transaction-servicing-insurance-delayed-payment-dm-bill-response-payment=${({detail:e})=>{this._billResponsePayment=e,this.clearLoader(),this._showSuccessfulPayment=!0}}
        @insurance-transaction-servicing-insurance-delayed-payment-dm-customer-accounts=${({detail:e})=>{this._accountsResponse=e,this.clearLoader(),this.showMultiStep()}}
        @insurance-transaction-servicing-insurance-delayed-payment-dm-customer-cards=${({detail:e})=>{this._cardsResponse=e,this.clearLoader(),this.showMultiStep()}}
        @insurance-transaction-servicing-insurance-delayed-payment-dm-user-email=${({detail:e})=>{this.userEmail=e}}
        @insurance-transaction-servicing-insurance-delayed-payment-dm-bill-response-expired-time=${()=>{this.genericConfigsEvent(!0,!1,Bt.MODES.offerExpired)}}
        @insurance-transaction-servicing-insurance-delayed-payment-dm-bill-response-payment-another-operation=${()=>{this.genericConfigsEvent(!0,!1,Bt.MODES.paidPolicy)}}
        @insurance-transaction-servicing-insurance-delayed-payment-dm-bill-response-functional-error=${()=>{this.clearLoader(),this.genericConfigsEvent(!0,!1,Bt.MODES.errorReviewingSummary)}}
        @insurance-transaction-servicing-insurance-delayed-payment-dm-error-retry="${({detail:e})=>{this.clearLoader(),this.genericConfigsEvent(!0,!1,Bt.MODES.errorServicesFail),this._retryService=e}}"
        @insurance-transaction-servicing-insurance-delayed-payment-dm-error-exit="${({detail:e})=>{this.clearLoader(),this.genericConfigsEvent(!0,!1,Bt.MODES.errorServices),this._retryService=e}}"
      >
      </insurance-transaction-servicing-insurance-delayed-payment-dm>
    `}genericConfigsEvent(e,t,i){this._modalVisible=e,this._showOnBoarding=t,this._typeModal=i}get _renderInsuranceMultiStep(){return o`
      <insurances-payments-multistep
        id="insuranceMultistep"
        .accountsResponse="${this._accountsResponse}"
        .cardsResponse="${this._cardsResponse}"
        .billResponse="${this._billResponse}"
        header-type="${this.headerType}"
        @insurance-transaction-servicing-insurance-delayed-payment-payment-multistep-bill-pay=${()=>{this._showMultistep=!1,this.showLoader(),this._insuranceDM.insurancePayment()}}
        .showMultistep="${this._showMultistep}"
        .insuranceDataDetail="${this.insuranceDataDetail}"
        @insurance-transaction-servicing-insurance-delayed-payment-custom-modal-footer-button-click="${e=>{var t;null!==(t=e.detail)&&void 0!==t&&t.fromExitModal&&this.exitProcess()}}"
        @insurance-transaction-servicing-insurance-delayed-payment-product-select="${e=>{this._productSelected=e.detail}}"
        @insurance-transaction-servicing-insurance-delayed-payment-method-payment-select="${e=>{this._paymentSelected=e.detail}}"
        @insurance-transaction-servicing-insurance-delayed-payment-conditions-document-show="${()=>{this._flagService&&(this._insuranceDM.getContract(),this._flagService=!1)}}"
      >
      </insurances-payments-multistep>
    `}get _renderOnBoarding(){return this._showOnBoarding?o`
          <insurance-payment-onboarding-page
            @insurance-transaction-servicing-insurance-delayed-payment-onboarding-page-send-data-visibility-change="${({detail:e})=>{e&&(this.showLoader(),this.insuranceDataDetail=e,this._insuranceDM.getAC(),this._showOnBoarding=!1)}}"
            ?visible="${this._showOnBoarding}"
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            .billResponse="${this._billResponse}"
            .subsidiary="${this.subsidiary}"
            @insurance-transaction-servicing-insurance-delayed-payment-onboarding-page-close-onboarding-modal="${()=>{this.exitProcess()}}"
          ></insurance-payment-onboarding-page>
        `:S}get _renderGenericModal(){return o`
      <insurance-transaction-servicing-insurance-delayed-payment-custom-modal
        @insurance-transaction-servicing-insurance-delayed-payment-custom-modal-exit="${()=>{this.exitProcess()}}"
        @insurance-transaction-servicing-insurance-delayed-payment-custom-modal-exit-scroll=${({detail:e})=>{e&&this.exitProcess()}}
        @insurance-transaction-servicing-insurance-delayed-payment-custom-modal-error-retry="${()=>{this._modalVisible=!1,"BILLPAYMENT"===this._retryService?(this.showLoader(),this._insuranceDM.insurancePayment()):(this.clearLoader(),this._insuranceDM.reTryBill())}}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible="${this._modalVisible}"
        .mode="${this._typeModal}"
        .subsidiary="${this.subsidiary}"
      ></insurance-transaction-servicing-insurance-delayed-payment-custom-modal>
    `}get _renderSuccessfulPage(){return o`
      <insurance-payment-successful-payment
        @help-modal-header-click="${()=>this.exitProcess()}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible=${this._showSuccessfulPayment}
        .billResponsePayment=${this._billResponsePayment}
        user-email="${this.userEmail}"
      ></insurance-payment-successful-payment>
    `}render(){return o`
      ${super.render()} ${this._renderDM} ${this._renderOnBoarding} ${this._renderGenericModal}
      ${this._renderInsuranceMultiStep} ${this._renderSuccessfulPage}
    `}}customElements.define(Ut.is,Ut);const{moment:Kt}=window,Xt=(e,t,i)=>{if(!e||!t)return i;return(Array.isArray(t)?t:t.split(".")).reduce(((e,t)=>e&&void 0!==e[t]?e[t]:i),e)},Jt="1 forma de pago",Wt="2 modalidad de pago",Yt="3 confirmacion",Qt="pago unico",Zt="domiciliar pagos";class ei extends(s(n(a))){static get is(){return"bbva-controller-insurance-delayed-payment"}static get scopedElements(){return{"bbva-dataprovider-business-documents":pe,"bbva-global-accounts-api-dm":me,"bbva-global-customer-contact-details-api-dm":ae}}static get properties(){return{accountsResponse:{type:Array},accountsApiVersion:{type:String,attribute:"account-api-version"},customersApiVersion:{type:String,attribute:"customer-api-version"},host:{type:String},requiredToken:{type:String},country:{type:String},paymentSelected:{type:Object},_billId:{type:Number,state:!0},_subsidiary:{type:Object,state:!0},_documentTemplateIds:{type:Object,state:!0},_fromPage:{type:String,state:!0},_businessDocumentsDP:{type:Object,state:!0},allStepsCompleted:{type:Boolean},product:{type:Object},folio:{type:Object},exitStep:{typeof:String},flags:{type:Object},billId:{type:String},formattedValues:{type:Object},userEmail:{type:String},userId:{type:String},userIdEncr:{type:String},userFlag:{type:Boolean},businessId:{type:Object}}}constructor(){super(),this.accountsApiVersion="1",this.customersApiVersion="1",this.notificationData={},this.host="",this.requiredToken="tsec",this.country="Mx",this._billId=0,this._subsidiary={},this._documentTemplateIds={},this._fromPage="",this._businessDocumentsDP={},this.paymentSelected={},this.allStepsCompleted=!1,this.product={},this.folio={},this.exitStep="",this.flags={},this.billId="",this.formattedValues={},this.userEmail="",this.userId="",this.userIdEncr="",this.userFlag=!1,this.accountsResponse=[],this.businessId={productId:"SEGUROS",subproductId:"CARGOS"}}firstUpdated(){this._businessDocumentsDP=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-business-documents"]'),this._accountsDM=this.shadowRoot.querySelector(`[data-tag-name="${me.is}"]`),this._customerContactDetailsDm=this.shadowRoot.getElementById("customerContactDetailsDm"),this.init()}updated(e){var t;!e.has("flags")||null!==(t=this.flags["glomo.insurances.insuranceDelayedPayment"])&&void 0!==t&&t.value||this._fireEvent("insurance-delayed-comming-soon")}analyticConfirm(e){const t={type:this.product&&this.product.endorsementFlag?Zt:Qt};e&&(this.exitStep="step-4",this._fireEvent("insurance-delayed-analytic-confirm",t))}closeOtp(){this._fireEvent("cancel-otp-close-modal")}obtainRequesterFullName(e){const{grantingTicketUserId:t}=e||"";this.userId=t}obtainPaymentSelected(e){this._fireEvent("insurance-delayed-payment-controller-select-started"),this.paymentSelected=e,"CARD"!==this.paymentSelected.type?this._getStandingOrderTemplateDocumentId():this._getRecurringChargesTemplateDocumentId();const t="CARD"===this.paymentSelected.type?"mis tarjetas":"mis cuentas";this._fireEvent("insurance-delayed-payment-controller-subsidiary-item-select",{type:t})}fireOtp(){const e={type:Xt(this.product,"endorsementFlag")?Zt:Qt};this._fireEvent("analytics-fire-otp",e)}async init(){await this.updateComplete,this._requestDocumentTemplateId(),0===this.accountsResponse.length&&this._accountsDM.getAccounts(),""===this.userEmail&&this._customerContactDetailsDm.getCustomerContactDetails(this.userIdEncr)}fireBase64(e){const t={value:e.replaceAll(/(\r\n|\n|\r|\s)/gm,""),mimeType:"application/pdf",headers:{"Content-Type":"application/json"},title:"CARD"===this.paymentSelected.type?"Formato cargos recurrentes":"Formato domiciliación",headerColor:"FFFFFFFF",tintColor:"FF072146",canShare:!0,titleColor:"000000",blackStatusBar:!1};this._fireEvent("insurance-delayed-payment-controller-document-base64",t)}getCustomerId(e){this.userId=Xt(e,"customerIdGlobal"),this.userIdEncr=Xt(e,"customerId")}getSubsidiary(e){this._subsidiary=e.insuranceScheduleSubsidiary,Object.assign(this._subsidiary,{phoneNumber:e.contact.insuranceDelayedPhoneNumber}),this._fireEvent("insurance-delayed-payment-controller-subsidiary",this._subsidiary)}initFromPush(e){this._fireEvent("insurance-delayed-payment-close-notification-center",!1);const t=this._parseData(e);this.billId=Xt(t,"bill"),this._validateEmail(),this.billId&&(this._fireEvent("insurance-delayed-payment-controller-bill",this.billId),this._fireEvent("insurance-delayed-payment-controller-bill-user",this.userFlag?this.userIdEncr:this.userId.slice(-8)))}initFromNotificationCenter(e){this._fireEvent("insurance-delayed-payment-close-notification-center",!1),this.billId="",this._fromPage="notification-center";const t=Xt(e,"notification.content");e=JSON.parse(t);const i=this._parseData(e);this.billId=Xt(i,"bill"),this._validateEmail(),this.billId&&(this._fireEvent("insurance-delayed-payment-controller-bill",this.billId),this._fireEvent("insurance-delayed-payment-controller-bill-user",this.userFlag?this.userIdEncr:this.userId.slice(-8)))}navigate(e){e&&this._fireEvent("navigation-dashboard")}validateEndProcess(e){this.folio=e,this._fireEvent("insurance-delayed-payment-share-recipt",this.folio),this.accountsResponse=[];const t={type:this.product&&this.product.endorsementFlag?Zt:Qt,operationNumber:this.folio.folio,otype:this.folio.productType};this._fireEvent("insurance-delayed-analytic-finish-process",t)}whereStep(e){this.exitStep=Xt(e,"id"),null!==e&&"step-4"===e.id&&this._fireEvent("insurance-delayed-analytic-terms-and-conditions")}exitProcessAnalytics(){""===this.exitStep&&(this.exitStep="step-2");const e={"step-2":Jt,"step-3":Wt,"step-4":Yt},t={exitPart:this.allStepsCompleted?"completed":e[this.exitStep]};this._fireEvent("insurance-delayed-payment-analytics-exit-proccess",null==t?void 0:t.exitPart)}_validateEmail(){""===this.userEmail?this._customerContactDetailsDm.getCustomerContactDetails(this.userIdEncr):this._fireEvent("insurance-delayed-payment-controller-bill-user-email",this.userEmail)}exitProcess(e){const t={"step-2":Jt,"step-3":Wt,"step-4":Yt},i={exitPart:this.allStepsCompleted?"completed":t[this.exitStep]};e?this._fireEvent("insurance-delayed-payment-analytics-exit-button",null==i?void 0:i.exitPart):this._fireEvent("insurance-delayed-payment-analytics-exit-coninue",null==i?void 0:i.exitPart)}_parseData(e){const t={},i=this._parseBill(e);return t.bill=i,t}_parseBill(e){return Xt(e,"extra")?Xt(e,"variables_receipt"):Xt(e,"sRECIBO")}_parseDocumentTemplate(e){const t={DOMICILIACION:"","FORMATO PARA CONTRATAR CARGOS RECURRENTES":""},i=Object.keys(t);return null==e||e.forEach((e=>{i.includes(e.documentTemplate.id.trim())&&(t[e.documentTemplate.id.trim()]=e.id)})),t}_getDocumentTemplates(e){const t=this._parseDocumentTemplate(e.detail);Object.keys(t).reduce(((e,i)=>e&&this._isValidString(t[i])),!0)?this._documentTemplateIds=t:this._fireEvent("insurance-delayed-payment-controller-document-template-ids-parse-error")}_filterAccounts(e){e.stopPropagation();const t=Xt(e,"detail");if(!Object.keys(t).length)return;const i=t.filter((e=>"ACTIVATED"===e.status.id));this.accountsResponse=i.map((e=>({id:e.accountId,name:e.alias,primaryAmount:{amount:Xt(e,"availableBalance.currentBalances.0.amount"),currency:Xt(e,"availableBalance.currentBalances.0.currency")},number:e.number}))),this._fireEvent("insurance-delayed-payment-controller-bill-user-accounts",[{products:this.accountsResponse}])}async dashboardAccounts(e){this.accountsResponse=e,this._fireEvent("insurance-delayed-payment-controller-bill-user-accounts",e)}_getStandingOrderTemplateDocumentId(){this._fireEvent("insurance-delayed-payment-controller-document-template-id",this._documentTemplateIds.DOMICILIACION)}_getRecurringChargesTemplateDocumentId(){this._fireEvent("insurance-delayed-payment-controller-document-template-id",this._documentTemplateIds["FORMATO PARA CONTRATAR CARGOS RECURRENTES"])}_isValidString(e){return e&&e.length>0}_documentTemplateIdGetError(e){this._fireEvent("insurance-delayed-payment-controller-document-template-id-request-error",e)}_requestDocumentTemplateId(){this._businessDocumentsDP.getBusinessDocuments()}dataProcessingSuccessResponse(e){this.formattedValues=(e=>{const t=e&&e.operationDate||"",i=Kt(t).format("DD MMM YYYY"),s=Kt(t,"DD MMM YYYY hh:mm A").format("HH:mm");return{templateSelected:"insuranceDelayedPayment",title:"cells-share-operative-receipt-insurance-delayed-payment",localAmount:{amount:e&&e.amount,currency:e&&e.currency},origin:[{key:"cells-share-operative-receipt-life-insurance-way-to-pay",value:e&&"CARD"===e.productPaymenth?`Tarjeta ${e.id}`:`Cuenta ${e.id}`,class:"bold spacing md ellipsis grid"}],insuranceInfo:[{key:"cells-share-operative-receipt-insurance-delayed-payment-insurance-subtitle",value:e&&e.productName},{key:"cells-share-operative-receipt-emergency-policy",value:e&&e.policeNumber},{key:"cells-share-operative-receipt-insurance-delayed-payment-start-validity",value:e&&e.startDate},{key:"cells-share-operative-receipt-device-frequency-of-payment",value:e&&e.period}],generalInformation:[{key:"cells-share-operative-receipt-cancel-insurance-operation-type",value:e&&e.productType},{key:"cells-share-operative-receipt-operation-number",value:e&&e.folio},{key:"cells-share-operative-receipt-date",value:i},{key:"cells-share-operative-receipt-cardless-expiration-hour",value:`${s} h`},{"font-size":"var(--cells-text-size-12, 12px)",height:1,key:"BBVA México, S.A., Institución de Banca Múltiple, Grupo Financiero BBVA México. Avenida Paseo de la Reforma 510, colonia Juárez, código postal 06600, alcaldía Cuahutémoc, Ciudad de México.",value:" ",id:"receipt-footer"}]}})(e)}shareTrigger(){this._fireEvent("bbva-controller-insurance-delayed-payment-operative-receipt-set",{operative:"insuranceDelayedPayment"}),this._fireEvent("bbva-controller-insurance-delayed-payment-share-receipt",{result:this.formattedValues})}_fireEvent(e,t=void 0){this.dispatchEvent(new CustomEvent(e,{detail:t,composed:!0,bubbles:!0}))}render(){return o`
      <bbva-dataprovider-business-documents
        .host="${this.host}"
        api-version="0"
        .productId="${this.businessId.productId}"
        .subproductId="${this.businessId.subproductId}"
        required-token="${this.requiredToken}"
        @get-business-documents-v0-success="${this._getDocumentTemplates}"
        @get-business-documents-v0-error="${this._documentTemplateIdGetError}"
      ></bbva-dataprovider-business-documents>
      <bbva-global-accounts-api-dm
        id="accountsDM"
        .host="${this.host}"
        .version="${this.accountsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @accounts-api-dm-fetch="${this._filterAccounts}"
      ></bbva-global-accounts-api-dm>
      <bbva-global-customer-contact-details-api-dm
        id="customerContactDetailsDm"
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @customer-contact-details-api-dm-fetch="${e=>{e.stopPropagation();const t=e.detail.find((({contact:e})=>"EMAIL"===e.contactDetailType));this.userEmail=t.contact.address,this._fireEvent("insurance-delayed-payment-controller-bill-user-email",this.userEmail)}}"
      >
      </bbva-global-customer-contact-details-api-dm>
    `}}customElements.define(ei.is,ei);var ti=Object.freeze({__proto__:null});export{ht as B,xe as a,ke as b,ti as i};
