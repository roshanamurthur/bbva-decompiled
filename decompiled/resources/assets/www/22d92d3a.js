import{J as e,L as t,a7 as s,aZ as i,H as a,z as r,aX as n,an as o,ci as c,ck as h,ak as l,aD as d,h as u,d9 as m,dZ as p,cW as g,cV as _,f2 as v,cn as b,bW as y,eU as f,fa as S,aV as C,aN as E,cU as w,dI as R}from"./952f98a9.js";import{R as T,S as x,L as $,M as A,h as M,an as I,K as D,G as O,a6 as P,I as q,x as N,P as k,f as H,Q as j,e as F,ao as B,N as V,D as L,a5 as G,E as U,T as z,O as K,V as X,ah as J,F as W,H as Y,z as Q,A as Z,a4 as ee,Z as te,Y as se,a3 as ie,at as ae,ap as re,as as ne}from"./216055dc.js";import{ct as oe,cu as ce,cv as he,cw as le,cx as de,cy as ue,cz as me,cA as pe,by as ge,bP as _e,bQ as ve,aH as be,aI as ye}from"./7f3d7ca9.js";import"./28fb68d0.js";import{B as fe}from"./1d68fca4.js";import{B as Se}from"./7d773f57.js";import{B as Ce,a as Ee,b as we}from"./d2484b66.js";import{a as Re}from"./4656db6d.js";import{B as Te,b as xe}from"./2fc6c95e.js";import{a as $e,c as Ae,b as Me,d as Ie}from"./c56961f6.js";import{c as De,g as Oe,i as Pe,B as qe,b as Ne,f as ke,j as He,k as je}from"./30ef6f1f.js";import{H as Fe}from"./e7d77b44.js";import"./056d7ed1.js";import"./010d8aa7.js";import"./2dde318b.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./1a79f9f5.js";import"./854beed0.js";import"./84dff06e.js";import"./dd13577a.js";class Be extends oe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`conversations/v${this.version}/conversations/{conversation-id}/delete-conversation`)}toString(){return super.toString("BGADPConversationsConversationDeleteConversationPostV0")}}class Ve extends oe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`conversations/v${this.version}/conversations/{conversation-id}/messages/{message-id}/download-file-attachment-message`)}toString(){return super.toString("BGADPConversationsConversationMessagesMessageDownloadFileAttachmentMessagePostV0")}}class Le extends oe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`conversations/v${this.version}/upload-file-attachments`)}toString(){return super.toString("BGADPConversationsUploadFileAttachmentsPostV0")}}class Ge extends ce{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`conversations/v${this.version}/user-conversations/customer/customer-service-data`)}toString(){return super.toString("BGADPUserConversationsCustomerCustomerServiceDataGetV0")}}class Ue extends ce{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`conversations/v${this.version}/user-conversations/customer/setting-accesses`)}toString(){return super.toString("BGADPUserConversationsCustomerSettingAccessesGetV0")}}class ze extends(e(t)){}class Ke extends ze{static get is(){return"bbva-global-conversations-api-dm"}static get properties(){return{conversations:{type:Array,attribute:!1}}}constructor(){super(),this.conversations=[]}resetConversations(){this.conversations=[]}getConversations(e={}){if(Object.keys(this.conversations).length)return;this._generateGetService(this._getService("get",{},e),{customEvent:"conversations-api-dm-fetch",paginationEvent:"conversations-api-dm-pagination",errorFireEventHandler:"conversations-api-dm-fetch-error"},this._responseMapping,e.fields,this._paginationMapping)}postConversations(e){this._generateGetService(this._getService("post",e),{customEvent:"conversations-api-dm-create",errorFireEventHandler:"conversations-api-dm-create-error"},this._responseMapping),this.resetConversations()}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}Conversations`,this._getBgadp(i))}_getBgadp(e){return{getConversationsV0:()=>new he(e),postConversationsV0:()=>new le(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}_paginationMapping(e){return e}}class Xe extends ze{static get is(){return"bbva-global-conversation-delete-conversation-api-dm"}constructor(){super()}postConversationDeleteConversation(e,t){const s={"conversation-id":e};this._generateGetService(this._getService("post",t,s),{customEvent:"conversation-delete-conversation-api-dm-create",errorFireEventHandler:"conversation-delete-conversation-api-dm-create-error"})}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}ConversationDeleteConversation`,this._getBgadp(i))}_getBgadp(e){return{postConversationDeleteConversationV0:()=>new Be(e),default:()=>"BGADP called not exist"}}}class Je extends ze{static get is(){return"bbva-global-conversation-messages-api-dm"}static get properties(){return{conversationMessages:{type:Array,attribute:!1}}}constructor(){super(),this.conversationMessages=[]}resetConversationMessages(){this.conversationMessages=[]}getConversationMessages(e,t={}){if(Object.keys(this.conversationMessages).length)return;t=Object.assign({"conversation-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"conversation-messages-api-dm-fetch",paginationEvent:"conversation-messages-api-dm-pagination",errorFireEventHandler:"conversation-messages-api-dm-fetch-error"},this._responseMapping,t.fields,this._paginationMapping)}postConversationMessages(e,t){const s={"conversation-id":e};this._generateGetService(this._getService("post",t,s),{customEvent:"conversation-messages-api-dm-create",errorFireEventHandler:"conversation-messages-api-dm-create-error"},this._responseMapping),this.resetConversationMessages()}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}ConversationMessages`,this._getBgadp(i))}_getBgadp(e){return{getConversationMessagesV0:()=>new de(e),postConversationMessagesV0:()=>new ue(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}_paginationMapping(e){return e}}class We extends ze{static get is(){return"bbva-global-conversation-message-api-dm"}constructor(){super()}patchConversationMessage(e,t,s){const i={"conversation-id":e,"message-id":t};this._generateGetService(this._getService("patch",s,i),{customEvent:"conversation-message-api-dm-update",errorFireEventHandler:"conversation-message-api-dm-update-error"})}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}ConversationMessage`,this._getBgadp(i))}_getBgadp(e){return{patchConversationMessageV0:()=>new me(e),default:()=>"BGADP called not exist"}}}class Ye extends ze{static get is(){return"bbva-global-conversation-message-delete-message-api-dm"}constructor(){super()}postConversationMessageDeleteMessage(e,t,s){const i={"conversation-id":e,"message-id":t};this._generateGetService(this._getService("post",s,i),{customEvent:"conversation-message-delete-message-api-dm-create",errorFireEventHandler:"conversation-message-delete-message-api-dm-create-error"})}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}ConversationMessageDeleteMessage`,this._getBgadp(i))}_getBgadp(e){return{postConversationMessageDeleteMessageV0:()=>new pe(e),default:()=>"BGADP called not exist"}}}class Qe extends ze{static get is(){return"bbva-global-conversation-message-download-file-attachment-message-api-dm"}static get properties(){return{conversationMessageDownloadFileAttachmentMessage:{type:Object,attribute:!1}}}constructor(){super(),this.conversationMessageDownloadFileAttachmentMessage={}}resetConversationMessageDownloadFileAttachmentMessage(){this.conversationMessageDownloadFileAttachmentMessage={}}postConversationMessageDownloadFileAttachmentMessage(e,t,s){if(Object.keys(this.conversationMessageDownloadFileAttachmentMessage).length)return;const i={"conversation-id":e,"message-id":t};this._generateGetService(this._getService("post",s,i),{customEvent:"conversation-message-download-file-attachment-message-api-dm-fetch",errorFireEventHandler:"conversation-message-download-file-attachment-message-api-dm-fetch-error"},this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}ConversationMessageDownloadFileAttachmentMessage`,this._getBgadp(i))}_getBgadp(e){return{postConversationMessageDownloadFileAttachmentMessageV0:()=>new Ve(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class Ze extends ze{static get is(){return"bbva-global-conversations-upload-file-attachments-base-api-dm"}postUploadFileAttachments(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}UploadFileAttachments`,this._getBgadp(i))}_getBgadp(e){return{postUploadFileAttachmentsV0:()=>new Le(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(Ze,"POST_EVENTS",{customEvent:"upload-file-attachments-api-dm-create",errorFireEventHandler:"upload-file-attachments-api-dm-create-error"}),customElements.define(Ze.is,Ze);class et extends ze{static get is(){return"bbva-global-conversations-user-conversations-customer-customer-service-data-base-api-dm"}getUserConversationsCustomerCustomerServiceData(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}UserConversationsCustomerCustomerServiceData`,this._getBgadp(i))}_getBgadp(e){return{getUserConversationsCustomerCustomerServiceDataV0:()=>new Ge(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(et,"GET_EVENTS",{customEvent:"user-conversations-customer-customer-service-data-api-dm-fetch",errorFireEventHandler:"user-conversations-customer-customer-service-data-api-dm-fetch-error"}),customElements.define(et.is,et);class tt extends ze{static get is(){return"bbva-global-conversations-user-conversations-customer-setting-accesses-base-api-dm"}getUserConversationsCustomerSettingAccesses(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}UserConversationsCustomerSettingAccesses`,this._getBgadp(i))}_getBgadp(e){return{getUserConversationsCustomerSettingAccessesV0:()=>new Ue(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(tt,"GET_EVENTS",{customEvent:"user-conversations-customer-setting-accesses-api-dm-fetch",errorFireEventHandler:"user-conversations-customer-setting-accesses-api-dm-fetch-error"}),customElements.define(tt.is,tt);let st=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let s=Object(this),i=s.length>>>0;if(0===i)return!1;let a=0|t,r=Math.max(a>=0?a:i-Math.abs(a),0);for(;r<i;){if((n=s[r])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;r++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var s=[],i=0,a="",r=0,n=arguments.length;r!==n;++r){var o=+arguments[r];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=s.push(o):(o-=65536,i=s.push(55296+(o>>10),o%1024+56320)),i>=16383&&(a+=e.apply(null,s),s.length=0)}return a+e.apply(null,s)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",s=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${s&&s.message}`)}},it=class extends st{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}};const at=0,rt=1,nt="jwt",ot="tsec",ct="none";let ht=class extends st{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=at,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new it,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=ot:this.requiredToken=ct,this.requiresJWT=!1):this.requiredToken===ot?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===nt?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===ct?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(ot)}_setJwtHandler(){this._setTokenHandler(nt)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((s,i)=>{t=Object.assign(t,{resolve:s,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let s=this._getRequestHeaders();Object.keys(s).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,s[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=i),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let s=e.replace(/[\{\}]+/g,""),i=t[s];return i?delete t[s]:this._error(9,`Missing ${s} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let s=Object.keys(t);s.length&&(e=[e,s.map((e=>{let s=t[e];return Array.isArray(s)&&this.paramArrayMode===rt?this._arrayToQueryParam(e,s):`${e}=${s}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(ot,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(nt,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(s){var i=t.getItem(s);i&&"null"!==i&&(e[s]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const s=window.sessionStorage;t=Object.keys(s).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=s.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const s=`${e}Handler`,i=e===nt?"JWT ":"",a=e===nt?"Authorization":ot;if(void 0===this[s]||null===this[s])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[s].getItem(r);n?t[a]=t[a]||i+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((s=>{t.push(`${s}=${e[s]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let s;const i=new Promise(((e,t)=>{s=(s,i)=>{s?t(s):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?s(i.error):s(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let s=0;for(;s<e.length;){let i=e[s],a=0,r=0;if(i<=127?(a=0,r=255&i):i<=223?(a=1,r=31&i):i<=239?(a=2,r=15&i):i<=244&&(a=3,r=7&i),e.length-s-a>0){let t=0;for(;t<a;)i=e[s+t+1],r=r<<6|63&i,t+=1}else r=65533,a=e.length-s;t+=String.fromCodePoint(r),s+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},s=e.trim().split(/[\r\n]+/);for(const e in s)if(s.hasOwnProperty(e)&&""!==s[e]){let i=": ",a=s[e].split(i);t[a.shift().toLowerCase()]=a.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,s,i){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(a=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[i])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):s;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(s,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const s=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(s)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,s,i,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),s=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,s=n.authenticationdata||null,i=n.authenticationstate,a=n.authenticationchallenge,r=n.authenticationresponse}return{type:t,data:s,state:i,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",s=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,s);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",s="",i=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,s);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",i)):(a=`${s}=${e}`,this._buildSignatureHeaders(a,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let s,i=e.split(",");if(i.length>1){s=i.map((e=>`${e}=${t[e]}`)).join(",")}else s=`${e}=${t}`;return s}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",s=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),s&&(this.headers=Object.assign(this.headers,{AuthenticationState:s})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:n,state:o,challenge:c,response:h}=this._extractSignatureResponseHeaders(e),l=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(l),s=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,l,r,n,o,c,h),s=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(l,r,n,o,c,h),s=!0}return s}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),s=!0)}return s}_notifySignatureRequiredFirstStep(e,t,s,i){this._defineSignatureType(t,s),this._defineSignatureValue(t,s,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:s,metadata:e}}))}_notifySignatureRequired(e,t,s,i,a,r){this._defineSignatureValue(t,s,i);const n={type:t,data:s,challenge:a,metadata:e};r&&(n.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:s}=e;return{path:this._path,method:this.method,url:t,status:s}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",s=""){const i=t.split(";").findIndex((t=>t===e));return s?s.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,s,i,a,r){i?this._notifySignatureRequired(e,t,s,i,a,r):this._notifySignatureRequiredFirstStep(e,t,s,i)}_notifySignatureTypeUsingErrorCode(e,t,s,i,a,r,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,s,i,a):this._notifySignatureRequired(t,s,i,a,r,n)}},lt=class extends ht{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}};class dt extends lt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`business-cryptography/v${this.version}/crypto-documents`)}toString(){return super.toString("BGADPBusinessCryptographyCryptoDocumentsPostV0")}}class ut extends(e(t)){}class mt extends ut{static get is(){return"bbva-global-crypto-documents-api-dm"}constructor(){super()}postCryptoDocuments(e){this._generateGetService(this._getService("post",e),{customEvent:"crypto-documents-api-dm-create",errorFireEventHandler:"crypto-documents-api-dm-create-error"},this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CryptoDocuments`,this._getBgadp(i))}_getBgadp(e){return{postCryptoDocumentsV0:()=>new dt(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}let pt=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let s=Object(this),i=s.length>>>0;if(0===i)return!1;let a=0|t,r=Math.max(a>=0?a:i-Math.abs(a),0);for(;r<i;){if((n=s[r])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;r++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var s=[],i=0,a="",r=0,n=arguments.length;r!==n;++r){var o=+arguments[r];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=s.push(o):(o-=65536,i=s.push(55296+(o>>10),o%1024+56320)),i>=16383&&(a+=e.apply(null,s),s.length=0)}return a+e.apply(null,s)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",s=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${s&&s.message}`)}},gt=class extends pt{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}};const _t=0,vt=1,bt="jwt",yt="tsec",ft="none";let St=class extends pt{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=_t,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new gt,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=yt:this.requiredToken=ft,this.requiresJWT=!1):this.requiredToken===yt?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===bt?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===ft?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(yt)}_setJwtHandler(){this._setTokenHandler(bt)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((s,i)=>{t=Object.assign(t,{resolve:s,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let s=this._getRequestHeaders();Object.keys(s).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,s[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=i),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let s=e.replace(/[\{\}]+/g,""),i=t[s];return i?delete t[s]:this._error(9,`Missing ${s} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let s=Object.keys(t);s.length&&(e=[e,s.map((e=>{let s=t[e];return Array.isArray(s)&&this.paramArrayMode===vt?this._arrayToQueryParam(e,s):`${e}=${s}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(yt,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(bt,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(s){var i=t.getItem(s);i&&"null"!==i&&(e[s]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const s=window.sessionStorage;t=Object.keys(s).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=s.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const s=`${e}Handler`,i=e===bt?"JWT ":"",a=e===bt?"Authorization":yt;if(void 0===this[s]||null===this[s])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[s].getItem(r);n?t[a]=t[a]||i+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((s=>{t.push(`${s}=${e[s]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let s;const i=new Promise(((e,t)=>{s=(s,i)=>{s?t(s):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?s(i.error):s(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let s=0;for(;s<e.length;){let i=e[s],a=0,r=0;if(i<=127?(a=0,r=255&i):i<=223?(a=1,r=31&i):i<=239?(a=2,r=15&i):i<=244&&(a=3,r=7&i),e.length-s-a>0){let t=0;for(;t<a;)i=e[s+t+1],r=r<<6|63&i,t+=1}else r=65533,a=e.length-s;t+=String.fromCodePoint(r),s+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},s=e.trim().split(/[\r\n]+/);for(const e in s)if(s.hasOwnProperty(e)&&""!==s[e]){let i=": ",a=s[e].split(i);t[a.shift().toLowerCase()]=a.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,s,i){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(a=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[i])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):s;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(s,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const s=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(s)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,s,i,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),s=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,s=n.authenticationdata||null,i=n.authenticationstate,a=n.authenticationchallenge,r=n.authenticationresponse}return{type:t,data:s,state:i,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",s=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,s);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",s="",i=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,s);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",i)):(a=`${s}=${e}`,this._buildSignatureHeaders(a,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let s,i=e.split(",");if(i.length>1){s=i.map((e=>`${e}=${t[e]}`)).join(",")}else s=`${e}=${t}`;return s}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",s=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),s&&(this.headers=Object.assign(this.headers,{AuthenticationState:s})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:n,state:o,challenge:c,response:h}=this._extractSignatureResponseHeaders(e),l=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(l),s=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,l,r,n,o,c,h),s=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(l,r,n,o,c,h),s=!0}return s}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),s=!0)}return s}_notifySignatureRequiredFirstStep(e,t,s,i){this._defineSignatureType(t,s),this._defineSignatureValue(t,s,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:s,metadata:e}}))}_notifySignatureRequired(e,t,s,i,a,r){this._defineSignatureValue(t,s,i);const n={type:t,data:s,challenge:a,metadata:e};r&&(n.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:s}=e;return{path:this._path,method:this.method,url:t,status:s}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",s=""){const i=t.split(";").findIndex((t=>t===e));return s?s.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,s,i,a,r){i?this._notifySignatureRequired(e,t,s,i,a,r):this._notifySignatureRequiredFirstStep(e,t,s,i)}_notifySignatureTypeUsingErrorCode(e,t,s,i,a,r,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,s,i,a):this._notifySignatureRequired(t,s,i,a,r,n)}},Ct=class extends St{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}};class Et extends St{constructor(e=null){super(Object.assign(e||{},{method:"PATCH"}))}toString(e=""){return super.toString(e||"BGADPRequestPATCH")}}class wt extends Ct{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`business-agents/v${this.version}/business-agents/{business-agent-id}`)}toString(){return super.toString("BGADPBusinessAgentsBusinessAgentGetV1")}}class Rt extends Et{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`business-agents/v${this.version}/business-agents/{business-agent-id}`)}toString(){return super.toString("BGADPBusinessAgentsBusinessAgentPatchV1")}}class Tt extends(e(t)){}class xt extends Tt{static get is(){return"bbva-global-business-agent-api-dm"}static get properties(){return{businessAgent:{type:Object,attribute:!1}}}constructor(){super(),this.businessAgent={}}resetBusinessAgent(){this.businessAgent={}}getBusinessAgent(e,t={}){if(Object.keys(this.businessAgent).length)return;t=Object.assign({"business-agent-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"business-agent-api-dm-fetch",errorFireEventHandler:"business-agent-api-dm-fetch-error"},this._responseMapping,t.fields)}patchBusinessAgent(e,t){const s={"business-agent-id":e};this._generateGetService(this._getService("patch",t,s),{customEvent:"business-agent-api-dm-update",errorFireEventHandler:"business-agent-api-dm-update-error"},this._responseMapping),this.resetBusinessAgent()}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}BusinessAgent`,this._getBgadp(i))}_getBgadp(e){return{getBusinessAgentV1:()=>new wt(e),patchBusinessAgentV1:()=>new Rt(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class $t{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let s=Object(this),i=s.length>>>0;if(0===i)return!1;let a=0|t,r=Math.max(a>=0?a:i-Math.abs(a),0);for(;r<i;){if((n=s[r])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;r++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var s=[],i=0,a="",r=0,n=arguments.length;r!==n;++r){var o=+arguments[r];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=s.push(o):(o-=65536,i=s.push(55296+(o>>10),o%1024+56320)),i>=16383&&(a+=e.apply(null,s),s.length=0)}return a+e.apply(null,s)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",s=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${s&&s.message}`)}}class At extends $t{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const Mt=0,It=1,Dt="jwt",Ot="tsec",Pt="none";class qt extends $t{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Mt,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new At,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Ot:this.requiredToken=Pt,this.requiresJWT=!1):this.requiredToken===Ot?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Dt?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Pt?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Ot)}_setJwtHandler(){this._setTokenHandler(Dt)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((s,i)=>{t=Object.assign(t,{resolve:s,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let s=this._getRequestHeaders();Object.keys(s).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,s[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=i),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let s=e.replace(/[\{\}]+/g,""),i=t[s];return i?delete t[s]:this._error(9,`Missing ${s} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let s=Object.keys(t);s.length&&(e=[e,s.map((e=>{let s=t[e];return Array.isArray(s)&&this.paramArrayMode===It?this._arrayToQueryParam(e,s):`${e}=${s}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(Ot,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Dt,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(s){var i=t.getItem(s);i&&"null"!==i&&(e[s]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const s=window.sessionStorage;t=Object.keys(s).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=s.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const s=`${e}Handler`,i=e===Dt?"JWT ":"",a=e===Dt?"Authorization":Ot;if(void 0===this[s]||null===this[s])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[s].getItem(r);n?t[a]=t[a]||i+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((s=>{t.push(`${s}=${e[s]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let s;const i=new Promise(((e,t)=>{s=(s,i)=>{s?t(s):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?s(i.error):s(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let s=0;for(;s<e.length;){let i=e[s],a=0,r=0;if(i<=127?(a=0,r=255&i):i<=223?(a=1,r=31&i):i<=239?(a=2,r=15&i):i<=244&&(a=3,r=7&i),e.length-s-a>0){let t=0;for(;t<a;)i=e[s+t+1],r=r<<6|63&i,t+=1}else r=65533,a=e.length-s;t+=String.fromCodePoint(r),s+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},s=e.trim().split(/[\r\n]+/);for(const e in s)if(s.hasOwnProperty(e)&&""!==s[e]){let i=": ",a=s[e].split(i);t[a.shift().toLowerCase()]=a.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,s,i){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(a=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[i])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):s;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(s,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const s=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(s)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,s,i,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),s=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,s=n.authenticationdata||null,i=n.authenticationstate,a=n.authenticationchallenge,r=n.authenticationresponse}return{type:t,data:s,state:i,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",s=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,s);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",s="",i=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,s);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",i)):(a=`${s}=${e}`,this._buildSignatureHeaders(a,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let s,i=e.split(",");if(i.length>1){s=i.map((e=>`${e}=${t[e]}`)).join(",")}else s=`${e}=${t}`;return s}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",s=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),s&&(this.headers=Object.assign(this.headers,{AuthenticationState:s})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:n,state:o,challenge:c,response:h}=this._extractSignatureResponseHeaders(e),l=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(l),s=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,l,r,n,o,c,h),s=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(l,r,n,o,c,h),s=!0}return s}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),s=!0)}return s}_notifySignatureRequiredFirstStep(e,t,s,i){this._defineSignatureType(t,s),this._defineSignatureValue(t,s,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:s,metadata:e}}))}_notifySignatureRequired(e,t,s,i,a,r){this._defineSignatureValue(t,s,i);const n={type:t,data:s,challenge:a,metadata:e};r&&(n.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:s}=e;return{path:this._path,method:this.method,url:t,status:s}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",s=""){const i=t.split(";").findIndex((t=>t===e));return s?s.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,s,i,a,r){i?this._notifySignatureRequired(e,t,s,i,a,r):this._notifySignatureRequiredFirstStep(e,t,s,i)}_notifySignatureTypeUsingErrorCode(e,t,s,i,a,r,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,s,i,a):this._notifySignatureRequired(t,s,i,a,r,n)}}class Nt extends qt{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class kt extends qt{constructor(e=null){super(Object.assign(e||{},{method:"HEAD"}))}toString(e=""){return super.toString(e||"BGADPRequestHEAD")}}class Ht extends qt{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class jt extends Nt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersGetV0")}}class Ft extends Nt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/economic-data`)}toString(){return super.toString("BGADPCustomersCustomerEconomicDataGetV0")}}class Bt extends Nt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries`)}toString(){return super.toString("BGADPCustomersCivilRegistriesGetV1")}}class Vt extends Ht{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries/search`)}toString(){return super.toString("BGADPCustomersCivilRegistriesSearchPostV1")}}class Lt extends Nt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersGetV1")}}class Gt extends Ht{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersPostV1")}}class Ut extends kt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersHeadV1")}}class zt extends Nt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsGetV1")}}class Kt extends Ht{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsPostV1")}}class Xt extends Nt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/indicators`)}toString(){return super.toString("BGADPCustomersCustomerIndicatorsGetV1")}}class Jt extends Nt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsGetV1")}}class Wt extends Ht{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsPostV1")}}class Yt extends(e(t)){_mappingBank(e){this._renameProperty(e,"bank.bankId","id"),this._renameProperty(e,"bank.branch.branchId","id"),e.bank&&e.bank.branch&&e.bank.branch.costCenter&&(e.bank.branch.costCenter={id:e.bank.branch.costCenter})}_mappingGender(e){this._renameProperty(e,"gender.name","description")}_mappingIdentityDocuments(e){for(let t=0;t<e.identityDocuments.length;t++)this._renameProperty(e.identityDocuments[t],"documentType.name","description"),this._renameProperty(e.identityDocuments[t],"status.name","description")}_mappingMaritalStatus(e){this._renameProperty(e,"maritalStatus.name","description")}_mappingNationalities(e){for(let t=0;t<e.nationalities.length;t++)this._renameProperty(e.nationalities[t],"name","description")}_mappingPersonalTitle(e){this._renameProperty(e,"personalTitle.name","description")}_mappingResidence(e){this._renameProperty(e,"residence","taxResidence"),this._renameProperty(e,"taxResidence.residenceType.name","description")}_mappingVerification(e){this._renameProperty(e,"enrollmentModality","verification"),this._renameProperty(e,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(e){for(let t=0;t<e.segments.length;t++)this._renameProperty(e.segments[t],"name","description")}_changeNameToDescription(e){e.map((e=>{this._renameProperty(e,"name","description")}))}}class Qt extends Yt{static get is(){return"bbva-global-customers-api-dm"}static get properties(){return{customers:{type:Array,attribute:!1}}}constructor(){super(),this.customers=[]}resetCustomers(){this.customers=[]}getCustomers(e={}){if(Object.keys(this.customers).length)return;this._generateGetService(this._getService("get",{},e),{customEvent:"customers-api-dm-fetch",errorFireEventHandler:"customers-api-dm-fetch-error"},this._responseMapping,e.fields)}postCustomers(e){this._generateGetService(this._getService("post",e),{customEvent:"customers-api-dm-create",errorFireEventHandler:"customers-api-dm-create-error"},this._responseMapping),this.resetCustomers()}headCustomers(){this._generateGetService(this._getService("head",{},{}),{customEvent:"customers-api-dm-head-fetch",errorFireEventHandler:"customers-api-dm-head-fetch-error"},this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}Customers`,this._getBgadp(i))}_getBgadp(e){return{getCustomersV0:()=>new jt(e),getCustomersV1:()=>new Lt(e),postCustomersV1:()=>new Gt(e),headCustomersV1:()=>new Ut(e),getCustomersV3:()=>new Se(e),default:()=>"BGADP called not exist"}}_responseMapping(e){if("0"===this.version&&e.length){const t=["membershipDate","arrivalReference"];for(let s=0;s<e.length;s++)this._renameProperty(e[s],"customerId","id"),this._mappingBank(e[s]),this._mappingGender(e[s]),this._mappingIdentityDocuments(e[s]),this._mappingMaritalStatus(e[s]),e[s].nationalities&&this._mappingNationalities(e[s]),this._mappingPersonalTitle(e[s]),this._mappingResidence(e[s]),this._removeFields(t,e[s])}return e}}class Zt extends Yt{static get is(){return"bbva-global-customer-terms-base-api-dm"}resetCustomerTerms(){this.customerTerms=[]}getCustomerTerms(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}postCustomerTerms(e,t){this._requestMapping(t);const s={"customer-id":e};this._generateGetService(this._getService("post",t,s),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerTerms()}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerTerms`,this._getBgadp(i))}_getBgadp(e){return{getCustomerTermsV1:()=>new Jt(e),postCustomerTermsV1:()=>new Wt(e),default:()=>"BGADP does not exist."}}_requestMapping(e){return e}_responseMapping(e){return e}_paginationMapping(e){return e}}s(Zt,"GET_EVENTS",{customEvent:"customer-terms-api-dm-fetch",paginationEvent:"customer-terms-api-dm-pagination",errorFireEventHandler:"customer-terms-api-dm-fetch-error"}),s(Zt,"POST_EVENTS",{customEvent:"customer-terms-api-dm-create",errorFireEventHandler:"customer-terms-api-dm-create-error"}),customElements.define(Zt.is,Zt);class es extends Yt{static get is(){return"bbva-global-customer-lopd-documents-base-api-dm"}resetCustomerLopdDocuments(){this.customerLopdDocuments={}}getCustomerLopdDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerLopdDocuments`,this._getBgadp(i))}_getBgadp(e){return{getCustomerLopdDocumentsV3:()=>new ge(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(es,"GET_EVENTS",{customEvent:"customer-lopd-documents-api-dm-fetch",errorFireEventHandler:"customer-lopd-documents-api-dm-fetch-error"}),customElements.define(es.is,es);class ts extends Yt{static get is(){return"bbva-global-customer-economic-data-base-api-dm"}resetCustomerEconomicData(){this.customerEconomicData={}}getCustomerEconomicData(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerEconomicData`,this._getBgadp(i))}_getBgadp(e){return{getCustomerEconomicDataV0:()=>new Ft(e),getCustomerEconomicDataV2:()=>new Ce(e),getCustomerEconomicDataV3:()=>new Ee(e),default:()=>"BGADP does not exist."}}_incomesMapping(e){e.map((e=>{e.incomeValue={},e.incomeValue={valueType:"EXACT",amount:{amount:e.incomeValues[0].amount,currency:e.incomeValues[0].currency}},e.incomeValues[0].concept&&(e.incomeValue.concept=e.incomeValues[0].concept),e.incomeValues[0].frecuency&&(e.incomeValue.frequency=e.incomeValues[0].frecuency),"BIWEEKLY"==e.incomeValue.frequency&&(e.incomeValue.frequency="BI_WEEKLY"),this._removeFields(["incomeValues"],e),this._changeNameToDescription([e.incomeType])}))}_expensesMapping(e){e.map((e=>{e.expenseValue={currency:e.expenseValues[0].currency,amount:e.expenseValues[0].amount},e.expenseValues[0].frecuency&&(e.expenseValue.frequency=e.expenseValues[0].frecuency),e.expenseValue.frequency&&"BIWEEKLY"==e.expenseValue.frequency&&(e.expenseValue.frequency="BI_WEEKLY"),this._removeFields(["expenseValues"],e),this._changeNameToDescription([e.expenseType])}))}_workPlaceMapping(e){e.address&&(e.address.addressType&&"WORK"!==e.address.addressType.id&&this._removeFields(["id"],e.address.addressType),e.address.ownershipType&&(["MOVED","REJECTED","NOT_LOCATED"].includes(e.address.ownershipType.id)&&this._removeFields(["id"],e.address.ownershipType),this._changeNameToDescription([e.address.ownershipType,e.address.ownershipType.propertyType])),this._renameProperty(e.address.location,"addressName","formatedAddress"),this._removeFields(["residenceStartDate"],e.address),this._removeFields(["city","state","country","zipCode","geolocation","geographicGroups","meta"],e.address.location)),this._changeNameToDescription([e.address.addressType,e.economicActivity,e.profesionPosition]),this._renameProperty(e,"profesionPosition","professionPosition"),this._removeFields(["taxpayerIdentification"],e)}_assetsMapping(e){e.map((e=>{this._changeNameToDescription([e.assetType]),e.assetValues.map((e=>{this._removeFields(["concept"],e)}))}))}_liabilitiesMapping(e){e.map((e=>{this._changeNameToDescription([e.liabilityType]),e.liabilityValues.map((e=>{this._removeFields(["concept","frecuency"],e)}))}))}_responseMapping(e){return"0"==this.version&&Object.keys(e).length?(this._changeNameToDescription([e.economicActivity,e.occupationType,e.employmentSituation,e.education]),e.incomes&&this._incomesMapping(e.incomes),e.expenses&&this._expensesMapping(e.expenses),e.workPlace&&this._workPlaceMapping(e.workPlace),e.assets&&this._assetsMapping(e.assets),e.liabilities&&this._liabilitiesMapping(e.liabilities),e.balances&&e.balances.map((e=>{this._changeNameToDescription([e])})),this._renameProperty(e,"workPlace","workplace"),this._removeFields(["financialGroup","financialSubGroup","indicators","incomeSources"],e)):"2"==this.version&&Object.keys(e).length&&(e.workPlace&&e.workPlace.economicActivities&&(e.workPlace.economicActivity=e.workPlace.economicActivities[0],this._removeFields(["economicActivities"],e.workPlace)),e.balances&&e.balances.forEach((e=>{e.id=e.balanceType.id,e.description=e.balanceType.description,e.amount=e.balanceValue.amount,e.currency=e.balanceValue.currency,this._removeFields(["balanceType","balanceValue"],e)})),e.expenses&&e.expenses.forEach((e=>{["OTHER_LOAN","REVOLVING_CARD","FIXED_PAYMENT"].includes(e.expenseType.id)&&this._removeFields(["expenseType"],e)})),e.assets&&e.assets.forEach((e=>{["BANK_DEPOSIT"].includes(e.assetType.id)&&this._removeFields(["assetType"],e)})),e.liabilities&&e.liabilities.forEach((e=>{["MORTGAGE","PERSONAL_LOANS","OTHER_LOANS"].includes(e.liabilityType.id)&&this._removeFields(["liabilityType"],e)})),this._renameProperty(e,"workPlace","workplace"),this._removeFields(["financialSummaries"],e)),e}}s(ts,"GET_EVENTS",{customEvent:"customer-economic-data-api-dm-fetch",errorFireEventHandler:"customer-economic-data-api-dm-fetch-error"}),customElements.define(ts.is,ts);class ss extends Yt{static get is(){return"bbva-global-civil-registries-search-base-api-dm"}resetCivilRegistriesSearch(){this.civilRegistriesSearch=[]}postCivilRegistriesSearch(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CivilRegistriesSearch`,this._getBgadp(i))}_getBgadp(e){return{postCivilRegistriesSearchV1:()=>new Vt(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(ss,"POST_EVENTS",{customEvent:"civil-registries-search-api-dm-fetch",errorFireEventHandler:"civil-registries-search-api-dm-fetch-error"}),customElements.define(ss.is,ss);class is extends Yt{static get is(){return"bbva-global-civil-registries-base-api-dm"}resetCivilRegistries(){this.civilRegistries=[]}getCivilRegistries(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CivilRegistries`,this._getBgadp(i))}_getBgadp(e){return{getCivilRegistriesV1:()=>new Bt(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}s(is,"GET_EVENTS",{customEvent:"civil-registries-api-dm-fetch",paginationEvent:"civil-registries-api-dm-pagination",errorFireEventHandler:"civil-registries-api-dm-fetch-error"}),customElements.define(is.is,is);class as extends Yt{static get is(){return"bbva-global-customers-child-customers-base-api-dm"}postCustomersChildCustomers(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomersChildCustomers`,this._getBgadp(i))}_getBgadp(e){return{postCustomersChildCustomersV3:()=>new Re(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(as,"POST_EVENTS",{customEvent:"customers-child-customers-api-dm-create",errorFireEventHandler:"customers-child-customers-api-dm-create-error"}),customElements.define(as.is,as);class rs extends Yt{static get is(){return"bbva-global-customer-identification-process-documents-base-api-dm"}resetCustomerIdentificationProcessDocuments(){this.customerIdentificationProcessDocuments=[]}getCustomerIdentificationProcessDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}postCustomerIdentificationProcessDocuments(e,t){const s={"customer-id":e};this._generateGetService(this._getService("post",t,s),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerIdentificationProcessDocuments()}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerIdentificationProcessDocuments`,this._getBgadp(i))}_getBgadp(e){return{getCustomerIdentificationProcessDocumentsV1:()=>new zt(e),postCustomerIdentificationProcessDocumentsV1:()=>new Kt(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(rs,"GET_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-fetch",errorFireEventHandler:"customer-identification-process-documents-api-dm-fetch-error"}),s(rs,"POST_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-create",errorFireEventHandler:"customer-identification-process-documents-api-dm-create-error"}),customElements.define(rs.is,rs);class ns extends Yt{static get is(){return"bbva-global-customer-indicators-base-api-dm"}resetCustomerIndicators(){this.customerIndicators=[]}getCustomerIndicators(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerIndicators`,this._getBgadp(i))}_getBgadp(e){return{getCustomerIndicatorsV1:()=>new Xt(e),getCustomerIndicatorsV3:()=>new we(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return"1"==this.version&&Object.keys(e).length&&e.forEach((e=>{["BASIC_DATA","ENTREPRENEUR_AND_POTENTIAL","WEB_CONSUMPTION_ACCOUNT","USER_EXPIRED"].includes(e.id)&&this._removeFields(["id"],e),this._removeFields(["payrollAmounts","payrollAge"],e)})),e}}s(ns,"GET_EVENTS",{customEvent:"customer-indicators-api-dm-fetch",errorFireEventHandler:"customer-indicators-api-dm-fetch-error"}),customElements.define(ns.is,ns);const os=a((e=>class extends e{constructor(...e){super(...e),s(this,"removeEmojis",(e=>e?e.replace(/[\uD800-\uDBFF][\uDC00-\uDFFF]/g,""):""))}static get properties(){return{}}dispatchCustomEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}validateString(e,t){return e.length>t?`${e.substring(0,t)}...`:e}formatDate(e){return new Date(e).toLocaleDateString("en-US",{month:"long",day:"numeric",year:"numeric"})}formatSize(e){const t=1048576;if(e>=t){return`${(e/t).toFixed(2)}mb`}return`${(e/1024).toFixed(2)}kb`}parseMultipartMessage(e){const t=e.match(/--uuid:[^\n\r]+/)[0],s=e.split(t).filter((e=>""!==e.trim()));if(s.length<2)throw new Error("El mensaje multipart no contiene suficientes partes.");const i=s[0].split("\r\n\r\n")[1].trim(),a=s[1].split("<attachmentPart>")[1].trim().split("\r\n\r\n")[0],{document:{contentType:r,contentDisposition:n}}=JSON.parse(i);return{contentType:r,filename:n.match(/filename=([^;]+)/)[1],document:a}}getMimeType(e){return{jpg:"image/jpeg",jpeg:"image/jpeg",png:"image/png",gif:"image/gif",bmp:"image/bmp",webp:"image/webp",xls:"application/vnd.ms-excel",xlsx:"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",doc:"application/msword",docx:"application/vnd.openxmlformats-officedocument.wordprocessingml.document",ppt:"application/vnd.ms-powerpoint",pptx:"application/vnd.openxmlformats-officedocument.presentationml.presentation",odt:"application/vnd.oasis.opendocument.text",pdf:"application/pdf",xml:"application/xml",csv:"text/csv",txt:"text/plain",avi:"video/x-msvideo",mp4:"video/mp4","3gpp":"video/3gpp",mp3:"audio/mpeg",flac:"audio/flac"}[e.toLowerCase()]||"application/octet-stream"}base64ToBlob(e,t){if(!e||!t)throw new Error("Invalid Base64 string or MIME type");const s=e.replace(/\s/g,""),i=atob(s),a=[];for(let e=0;e<i.length;e+=1)a.push(i.charCodeAt(e));const r=new Uint8Array(a);return new Blob([r],{type:t})}getExtension(e){const t=e.match(/\.([a-z0-9]+)$/i);return t?t[1]:""}cleanFileName(e){return e.name.replace(/[^a-zA-Z0-9._-]/g,"")}truncateFileName(e,t=50){const s=e.name.lastIndexOf("."),i=-1!==s?e.name.slice(s):"",a=-1!==s?e.name.slice(0,s):e.name,r=t-i.length;return`${a.slice(0,r)}${i}`}sleep(e){return new Promise((t=>setTimeout(t,e)))}}));var cs=r`
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

[data-tag-name=help-faqs-aem] {
  height: auto;
}

[data-tag-name=bbva-list-swipe] {
  z-index: 0;
}

[data-tag-name=bbva-button-row] {
  padding: 1rem 0.5rem;
  align-items: flex-start;
  display: inline-flex;
  background-color: var(--_user-info-my-conversations-list--bg-color);
}

.no-conversations {
  padding: 1rem;
}

.conversation {
  all: unset;
  cursor: pointer;
  width: 100%;
  box-sizing: border-box;
  display: block;
  padding: 1rem;
  background-color: var(--_user-info-my-conversation-bg-color);
}

.conversation:focus,
.conversation:hover {
  background-color: var(--_user-info-my-conversation-bg-color-pressed);
  color: var(--color-text-hover);
}

.conversation:active {
  background-color: var(--_user-info-my-conversation-bg-color-pressed);
}

.attached {
  margin-left: auto;
}

.read {
  border-left: 0.25rem solid transparent;
}

.highlighted {
  border-left: 0.25rem solid var(--_user-info-my-conversations-list--highlighted-border-color);
}

[data-tag-name=bbva-clip-microillustration] {
  padding-bottom: 1rem;
}

.icon-title {
  display: flex;
  align-items: center;
  gap: 0.5rem;
  flex: 1 0 0;
}

.subject {
  display: flex;
  align-items: center;
  margin-bottom: 0.375rem;
}

[data-tag-name=bbva-form-input] {
  margin-top: 0.5rem;
}

.form-button {
  width: -webkit-fill-available;
}

.expanded-modal {
  --bbva-help-modal-padding: 0;
}

.checkbox-container {
  display: flex;
  padding-top: 0.5rem;
}

.lateral-padding {
  padding: 0 1rem;
}

.notification-container {
  background-color: var(--_user-info-my-conversations-list--bg-color);
  padding: 1rem;
}

.list-error {
  padding: 1rem;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  min-height: 91vh;
}

.list-error-header {
  margin-bottom: 9.375rem;
}
`,hs=r`
:host {
  --_user-info-my-conversations-list--bg-color: ${T("colorPrimarySurfaceAmbientDefault",x)};
  --_user-info-my-conversations-list--highlighted-border-color: ${T("colorPrimarySurfaceContrastDefault",x)};
  --_user-info-my-conversation-bg-color: var(--user-info-my-conversation--_ambient--bg-color,${T("colorPrimarySurfaceAmbientDefault",x)});
  --_user-info-my-conversation-bg-color-pressed: var(--user-info-my-conversation--_ambient--bg-color-pressed,${T("colorPrimarySurfaceAmbientPressed",x)});
}
`;class ls extends(n(os($(A(o(t)))))){static get scopedElements(){const e=[M,I,D,O,P,q,N,k,Te,H,_e,j,F,...ls.configurationScopedElements()];return ls.scopedElementsFromClasses(e)}static get is(){return"user-info-my-conversations-list"}static get properties(){return{_noResultsPicture:{type:String},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},showSidebarIcon:{type:Boolean,attribute:"show-sidebar-icon"},conversations:{type:Array},errorListConversations:{type:Boolean,attribute:"error-list-conversations"},canNotRetryGetConversations:{type:Boolean,attribute:"can-not-retry-get-conversations"},_operativeActions:{type:Array},showHistory:{type:Boolean,attribute:"show-history"},resetSwipe:{type:Boolean,attribute:"reset-swipe"},_openedSwipeElement:{type:Object}}}constructor(){super(),this.showHelpFaqs=!1,this.showHistory=!1,this.showSidebarIcon=!1,this._noResultsPicture="empty_state_day",this._operativeActions=[{icon:c(),label:this.t("user-info-my-conversations-swipe-button-trash-label"),warning:!0}],this._dateOptions={day:"numeric",month:"numeric",year:"numeric"},this.conversations=[],this._buttons=[{id:"btn-menu",icon:h(),accessibilityText:this.t("user-info-my-conversations-faqs-accessibility-menu-button")}],this.errorListConversations=!1,this.canNotRetryGetConversations=!1,this.resetSwipe=!1,this._openedSwipeElement={}}updated(e){if(e.has("conversations")){this.shadowRoot.querySelectorAll('[data-tag-name="bbva-list-swipe"]').forEach((e=>{e.opening=""}))}e.has("resetSwipe")&&this.resetSwipe&&Object.keys(this._openedSwipeElement).length&&this._resetSwipe()}static get styles(){return[cs,hs,B.primary,V.primary,L.primary,G.primary,U.primary,z.primary,K.primary,xe.primary,X.primary,ve.primary,l("user-info-my-conversations-list")]}get _header(){return this._buttons=[],this.showHelpFaqs&&this._buttons.push({id:"btn-help",icon:d(),accessibilityText:this.t("user-info-my-conversations-faqs-accessibility-help-button"),eventIconName:"icon-help-click"}),this.showSidebarIcon&&this._buttons.push({id:"btn-menu",icon:h(),accessibilityText:this.t("user-info-my-conversations-faqs-accessibility-menu-button")}),u`
      <bbva-header-main
        variant="first-level-sequential"
        text="${this.t("user-info-my-conversations-header-text")}"
        accessibilityText="${this.t("user-info-my-conversations-header-text")}"
        left-icon-aria-label="${this.t("user-info-my-conversations-close")}"
        show-left-icon
        .buttons=${this._buttons}
        @header-main-icon-click="${this._clickHeaderIcon}"
        @icon-help-click="${this._openFaqs}"
        class="header-index"
      ></bbva-header-main>
    `}get _buttonRow(){return this.conversations.length>=7?this.options=[{icon:m(),label:this.t("user-info-my-conversations-button-row-add-label"),id:"new",accessibilityText:this.t("user-info-my-conversations-new-modal-header")},{icon:p(),label:this.t("user-info-my-conversations-button-row-search-label"),id:"search",accessibilityText:this.t("user-info-my-conversations-search-modal-header")}]:this.options=[{icon:m(),label:this.t("user-info-my-conversations-button-row-add-label"),id:"new",accessibilityText:this.t("user-info-my-conversations-new-modal-header")}],u`
      <bbva-button-row
        variant="simple"
        .options="${this.options}"
        ambient="primary"
      ></bbva-button-row>
    `}get historyMessage(){return u`
      <div class="notification-container">
        <bbva-notification-message
          message-title="${this.t("user-info-my-conversations-history-notification-title")}"
          message="${this.t("user-info-my-conversations-history-notification-message")}"
          link-title="${this.t("user-info-my-conversations-history-notification-link")}"
        >
        </bbva-notification-message>
      </div>
    `}get _mainTmpl(){return 0!==this.conversations.length?u`
        ${this._renderList(this.conversations)} ${this.showHistory?this.historyMessage:""}
      `:u`
      <div class="no-conversations">
        <bbva-clip-microillustration
          alt-microillustration="${this._noResultsPicture}"
          alt-image="${this.t("user-info-my-conversations-message-title-no-results")}"
          size="M"
          ambient="primary"
        ></bbva-clip-microillustration>
        <bbva-type-text
          text="${this.t("user-info-my-conversations-message-title-no-results")}"
          accessibilityText="${this.t("user-info-my-conversations-message-title-no-results")}"
          size="3XL"
          tag="h3"
          ambient="primary"
        ></bbva-type-text>
        <bbva-type-text
          text="${this.t("user-info-my-conversations-message-label-no-results")}"
          accessibilityText="${this.t("user-info-my-conversations-message-label-no-results")}"
          size="M"
          ambient="primary"
        ></bbva-type-text>
      </div>
    `}_renderList(e){return e.map(((t,s)=>{const i=`swipe-${t.id}`;return u`
        <bbva-list-swipe
          id="${i}"
          .operativeActions="${this._operativeActions}"
          @list-swipe-action-click="${()=>this._deleteConversation(t,i)}"
          @bbva-list-swipe-track-left="${this._openedSwipe}"
          ambient="primary"
        >
          <div slot="invoker" class="invoker">
            <button
              class="conversation ${t.read?"highlighted":"read"}"
              @click="${()=>this._onClickConversation(t)}"
            >
              <div class="subject">
                <div class="icon-title">
                  <bbva-type-icon
                    icon="${t.read?g():_()}"
                    size="24"
                    icon-color="${T("colorPrimaryTextIncome",x)}"
                    ambient="primary"
                  ></bbva-type-icon>
                  <bbva-type-text
                    text="${t.subject}"
                    text-color="${T("colorPrimaryTextIncome",x)}"
                    size="S"
                    font-weight="500"
                    tag="span"
                    ambient="primary"
                  ></bbva-type-text>
                </div>
                <bbva-type-date
                  date="${t.date}"
                  font-weight="500"
                  font-style="italic"
                  .options="${this._dateOptions}"
                  ambient="primary"
                ></bbva-type-date>
              </div>
              <bbva-type-text
                text="${t.message}"
                size="M"
                tag="span"
                ambient="primary"
              ></bbva-type-text>
              <bbva-type-icon
                class="attached"
                icon="${v()}"
                size="16"
                icon-color="${T("colorPrimaryIcon01",x)}"
                .hidden=${!t.attached}
                ambient="primary"
              ></bbva-type-icon>
              <bbva-badge-default
                text="${t.description?this.t(t.description):""}"
                type="${t.type?t.type:""}"
                ambient="primary"
              ></bbva-badge-default>
            </button>
            ${s<e.length-1?u`
                  <div class="lateral-padding">
                    <bbva-divider-default ambient="primary"></bbva-divider-default>
                  </div>
                `:""}
          </div>
        </bbva-list-swipe>
      `}))}get _listConversationsError(){return u` <div class="list-error">
      <div class="list-error-header">
        <bbva-clip-microillustration
          ambient="primary"
          alt-microillustration="error"
          size="M"
          alt-image="${this.t("user-info-my-conversations-conversations-error-title")}"
        ></bbva-clip-microillustration>
        <bbva-type-text
          unset
          ambient="primary"
          text="${this.t("user-info-my-conversations-conversations-error-title")}"
          size="2XL"
          font-weight="500"
        ></bbva-type-text>
        <bbva-type-text
          ambient="primary"
          text="
        ${this.canNotRetryGetConversations?this.t("user-info-my-conversations-conversations-error-description-no-retry"):this.t("user-info-my-conversations-conversations-error-description")}"
          size="S"
        ></bbva-type-text>
      </div>
      ${this.canNotRetryGetConversations?"":u`
            <bbva-button-default
              ambient="primary"
              class="form-button"
              type="submit"
              @click="${()=>this.dispatchCustomEvent("user-info-my-conversations-get-conversations-retry")}"
            >
              ${this.t("user-info-my-conversations-full-modal-error-button")}
            </bbva-button-default>
          `}
    </div>`}_onClickConversation(e){this.dispatchCustomEvent("user-info-my-conversations-conversation-selected-open",e)}render(){return this.errorListConversations?u` ${this._header} ${this._listConversationsError}`:u` ${this._header} ${this._buttonRow} ${this._mainTmpl}`}_deleteConversation(e){this.dispatchCustomEvent("user-info-my-conversations-delete-conversation-button-press",e),this._resetSwipe()}_openedSwipe({detail:e}){const t=Object.keys(this._openedSwipeElement).length>0,s=""!==this._openedSwipeElement.opening,i=this._openedSwipeElement!==e;t&&s&&i&&this._resetSwipe(),this._openedSwipeElement=e,this.dispatchCustomEvent("user-info-my-conversations-swipe-element-open")}_resetSwipe(){this._openedSwipeElement.opening="",this._openedSwipeElement={}}_clickHeaderIcon({detail:e}){0===e.index?this.dispatchCustomEvent("user-info-my-conversations-header-back-click"):1!==e.index&&2!==e.index||this.dispatchCustomEvent("user-info-my-conversations-toggle-menu-open",!0)}_openFaqs(){this.dispatchCustomEvent("user-info-my-conversations-show-faqs-click")}}var ds=r`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-type-text-word-break: break-word;
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--_user-info-my-conversations-chat-bg-color);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.chat-input {
  position: sticky;
  z-index: 9999;
  bottom: 0;
  left: 0;
  right: 0;
  background-color: var(--_user-info-my-conversations-chat-bg-color);
  padding-top: 1rem;
}

.chat-date {
  position: -webkit-sticky;
  position: sticky;
  top: 0;
  background-color: var(--_user-info-my-conversations-chat-bg-color);
  z-index: 1;
  padding: 0.5rem 0;
}

[data-tag-name=bbva-chat-container] {
  padding: 1rem 0;
}

[data-tag-name=bbva-type-date] {
  display: flex;
}

.text-left {
  text-align: left;
}

.modal-container {
  max-width: none;
}

.field {
  place-content: space-between;
}

.chat-transition {
  transition: none !important; /* Desactiva transiciones en iOS */
}

.chat-page {
  min-height: calc(100vh - 8rem);
  scroll-margin-bottom: 3.125rem;
}

.chat-page.ios {
  min-height: calc(100vh - 10.375rem);
}

.no-conversations {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
}

.no-conversations > [data-tag-name=bbva-clip-microillustration] {
  margin-top: 6rem;
}

.margin-botton-chat {
  margin-bottom: 7rem;
}

.link-attach {
  display: flex;
  justify-content: left;
  margin: 0;
  padding: 0;
  align-items: center;
  text-align: left;
  white-space: normal;
  overflow-wrap: break-word;
  word-break: break-word;
}

.padding-self {
  padding: 0 3.5rem 1rem 0;
}

.padding-not-self {
  padding: 0 0 1rem 3.5rem;
}

.list-error {
  padding: 1rem;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  min-height: 91vh;
}

.list-error [data-tag-name=bbva-button-default] {
  width: 100%;
}

.list-error-header {
  margin-bottom: 9.375rem;
  display: flex;
  flex-direction: column;
  align-items: flex-start;
}
`,us=r`
:host {
  --_user-info-my-conversations-chat-bg-color: ${T("colorPrimarySurfaceAmbientDefault",x)};
}
`;class ms extends(os(n($(A(o(t)))))){static get scopedElements(){const e=[O,P,k,J,$e,Ae,W,j,Y,D,H,...ms.configurationScopedElements()];return ms.scopedElementsFromClasses(e)}static get is(){return"user-info-my-conversations-chat"}static get properties(){return{_chatTitle:{type:String},_chatMessages:{type:Array},_messageMaxLength:{type:Number},_lastMessage:{type:Object},_hasDraftMessage:{type:Boolean},_draftMessage:{type:String},idDraftMessage:{type:String,attribute:"id-draft-message"},allowAttachments:{type:Boolean,attribute:"allow-attachments"},disabledConversation:{type:Boolean,attribute:"disabled-conversation"},_noResultsPicture:{type:String},_clientLabel:{type:String},_bankerLabel:{type:String},firstAttach:{type:Boolean,attribute:"first-attach"},_oldMessages:{type:Array},_draftDate:{type:String},messageData:{type:Object},chatFormMessage:{type:String,attribute:"chat-form-message"},errorListMessages:{type:Boolean,attribute:"error-list-messages"},canNotRetryGetMessages:{type:Boolean,attribute:"can-not-retry-get-messages"},_nameMaxCharacters:{type:Number},visibleChatPage:{type:Boolean,attribute:"visible-chat-page"},showSecondMessage:{type:Boolean,attribute:"show-second-message"}}}constructor(){super(),this._messageMaxLength=3800,this.allowAttachments=!1,this.attachmentOption="",this._chatMessages=[],this._chatTitle=this.t("user-info-my-conversations-header-text"),this.disabledConversation=!1,this._draftMessage="",this.firstAttach=!1,this._hasDraftMessage=!1,this.idDraftMessage="",this._lastMessage={},this._noResultsPicture="empty_state_day",this._bankerLabel="M",this._clientLabel="C",this._oldMessages=[],this._draftDate="",this.chatFormMessage="",this.messageData={},this.errorListMessages=!1,this._dateOptions={hour:"2-digit",minute:"2-digit"},this.canNotRetryGetMessages=!1,this._nameMaxCharacters=19,this.visibleChatPage=!1,this.iOSFixedHeader=!1,this.showSecondMessage=!1}static get styles(){return[ds,us,L.primary,Q.primary,G.primary,K.primary,Me.primary,Me.primaryAlt,Ie.primary,Z.primary,V.primary,l("user-info-my-conversations-chat")]}updated(e){if(e.has("_chatMessages")){const e=this.shadowRoot.getElementById("chat-container-box");setTimeout((()=>{e&&e.scrollIntoView({behavior:"smooth",block:"end"})}),0)}e.has("messageData")&&0!==Object.keys(this.messageData).length&&this.openChatPage(this.messageData)}_sendClick(e){const t=this.removeEmojis(e);if(this._hasDraftMessage){const e={messageId:this.idDraftMessage,message:t,isDraft:!1};this._hasDraftMessage=!1,this.dispatchCustomEvent("user-info-my-conversations-message-update",e)}else{const e={message:t,isDraft:!1};this.dispatchCustomEvent("user-info-my-conversations-message-post",e)}}_addClick(e){this.firstAttach&&this.dispatchCustomEvent("user-info-my-conversations-native-local-storage-get",{key:"my_conversation_attach"}),this.dispatchCustomEvent("user-info-my-conversations-modal-open","attach"),this.dispatchCustomEvent("user-info-my-conversations-message-draft-id-set",this.idDraftMessage)}_clearClick(){this.dispatchCustomEvent("user-info-my-conversations-chat-form-clear"),this.chatFormMessage=""}get _chatPage(){return u`
      <bbva-transition-container
        class="chat-transition"
        id="chat"
        header-text="${this._chatTitle}"
        header-type="first-level-sequential"
        header-show-left-icon=""
        header-left-icon-aria-label="${this.t("user-info-my-conversations-close")}"
        ?visible="${this.visibleChatPage}"
        @transition-container-close="${this._onChatPageClose}"
        @transition-container-open="${this._onChatPageOpen}"
      >
        ${this.errorListMessages?u` ${this._listMessagesError}`:u` <div
                id="chat-container-box"
                class="chat-page ${this.iOSFixedHeader?"ios":""}  ${this.disabledConversation?"margin-botton-chat":""}"
                slot="slot-content"
              >
                <div id="chat-container">${this._chatContainer}</div>
              </div>
              <div class="chat-input" slot="slot-content">
                ${this.disabledConversation?u`
                      <bbva-notification-message
                        message-title="${this.t("user-info-my-conversations-chat-notification-conversation-solve")}"
                        message="${this.t("user-info-my-conversations-chat-notification-conversation-solve-info")}"
                      ></bbva-notification-message>
                    `:u`
                      <bbva-chat-form
                        class="text-left"
                        id="chat-form"
                        ?disabled=${this.disabledConversation}
                        ?show-add-icon=${this.allowAttachments}
                        .message="${this.chatFormMessage}"
                        @chat-form-add="${e=>this._addClick(e.detail)}"
                        @chat-form-clear="${this._clearClick}"
                        @chat-form-send-click="${e=>this._sendClick(e.detail)}"
                        @input="${e=>this._keyUpChatForm(e)}"
                        add-button-label="${this.t("user-info-my-conversations-chat-add-button-label")}"
                        clear-button-label="${this.t("user-info-my-conversations-chat-clear-button-label")}"
                        send-button-label="${this.t("user-info-my-conversations-chat-send-button-label")}"
                        text-placeholder="${this.t("user-info-my-conversations-chat-form-placeholder")}"
                        ambient="primary"
                      ></bbva-chat-form>
                    `}
              </div>`}
      </bbva-transition-container>
    `}_onChatPageClose(){this._checkDraftMessage(),this.dispatchCustomEvent("user-info-my-conversations-chat-page-close"),this.dispatchCustomEvent("user-info-my-conversations-chat-page-visible-change",!1)}_onChatPageOpen(){this.dispatchCustomEvent("user-info-my-conversations-chat-page-visible-change",!0)}_checkDraftMessage(){if(this._hasDraftMessage)if(""===this.chatFormMessage){const e=0===this._chatMessages.length,t={messageId:this.idDraftMessage,showDiscartedConversation:e};this.dispatchCustomEvent("user-info-my-conversations-message-delete",t)}else{const e={messageId:this.idDraftMessage,message:this.chatFormMessage,isDraft:!0};this.dispatchCustomEvent("user-info-my-conversations-message-update",e)}else if(""!==this.chatFormMessage){const e={message:this.chatFormMessage,isDraft:!0};this.dispatchCustomEvent("user-info-my-conversations-message-post",e)}}_handleIcon(e){const t=e.name.split(".").pop().toLowerCase()?e.name.split(".").pop().toLowerCase():"",s={images:["jpg","jpeg","png","bmp","gif","webp"],documents:["xls","doc","docs","xlsx","ppt","pptx","odt","pdf","xml","csv","txt"],videos:["avi","mp4","3gpp"],audios:["mp3","flac"]};return s.images.includes(t)?b():s.documents.includes(t)?y():s.videos.includes(t)?f():s.audios.includes(t)?S():y()}get _chatContainer(){let e=null;return 0==this._chatMessages?u`
        <div class="no-conversations">
          <bbva-type-date
            class="chat-date"
            date="${this._draftDate}"
            font-weight="500"
            font-style="italic"
            ambient="primary"
          ></bbva-type-date>
          <bbva-clip-microillustration
            alt-microillustration="${this._noResultsPicture}"
            alt-image="${this.t("user-info-my-conversations-message-title-no-results-no-conversations")}"
            size="M"
          ></bbva-clip-microillustration>
          <bbva-type-text
            text="${this.t("user-info-my-conversations-message-title-no-results-no-conversations")}"
            size="4XL"
            tag="strong"
            ambient="primary"
          ></bbva-type-text>
          <bbva-type-text
            text="${this.t("user-info-my-conversations-message-label-no-results-no-conversations")}"
            size="M"
            ambient="primary"
          ></bbva-type-text>
        </div>
      `:u`
      <div class="chat-container" ambient="primary">
        ${this._chatMessages.map(((t,s)=>{const i=this.formatDate(t.date),a=e!==i;e=i;const r=a?u` <bbva-type-date
                class="chat-date"
                date=${i}
                font-weight="500"
                font-style="italic"
                ambient="primary"
              ></bbva-type-date>`:"",n=0==s?u`
                  <bbva-notification-help
                    class="new-conversation-notification-message"
                    variant="info"
                    text="${this.showSecondMessage?this.t("user-info-my-conversations-new-conversation-notification-message-second"):this.t("user-info-my-conversations-new-conversation-notification-message")}"
                    ambient="primary"
                  ></bbva-notification-help>
                `:"",o=!!t.attachments,c=s>0&&this._chatMessages[s-1].initials===t.initials;return u`
            ${r}
            ${o?u`
                  ${t.attachments.map(((e,s)=>u`
                      <bbva-chat-container
                        owner="${0!==s||c?"":t.name}"
                        variant="${t.self?"":"received"}"
                        initials="${t.initials}"
                        state="${0===s?"":"stacked"}"
                        class="${0!==s?"padding-self":""}"
                        date="${0!==s||c?"":t.date}"
                        .dateOptions=${this._dateOptions}
                        clock-suffix=""
                      >
                        <bbva-type-link
                          class="link-attach"
                          icon="${this._handleIcon(e)}"
                          @click="${()=>this._downloadFile(e)}"
                          icon-size="24"
                          size="M"
                        >
                          ${e.name}
                        </bbva-type-link>
                        <bbva-type-text
                          text="${this.formatSize(e.size)}"
                          font-style="italic"
                          size="S"
                        ></bbva-type-text>
                      </bbva-chat-container>
                    `))}

                  <bbva-chat-container
                    class="${t.self?"padding-self":"padding-not-self"}"
                    disable-click="true"
                    variant="${t.self?"":"received"}"
                    state="stacked"
                    date="${0!==s||c?"":t.date}"
                    .dateOptions=${this._dateOptions}
                    clock-suffix=""
                  >
                    <bbva-type-text size="S" text="${t.message}"></bbva-type-text>
                  </bbva-chat-container>
                  ${t.self?n:""}
                `:u`
                  <bbva-chat-container
                    owner="${c?"":t.name}"
                    disable-click="true"
                    variant="${t.self?"":"received"}"
                    initials="${t.initials}"
                    date="${c?"":t.date}"
                    .dateOptions=${this._dateOptions}
                    clock-suffix=""
                  >
                    <bbva-type-text size="S" text="${t.message}"></bbva-type-text>
                  </bbva-chat-container>
                  ${t.self?n:""}
                `}
          `}))}
      </div>
    `}get _listMessagesError(){return u` <div class="list-error" slot="slot-content">
      <div class="list-error-header">
        <bbva-clip-microillustration
          alt-image="${this.t("user-info-my-conversations-messages-error-title")}"
          ambient="primary"
          alt-microillustration="error"
          size="M"
        ></bbva-clip-microillustration>
        <bbva-type-text
          unset
          ambient="primary"
          text="${this.t("user-info-my-conversations-messages-error-title")}"
          size="2XL"
          font-weight="500"
        ></bbva-type-text>
        <bbva-type-text
          ambient="primary"
          text="
        ${this.canNotRetryGetMessages?this.t("user-info-my-conversations-messages-error-description-no-retry"):this.t("user-info-my-conversations-messages-error-description")}"
          size="S"
        ></bbva-type-text>
      </div>
      ${this.canNotRetryGetMessages?"":u`
            <bbva-button-default
              ambient="primary"
              class="form-button"
              type="submit"
              @click="${()=>this.dispatchCustomEvent("user-info-my-conversations-get-messages-retry")}"
            >
              ${this.t("user-info-my-conversations-full-modal-error-button")}
            </bbva-button-default>
          `}
    </div>`}render(){return u` ${this._chatPage} `}openChatPage(e){if(e.error)return void this._onChatPageOpen();const{conversations:t,status:s,subject:i}=e;i&&(this._chatTitle=i),this.disabledConversation="solve"===s,this.idDraftMessage="","draft"===s?(this.chatFormMessage=e.conversations[0].message,this.dispatchCustomEvent("user-info-my-conversations-chat-chat-form-update",this.chatFormMessage),this._hasDraftMessage=!0,this._draftMessage=e.conversations[0].message,this.idDraftMessage=e.conversations[0].id):(this._hasDraftMessage=!1,this._draftMessage=""),this.viewMessages(t),this._onChatPageOpen(),"solve"===s?this.dispatchCustomEvent("user-info-my-conversations-chat-page-resolved-open"):this.dispatchCustomEvent("user-info-my-conversations-chat-page-open")}viewMessages(e){this._keyFinder(e);const t=this._messageFilter(e);if(t.length>=0){this._oldMessages.push(...t);let e=[];t.forEach((t=>{var s,i;let a={};const r=(null===(s=t.customer)||void 0===s?void 0:s.name)??"Yo",n=(null===(i=t.customer)||void 0===i?void 0:i.lastName)??"",o=r+" "+n,c=t.businessAgent.name+" "+t.businessAgent.lastName;t.senderType===this._clientLabel?(a.self=!0,a.name=o.length>this._nameMaxCharacters?o.substring(0,this._nameMaxCharacters)+"...":o,a.initials=r.charAt(0).toUpperCase()+n.charAt(0).toUpperCase()):t.senderType===this._bankerLabel&&(a.self=!1,a.name=c.length>this._nameMaxCharacters?c.substring(0,this._nameMaxCharacters)+"...":c,a.initials=t.businessAgent.name.charAt(0).toUpperCase()+t.businessAgent.lastName.charAt(0).toUpperCase()),a.date=t.creationDate,a.message=t.message,a.wasRead=t.wasRead,a.attachments=t.attachments,e.push(a)})),e.reverse(),this._chatMessages=e;const s=this.shadowRoot.getElementById("chat-container");s.scrollTop=s.scrollHeight}}_keyFinder(e){let t=e?e[0]:{};t.senderType===this._bankerLabel&&t.message.includes(this.t("user-info-my-conversations-key-phrase-to-close-the-conversation"))&&(this.disabledConversation=!0)}_messageFilter(e){return e.filter((e=>(e.message=e.message.replace(/\n/g,"<br>"),e.isDraft&&(this._draftDate=e.creationDate),!e.isDraft)))}_downloadFile(e){this.dispatchCustomEvent("user-info-my-conversations-file-download",e)}_keyUpChatForm(e){let t=e.srcElement.message;t.length>this._messageMaxLength?(t=t.slice(0,this._messageMaxLength),e.srcElement.message=t,this.chatFormMessage=t):this.chatFormMessage=t,this.dispatchCustomEvent("user-info-my-conversations-chat-chat-form-update",this.chatFormMessage)}}var ps=r`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--_user-info-my-conversations--bg-color);
  height: 100vh;
}

:host([hidden]), [hidden] {
  display: none !important;
}

:host(.overflow-hidden) {
  overflow: hidden;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.toast {
  z-index: 1;
}

.spinner {
  z-index: 11;
}
`,gs=r`
:host {
  --_user-info-my-conversations--bg-color: ${T("colorPrimarySurfaceAmbientDefault",x)};
  --_user-info-my-conversations--border-color: ${T("colorPrimaryFormatDivider",x)};
}
`,_s=r`
@charset "UTF-8";
:host {
  display: block;
  box-sizing: border-box;
  --bbva-transition-container-padding: 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=help-faqs-aem] {
  height: auto;
}

[data-tag-name=bbva-button-row] {
  background-color: var(--_user-info-my-conversations-modals--bg-color);
  padding: 1rem 0;
}

.conversation {
  padding: 1rem;
}

.conversation:active {
  background-color: var(--_user-info-my-conversations-modals--conversations-bg-color);
}

.attached {
  margin-left: auto;
}

.read {
  border-left: 0.25rem solid transparent;
}

.advice {
  margin-bottom: 1rem;
}

.highlighted {
  border-left: 0.25rem solid var(--_user-info-my-conversations-modals--highlighted-border-color);
}

[data-tag-name=bbva-clip-microillustration] {
  padding-bottom: 1rem;
}

.icon-title {
  display: flex;
  align-items: center;
  gap: 0.5rem;
  flex: 1 0 0;
}

.subject {
  display: flex;
  align-items: flex-start;
  align-items: center;
  margin-bottom: 0.375rem;
}

[data-tag-name=bbva-form-input] {
  margin-top: 0.5rem;
}

[data-tag-name=bbva-list-bullet] {
  padding: 0 0 0.5rem;
}

.expanded-modal {
  --bbva-help-modal-padding: 0;
}

.modal-form {
  padding: 0 1rem;
}

.checkbox-container {
  display: flex;
  padding-top: 0.5rem;
}

.new-conversation-notification-message {
  padding: 1rem 0;
}

.notification {
  padding: 1rem;
  margin-bottom: 1rem;
}

.notification-container {
  background-color: var(--_user-info-my-conversations-modals--bg-color);
  padding: 1rem;
}

.chat-page {
  background-color: var(--_user-info-my-conversations-modals--bg-color);
  text-align: left;
}

.chat-input {
  position: fixed;
  bottom: 0;
  width: 100%;
  padding: 1rem;
  background-color: var(--_user-info-my-conversations-modals--bg-color);
}

.chat-date {
  padding-left: 1rem;
  margin-top: 3.75rem;
  position: relative;
  top: 0;
  width: 100%; /* Opcional: ajusta el ancho según sea necesario */
}

.file-row {
  display: flex;
  overflow-wrap: anywhere;
  padding: 0;
}

.file-title {
  display: flex;
  justify-content: space-between;
}

.file-content {
  display: flex;
  width: 100%;
  flex-direction: column;
  padding: 0.5rem 0;
}

.no-padding {
  padding: 0;
}

.lateral-padding {
  padding: 0 1rem;
}

.table-caption {
  display: flex;
  flex-direction: column;
  gap: 1rem;
}

.type-link {
  padding: 1rem 0;
}

.border-top {
  border-top: 0.0625rem solid var(--_user-info-my-conversations--border-color);
}
`,vs=r`
:host {
  --_user-info-my-conversations-_icon-color: var(--user-info-my-conversations-_icon-color-message,${T("colorPrimaryFormatBullet",x)});
}
`,bs=r`
.expanded-modal {
  z-index: 99;
}

.table-caption {
  display: flex;
  flex-direction: column;
  gap: 1rem;
}

.file-row {
  display: flex;
  overflow-wrap: anywhere;
  padding: 0;
}

.file-title {
  display: flex;
  justify-content: space-between;
}

.file-content {
  display: flex;
  width: 100%;
  flex-direction: column;
  padding: 1rem 0;
}

.no-padding {
  padding: 0;
}

.type-link {
  padding: 1rem 0;
}

.form-button {
  width: -webkit-fill-available;
}

[data-tag-name=bbva-list-bullet] {
  padding: 0 0 1rem;
}

.notification {
  padding: 1rem;
  margin-bottom: 1rem;
}

.new-conversation-notification-message {
  padding: 1rem 0;
}

.border-top {
  border-top: 0.0625rem solid var(--_user-info-my-conversations--border-color);
}

[modal-type=caution] {
  z-index: 1000;
}

[modal-type=warning] {
  z-index: 1000;
}
`;class ys extends(n(os($(A(o(t)))))){static get scopedElements(){const e=[M,I,D,O,P,q,N,k,be,ee,De,Oe,Pe,H,_e,j,W,F,qe,J,$e,Ae,Y,te,Te,...ys.configurationScopedElements()];return ys.scopedElementsFromClasses(e)}static get is(){return"user-info-my-conversations-modals"}static get properties(){return{noResultsPicture:{type:String,attribute:"no-results-picture"},attachedMessage:{type:String,attribute:"attached-message"},showHelpModal:{type:Boolean,attribute:"show-help-modal"},showAdvice:{type:Boolean,attribute:"show-advice"},bulletExtra:{type:Number,attribute:"bullet-extra"},onboardingBold:{type:Boolean,attribute:"onboarding-bold"},showAttachOnBoardingModal:{type:Boolean,attribute:"show-attach-on-boarding-modal"},showAttachModal:{type:Boolean,attribute:"show-attach-modal"},showAttachErrorModal:{type:Boolean,attribute:"show-attach-error-modal"},showNewModal:{type:Boolean,attribute:"show-new-modal"},showSearchModal:{type:Boolean,attribute:"show-search-modal"},showHistoryModal:{type:Boolean,attribute:"show-history-modal"},showAttachTypeModal:{type:Boolean,attribute:"show-attach-type-modal"},customerId:{type:String,attribute:"customer-id"},customerName:{type:String,attribute:"customer-name"},customerLastName:{type:String,attribute:"customer-last-name"},receiverId:{type:String,attribute:"receiver-id"},receiverName:{type:String,attribute:"receiver-name"},receiverLastName:{type:String,attribute:"receiver-last-name"},errorTitle:{type:String,attribute:"error-title"},errorBody:{type:String,attribute:"error-body"},errorButton:{type:String,attribute:"error-button"},allowAttachments:{type:Boolean,attribute:"allow-attachments"},allowCamera:{type:Boolean,attribute:"allow-camera"},noResultSearch:{type:Boolean,attribute:"no-result-search"},conversations:{type:Array},_filteredConversations:{type:Array},_firstMessage:{type:String},_firstMessageTitle:{type:String},_searchInput:{type:String},_showErrorButton:{type:Boolean},_enableNewModalButton:{type:Boolean},_enableSubmitAttachButton:{type:Boolean},_uploadedFiles:{type:Array},_newModalMessageMaxLength:{type:Number},firstAttach:{type:Boolean,attribute:"first-attach"},maxAmountDocuments:{type:Number,attribute:"max-amount-documents"},modalOpenId:{type:String,attribute:"modal-open-id"},modalCloseId:{type:String,attribute:"modal-close-id"},includeFileToAttachId:{type:String,attribute:"include-file-to-attach-id"},fileToIncludeRaw:{type:Object,attribute:"file-to-include-raw"},idDraftMessage:{type:String,attribute:"id-draft-message"},maxFileSize:{type:Number,attribute:"max-file-size"},allowExtensions:{type:Array,attribute:"allow-extensions"},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"}}}constructor(){super(),this.noResultsPicture="empty_state_day",this.newMicroIllustration="chat",this.newMicroIllustrationAttach="upload_files",this._newModalMessageMaxLength=3800,this.dateOptions={day:"numeric",month:"numeric",year:"numeric"},this._firstMessage="",this._firstMessageTitle="",this._searchInput="",this.conversations=[],this._filteredConversations=[],this.fileToIncludeRaw={},this.firstAttach=!1,this.showHelpModal=!1,this.showAdvice=!1,this.bulletExtra=0,this.onboardingBold=!1,this.showAttachOnBoardingModal=!1,this.showAttachModal=!1,this.showAttachErrorModal=!1,this.showNewModal=!1,this.showSearchModal=!1,this.showHistoryModal=!1,this.showAttachTypeModal=!1,this.customerId="",this.receiverId="",this.modalOpenId="",this.modalCloseId="",this.includeFileToAttachId="",this._uploadedFiles=[],this._fileToInclude={},this._enableNewModalButton=!1,this._enableSubmitAttachButton=!1,this.noResultSearch=!1,this.allowAttachments=!1,this.allowCamera=!1,this._searchTerms="",this.idDraftMessage="",this.maxFileSize=3,this.iOSFixedHeader=!1,this.maxAmountDocuments=3,this.allowExtensions=["image","document","video","audio"]}static get styles(){return[_s,vs,bs,U.primary,L.primary,Ne.primary,B.primary,G.primary,K.primary,ye.primary,ke.primary,He.primary,je.primary,xe.primary,X.primary,ve.primary,Z.primary,Me.primary,Ie.primary,Q.primary,se.primary,se.primary,ie.primary,l("user-info-my-conversations-modals")]}updated(e){e.has("fileToIncludeRaw")&&0!==Object.keys(this.fileToIncludeRaw).length&&this._addFilePluginSuccess(this.fileToIncludeRaw),e.has("modalOpenId")&&""!==this.modalOpenId&&this._openModal(this.modalOpenId),e.has("modalCloseId")&&""!==this.modalCloseId&&this._closeModal(this.modalCloseId),e.has("includeFileToAttachId")&&""!==this.includeFileToAttachId&&this.successUploadFile(this.includeFileToAttachId)}get _helpModal(){return u`
      <bbva-help-modal
        id="help"
        full-height
        fixed-footer
        button-text="${this.t("user-info-my-conversations-help-modal-button-text")}"
        header-text="${this.t("user-info-my-conversations-header-text")}"
        ?visible="${this.showHelpModal}"
        header-close-icon-aria-label="${this.t("user-info-my-conversations-close")}"
        @help-modal-header-click="${()=>this._closeModal("help")}"
      >
        <div class="content" slot="slot-content">
          <bbva-clip-microillustration
            class="no-padding"
            alt-microillustration="${this.newMicroIllustration}"
            alt-image="${this.t("user-info-my-conversations-header-text")}"
            size="M"
          ></bbva-clip-microillustration>
          <bbva-type-text
            ambient="primary"
            text="${this.t("user-info-my-conversations-help-modal-bullet-one")}"
            size="S"
            font-weight=" ${this.onboardingBold?"500":"400"}"
          ></bbva-type-text>
          <bbva-list-bullet ambient="primary">
            <bbva-type-text
              text="${this.t("user-info-my-conversations-help-modal-bullet-two")}"
              size="S"
              font-weight="400"
              tag="span"
            ></bbva-type-text>
          </bbva-list-bullet>
          <bbva-list-bullet ambient="primary">
            <bbva-type-text
              text="${this.t("user-info-my-conversations-help-modal-bullet-three")}"
              size="S"
              font-weight="400"
              tag="span"
            ></bbva-type-text>
          </bbva-list-bullet>
          ${this._extraBullets()}
          ${this.showAdvice?u`
                <bbva-header-category
                  ambient="primary"
                  class="advice"
                  text="${this.t("user-info-my-conversations-help-modal-header-advice")}"
                ></bbva-header-category>
                <bbva-list-bullet ambient="primary">
                  <bbva-type-text
                    text="${this.t("user-info-my-conversations-help-modal-bullet-four")}"
                    size="S"
                    font-weight="400"
                    tag="span"
                  ></bbva-type-text>
                </bbva-list-bullet>
                <bbva-list-bullet ambient="primary">
                  <bbva-type-text
                    text="${this.t("user-info-my-conversations-help-modal-bullet-five")}"
                    size="S"
                    font-weight="400"
                    tag="span"
                  ></bbva-type-text>
                </bbva-list-bullet>
              `:C}
          <bbva-notification-message
            class="notification"
            message-title="${this.t("user-info-my-conversations-help-modal-notification-title")}"
            message="${this.t("user-info-my-conversations-help-modal-notification-message")}"
          ></bbva-notification-message>
        </div>
      </bbva-help-modal>
    `}get _attachOnboarding(){return u`
      <bbva-help-modal
        id="attachOnBoarding"
        class="expanded-modal"
        ?visible="${this.showAttachOnBoardingModal}"
        attach-to-body
        .contentStyles="${bs}"
        full-height
        fixed-footer
        button-text="${this.t("user-info-my-conversations-help-modal-button-text")}"
        header-text="${this.t("user-info-my-conversations-attach-modal-header-text")}"
        header-close-icon-aria-label="${this.t("user-info-my-conversations-close")}"
        @help-modal-header-click="${()=>this._closeModal("attachOnBoarding")}"
      >
        <div class="content" slot="slot-content">
          <bbva-clip-microillustration
            ambient="primary"
            alt-microillustration="${this.newMicroIllustrationAttach}"
            alt-image="${this.t("user-info-my-conversations-attach-modal-header-text")}"
            size="M"
          ></bbva-clip-microillustration>
          <bbva-type-text
            text="${this.t("user-info-my-conversations-attach-modal-bullet-one")}"
            size="S"
            font-weight="400"
            ambient="primary"
          ></bbva-type-text>
          <bbva-list-bullet>
            <bbva-type-text
              text="${this.t("user-info-my-conversations-attach-modal-bullet-two")}"
              size="S"
              font-weight="400"
              tag="span"
              ambient="primary"
            ></bbva-type-text>
          </bbva-list-bullet>
          <bbva-list-bullet>
            <bbva-type-text
              text="${this.t("user-info-my-conversations-attach-modal-bullet-three")}"
              size="S"
              font-weight="400"
              tag="span"
              ambient="primary"
            ></bbva-type-text>
          </bbva-list-bullet>
          <bbva-list-bullet>
            <bbva-type-text
              text="${this.t("user-info-my-conversations-attach-modal-bullet-four")}"
              size="S"
              font-weight="400"
              tag="span"
              ambient="primary"
            ></bbva-type-text>
          </bbva-list-bullet>
          <bbva-list-bullet>
            <bbva-type-text
              text="${this.t("user-info-my-conversations-attach-modal-bullet-five")}"
              size="S"
              font-weight="400"
              tag="span"
              ambient="primary"
            ></bbva-type-text>
          </bbva-list-bullet>
        </div>
      </bbva-help-modal>
    `}get _attachFileModal(){return u`
      <bbva-help-modal
        id="attach"
        ?visible="${this.showAttachModal}"
        full-height
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        fixed-footer
        .disabledButton="${!this._enableSubmitAttachButton}"
        .closeModalElements="${[]}"
        button-text="${this.t("user-info-my-conversations-attach-modal-button-text")}"
        header-text="${this.t("user-info-my-conversations-attach-file")}"
        header-close-icon-aria-label="${this.t("user-info-my-conversations-close")}"
        @help-modal-header-click="${()=>this._closeModal("attach")}"
        @help-modal-footer-button-click="${()=>this._submitAttachMessage()}"
      >
        <div class="content" slot="slot-content">
          ${this._uploaderForm()}
          <bbva-type-text
            text="${this.t("user-info-my-conversations-attach-modal-message-label-out")}"
            size="S"
            font-weight="500"
            ambient="primary"
          >
          </bbva-type-text>
          <bbva-form-input
            id="attached-message-input"
            ambient="primary-alt"
            type="textarea"
            value="${this.attachedMessage}"
            label="${this.t("user-info-my-conversations-attach-modal-message-label")}"
            maxlength="${this._newModalMessageMaxLength}"
            character-counter-label="${this.t("user-info-my-conversations-new-modal-message-character-counter-label")}"
            clear-accessible-text="${this.t("user-info-my-conversations-chat-clear-button-label")}"
            @form-input-value-change="${this._setAttachedMessage}"
            @form-textarea-input-clear="${this._clearAttachedMessage}"
            accessible-description="${this.t("user-info-my-conversations-field-required")}"
          ></bbva-form-input>
        </div>
      </bbva-help-modal>
    `}_errorModal(e,t,s,i){return u`
      <bbva-help-modal
        id="attachError"
        attach-to-body
        ?visible="${this.showAttachErrorModal}"
        modal-type="${i}"
        header-close-icon-aria-label="${this.t("user-info-my-conversations-close")}"
        header-text=${this.t(e)}
        title-icon="${"warning"===i?E():w()}"
        body-text="${this.t(t)}"
        button-text="${this.t(s)}"
        @help-modal-header-click="${()=>this._closeModal("attachError")}"
      >
      </bbva-help-modal>
    `}get _newConversationModal(){return u`
      <bbva-help-modal
        id="new"
        ?visible="${this.showNewModal}"
        full-height
        fixed-footer
        .disabledButton="${!this._enableNewModalButton}"
        button-text="${this.t("user-info-my-conversations-new-modal-button-text")}"
        header-text="${this.t("user-info-my-conversations-new-modal-header")}"
        header-close-icon-aria-label="${this.t("user-info-my-conversations-close")}"
        hide-content-padding-top
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        @help-modal-header-click="${()=>this._closeModal("new")}"
        attach-to-body
        class="expanded-modal"
        .contentStyles="${bs}"
        @help-modal-footer-button-click="${()=>this._createConversation()}"
      >
        <div class="content" slot="slot-content">
          <bbva-type-text
            text="${this.t("user-info-my-conversations-new-modal-message")}"
            size="S"
            font-weight="400"
            ambient="primary"
          ></bbva-type-text>
          <bbva-form-input
            id="first-title-input"
            value="${this._firstMessageTitle}"
            ambient="primary-alt"
            type="text"
            accessible-description="${this.t("user-info-my-conversations-field-required")}"
            label-out="${this.t("user-info-my-conversations-new-modal-subject-label-out")}"
            label="${this.t("user-info-my-conversations-new-modal-subject-label")}"
            maxlength="50"
            info-message="${this.t("user-info-my-conversations-new-modal-subject-info-message")}"
            @form-input-value-change="${this._setFirstTitleMessage}"
            ambient="primary"
            clear-accessible-text="${this.t("user-info-my-conversations-chat-clear-button-label")}"
          ></bbva-form-input>
          <bbva-type-text
            text="${this.t("user-info-my-conversations-new-modal-message-label-out")}"
            size="S"
            font-weight="500"
            ambient="primary"
          >
          </bbva-type-text>
          <bbva-form-input
            id="first-message-input"
            value="${this._firstMessage}"
            ambient="primary-alt"
            type="textarea"
            accessible-description="${this.t("user-info-my-conversations-field-required")}"
            label="${this.t("user-info-my-conversations-new-modal-message-label")}"
            maxlength="${this._newModalMessageMaxLength}"
            character-counter-label="${this.t("user-info-my-conversations-new-modal-message-character-counter-label")}"
            @form-input-value-change="${this._setFirstMessage}"
            @form-textarea-input-clear="${this._clearFirstMessage}"
            clear-accessible-text="${this.t("user-info-my-conversations-chat-clear-button-label")}"
            ambient="primary"
          >
          </bbva-form-input>
          <bbva-notification-help
            class="new-conversation-notification-message"
            variant="info"
            text="${this.t("user-info-my-conversations-new-conversation-notification-message")}"
            ambient="primary"
          ></bbva-notification-help>
          ${this.allowAttachments?this._uploaderForm():""}
        </div>
      </bbva-help-modal>
    `}_clickAttachFile(){this.firstAttach?this.dispatchCustomEvent("user-info-my-conversations-native-local-storage-get",{key:"my_conversation_attach"}):this.dispatchCustomEvent("user-info-my-conversations-modal-open","attachType")}_openFileFetcher(){this._closeModal("attachType");this.dispatchCustomEvent("user-info-my-conversations-file-fetch",{contentType:"*/*"})}_openGallery(){this._closeModal("attachType");this.dispatchCustomEvent("user-info-my-conversations-gallery-open",{source:"gallery",scaleType:"maxWeight",scaleRate:1,showMetadata:!0})}_checkCameraPermissions(e){this._closeModal("attachType"),this._dispatchCustomEvent("user-info-my-conversations-check-mobile-permission","camera")}_addFilePluginSuccess(e){if(e.name=this.cleanFileName(e),e.name=this.truncateFileName(e),e.extension||(e.extension=this.getExtension(e.name)),this._uploadedFiles.length>=this.maxAmountDocuments)return void this.openAttachErrorModal(this.t("user-info-my-conversations-attach-error-amount-title"),this.t("user-info-my-conversations-attach-error-amount-body"),this.t("user-info-my-conversations-attach-error-amount-button"));const t={image:["jpg","jpeg","png","gif","bmp","webp"],document:["xls","doc","docx","xlsx","ppt","pptx","odt","pdf","xml","csv","txt"],video:["avi","mp4","3gpp"],audio:["mp3","flac","m4a"]};if(!this.allowExtensions.reduce(((e,s)=>t[s]?e.concat(t[s]):e),[]).some((t=>e.extension.toUpperCase()===t.toUpperCase())))return void this.openAttachErrorModal(this.t("user-info-my-conversations-attach-error-type-title"),this.t("user-info-my-conversations-attach-error-type-body"),this.t("user-info-my-conversations-attach-error-type-button"),"warning");if(e.size>1024*this.maxFileSize*1024)return void this.openAttachErrorModal(this.t("user-info-my-conversations-attach-error-size-title"),this.t("user-info-my-conversations-attach-error-size-body"),this.t("user-info-my-conversations-attach-error-size-button"),"caution");if(this._uploadedFiles.some((t=>t.name===e.name)))return void this.openAttachErrorModal(this.t("user-info-my-conversations-attach-error-duplicate-title"),this.t("user-info-my-conversations-attach-error-duplicate-body"),this.t("user-info-my-conversations-attach-error-duplicate-button"),"caution");const s=this.getMimeType(e.extension),i=this.base64ToBlob(e.fileBase64,s),a=new FormData;a.append("file",i),this._fileToInclude=e,this._uploadDocument(a)}_uploaderForm(){return u`
      ${this._files(this._uploadedFiles)}
      <bbva-type-link
        class="type-link"
        ambient="primary"
        icon=${m()}
        @click="${()=>this._clickAttachFile()}"
        ?disabled="${this._uploadedFiles.length>=this.maxAmountDocuments}"
      >
        <span>${this.t("user-info-my-conversations-chat-add-button-label")}</span>
      </bbva-type-link>
      <bbva-notification-message
        class="notification"
        variant="caution"
        message-title="${this.t("user-info-my-conversations-max-files")}"
        book-title=""
      ></bbva-notification-message>
    `}_files(e){return u`
      ${e.map(((e,t)=>{const s=t>0;return u`
          ${s?u`<bbva-divider-default ambient="primary"></bbva-divider-default>`:""}
          <div class="file-row">
            <div class="file-content ${s?"border-top":""}">
              <div class="file-title">
                <bbva-type-text
                  tag="span"
                  text="${e.name}"
                  font-weight="500"
                  aria-label="${e.name}"
                  ambient="primary"
                  size="L"
                >
                </bbva-type-text>
                <bbva-type-link
                  icon-size="24"
                  class="no-padding"
                  icon=${c()}
                  @click="${()=>this._deleteIconClick(e.name)}"
                  aria-label="Descartar"
                  ambient="primary"
                >
                </bbva-type-link>
              </div>
              <div class="file-subtitle">
                <bbva-type-text
                  tag="span"
                  text="${this.formatSize(e.size)}"
                  size="S"
                  ambient="primary"
                ></bbva-type-text>
              </div>
            </div>
            <div class="divider">
              <bbva-divider-default ambient="primary"></bbva-divider-default>
            </div>
          </div>
        `}))}
    `}get _searchModal(){return u`
      <bbva-help-modal
        class="expanded-modal"
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        id="search"
        ?visible="${this.showSearchModal}"
        full-height
        header-text="${this.t("user-info-my-conversations-search-modal-header")}"
        header-close-icon-aria-label="${this.t("user-info-my-conversations-close")}"
        hide-content-padding-top
        @help-modal-header-click="${()=>this._closeModal("search")}"
      >
        <div class="content" slot="slot-content">
          <bbva-form-input
            id="search-input"
            .value="${this._searchInput}"
            class="modal-form"
            ambient="primary-alt"
            type="search"
            label="${this.t("user-info-my-conversations-search-modal-header-search")}"
            @form-input-value-change="${e=>this._searchInputValueChange(e)}"
            @form-search-button-submit="${this._filterList}"
            action-accessible-text="Buscar"
            clear-accessible-text="${this.t("user-info-my-conversations-chat-clear-button-label")}"
          ></bbva-form-input>
          ${this._renderList(this._filteredConversations)}
          ${this.noResultSearch?u`
                  <div class="conversation" ambient="primary">
                    <bbva-clip-microillustration
                      alt-microillustration="${this.noResultsPicture}"
                      alt-image="${this.t("user-info-my-conversations-search-modal-header-search")}"
                      size="M"
                    ></bbva-clip-microillustration>
                    <bbva-type-text
                      text="${this.t("user-info-my-conversations-search-title-no-results")}"
                      size="3XL"
                      tag="strong"
                    ></bbva-type-text>
                    <bbva-type-text
                      text="${this.t("user-info-my-conversations-search-label-no-results")}"
                      size="M"
                    ></bbva-type-text>
                  </div>
                `:""}
      </bbva-help-modal>
    `}get _historyModal(){return u`
      <bbva-help-modal
        class="expanded-modal"
        id="history"
        ?visible="${this.showHistoryModal}"
        full-height
        header-text="${this.t("user-info-my-conversations-history-modal-header")}"
        header-close-icon-aria-label="${this.t("user-info-my-conversations-close")}"
        @help-modal-header-click="${()=>this._closeModal("history")}"
      >
        <div class="content" slot="slot-content">
          <bbva-notification-help
            class="lateral-padding"
            variant="info"
            text="${this.t("user-info-my-conversations-history-modal-text")}"
          ></bbva-notification-help>
          ${this._renderList(this._filterListByDate())}
        </div>
      </bbva-help-modal>
    `}_modalStateChange(e,t){e.visible||this._closeModal(t)}get _attachTypeModal(){return u`
      <bbva-help-modal
        id="attachType"
        ?visible="${this.showAttachTypeModal}"
        class="expanded-modal"
        .contentStyles="${bs}"
        attach-to-body
        header-text="${this.t("user-info-my-conversations-chat-add-button-label")}"
        header-close-icon-aria-label="${this.t("user-info-my-conversations-close")}"
        @help-modal-header-click="${()=>this._closeModal("attachType")}"
        @modal-state-change="${e=>this._modalStateChange(e.detail,"attachType")}"
      >
        <div slot="slot-content" class="table-caption">
          ${this.allowCamera?u`
                <bbva-type-link
                  id="bbva-camera-btn"
                  icon-size="24"
                  icon="${R()}"
                  @click=${()=>this._checkCameraPermissions()}
                  aria-label="${this.t("user-info-my-conversations-camera")}"
                  ambient="primary"
                >
                  <span>${this.t("user-info-my-conversations-camera")}</span>
                </bbva-type-link>
                <bbva-divider-default ambient="primary"></bbva-divider-default>
              `:""}
          <bbva-type-link
            id="bbva-gallery-btn"
            icon-size="24"
            icon="${b()}"
            @click=${()=>this._openGallery()}
            aria-label="${this.t("user-info-my-conversations-images")}"
            ambient="primary"
          >
            <span>${this.t("user-info-my-conversations-images")}</span>
          </bbva-type-link>
          <bbva-divider-default ambient="primary"></bbva-divider-default>

          <bbva-type-link
            id="bbva-document-btn"
            icon-size="24"
            icon="${y()}"
            @click=${()=>this._openFileFetcher()}
            aria-label="${this.t("user-info-my-conversations-documents")}"
            ambient="primary"
          >
            <span>${this.t("user-info-my-conversations-documents")}</span>
          </bbva-type-link>
        </div>
      </bbva-help-modal>
    `}_renderList(e){return e.map(((t,s)=>u`
        <div
          class="conversation ${t.read?"highlighted":"read"}"
          @click="${()=>this._onClickConversation(t)}"
        >
          <div class="subject">
            <div class="icon-title">
              <bbva-type-icon
                icon="${t.read?g():_()}"
                size="24"
                icon-color="${"var(--_user-info-my-conversations-_icon-color)"}"
                ambient="primary"
              ></bbva-type-icon>
              <bbva-type-text
                text="${t.subject}"
                variant="spotlight"
                size="S"
                font-weight="500"
                tag="span"
                ambient="primary"
              ></bbva-type-text>
            </div>
            <bbva-type-date
              date="${t.date}"
              font-weight="500"
              font-style="italic"
              .options=${this.dateOptions}
              ambient="primary"
            ></bbva-type-date>
          </div>
          <bbva-type-text
            text="${t.message}"
            size="M"
            tag="span"
            ambient="primary"
          ></bbva-type-text>
          <bbva-type-icon
            class="attached"
            icon="${v()}"
            size="16"
            icon-color="${"var(--_user-info-my-conversations-_icon-color-attached)"}"
            .hidden=${!t.attached}
          ></bbva-type-icon>
          <bbva-badge-default
            text="${t.description?this.t(t.description):""}"
            type="${t.type?t.type:""}"
          ></bbva-badge-default>
        </div>
        ${s<e.length-1?u`
              <div class="lateral-padding">
                <bbva-divider-default ambient="primary"></bbva-divider-default>
              </div>
            `:""}
      `))}_filterList({detail:e}){this._searchTerms=null==e?void 0:e.toLowerCase();const t=this.conversations.filter((e=>e.subject.toLowerCase().includes(this._searchTerms)));this._filteredConversations=t,this.noResultSearch=0===this._filteredConversations.length,this.dispatchCustomEvent("user-info-my-conversations-modal-results-search",{searchResults:this._filteredConversations.length.toString()})}_filterListByDate(){const e=new Date;return[...this.conversations.filter((t=>{const s=new Date(t.date);return ys._getYearDifference(s,e)>=2}))]}static _getYearDifference(e,t){const s=new Date(e).getFullYear(),i=new Date(t).getFullYear();return Math.abs(i-s)}_setFirstTitleMessage({detail:e}){this._firstMessageTitle=this.removeEmojis(e.value),this._checkIsValidForm()}_setFirstMessage({detail:e}){this._firstMessage=this.removeEmojis(e.value),this._checkIsValidForm()}_clearFirstMessage(){this._firstMessage="",this._checkIsValidForm()}_clearAttachedMessage(){this.attachedMessage="",this._checkIsAttachedValidForm()}_checkIsValidForm(){const e=this._firstMessage&&this._firstMessage.trim().length>0&&this._firstMessageTitle&&this._firstMessageTitle.trim().length>0;this._enableNewModalButton=e}_submitAttachMessage(){this.dispatchCustomEvent("user-info-my-conversations-attach-modal-spinner"),this.attachedMessage=this.removeEmojis(this.attachedMessage);const e=this._uploadedFiles.map((e=>({name:e.name,url:e.id,size:e.size,loadFileDate:new Date}))),t={messageId:this.idDraftMessage,message:this.attachedMessage,customer:{id:this.customerId},isDraft:!1,attachments:e||[]};this.idDraftMessage?this.dispatchCustomEvent("user-info-my-conversations-message-update",t):this.dispatchCustomEvent("user-info-my-conversations-message-post",t)}_createConversation(e=!1){e||(this.showNewModal=!1,this.dispatchCustomEvent("user-info-my-conversations-modal-close"));const t=this._uploadedFiles.map((e=>({name:e.name,url:e.id,size:e.size,loadFileDate:new Date}))),s={customer:{id:this.customerId,name:this.customerName,lastName:this.customerLastName},receiver:{id:this.receiverId,name:this.receiverName,lastName:this.receiverLastName},subject:this._firstMessageTitle,message:{message:this._firstMessage,isDraft:e,attachments:t||[]},businessAgent:{id:this.receiverId,name:this.receiverName,lastName:this.receiverLastName}};this._firstMessage&&this._firstMessage.length>0&&this._firstMessageTitle&&this._firstMessageTitle.length>0&&this.dispatchCustomEvent("user-info-my-conversations-conversation-post",s)}_resetNewModal(){this._firstMessage="",this._firstMessageTitle="",this._enableNewModalButton=!1,this._uploadedFiles=[],this._checkIsValidForm()}_resetAttachModal(){this._uploadedFiles=[],this._checkIsAttachedValidForm()}_resetSearch(){this._searchInput="",this._filteredConversations=[],this.noResultSearch=!1}_openModal(e){const t=`show${e.charAt(0).toUpperCase()+e.slice(1)}Modal`;this[t]||(this[t]=!0,"new"===e&&this._resetNewModal(),"attach"===e&&this._resetAttachModal(),"search"===e&&this._resetSearch(),this.dispatchCustomEvent("user-info-my-conversations-"+e+"-modal-open"))}_onClickConversation(e){this._closeModal("search"),this.dispatchCustomEvent("user-info-my-conversations-conversation-selected-open",e)}_setAttachedMessage({detail:e}){this.attachedMessage=e.value,this._checkIsAttachedValidForm()}_checkIsAttachedValidForm(){const e=this.attachedMessage&&this.attachedMessage.trim().length>0&&this._uploadedFiles&&this._uploadedFiles.length>0;this._enableSubmitAttachButton=e}successUploadFile(e){this._fileToInclude.id=e,this._uploadedFiles=[...this._uploadedFiles,this._fileToInclude],this._checkIsAttachedValidForm(),this.dispatchCustomEvent("user-info-my-conversations-success-file-upload")}openAttachErrorModal(e,t,s,i){this.errorTitle=e,this.errorBody=t,this.errorButton=s,this.modalErrorType=i,this.dispatchCustomEvent("user-info-my-conversations-modal-open","attachError")}_deleteIconClick(e){this._uploadedFiles=this._uploadedFiles.filter((t=>t.name!==e)),this._checkIsAttachedValidForm()}_uploadDocument(e){this.dispatchCustomEvent("user-info-my-conversations-document-upload",e)}_deleteConversation(e){this.dispatchCustomEvent("user-info-my-conversations-delete-conversation-button-press",e)}_closeModal(e){"new"===e&&this._createConversation(!0),"attach"===e&&this.dispatchCustomEvent("user-info-my-conversations-set-draft-attach",this.attachedMessage);this[`show${e.charAt(0).toUpperCase()+e.slice(1)}Modal`]=!1,this.dispatchCustomEvent("user-info-my-conversations-modal-close",{showNewModal:this.showNewModal,showAttachModal:this.showAttachModal})}_searchInputValueChange({detail:e}){e&&(this._searchInput=e.value)}_extraBullets(){this.bulletExtra>3&&(this.bulletExtra=3);let e=[];for(let t=0;t<this.bulletExtra;t++)e.push(u`
        <bbva-list-bullet ambient="primary">
          <bbva-type-text
            text="${this.t("user-info-my-conversations-help-modal-bullet-extra-"+(t+1))}"
            size="S"
            font-weight="400"
            tag="span"
          ></bbva-type-text>
        </bbva-list-bullet>
      `);return e}render(){return u`
      ${this._helpModal} ${this._newConversationModal} ${this._searchModal} ${this._historyModal}
      ${this._attachFileModal} ${this._attachOnboarding} ${this._attachTypeModal}
      ${this._errorModal(this.errorTitle,this.errorBody,this.errorButton,this.modalErrorType)}
    `}}const fs=a((e=>class t extends e{static get properties(){return{}}static get is(){return"user-info-my-conversations-dm"}constructor(){super(),this._requiredToken="tsec",this._isDraft=!1,this._errorListConversationsCount=0,this._creatingConversation=!1,this._creatingMessage=!1,this._creatingUpdateMessage=!1,this._conversationSelectedId="",this._conversationStatus="",this._conversationSubject=""}get _renderConversationsApis(){return u`
          <bbva-global-conversations-api-dm
            .host=${this.host}
            .version=${this.conversationsApiVersion}
            .requiredToken=${this._requiredToken}
            @conversations-api-dm-fetch=${e=>this.successResponseListConversation(e.detail)}
            @conversations-api-dm-fetch-error=${()=>this._errorConverations()}
            @conversations-api-dm-create=${()=>this.createConversationSuccess()}
            @conversations-api-dm-create-error=${()=>this._serviceError("postConversations")}
          >
          </bbva-global-conversations-api-dm>
          <bbva-global-conversation-messages-api-dm
            .host="${this.host}"
            .version="${this.conversationsApiVersion}"
            .requiredToken="${this._requiredToken}"
            @conversation-messages-api-dm-fetch=${e=>this._successGetMessages(e)}
            @conversation-messages-api-dm-fetch-error=${()=>this._errorMessages()}
            @conversation-messages-api-dm-create=${()=>this.successUpdateMessage()}
            @conversation-messages-api-dm-create-error="${()=>this._serviceError("postMessage")}"
          >
          </bbva-global-conversation-messages-api-dm>
          <bbva-global-conversation-message-api-dm
            .host="${this.host}"
            .version="${this.conversationsApiVersion}"
            .requiredToken="${this._requiredToken}"
            @conversation-message-api-dm-update=${()=>this.successUpdateMessage()}
            @conversation-message-api-dm-update-error="${()=>this._serviceError("updateMessage")}"
          ></bbva-global-conversation-message-api-dm>
          <bbva-global-conversation-message-delete-message-api-dm
            .host="${this.host}"
            .version="${this.conversationsApiVersion}"
            .requiredToken="${this._requiredToken}"
            @conversation-message-delete-message-api-dm-create=${()=>this.successDeleteMessage()}
            @conversation-message-delete-message-api-dm-create-error="${()=>this._serviceError("deleteMessage")}"
          ></bbva-global-conversation-message-delete-message-api-dm>
          <bbva-global-conversation-delete-conversation-api-dm
            .host="${this.host}"
            .version="${this.conversationsApiVersion}"
            .requiredToken="${this._requiredToken}"
            @conversation-delete-conversation-api-dm-create=${()=>this.successDeleteConversation()}
            @conversation-delete-conversation-api-dm-create-error="${()=>this._serviceError("deleteConversation")}"
          >
          </bbva-global-conversation-delete-conversation-api-dm>
          <bbva-global-file-api-dm
            .host="${this.host}"
            .version="${this.fileApiVersion}"
            .requiredToken="${this._requiredToken}"
            @file-api-dm-create="${e=>this.uploadDocumentSuccess(e.detail)}"
            @file-api-dm-create-error="${()=>this._serviceError("uploadDocument")}"
          ></bbva-global-file-api-dm>
          <bbva-global-conversation-message-download-file-attachment-message-api-dm
            .host="${this.host}"
            .version="${this.conversationsApiVersion}"
            .requiredToken="${this._requiredToken}"
            @conversation-message-download-file-attachment-message-api-dm-fetch=${e=>this.downloadDocumentSuccess(e)}
            @conversation-message-download-file-attachment-message-api-dm-fetch-error="${()=>this._serviceError("downloadFile")}"
          >
          </bbva-global-conversation-message-download-file-attachment-message-api-dm>
          <bbva-global-crypto-documents-api-dm
            .version="${this.cryptoDocumentsApiVersion}"
            .requiredToken="${this._requiredToken}"
            .host="${this.host}"
            @crypto-documents-api-dm-create="${e=>this._cryptoDocumentsServiceSuccess(e.detail)}"
            @crypto-documents-api-dm-create-error="${()=>this._errorConverations()}"
          >
          </bbva-global-crypto-documents-api-dm>
          <bbva-global-business-agent-api-dm
            .host="${this.host}"
            .version="${this.businessAgentsApiVersion}"
            .requiredToken="${this._requiredToken}"
            @business-agent-api-dm-fetch="${e=>this.getAgentDataSuccess(e.detail)}"
            @business-agent-api-dm-fetch-error="${()=>this._errorConverations()}"
          >
          </bbva-global-business-agent-api-dm>
          <bbva-global-customers-api-dm
            .host="${this.host}"
            .version="${this.customerDataApiVersion}"
            .requiredToken="${this._requiredToken}"
            @customers-api-dm-fetch="${e=>this.getCustomerDataSuccess(e)}"
            @customers-api-dm-fetch-error="${()=>this._errorConverations()}"
          >
          </bbva-global-customers-api-dm>
        `}_initDataManager(){this.conversationsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-conversations-api-dm"]'),this.deleteConversationDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-conversation-delete-conversation-api-dm"]'),this.messagesDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-conversation-messages-api-dm"]'),this.messageDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-conversation-message-api-dm"]'),this.deleteMessageDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-conversation-message-delete-message-api-dm"]'),this.documentFileDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-file-api-dm"]'),this.downloadFileDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-conversation-message-download-file-attachment-message-api-dm"]'),this.cryptoDocumentsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-crypto-documents-api-dm"]'),this.bussinesAgentDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-business-agent-api-dm"]'),this.customerDataDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-customers-api-dm"]')}_getCustomerInfo(){var e,t,s,i,a,r;this.customerId=(null===(e=this.customer)||void 0===e?void 0:e.customerId)||(null===(t=this.customer)||void 0===t?void 0:t.id)||"",this.customerName=(null===(s=this.customer)||void 0===s?void 0:s.firstName)||"",this.customerLastName=(null===(i=this.customer)||void 0===i?void 0:i.lastName)||"";const n=(null===(a=this.customer)||void 0===a?void 0:a.identityDocuments)||[],[o]=n;if(this.customerDocumentNumber=(null==o?void 0:o.documentNumber)||"",this.customerDocumentType=(null==o||null===(r=o.documentType)||void 0===r?void 0:r.id)||"",this.receiverId){if(!this.encriptedCustomerId){if(!this.isEncryptedId)return void this.encryption(this.customerId,"customerId");this.encriptedCustomerId=this.customerId}if(!this.encriptedReceiverId){if(!this.isEncryptedId)return void this.encryption(this.receiverId,"receiverId");this.encriptedReceiverId=this.receiverId}this.receiverName||this.isEncryptedId?this.getConversationList():this._getAgentData()}else this.encryption(this.customerDocumentNumber,"customerDocumentNumber")}getCustomerData(){const e={"identityDocument.documentType.id":this.customerDocumentType,"identityDocument.documentNumber":this._encriptedCustomerDocumentNumber};this.customerDataDm.getCustomers(e)}getCustomerDataSuccess(e){if(e&&Array.isArray(e.detail)){const t=e.detail.find((e=>e.lastModification&&e.lastModification.businessAgent));if(t){const{lastModification:{businessAgent:e}={}}=t,[s,i]=e.fullName.split(" ");this.receiverId=e.id,this.receiverName=s,this.receiverLastName=i,this.encryption(this.customerId,"customerId")}}}encryption(e,t){this.encryptionValue=t;const s={stream:e,configurationParams:[{name:this.paramName,value:this.paramValue}],codecFormat:"PLAIN"};this.cryptoDocumentsDm.postCryptoDocuments(s)}_cryptoDocumentsServiceSuccess(e){switch(this.encryptionValue){case"customerDocumentNumber":this._encriptedCustomerDocumentNumber=e.document,this.getCustomerData();break;case"customerId":this.encriptedCustomerId=e.document,this.encryption(this.receiverId,"receiverId");break;case"receiverId":this.encriptedReceiverId=e.document,this.receiverName||this.isEncryptedId?this.getConversationList():this._getAgentData()}}getConversationList(e){this._lastDetail=e;const t={"customer.id":this.encriptedCustomerId,"receiver.id":this.encriptedReceiverId,paginationKey:this.paginationKey,pageSize:this.pageSize};this.conversationsDm.getConversations(t)}downloadDocumentSuccess(e){const t=e.currentTarget._lastResponseRaw,s=this.parseMultipartMessage(t),i={value:s.document,mimeType:s.contentType,title:s.filename,canShare:!0};this.dispatchCustomEvent("user-info-my-conversations-document-base64-open",i)}postConversations({detail:e}){this._lastDetail=e;const{customer:t,receiver:s,subject:i,message:a,businessAgent:r}=e;a.isDraft?(this._hasAttachments=a.attachments.length>0,a.attachments=[]):this._hasAttachments=!1;const n={customer:{id:this.encriptedCustomerId,name:t.name,lastName:t.lastName},receiver:{id:this.encriptedReceiverId,name:s.name,lastName:s.lastName},subject:i,message:{message:a.message,isDraft:!!a.isDraft,attachments:a.attachments},businessAgent:{id:this.encriptedReceiverId,name:r.name,lastName:r.lastName}};this._isDraft=!!a.isDraft,this.conversationsDm.postConversations(n)}getConversationMessages({detail:e}){this._lastDetail=e;const{id:t,status:s,subject:i}=e,a={"receiver.id":this.encriptedReceiverId,customerId:this.encriptedCustomerId,paginationKey:this.paginationKey,pageSize:this.pageSize};this._conversationSelectedId=t,this._conversationStatus=s,this._conversationSubject=i,this.messagesDm.getConversationMessages(t,a)}postMessage(e){this._lastDetail=e;const{message:t,attachments:s,isDraft:i}=e.detail,a={message:t,businessAgent:{id:this.encriptedReceiverId,name:this.receiverName,lastName:this.receiverLastName},customerId:this.encriptedCustomerId,isDraft:i,attachments:s};this._isDraft=i,i||(this._creatingMessage=!0),i&&(this._creatingUpdateMessage=!0),this.messagesDm.postConversationMessages(this._conversationSelectedId,a)}static _getLastEntryId(e){return e[0].id}successResponseListConversation(e){if(e&&e.length){if(this._conversationWithMessage=[],this._creatingConversation){this._creatingConversation=!1;const s={conversation:{id:t._getLastEntryId(e)},message:{id:"1"}};this.dispatchCustomEvent("user-info-my-conversations-conversation-boveda-create",s)}this._parseConversations(e)}else this._setConversations([]);this.dispatchCustomEvent("user-info-my-conversations-my-conversations-page-open",{conversations:e?`numero de conversaciones:${e.length.toString()}`:"numero de conversaciones:0"}),this.showDiscartedConversation&&this._showToast("success","user-info-my-conversations-toast-notification-discard-conversation")}_parseConversations(e){this._conversationWithMessage=e.map((e=>{let t="",s="",i="";const a=!(e.unreadMessages<=0);return e.isDraft&&(t="neutral",s=this.t("user-info-my-conversations-draft-status"),i="draft"),e.status.toLowerCase()===this.statusClose&&(t="success",s=this.t("user-info-my-conversations-resolved-status"),i="solve"),{id:e.id,subject:this.validateString(e.subject,20),message:this.validateString(e.updateConversationContext,30),date:e.lastUpdate,attached:e.hasAttachments,read:a,type:t,description:s,status:i}})),this._setConversations(this._conversationWithMessage)}_successGetMessages(e){this._checkWasReadMessages(e.detail);const s=t._getLastEntryId(e.detail);if(this._creatingMessage){const e={conversation:{id:this._conversationSelectedId},message:{id:s}};this.dispatchCustomEvent("user-info-my-conversations-message-boveda-create",e),this._creatingMessage=!1,this._setSpinner(!1),this.clearMessageInput()}if(this._creatingUpdateMessage&&!1===e.detail[0].isDraft){this._creatingUpdateMessage=!1;const e={conversation:{id:this._conversationSelectedId},message:{id:s}};this.dispatchCustomEvent("user-info-my-conversations-message-boveda-update",e),this.clearMessageInput()}this.openChatPage({conversations:[...e.detail],status:this._conversationStatus,subject:this._conversationSubject})}_checkWasReadMessages(e){e.filter((e=>e.senderType===this.senderType&&!e.wasRead&&!e.isDraft)).forEach((e=>{const t={detail:{messageId:e.id,wasRead:!0,attachments:e.attachments?e.attachments:[]}};e.attachments&&(t.detail.attachments=e.attachments),this.updateMessage(t)}))}createConversationSuccess(){this._isDraft?this._hasAttachments?this._showToast("success","user-info-my-conversations-toast-notification-create-draft-conversation-no-attachments"):this._showToast("success","user-info-my-conversations-toast-notification-create-draft-conversation"):(this._showToast("success","user-info-my-conversations-toast-notification-create-conversation"),this._creatingConversation=!0),this.getConversationList()}successUpdateMessage(){this._idDraftMessage="","draft"===this._conversationStatus&&(this._conversationStatus="");const e={id:this._conversationSelectedId,status:this._conversationStatus,subject:this._conversationSubject};this._isDraft?(this.clearMessageInput(),this.getConversationList()):this.getConversationMessages({detail:e}),"attach"===this._modalOpenId&&(this._closeModal("attach"),this._setSpinner(!1))}updateMessage({detail:e}){this._lastDetail=e;const{messageId:t,message:s,isDraft:i=!1,wasRead:a,attachments:r}=e;if(a&&!r)return void this.messageDm.patchConversationMessage(this._conversationSelectedId,t,{wasRead:a});const n={businessAgent:{id:this.encriptedReceiverId},customerId:this.encriptedCustomerId,isDraft:i,...r&&{attachments:r},...s&&{message:s}};s&&(n.message=s),a&&(n.wasRead=a,delete n.isDraft),r&&(n.attachments=r),i||(this._creatingUpdateMessage=!0),this._isDraft=i,this.messageDm.patchConversationMessage(this._conversationSelectedId,t,n)}successDeleteMessage(){this.getConversationList()}deleteMessage({detail:e}){this._lastDetail=e;const{messageId:t,showDiscartedConversation:s}=e;this.showDiscartedConversation=s;const i={businessAgent:{id:this.encriptedReceiverId},customer:{id:this.encriptedCustomerId}};this.deleteMessageDm.postConversationMessageDeleteMessage(this._conversationSelectedId,t,i)}deleteConversation(e){this._lastDetail=e;const{id:t}=e.detail,s={businessAgent:{id:this.encriptedReceiverId},customer:{id:this.encriptedCustomerId}};this.deleteConversationDm.postConversationDeleteConversation(t,s)}successDeleteConversation(){this._showToast("success","user-info-my-conversations-toast-notification-delete-conversation"),this.getConversationList()}uploadDocument({detail:e}){this._lastDetail=e,this.documentFileDm.headers={Accept:"*/*","Content-Type":"multipart/form-data"},this.documentFileDm.postFile(e)}uploadDocumentSuccess(e){const{fileId:t}=e;this.includeFileToAttach(t)}downloadFile({detail:e}){this._lastDetail=e;const{url:t}=e,s=t.split("_"),i=s[0],a=s[1],r={documentId:t};this.downloadFileDm.headers={Accept:"*/*"},this.downloadFileDm.postConversationMessageDownloadFileAttachmentMessage(i,a,r)}_getAgentData(){this.bussinesAgentDm.getBusinessAgent(this.receiverId)}getAgentDataSuccess(e={}){const{firstName:t,lastName:s}=e;this.receiverName=t,this.receiverLastName=s,this.getConversationList()}getAgentDataError(){this.getConversationList()}}));var Ss=r`
:host {
  display: block;
  box-sizing: border-box;
  overflow: hidden;
  --bbva-help-modal-padding: 0;
}
`,Cs=r`
[data-tag-name=bbva-help-modal] {
  z-index: 99;
  --bbva-help-modal-second-modal-z-index: 99;
}
`;class Es extends(n(os($(A(o(t)))))){static get is(){return"user-info-my-conversations-faqs"}static get scopedElements(){const e=[F,Fe];return Es.scopedElementsFromClasses(e)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},contentFragmentPath:{type:String,attribute:"content-fragment-path"},visible:{type:Boolean},_avoidIconCloseModal:{type:Boolean},_closeModalIndex:{type:Array}}}constructor(){super(),this.visible=!1,this.aemHost="",this.contentFragmentPath="",this._avoidIconCloseModal=!1,this._closeModalIndex=[]}static get styles(){return[Ss,Cs,l("user-info-my-conversations-faqs")]}_handleFaqClick(e){var t,s;const i=null==e?void 0:e.type,a=null==e||null===(t=e.target)||void 0===t||null===(s=t.dataset)||void 0===s?void 0:s.tagName;this.iOSFixedHeader&&("help-faqs-aem-detail-show"===i?(this._avoidIconCloseModal=!0,this._closeModalIndex=[]):"help-modal-header-click"===i&&"help-faqs-aem"===a&&(this._avoidIconCloseModal=!1,this._closeModalIndex=[0])),"help-modal-header-click"===i&&"bbva-help-modal"===a&&this.dispatchCustomEvent("user-info-my-conversations-faqs-close")}get _renderFaqs(){return u`
      <help-faqs-aem
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        host="${this.aemHost}"
        hide-footer
        ?native=${this.native}
        header-text="${this.t("user-info-my-conversations-faqs-title")}"
        content-fragment-path=${this.contentFragmentPath}
        faqs-message-text="${this.t("user-info-my-conversations-faqs-message-text")}"
        @visible-changed=${e=>e.stopPropagation()}
        @hide-loader=${e=>e.stopPropagation()}
        @help-faqs-aem-detail-show="${e=>this._handleFaqClick(e)}"
      >
      </help-faqs-aem>
    `}render(){return u`
      <bbva-help-modal
        id="faqsModal"
        .contentStyles=${Cs}
        .headerText="${this.t("user-info-my-conversations-faqs-title")}"
        aria-label="${this.t("user-info-my-conversations-faqs-title")}"
        .headerCloseIconAriaLabel="${this.t("user-info-my-conversations-faqs-accessibility-close-button")}"
        hide-content-padding-top
        full-height
        ?visible="${this.visible}"
        attach-to-body
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        .closeModalIndex=${this._closeModalIndex}
        .avoidIconCloseModal=${this._avoidIconCloseModal}
        @help-modal-header-click="${e=>this._handleFaqClick(e)}"
      >
        <div slot="slot-content">${this._renderFaqs}</div>
      </bbva-help-modal>
    `}}class ws extends(n(os(fs(A($(o(t))))))){static get is(){return"user-info-my-conversations"}static get scopedElements(){const e=[ls,ms,ae,ys,re,Ke,Je,We,Xe,Ye,fe,Qe,mt,xt,Es,Qt,F,...ws.configurationScopedElements()];return ws.scopedElementsFromClasses(e)}static get properties(){return{pageSize:{type:Number,attribute:"page-size"},paginationKey:{type:Number,attribute:"pagination-key"},showAdvice:{type:Boolean,attribute:"show-advice"},bulletExtra:{type:Number,attribute:"bullet-extra"},onboardingBold:{type:Boolean,attribute:"onboarding-bold"},allowAttachments:{type:Boolean,attribute:"allow-attachments"},allowCamera:{type:Boolean,attribute:"allow-camera"},customerId:{type:String,attribute:"customer-id"},customerName:{type:String,attribute:"customer-name"},customerLastName:{type:String,attribute:"customer-last-name"},customerDocumentNumber:{type:String,attribute:"customer-document-number"},customerDocumentType:{type:String,attribute:"customer-document-type"},receiverId:{type:String,attribute:"receiver-id"},receiverName:{type:String,attribute:"receiver-name"},receiverLastName:{type:String,attribute:"receiver-last-name"},aemHost:{type:String,attribute:"aem-host"},aemContentFragmentPath:{type:String,attribute:"aem-content-fragment-path"},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},showSidebarIcon:{type:Boolean,attribute:"show-sidebar-icon"},paramName:{type:String,attribute:"param-name"},paramValue:{type:String,attribute:"param-value"},customer:{type:Object},_conversations:{type:Array},_conversationWithMessage:{type:Array},_firstAttach:{type:Boolean},_requiredToken:{type:String},_showHistory:{type:Boolean},_conversationSelectedId:{type:String},_faqsVisible:{type:Boolean},maxAmountDocuments:{type:Number,attribute:"max-amount-documents"},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"},conversationsApiVersion:{type:Number,atribute:"conversations-api-version"},cryptoDocumentsApiVersion:{type:Number,atribute:"crypto-documents-api-version"},fileApiVersion:{type:Number,atribute:"file-api-version"},_errorTitle:{type:String},_errorBody:{type:String},_errorButton:{type:String},businessAgentsApiVersion:{type:Number,atribute:"business-agents-api-version"},customerDataApiVersion:{type:Number,atribute:"customer-data-api-version"},senderType:{type:String,atribute:"sender-type"},statusClose:{type:String,atribute:"status-close"},_modalSearchVisible:{type:Boolean},_messageData:{type:Object},_modalOpenId:{type:String},_modalCloseId:{type:String},_includeFileToAttachId:{type:String},_messageInput:{type:String},fileToInclude:{type:Object,atribute:"file-to-include"},_errorService:{type:Boolean},_countError:{type:Number},_errorListConversationsCount:{type:Number},_errorListMessagesCount:{type:Number},_lastCall:{type:String},_notificationDuration:{type:Number},isEncryptedId:{type:Boolean,attribute:"is-encrypted-id"},_idDraftMessage:{type:String},maxFileSize:{type:Number,attribute:"max-file-size"},allowExtensions:{type:Array,attribute:"allow-extensions"},_visibleChatPage:{type:Boolean},_resetData:{type:Boolean},showSecondMessage:{type:Boolean,attribute:"show-second-message"},_creatingMessageAttach:{type:Boolean}}}constructor(){super(),this.allowAttachments=!1,this.allowCamera=!1,this._conversations=[],this._conversationWithMessage=[],this.firstOnboarding=!1,this.pageSize=9999,this.paginationKey=0,this.showHelpFaqs=!1,this._showHistory=!1,this.showSidebarIcon=!1,this._showSpinner=!1,this._firstAttach=!0,this._faqsVisible=!1,this._messageData={},this.showAdvice=!1,this.bulletExtra=0,this.onboardingBold=!1,this._modalOpenId="",this._modalCloseId="",this._includeFileToAttachId="",this._messageInput="",this.fileToInclude={},this.aemContentFragmentPath="",this.aemHost="",this.maxAmountDocuments=3,this.maxRequestAttempts=3,this.senderType="M",this.statusClose="c",this._modalSearchVisible=!1,this._errorBody=this.t("user-info-my-conversations-error-operative-body"),this._errorTitle=this.t("user-info-my-conversations-error-operative-title"),this._errorButton=this.t("user-info-my-conversations-full-modal-error-button"),this._lastCall="",this._idDraftMessage="",this._errorService=!1,this._countError=0,this._errorListConversationsCount=0,this._errorListMessagesCount=0,this._notificationDuration=5e3,this.conversationsApiVersion=0,this.cryptoDocumentsApiVersion=0,this.fileApiVersion=0,this.businessAgentsApiVersion=1,this.customerDataApiVersion=1,this.isEncryptedId=!1,this.iOSFixedHeader=!1,this.maxFileSize=3,this.allowExtensions=["image","document","video","audio"],this._visibleChatPage=!1,this._resetData=!1,this.showSecondMessage=!1,this._creatingMessageAttach=!1}updated(e){e.has("_visibleChatPage")&&this.classList.toggle("overflow-hidden",this._visibleChatPage)}initMyConversations(){this._setSpinner(!0),this._getCustomerInfo()}firstUpdated(){this._setSpinner(!0),this._initDataManager(),this._initMessageManager()}_reset(){this._resetData=!0}static get styles(){return[ps,gs,ne.primary,l("user-info-my-conversations-shared-styles")]}get _notification(){return u`
      <bbva-notification-container id="notificationContainer" class="toast" fixed-bottom>
      </bbva-notification-container>
    `}get _error(){return u`
      <bbva-help-modal
        modal-type="warning"
        header-close-icon-aria-label="${this.t("user-info-my-conversations-close")}"
        header-text="${this._errorTitle}"
        title-icon="${E()}"
        body-text="${this.t(this._errorBody)}"
        button-text="${this._errorButton}"
        ?visible="${this._errorService}"
        @help-modal-footer-button-click="${this._errorServiceButtonClick}"
        @help-modal-header-click="${()=>(this._errorService=!1,this._countError=0)}"
      >
      </bbva-help-modal>
    `}async _showToast(e,t,s){this.showNotify(this.t(t),s,e,this._notificationDuration),await this.sleep(this._notificationDuration),this.clearNotify()}render(){return u`
      <bbva-progress-content
        variant="transparent"
        class="spinner"
        ambient="primary"
        ?visible="${this._showSpinner}"
      ></bbva-progress-content>
      ${this._renderConversationsApis}
      <user-info-my-conversations-list
        class="conversation-list"
        .conversations=${this._conversations}
        ?show-help-faqs=${this.showHelpFaqs}
        ?show-sidebar-icon=${this.showSidebarIcon}
        ?show-history=${this._showHistory}
        ?can-not-retry-get-conversations=${this._canNotRetryGetConversations}
        ?error-list-conversations=${this._errorListConversations}
        ?reset-swipe=${this._resetData}
        @user-info-my-conversations-get-conversations-retry="${()=>this.initMyConversations()}"
        @user-info-my-conversations-conversation-selected-open=${this.getConversationMessages}
        @button-row-item-click=${this._buttonRowItemClick}
        @user-info-my-conversations-delete-conversation-button-press=${this.deleteConversation}
        @user-info-my-conversations-show-faqs-click=${this._handleFaqsEvent}
        @user-info-my-conversations-swipe-element-open=${this._handleSwipeOpen}
        @user-info-my-conversations-header-back-click=${this.manageBackNavigation}
      ></user-info-my-conversations-list>
      <user-info-my-conversations-chat
        class="conversation-chat"
        ?first-attach=${this._firstAttach}
        ?allow-attachments=${this.allowAttachments}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?show-second-message=${this.showSecondMessage}
        .messageData="${this._messageData}"
        chat-form-message="${this._messageInput}"
        ?error-list-messages="${this._errorListMessages}"
        ?can-not-retry-get-messages=${this._canNotRetryGetMessages}
        id-draft-message="${this._idDraftMessage}"
        ?visible-chat-page="${this._visibleChatPage}"
        @user-info-my-conversations-get-messages-retry="${()=>this.getConversationMessages(this._getLastDetail())}"
        @user-info-my-conversations-modal-open=${this._openModal}
        @user-info-my-conversations-chat-chat-form-update="${this.setAttachMessageDraft}"
        @user-info-my-conversations-message-draft-id-set="${this.setMessageDraftId}"
        @user-info-my-conversations-message-update=${this.updateMessage}
        @user-info-my-conversations-message-delete=${this.deleteMessage}
        @user-info-my-conversations-message-post=${this.postMessage}
        @user-info-my-conversations-chat-page-close="${this._chatPageClose}"
        @user-info-my-conversations-file-download=${this.downloadFile}
        @user-info-my-conversations-chat-form-clear="${this.clearMessageInput}"
        @user-info-my-conversations-chat-page-visible-change="${this._setBackViewChat}"
      ></user-info-my-conversations-chat>
      <user-info-my-conversations-modals
        ?first-attach=${this._firstAttach}
        ?allow-attachments=${this.allowAttachments}
        ?allow-camera=${this.allowCamera}
        ?show-help-modal="${this.firstOnboarding}"
        ?show-search-modal=${this._modalSearchVisible}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        .customerId=${this.customerId}
        .customerName=${this.customerName}
        .customerLastName=${this.customerLastName}
        .receiverId=${this.receiverId}
        .receiverName=${this.receiverName}
        .maxFileSize=${this.maxFileSize}
        ?show-advice=${this.showAdvice}
        .allowExtensions=${this.allowExtensions}
        .bulletExtra=${this.bulletExtra}
        ?onboarding-bold=${this.onboardingBold}
        .receiverLastName=${this.receiverLastName}
        .conversations=${this._conversations}
        .maxAmountDocuments=${this.maxAmountDocuments}
        modal-open-id="${this._modalOpenId}"
        modal-close-id="${this._modalCloseId}"
        include-file-to-attach-id="${this._includeFileToAttachId}"
        attached-message="${this._messageInput}"
        .fileToIncludeRaw="${this.fileToInclude}"
        id-draft-message="${this._idDraftMessage}"
        @user-info-my-conversations-conversation-selected-open=${this.getConversationMessages}
        @user-info-my-conversations-delete-conversation-button-press=${this.deleteConversation}
        @user-info-my-conversations-document-upload="${e=>this._uploadDocument(e)}"
        @user-info-my-conversations-conversation-post=${this.postConversations}
        @user-info-my-conversations-message-post=${this.postMessage}
        @user-info-my-conversations-message-update=${this.updateMessage}
        @user-info-my-conversations-attach-modal-spinner="${this._attachModalSpinner}"
        @user-info-my-conversations-chat-form-clear="${this.clearMessageInput}"
        @user-info-my-conversations-set-draft-attach=${this.setAttachMessageDraft}
        @user-info-my-conversations-modal-close="${this._resetModalData}"
        @user-info-my-conversations-success-file-upload="${this._handleSuccessFileUpload}"
        @user-info-my-conversations-modal-open=${this._openModal}
      ></user-info-my-conversations-modals>
      <user-info-my-conversations-faqs
        ?native=${this.native}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible=${this._faqsVisible}
        @user-info-my-conversations-faqs-close="${this._faqsClose}"
        @user-info-my-conversations-faqs-detail-visible=${({detail:e})=>{this._faqsDetailVisible=e}}
        aem-host="${this.aemHost}"
        content-fragment-path="${this.aemContentFragmentPath}"
      >
      </user-info-my-conversations-faqs>
      ${this._notification} ${this._error}
    `}_faqsClose(){this._reset(),this._faqsVisible=!1}_handleSwipeOpen(){this._resetData=!1}_chatPageClose(){this.getConversationList(),this._messageData={},this.clearMessageInput()}_resetModalData({detail:e={}}){this._reset();const{showNewModal:t,showAttachModal:s}=e;this._modalOpenId=t?"new":s?"attach":"",this._modalCloseId=""}_setConversations(e){this._errorListConversations=!1,this._errorListConversationsCount=0,this._conversations=e||[],this._setSpinner(!1),this.requestUpdate()}_errorConverations(){this._errorListConversationsCount++,this._canNotRetryGetConversations=this._errorListConversationsCount>this.maxRequestAttempts,this._errorListConversations=!0,this._setSpinner(!1),this.requestUpdate(),this.dispatchCustomEvent("user-info-my-conversations-error-list-modal-open")}_errorMessages(){this.openChatPage({error:!0}),this._errorListMessagesCount++,this._canNotRetryGetMessages=this._errorListMessagesCount>this.maxRequestAttempts,this._errorListMessages=!0,this._setSpinner(!1),this.requestUpdate(),this.dispatchCustomEvent("user-info-my-conversations-error-list-messages-open")}_serviceError(e){this._lastCall=e,this._countError++,this._canNotRetryError=this._countError>this.maxRequestAttempts,this._canNotRetryError?(this._errorButton="",this._errorBody=this.t("user-info-my-conversations-error-operative-body-no-retry"),this._countError=0):this._errorButton=this.t("user-info-my-conversations-full-modal-error-button"),this._errorService=!0,this._creatingMessageAttach&&(this._creatingMessageAttach=!1,this._openModal("attach"),this._setSpinner(!1)),this.dispatchCustomEvent("user-info-my-conversations-error-service")}_errorServiceButtonClick(){if(!this._canNotRetryError){const e=this._getLastDetail();this[this._lastCall](e),this.dispatchCustomEvent("user-info-my-conversations-error-retry")}this._errorService=!1}_getLastDetail(){let e={};return this._lastDetail&&!("detail"in this._lastDetail)?e.detail=this._lastDetail:e=this._lastDetail,e}openChatPage(e){this._messageData=e,this._modalSearchVisible=!1}_initMessageManager(){this.firstOnboarding?this._closeModal("help"):this.dispatchCustomEvent("user-info-my-conversations-native-local-storage-get",{key:"my_conversation_onboarding"})}_setSpinner(e){this._showSpinner=e}getOnboardingInformation(e){if(null===e||999===e.code||e.onboarding){this._setOnBoardingStorage();const e={key:"my_conversation_onboarding",value:{onboarding:!1}};this.dispatchCustomEvent("user-info-my-conversations-native-local-storage-set",e),this.firstOnboarding=!0,this.dispatchCustomEvent("user-info-my-conversations-welcome-onboarding-modal-open"),this.requestUpdate()}else this._closeModal("help"),this.requestUpdate()}_setOnBoardingStorage(){this.dispatchCustomEvent("user-info-my-conversations-native-local-storage-set",{key:"my_conversation_onboarding",value:{onboarding:!1}})}getAttachInformation(e){this._firstAttach=!1,this.requestUpdate(),(null===e||999===e.code||e.attach)&&(this._setLocalStorageAttach(),this._openModal("attachOnBoarding"),this.dispatchCustomEvent("user-info-my-conversations-attach-onboarding-modal-open"))}_setLocalStorageAttach(){this.dispatchCustomEvent("user-info-my-conversations-native-local-storage-set",{key:"my_conversation_attach",value:{attach:!1}})}includeFileToAttach(e){this.fileToInclude={},this._includeFileToAttachId=e}_handleSuccessFileUpload(){this._includeFileToAttachId="",this.fileToInclude={}}_uploadDocument(e){this.fileToInclude={},this.uploadDocument(e)}_openModal(e){this._modalOpenId=e.detail||e}_closeModal(e){this._modalCloseId=e.detail||e}_buttonRowItemClick(e){this._openModal(e.srcElement.options[e.detail].id)}setAttachMessageDraft({detail:e}){this._messageInput=e}setMessageDraftId({detail:e}){this._idDraftMessage=e}clearMessageInput(){this._messageInput=""}_handleFaqsEvent(){this._faqsVisible=!0}handleCheckStateCameraPermissions(e={}){const{state:t}=e;({granted:()=>this.openCamera(),denied:()=>this._requestNativeCameraPermissions(),permanently_denied:()=>this._requestNativeCameraPermissions()})[t||"denied"]()}openCamera(){this.dispatchCustomEvent("user-info-my-conversations-gallery-open",{source:"camera",scaleType:"maxWeight",scaleRate:1,showMetadata:!0})}_requestNativeCameraPermissions(){this.dispatchCustomEvent("user-info-my-conversations-grant-mobile-permission","camera")}_attachModalSpinner(){this._setSpinner(!0),this._creatingMessageAttach=!0,this.requestUpdate()}manageBackNavigation(){this._reset(),""!==this._modalOpenId?this._closeModal(this._modalOpenId):this._visibleChatPage?this._visibleChatPage=!1:this._faqsVisible?this._faqsVisible=!1:this.dispatchCustomEvent("user-info-my-conversations-step-assistance-center-back")}_setBackViewChat({detail:e}){this._reset(),this._visibleChatPage=e}}customElements.define(ws.is,ws);
