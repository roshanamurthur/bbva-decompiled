import{z as e,an as t,L as i,ak as s,h as n,cy as a,bm as r,bn as o,bF as c,cz as l,aV as d,J as u,aZ as h,a7 as p,dC as g,a as m,i as b,b as _,a8 as y,aY as v,dJ as f,dp as S}from"./952f98a9.js";import{v as T,G as R,K as E,af as q,N as x,D as A,ae as P,R as C,S as $,f as I,H as w,V as k,z as D,M as O,L as N,h as F,Q as B,ah as H}from"./216055dc.js";import{aI as M,aH as j}from"./7f3d7ca9.js";import{b as L,B as z}from"./30ef6f1f.js";import{B as V,a as U}from"./4eb8d874.js";import{B as G}from"./40b41b3c.js";import{B as W}from"./62b11973.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./854beed0.js";import"./84dff06e.js";var K=e`
:host {
  position: relative;
  display: block;
  width: 100%;
  height: 100%;
  box-sizing: border-box;
}

.panel-info {
  padding: 1rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

[data-tag-name=bbva-banner-image] {
  padding: 0;
}

.action-area {
  position: absolute;
  z-index: 0;
  top: 0;
  left: 0;
  display: flex;
  width: 100%;
  height: 100%;
  justify-content: space-between;
}
.action-area .back-area {
  flex: 0 0 49%;
}
.action-area .next-area {
  flex: 0 0 49%;
}

:host ::slotted([slot=interactive-area]) {
  margin: var(--bbva-help-onboarding-interactive-area-margin, 0 0 0 1rem);
}
`;class X extends(T(t(i))){static get is(){return"bbva-help-onboarding-slide"}static get scopedElements(){return{"bbva-type-text":R,"bbva-clip-microillustration":E,"bbva-banner-image":q}}static get properties(){return{microillustration:{type:String},bannerImage:{type:String,attribute:"banner-image"},imgSize:{type:String,attribute:"img-size"},imgLabel:{type:String,attribute:"img-label"},bgImage:{type:String,attribute:"bg-image"},slideTitle:{type:String,attribute:"slide-title"},description:{type:String},loading:{type:Boolean}}}constructor(){super(),this.ambient="secondary",this.slideTitle="",this.description="",this.loading=!1,this.imgLabel="",this.imgSize="M"}static get styles(){return[K,x.secondary,A.secondary,P.secondary,s("bbva-help-onboarding-shared-styles")]}firstUpdated(){this._contentInteractiveSlot=this.shadowRoot.querySelector('slot[name="interactive-area"]').assignedElements({flatten:!0}),this._content=this.shadowRoot.querySelector(".content");const e=this.shadowRoot.querySelector(".next-area"),t=this.shadowRoot.querySelector(".back-area");e.addEventListener("touchend",(()=>{this._changeSlideEvent("next")})),t.addEventListener("touchend",(()=>{this._changeSlideEvent("back")}))}_changeSlideEvent(e){this.dispatchEvent(new CustomEvent(`help-onboarding-slide-${e}-tap`,{detail:this._currentSlide,bubbles:!0,composed:!0}))}render(){var e,t;return n`
      <div
        class="action-area"
        style="height:${null!==(e=this._contentInteractiveSlot)&&void 0!==e&&e.length?`${null===(t=this._content)||void 0===t?void 0:t.offsetHeight}px`:"100%"}"
      >
        <div class="back-area"></div>
        <div class="next-area"></div>
      </div>
      <div class="content">
        ${this.bannerImage&&!this.microillustration?n`<bbva-banner-image
              ?loading="${this.loading}"
              size="${this.imgSize}"
              image-src="${this.bannerImage}"
              img-accessibility-text="${this.t(this.imgLabel)}"
            >
            </bbva-banner-image>`:""}
        <div class="panel-info">
          ${this.microillustration?n`<bbva-clip-microillustration
                ?loading="${this.loading}"
                class="panel-image"
                microillustration="${this.microillustration}"
                size="M"
              ></bbva-clip-microillustration>`:""}
          ${this.slideTitle?n`<bbva-type-text
                ?loading="${this.loading}"
                class="panel-title"
                tag="h2"
                size="3XL"
                font-weight="bold"
                unset
                text=${this.slideTitle}
              ></bbva-type-text>`:""}
          ${this.description?n`<bbva-type-text
                ?loading="${this.loading}"
                size="S"
                tag="p"
                class="panel-info-description"
                text=${this.description}
              ></bbva-type-text>`:""}

          <slot name="slide-slot"></slot>
        </div>
      </div>
      <slot name="interactive-area"></slot>
    `}}var J=e`
:host {
  --_bbva-help-onboarding-bg-color:
      var(--bbva-help-onboarding--custom--secondary-ambient--bg-color,
      ${C("colorSecondarySurfaceAmbientDefault",$)});
  --_bbva-help-onboarding-uncomplete-step-color:
      var(--bbva-help-onboarding--custom--secondary-ambient--uncomplete-step-color,
      ${C("colorSecondarySurfaceAmbientPreloading",$)});
  --_bbva-help-onboarding-complete-step-color:
      var(--bbva-help-onboarding--custom--secondary-ambient--complete-step-color,
      ${C("colorSecondarySelectionInteraction01BackgroundSelected",$)});
}
`,Q=e`
:host {
  display: flex;
  overflow: hidden;
  width: 100%;
  height: 100vh;
  box-sizing: border-box;
  flex-direction: column;
  justify-content: space-between;
}

:host(:not([_hasBgImage])) {
  background-color: var(--_bbva-help-onboarding-bg-color);
}

:host([_hasBgImage]) {
  background-color: var(--_bbva-help-onboarding-bg-color);
  background-position: center;
  background-size: cover;
}

:host(:not([visible])) {
  display: none;
}

:host([hidden]),
[hidden] {
  display: none !important;
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
*,
*::before,
*::after {
  box-sizing: inherit;
}

.controls {
  display: flex;
  width: 100%;
  flex-direction: row;
  justify-content: space-between;
  padding: 0.25rem;
}

.carousel-items {
  display: flex;
  height: 100%;
  transform: translateX(0%);
  transition: transform 0.45s ease 0s;
}

.carousel-item {
  overflow: hidden;
  height: 100%;
  flex: 1 0 100%;
  margin-right: 1rem;
}

.footer {
  display: flex;
  flex-direction: column;
  padding: 1.5rem 1rem;
}
.footer [data-tag-name=bbva-type-link] {
  align-self: center;
}
.footer [data-tag-name=bbva-type-link]:first-child {
  margin-bottom: 1.5rem;
}

.action-buttons {
  display: flex;
  justify-content: center;
  padding-bottom: 1.5rem;
}
.action-buttons :nth-child(2) {
  margin-left: 1rem;
}

ul {
  display: flex;
  overflow: hidden;
  width: 100%;
  padding: 0;
  margin-top: 0;
  margin-bottom: 0;
  margin-left: 0;
  list-style: none;
}

li {
  position: relative;
  display: flex;
  height: 0.125rem;
  justify-content: center;
  margin: 0.125rem;
  background-color: var(--_bbva-help-onboarding-uncomplete-step-color);
  text-align: center;
}

.progress {
  position: absolute;
  left: 0;
  width: 0;
  height: 0.125rem;
  background: var(--_bbva-help-onboarding-complete-step-color);
}

.actions-area {
  position: absolute;
  z-index: 0;
  width: 100%;
  height: 100%;
}
.actions-area .action {
  width: 50%;
  height: 100%;
  float: left;
}
`;let Y;class Z extends(T(t(i))){static get is(){return"bbva-help-onboarding"}static get scopedElements(){return{"bbva-type-text":R,"bbva-button-default":I,"bbva-type-link":w,"bbva-help-onboarding-slide":X}}static get properties(){return{secondaryButtonText:{type:String,attribute:"secondary-button-text"},primaryButtonText:{type:String,attribute:"primary-button-text",reflect:!0},linkTextTop:{type:String,attribute:"link-text-top"},linkText:{type:String,attribute:"link-text"},visible:{type:Boolean,reflect:!0},playing:{type:Boolean,reflect:!0},playingDelay:{type:Number,attribute:"playing-delay"},loading:{type:Boolean},loop:{type:Boolean},currentSlide:{type:Number,attribute:"current-slide"},_hasBgImage:{type:Boolean},_slides:{type:Array},_numSlides:{typeof:Number},_progress:{type:Array}}}constructor(){super(),this.ambient="secondary",this.currentSlide=0,this.loading=!1,this.visible=!1,this.playing=!1,this.playingDelay=3,this.loop=!1,this._play=a(),this._back=r(),this._next=o(),this._close=c(),this._progress=[],this._paused=!1,this._numButtons=0,this._numSlides=0}static get styles(){return[J,Q,k.secondary,A.secondary,D.secondary,s("bbva-help-onboarding-shared-styles")]}async firstUpdated(){super.firstUpdated&&super.firstUpdated(),await this.updateComplete,this._slides=[...this.querySelectorAll('[data-tag-name="bbva-help-onboarding-slide"]')],this._numSlides=this._slides.length,this._isBgWithImage(),this._controlProgress(),this.playing&&this._playState(),this.addEventListener("help-onboarding-slide-next-tap",this._nextSlide),this.addEventListener("help-onboarding-slide-back-tap",this._backSlide)}updated(e){if(super.updated(e),e.has(this._numSlides)&&(this._slides=[...this.querySelectorAll('[data-tag-name="bbva-help-onboarding-slide"]')]),(e.has("primaryButtonText")||e.has("secondaryButtonText"))&&(this._numButtons=0,this.secondaryButtonText&&(this._numButtons+=1),this.primaryButtonText&&(this._numButtons+=1),this.requestUpdate()),e.has("visible")){let e="close";this.visible&&(e="open"),this.dispatchEvent(new CustomEvent(`help-onboarding-${e}`,{detail:{status:e},bubbles:!0,composed:!0}))}e.has("currentSlide")&&this._animationCarousel()}_animationCarousel(){this.shadowRoot.querySelector(".carousel-items").setAttribute("style",`transform: translateX(calc(-${this.currentSlide}00% - ${16*this.currentSlide}px));`)}_disabledButton(e,t=!0){const i=this.shadowRoot.querySelector(`.${e}`);i&&(t?i.setAttribute("disabled",!0):i.removeAttribute("disabled"))}_isBgWithImage(){const e=this._slides[this.currentSlide].bgImage;e?(this._hasBgImage=!0,this._setBgImage(e)):this._hasBgImage=!1}_setBgImage(e){this.style.backgroundImage=`linear-gradient(to bottom, rgba(0, 68, 129, 0.8), rgba(0, 68, 129, 0.8)), url(${e})`}_controlProgress(){if(this._updateProgress(),this.currentSlide<this._progress.length&&this.playing){const e=this._progress[this.currentSlide];let t=0!==e?1e3*this.playingDelay*e/100:1;const i=10;Y=setInterval((()=>{const e=100*t/(1e3*this.playingDelay);t+=i;const s=this._progress;s[this.currentSlide]=e,this._progress=[...s],e>=100?(this.currentSlide!==this._progress.length-1?(this.currentSlide+=1,this._changeSlideEvent("next")):this.loop?this._nextSlide():(this._togglePlay(),this._disabledButton("next")),clearInterval(Y),this._controlProgress()):this._animationCarousel()}),i)}this._isBgWithImage()}_updateProgress(){(0===this._progress.length||0===this.currentSlide&&0===this._progress[0]||this._initialize)&&(this._progress=new Array(this._slides.length).fill(0),this.loop||this._disabledButton("back"),this._initialize=!1),this.currentSlide<=this._progress.length-1&&(this._progress[this.currentSlide]>0&&this._progress[this.currentSlide]<100?0!==this.currentSlide?this._progress=this._progress.fill(100,0,this.currentSlide-1).fill(0,this.currentSlide+1,this._progress.length):this._progress=this._progress.fill(0,this.currentSlide+1,this._progress.length):this.playing?this.currentSlide!==this._progress.length-1?this._progress=this._progress.fill(100,0,this.currentSlide).fill(0,this.currentSlide,this._progress.length):this._progress=this._progress.fill(100,0,this.currentSlide):this._progress=this._progress.fill(100,0,this.currentSlide+1).fill(0,this.currentSlide+1,this._progress.length))}_playState(){var e,t;this._play=l(),this._paused=!1,null===(e=this.shadowRoot)||void 0===e||null===(t=e.querySelector(".play"))||void 0===t||t.setAttribute("aria-label",this.t("bbva-help-onboarding-automatic-pause"))}_togglePlay(){this.playing=!this.playing;let e="play";this.playing?(this._playState(),this.currentSlide===this._numSlides-1&&this._progress[this.currentSlide]>=100&&(this._initialize=!0,this.currentSlide=0)):(clearInterval(Y),this._play=a(),e="pause",this._paused=!0,this.shadowRoot.querySelector(".play").setAttribute("aria-label",this.t("bbva-help-onboarding-automatic-play"))),this._controlProgress(),this.dispatchEvent(new CustomEvent(`help-onboarding-${e}`,{detail:{status:e,currentSlide:this.currentSlide},bubbles:!0,composed:!0}))}_nextSlide(){clearInterval(Y),this._progress[this.currentSlide]=100,this.currentSlide=(this.currentSlide+1)%this._numSlides,this._initialize=0===this.currentSlide&&this.loop,this._initialize||this.currentSlide!==this._numSlides-1||this.loop?this._disabledButton("next",!1):this._disabledButton("next"),this._controlProgress(),this._changeSlideEvent("next")}_changeSlideEvent(e){this.dispatchEvent(new CustomEvent(`help-onboarding-slide-${e}`,{detail:this.currentSlide,bubbles:!0,composed:!0}))}_backSlide(){clearInterval(Y),this._progress[this.currentSlide]=0,this.currentSlide=this.currentSlide-1<0?this._numSlides-1:this.currentSlide-1,this._initialize=0===this.currentSlide,this._initialize&&!this.loop?this._disabledButton("back"):this._disabledButton("back",!1),this._isBgWithImage(),this._controlProgress(),this._changeSlideEvent("back")}_closeClick(){this.visible=!1,this.dispatchEvent(new CustomEvent("help-onboarding-secondary-close-click",{detail:!0,bubbles:!0,composed:!0}))}_secondaryButtonClick(){this.dispatchEvent(new CustomEvent("help-onboarding-secondary-button-click",{detail:!0,bubbles:!0,composed:!0}))}_primaryButtonClick(){this.dispatchEvent(new CustomEvent("help-onboarding-primary-button-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("help-onboarding-link-click",{detail:!0,bubbles:!0,composed:!0}))}_linkTopClick(){this.dispatchEvent(new CustomEvent("help-onboarding-link-top-click",{detail:!0,bubbles:!0,composed:!0}))}_tplStepBar(){return n`${this.loading?"":n` <div class="step-bar">
          <ul aria-hidden="true" class="step-bar-inner">
            ${this._progress.map((e=>n`<li style="flex-basis:calc(100% /${this._numSlides})">
                <div class="progress" style="width: ${e}%"></div>
              </li>`))}
          </ul>
        </div>`} `}_tplButtonIcon(e,t,i,s="",a=!1,r=32){return n` <bbva-button-default
      class="${s}"
      type="button"
      variant="icon no-background alternative"
      icon="${e}"
      @click="${t}"
      icon-size="${r}"
      aria-label=${this.t(i)}
      ?loading="${this.loading}"
      ?disabled="${a}"
    >
    </bbva-button-default>`}_tplCarouselItem(){var e;return n`
      ${null===(e=this._slides)||void 0===e?void 0:e.map(((e,t)=>n` <div
            class="carousel-item"
            aria-hidden=${this.currentSlide!==t?"true":"false"}
            role="group"
            aria-roledescription="${this.t("bbva-help-onboarding-slide-description",{slide:t+1,totalSlides:this._numSlides})}"
            aria-label="${this.t("bbva-help-onboarding-slide-aria-label",{slide:t+1,totalSlides:this._slides.length})}"
          >
            ${this._slides[t]}
          </div>`))}
    `}_tplActionButtons(e,t,i){return e?n`<bbva-button-default
        class="action"
        @click="${i}"
        text=${this.t(e)}
        variant=${t}
        ?fullwidth=${1===this._numButtons}
      >
      </bbva-button-default>`:""}get _renderActionArea(){return n`
      <div class="actions-area">
        <div
          class="action prev"
          role="button"
          tabindex="0"
          aria-label="${this.t("bbva-help-onboarding-back-slide-area")}"
          @click=${this._backSlide}
          @keydown=${this._backSlide}
        ></div>
        <div
          class="action next"
          role="button"
          tabindex="0"
          aria-label="${this.t("bbva-help-onboarding-next-slide-area")}"
          @click=${this._nextSlide}
          @keydown=${this._nextSlide}
        ></div>
      </div>
    `}render(){var e;return n`
      <div class="carousel-inner">
        ${(null===(e=this._slides)||void 0===e?void 0:e.length)>1?n` ${this._tplStepBar()}
              <div class="controls">
                <div>
                  ${this._tplButtonIcon(this._play,this._togglePlay,"bbva-help-onboarding-automatic-play","play",!1)}
                  ${this._tplButtonIcon(this._back,this._backSlide,"bbva-help-onboarding-chevron-prev-aria-label","back",!this.loop&&0===this.currentSlide)}
                  ${this._tplButtonIcon(this._next,this._nextSlide,"bbva-help-onboarding-chevron-next-aria-label","next",!this.loop&&this.currentSlide===this._progress.length-1)}
                </div>
                ${this._tplButtonIcon(this._close,this._closeClick,"bbva-help-onboarding-carousel-close","close",!1,24)}
              </div>`:d}
        <div class="carousel-items" aria-live="off">${this._tplCarouselItem()}</div>
      </div>
      <div class="footer">
        ${this.linkTextTop?n`<bbva-type-link ?loading="${this.loading}" @click="${this._linkTopClick}"
              >${this.linkTextTop}</bbva-type-link
            >`:""}
        ${this._numButtons>0&&!this.loading?n`<div class="action-buttons">
              ${this._tplActionButtons(this.secondaryButtonText,"secondary",this._secondaryButtonClick)}
              ${this._tplActionButtons(this.primaryButtonText,"",this._primaryButtonClick)}
            </div>`:""}
        ${this.linkText?n`<bbva-type-link ?loading="${this.loading}" @click="${this._linkClick}"
              >${this.linkText}</bbva-type-link
            >`:""}
      </div>
    `}}const ee=(e,t,i={})=>{e.dispatchEvent(new CustomEvent(t,{detail:i,bubbles:!0,composed:!0}))};class te extends(O(N(t(i)))){static get is(){return"onboarding-request-money-page"}static get scopedElements(){const e=[Z,X,j];return te.scopedElementsFromClasses(e)}static get styles(){return[M.secondary,s("OnboardingRequestMoneyPage-styles")]}_completeOnboarding(e){e.stopPropagation(),ee(this,"account-transaction-servicing-request-money-finish-onboarding")}_switchNextSlide(e){ee(this,`account-transaction-servicing-request-money-onboarding-${["request-money","can-request","can-save"][e.detail-1]}-slide`),e.stopPropagation()}_backPreviousSlide(e){ee(this,"account-transaction-servicing-request-money-onboarding-prev-slide"),e.stopPropagation()}_playSlides(e){ee(this,"account-transaction-servicing-request-money-onboarding-play-slides"),e.stopPropagation()}_pauseSlides(e){ee(this,"account-transaction-servicing-request-money-onboarding-pause-slides"),e.stopPropagation()}_exitPage(e){e.stopPropagation(),ee(this,"account-transaction-servicing-request-money-go-back","onboarding")}render(){return n`
      <bbva-help-onboarding
        visible
        primary-button-text="${this.t("account-transaction-servicing-request-money-onboarding-primary-button-text")}"
        @help-onboarding-primary-button-click=${this._completeOnboarding}
        @help-onboarding-secondary-close-click=${this._exitPage}
        @help-onboarding-slide-next=${this._switchNextSlide}
        @help-onboarding-slide-back=${this._backPreviousSlide}
        @help-onboarding-play=${this._playSlides}
        @help-onboarding-pause=${this._pauseSlides}
      >
        <bbva-help-onboarding-slide
          slide-title="${this.t("account-transaction-servicing-request-money-onboarding-slide-title-one")}"
          description="${this.t("account-transaction-servicing-request-money-onboarding-slide-description-one")}"
          microillustration="youngaccountflag"
        >
          <bbva-list-bullet
            slot="interactive-area"
            text="${this.t("account-transaction-servicing-request-money-onboarding-slide-description-one-p")}"
          ></bbva-list-bullet>
        </bbva-help-onboarding-slide>
        <bbva-help-onboarding-slide
          slide-title="${this.t("account-transaction-servicing-request-money-onboarding-slide-title-two")}"
          description="${this.t("account-transaction-servicing-request-money-onboarding-slide-description-two")}"
          microillustration="extraordinarycontribution"
        ></bbva-help-onboarding-slide>
        <bbva-help-onboarding-slide
          slide-title="${this.t("account-transaction-servicing-request-money-onboarding-slide-title-three")}"
          description="${this.t("account-transaction-servicing-request-money-onboarding-slide-description-three")}"
          microillustration="dollarmedium"
        ></bbva-help-onboarding-slide>
        <bbva-help-onboarding-slide
          slide-title="${this.t("account-transaction-servicing-request-money-onboarding-slide-title-four")}"
          description="${this.t("account-transaction-servicing-request-money-onboarding-slide-description-four")}"
          microillustration="clock"
        ></bbva-help-onboarding-slide>
      </bbva-help-onboarding>
    `}}class ie extends(u(i)){_mappingIndicators(e){e.map((e=>{this._removeFields(["name"],e),this._renameProperty(e,"indicatorId","id")}));for(let t=0;t<e.length;t++)"DESTINATION_IMMEDIATE_DEBIT"==e[t].id&&e.splice(t,1);return e}}class se{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let n=0|t,a=Math.max(n>=0?n:s-Math.abs(n),0);for(;a<s;){if((r=i[a])===(o=e)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;a++}var r,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,n="",a=0,r=arguments.length;a!==r;++a){var o=+arguments[a];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?s=i.push(o):(o-=65536,s=i.push(55296+(o>>10),o%1024+56320)),s>=16383&&(n+=e.apply(null,i),i.length=0)}return n+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class ne extends se{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const ae=0,re=1,oe="jwt",ce="tsec",le="none";class de extends se{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=ae,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new ne,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=ce:this.requiredToken=le,this.requiresJWT=!1):this.requiredToken===ce?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===oe?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===le?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(ce)}_setJwtHandler(){this._setTokenHandler(oe)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=h),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===re?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(ce,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(oe,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===oe?"JWT ":"",n=e===oe?"Authorization":ce;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let r=this[i].getItem(a);r?t[n]=t[n]||s+r:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],n=0,a=0;if(s<=127?(n=0,a=255&s):s<=223?(n=1,a=31&s):s<=239?(n=2,a=15&s):s<=244&&(n=3,a=7&s),e.length-i-n>0){let t=0;for(;t<n;)s=e[i+t+1],a=a<<6|63&s,t+=1}else a=65533,n=e.length-i;t+=String.fromCodePoint(a),i+=n+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",n=i[e].split(s);t[n.shift().toLowerCase()]=n.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let n=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(n=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(n=JSON.parse(t.headers)[s])}if(n){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==n&&(e.setItem(t,n),this._emitTokenUpdate(i,n))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,n,a;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),n=e.getResponseHeader("AuthenticationChallenge"),a=e.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(e.headers);t=r.authenticationtype,i=r.authenticationdata||null,s=r.authenticationstate,n=r.authenticationchallenge,a=r.authenticationresponse}return{type:t,data:i,state:s,challenge:n,response:a}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let n;if("object"==typeof e&&e){const a=this._getSignatureData(e.signatureType,t,i);n=this._makeKeyValuePairFromObject(a,e.signatureValue),e.challenge&&(n+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(n,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(n=`password=${e}`,this._buildSignatureHeaders(n,"2",s)):(n=`${i}=${e}`,this._buildSignatureHeaders(n,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),n=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:a,data:r,state:o,challenge:c,response:l}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(n)this._notifySignatureInvalid(d),i=!0;else if(a)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,d,a,r,o,c,l),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,a,r,o,c,l),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),n=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),a=this._getRequestMetadata(e);n&&(this._notifyWaitingForProcessResponse(a),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,n,a){this._defineSignatureValue(t,i,s);const r={type:t,data:i,challenge:n,metadata:e};a&&(r.response=a),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,n,a){s?this._notifySignatureRequired(e,t,i,s,n,a):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,n,a,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,n):this._notifySignatureRequired(t,i,s,n,a,r)}}class ue extends de{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class he extends de{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class pe extends ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsGetV0")}}class ge extends he{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsPostV0")}}class me extends ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/limits`)}toString(){return super.toString("BGADPAccountsAccountLimitsGetV0")}}class be extends ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/transactions`)}toString(){return super.toString("BGADPAccountsAccountTransactionsGetV0")}}class _e extends ie{static get is(){return"bbva-global-accounts-base-api-dm"}resetAccounts(){this.accounts=[]}getAccounts(e){this._paramsMapping(e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}postAccounts(e){this._requestMapping(e),this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping),this.resetAccounts()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}Accounts`,this._getBgadp(s))}_getBgadp(e){return{getAccountsV1:()=>new G(e),getAccountsV0:()=>new pe(e),postAccountsV0:()=>new ge(e),postAccountsV1:()=>new V(e),default:()=>"BGADP does not exist."}}_paramsMapping(e){return"0"==this.version?(this._renameProperty(e,"currency","currencies.currency"),this._renameProperty(e,"indicators.id","indicators.indicatorId"),e):e}_responseMapping(e){if(Array.isArray(e)){if("0"==this.version&&Object.keys(e).length)for(let t=0;t<e.length;t++)this._renameProperty(e[t],"accountId","id"),this._renameProperty(e[t],"title","product"),this._removeFields(["bank","commercialPackage","joint","alias","openingDate","currencies","disposedBalance","image","meta","offerId","delivery","accountAgreement"],e[t]),this._removeFields(["previousMonthAverageBalance"],e[t].availableBalance),this._removeFields(["subType"],e[t].accountType),this._removeFields(["reason","reasonDescription"],e[t].status),e[t].indicators&&e[t].indicators.length&&(e[t].indicators=this._mappingIndicators(e[t].indicators));return e}return this._postResponseMapping(e)}_postResponseMapping(e){return"0"==this.version&&Object.keys(e).length&&(this._renameProperty(e,"accountId","id"),e.customizedFormats&&e.customizedFormats.forEach((e=>{this._renameProperty(e,"customizedFormatId","id")})),this._renameProperty(e,"joint","jointSignatureType"),this._renameProperty(e,"title","product"),e.bank&&(this._renameProperty(e.bank,"bankId","id"),this._renameProperty(e.bank.branch,"branchId","id")),e.participants.forEach((e=>{var t;this._renameProperty(e,"participantId","id"),"NATURAL_PERSON"===e.personType?(e.customDetails={personType:"NATURAL_UNKNOWN"},e.firstName&&(e.customDetails={...e.customDetails,firstName:e.firstName}),e.middleName&&(e.customDetails={...e.customDetails,middleName:e.middleName}),e.lastName&&(e.customDetails={...e.customDetails,lastName:e.lastName}),e.secondLastName&&(e.customDetails={...e.customDetails,secondLastName:e.secondLastName}),e.identityDocument&&(e.customDetails.identityDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}]),this._removeFields(["personType","firstName","middleName","lastName","secondLastName","identityDocument"],e)):"LEGAL_PERSON"===e.personType&&(e.customDetails={personType:"LEGAL_UNKNOWN"},e.legalName&&(e.customDetails={...e.customDetails,legalName:e.legalName}),e.identityDocument&&(e.customDetails.businessDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}]),this._removeFields(["personType","legalName","identityDocument"],e)),null!==(t=e.participantType)&&void 0!==t&&t.order&&(e.order=e.participantType.order,this._removeFields(["order"],e.participantType)),this._removeFields(["suffix","documents"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"conditionId","id"),this._removeFields(["period","facts","outcomes"],e)})),e.delivery&&(e.deliveries=e.delivery,this._removeFields(["delivery"],e),e.deliveries.forEach((e=>{"VIRTUAL"===e.deliveryType?e.method="DIGITAL":"PHYSICAL"===e.deliveryType&&(e.method="STANDARD"),e.address&&this._renameProperty(e.address,"addressType","deliveryAddressType"),e.destination.branch&&(e.destination.bank={branch:e.destination.branch},this._removeFields(["branch"],e.destination)),e.contactDetails[0].contactDetail&&e.contactDetails[0].contactDetail.contactDetailId&&(e.contactDetails={id:e.contactDetails[0].contactDetail.contactDetailId,deliveryContactType:"STORED"}),e.documentType&&(e.serviceType={id:e.documentType},this._removeFields(["documentType"],e)),this._removeFields(["deliveryType"],e)}))),e.fees&&e.fees.itemizeFees.forEach((e=>{this._renameProperty(e,"name","description"),e.itemizeFeeUnits=[{unitType:"AMOUNT",amount:e.feeAmount.amount,currency:e.feeAmount.currency}],e.feeAmount.percentage&&e.itemizeFeeUnits.push({unitType:"PERCENTAGE",percentage:e.feeAmount.percentage}),this._removeFields(["feeAmount"],e)})),e.rates&&e.rates.forEach((e=>{e.itemizeRates=[{rateType:e.rateType.id,itemizeRateUnits:[e.unit]}],this._renameProperty(e.itemizeRates[0].itemizeRateUnits[0],"mode","unitType"),e.rateType.name&&(e.itemizeRates=[{...e.itemizeRates[0],description:e.rateType.name}]),this._removeFields(["rateType","unit"],e)})),e.operationNumber&&(e.operationTracking={operationNumber:e.operationNumber}),e.relatedContracts&&e.relatedContracts.forEach((e=>{this._renameProperty(e.relationType,"name","description"),e.contractDetails={number:e.number,contractType:"INTERNAL_CONTRACT"},this._removeFields(["number"],e)})),this._removeFields(["businessType","operationNumber","accountFamily","billingInformation","offerId"],e)),e}_requestMapping(e){return"0"==this.version&&(e.bank&&(this._renameProperty(e.bank,"id","bankId"),this._renameProperty(e.bank.branch,"id","branchId")),this._renameProperty(e,"jointSignatureType","joint"),this._renameProperty(e,"product","title"),this._removeFields(["subproduct"],e.title),e.limits&&e.limits.forEach((e=>{this._renameProperty(e,"id","limitId")})),e.indicators&&e.indicators.forEach((e=>{this._renameProperty(e,"id","indicatorId")})),e.participants.forEach((e=>{var t,i,s,n,a,r;null!==(t=e.customDetails)&&void 0!==t&&t.firstName&&(e.firstName=e.customDetails.firstName),null!==(i=e.customDetails)&&void 0!==i&&i.middleName&&(e.middleName=e.customDetails.middleName),null!==(s=e.customDetails)&&void 0!==s&&s.lastName&&(e.lastName=e.customDetails.lastName),null!==(n=e.customDetails)&&void 0!==n&&n.secondLastName&&(e.secondLastName=e.customDetails.secondLastName),null!==(a=e.customDetails)&&void 0!==a&&a.identityDocuments?e.identityDocument={documentNumber:e.customDetails.identityDocuments[0].documentNumber,documentType:e.customDetails.identityDocuments[0].documentType.id}:null!==(r=e.customDetails)&&void 0!==r&&r.businessDocuments&&(e.identityDocument={documentNumber:e.customDetails.businessDocuments[0].documentNumber,documentType:e.customDetails.businessDocuments[0].documentType.id}),this._removeFields(["customDetails"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"id","conditionId"),this._removeFields(["isNegotiable","conditionType","formats"],e)})),this._removeFields(["contractDetails"],e.relatedContracts),e.deliveries&&(e.delivery=e.deliveries,this._removeFields(["deliveries"],e),e.delivery.forEach((e=>{if(this._renameProperty(e,"method","deliveryType"),"DIGITAL"===e.deliveryType?e.deliveryType="VIRTUAL":"STANDARD"===e.deliveryType?e.deliveryType="PHYSICAL":this._removeFields(["deliveryType"],e),e.destination.bank&&(e.destination={...e.destination,branch:e.destination.bank.branch},this._removeFields(["bank"],e.destination)),e.contactDetails&&"STORED"===e.contactDetails.deliveryContactType){let t=[{contactDetail:{contactDetailId:e.contactDetails.id}}];e.contactDetails=t}else this._removeFields(["contactDetails"],e);e.address&&"STORED"===e.address.deliveryAddressType?this._renameProperty(e.address,"deliveryAddressType","addressType"):this._removeFields(["address"],e),this._removeFields(["deliverySchedules","serviceType","packagingtype"],e)})))),e}_paginationMapping(e){return e}}p(_e,"GET_EVENTS",{customEvent:"accounts-api-dm-fetch",paginationEvent:"accounts-api-dm-pagination",errorFireEventHandler:"accounts-api-dm-fetch-error"}),p(_e,"POST_EVENTS",{customEvent:"accounts-api-dm-create",errorFireEventHandler:"accounts-api-dm-create-error"}),customElements.define(_e.is,_e);class ye extends ie{static get is(){return"bbva-global-account-transactions-base-api-dm"}resetAccountTransactions(){this.accountTransactions=[]}getAccountTransactions(e,t){this._paramsMapping(t),t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountTransactions`,this._getBgadp(s))}_getBgadp(e){return{getAccountTransactionsV2:()=>new g(e),getAccountTransactionsV0:()=>new be(e),default:()=>"BGADP does not exist."}}_paramsMappingCanonical(e){if("0"==this.version){this._removeFields(["customerId"],e),e["transactionType.id"]&&(e["transactionType.id"]=e["transactionType.id"].toString()),e["status.id"]&&(e["status.id"]=e["status.id"].toString());let t=Object.keys(e);for(let i=0;i<t.length;i++){let s=t[i];if("operationAmount.id"===s&&"LOCAL_AMOUNT"===e[s])for(let i=0;i<t.length;i++)"operationAmount.fromAmount"===t[i]?this._renameQueryParam(e,"operationAmount.fromAmount","fromLocalAmount.amount"):"operationAmount.toAmount"===t[i]?this._renameQueryParam(e,"operationAmount.toAmount","toLocalAmount.amount"):"operationAmount.currency"===t[i]&&this._renameQueryParam(e,"operationAmount.currency","localAmount.currency");this._removeFields(["operationAmount.id","operationAmount.fromAmount","operationAmount.toAmount","operationAmount.currency"],e)}}return e}_renameQueryParam(e,t,i){t in e&&(e[i]=e[t],delete e[t])}_paramsMapping(e){return this._paramsMappingCanonical(e),e}responseMappingCanonical(e){if("0"==this.version&&Object.keys(e).length)for(let t=0;t<e.length;t++){this._renameProperty(e[t],"valuationDate","valueDate"),this._renameProperty(e[t].contract.numberType,"name","description"),this._removeFields(["category","exchangeRate","fundsOrigin"],e[t]),this._removeFields(["product","bank"],e[t].contract),this._removeFields(["description"],e[t].transactionType),this._removeFields(["updateDate"],e[t].status);const i=e[t].classification;i&&(this._removeFields(["pfmId","customName"],i),this._removeFields(["customName"],i.category),this._removeFields(["customName"],i.category.subcategory));const s=e[0].additionalInformation;this._removeFields(["postedBalance","reportingBalance","authorizedBalance","hold"],s),s&&s.branch&&(e[t].branch={id:s.branch.id,name:s.branch.name},this._removeFields(["branch"],s)),s&&s.updatedBalance&&(s.balances=[{id:"UPDATED_BALANCE",amount:s.updatedBalance.amount,currency:s.updatedBalance.currency}],this._removeFields(["updatedBalance"],s)),e[t].localAmount&&(e[t].operationAmounts=[{id:"LOCAL_AMOUNT",amount:e[t].localAmount.amount,currency:e[t].localAmount.currency}],this._removeFields(["localAmount"],e[t]));const n=e[t].operationAmounts[0];e[t].originAmount&&(e[t].operationAmounts=[n,{id:"ORIGIN_AMOUNT",amount:e[t].originAmount.amount,currency:e[t].originAmount.currency}],this._removeFields(["originAmount"],e[t]))}return e}_responseMapping(e){return this.responseMappingCanonical(e),e}}p(ye,"GET_EVENTS",{customEvent:"account-transactions-api-dm-fetch",paginationEvent:"account-transactions-api-dm-pagination",errorFireEventHandler:"account-transactions-api-dm-fetch-error"}),customElements.define(ye.is,ye);const ve={0:"notCategorizable",1:"cash",2:"saving",3:"taxes",4:"associations",6:"health",7:"shopping",8:"education",9:"bank",10:"home",11:"leisure",15:"transportation",16:"travel",17:"paycheck",18:"check",19:"otherIncome",20:"investment",21:"financing",999:"notCategorizable",9999:"toCategorize"},fe={notCategorizable:["0","998","999"],cash:["42","44","46","51"],bizum:["78"],toCategorize:["9998","9999"],paycheck:["41","96","97"],check:["98","99"],otherIncome:["43","50","100","101","102"],saving:["4","10","103","104"],investment:["6","11","105","106","107","110"],financing:["7"],taxes:["1","2","3"],associations:["12","13","81"],health:["23","64","65","7","69"],shopping:["24","25","27","28","30","63","87","88","109"],education:["31","32","33","34","82"],bank:["14","16","18","19","21","35","59","61","62","70","77","108"],home:["36","37","38","39","40","68","76","83","84","85"],leisure:["52","53","54","55","56","86"],transportation:["67","72","73","74","75","92","93","94","95"],travel:["57","58","71","89","90","91"]};class Se extends(m(ye)){static get is(){return"bbva-account-transactions-es-api-dm"}static get properties(){return{_financingTypeId:{type:String}}}static get scopedElements(){const e=[_];return Se.scopedElementsFromClasses(e)}render(){return n` ${this.accountTransactionsDM} `}constructor(){super(),this._financingTypeId=""}get accountTransactionsDM(){return n`
      <bbva-core-generic-dp
        id="accountTransactions"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        headers="${b(((e,t)=>{let i={};if(e.includes("ASO")){const e="x-dm-local-",t=window.sessionStorage;i=Object.keys(t).filter((t=>t.startsWith(e))).reduce(((i,s)=>(i[s.replace(e,"")]=t.getItem(s),i)),{})}return JSON.stringify({...t,...i})})(this.host,this.headers))}"
        method="${this.method}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}_handleLocalDMSuccess(e){const t=this._formatData(e.detail);this.dispatchEvent(new CustomEvent("account-transactions-api-dm-fetch",{bubbles:!0,composed:!0,detail:t})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(e){this._handleError("account-transactions-api-dm-fetch-error",this.shadowRoot.getElementById("accountTransactions"))(e.detail)}_requestAccountTransactions(e,t){var i;const s=this.shadowRoot.getElementById("accountTransactions"),n=t.moneyFlow?{INCOME:"IN",EXPENSE:"OUT"}[t.moneyFlow.id]:"BOTH";this._financingTypeId=null==t||null===(i=t.financingType)||void 0===i?void 0:i.id,this._setGenericRequest({dm:s,path:"accountTransactions/V02/accountTransactionsAdvancedSearch",method:"post",params:t.pagination?`?paginationKey=${t.pagination}`:`?paginationKey=0&pageSize=${t.pageSize?t.pageSize:40}`,body:{accountContracts:[{contract:{id:e}}],customer:{id:this.localCustomProperties.customerId},filter:{dates:{from:t.filterDateFrom,to:t.filterDateTo},operationType:[n]},searchType:"SEARCH"}})}_filterFinancingData(e){const t={FINANCING_AVAILABLE:"SF"};return t[this._financingTypeId]?e.filter((e=>{var i;return(null==e||null===(i=e.financingData)||void 0===i?void 0:i.customizableIndicator)===t[this._financingTypeId]})):e}_formatingOperationAmounts(e){const t="ORIGIN_AMOUNT",i=null==e?void 0:e.amount;let s={};var n,a;i&&(s={id:"EUR"===(null===(n=i.currency)||void 0===n?void 0:n.code)?"CONTRACT_AMOUNT":t,amount:null==i?void 0:i.amount,currency:null==i||null===(a=i.currency)||void 0===a?void 0:a.id});let r={};if(null!=e&&e.wireTransactionDetail){const{wireTransactionDetail:i}=e;r={id:t,amount:i.payment.amount,currency:i.payment.currency.id}}const o=0===Object.keys(s).length,c=0===Object.keys(r).length;return o&&c?null:o?[r]:c?[s]:[s,r]}_formatData(e){const t=this._filterFinancingData(e.accountTransactions).map((e=>{var t,i;return{id:e.id,operationAmounts:this._formatingOperationAmounts(e),contract:{id:e.contract.id},moneyFlow:{id:(null==e||null===(t=e.amount)||void 0===t?void 0:t.amount)<0?"EXPENSE":"INCOME",name:(null==e||null===(i=e.amount)||void 0===i?void 0:i.amount)<0?"expense":"income"},classification:this._formatClassification(e),operationDate:e.transactionDate,valueDate:e.valueDate,concept:this._formatConcept(e.humanConceptName)}}));return e.pagination&&(e.pagination={links:{first:e.pagination.firstPage,...void 0!==e.pagination.lastPage&&{last:e.pagination.lastPage},...void 0!==e.pagination.previousPage&&{previous:e.pagination.previousPage},...void 0!==e.pagination.nextPage&&{next:e.pagination.nextPage}},page:e.pagination.page,totalPages:e.pagination.total,totalElements:e.totalResults,pageSize:e.pagination.pageSize}),this.dispatchEvent(new CustomEvent("account-transactions-api-dm-pagination",{bubbles:!0,composed:!0,detail:e.pagination})),t}_formatConcept(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_formatClassification(e){var t,i;const s=null==e||null===(t=e.humanCategory)||void 0===t?void 0:t.id,n=null==e||null===(i=e.humanSubcategory)||void 0===i?void 0:i.id,a=ve[s];var r;return{id:s,name:a,category:{id:s,name:a,subcategory:{id:n,name:(r=n,Object.keys(fe).find((e=>fe[e].includes(r))))}}}}async getAccountTransactions(e,t){this._requestAccountTransactions(e,t)}_setGenericRequest({dm:e,path:t,method:i,params:s,body:n}){return e.native=!1,e.requiresToken=!0,e.path=`${t}${s}`,e.method=i,e.body=n,e.generateRequest()}}customElements.define(Se.is,Se);class Te extends ie{static get is(){return"bbva-global-account-limits-base-api-dm"}resetAccountLimits(){this.accountLimits=[]}getAccountLimits(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountLimits`,this._getBgadp(s))}_getBgadp(e){return{getAccountLimitsV0:()=>new me(e),getAccountLimitsV2:()=>new U(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return this._responseMappingCanonical(e),e}_responseMappingCanonical(e){"0"==this.version&&Object.keys(e).length&&e.map((e=>{this._renameProperty(e,"limitId","id"),this._removeFields(["name"],e)}))}}p(Te,"GET_EVENTS",{customEvent:"account-limits-api-dm-fetch",errorFireEventHandler:"account-limits-api-dm-fetch-error"}),customElements.define(Te.is,Te);class Re extends ie{static get is(){return"bbva-global-child-account-money-requests-api-dm"}constructor(){super()}postChildAccountMoneyRequests(e,t){const i={"child-account-id":e};this._generateGetService(this._getService("post",t,i),{customEvent:"child-account-money-requests-api-dm-create",errorFireEventHandler:"child-account-money-requests-api-dm-create-error"},this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}ChildAccountMoneyRequests`,this._getBgadp(s))}_getBgadp(e){return{postChildAccountMoneyRequestsV1:()=>new W(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}var Ee=e`
  :host {
    display: block;
    box-sizing: border-box;
    text-align: start;
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

  [data-tag-name='bbva-notification-message'] {
    margin: 1.375rem 1rem 1rem;
  }

  [data-tag-name='bbva-form-input'] {
    margin: 0 1rem 0.5rem;
  }

  .button-position {
    width: 100%;
    position: fixed;
    bottom: 0;
    display: flex;
  }
  .button-position [data-tag-name='bbva-button-default'] {
    width: 100%;
    margin: 0 1rem 1.5rem;
  }

  [data-tag-name='bbva-type-text'] {
    margin: 0.5rem 1rem;
    font-weight: var(
      --fontWeightOptionsFontWeight40,
      ${y(v.fontWeight40)}
    );
    font-size: var(
      --fontSizeOptionsFontSize40,
      ${y(f.fontSize40)}
    );
  }
`;class qe extends(O(N(t(i)))){static get is(){return"request-money-page"}static get scopedElements(){const e=[F,R,z,B,I,Re];return qe.scopedElementsFromClasses(e)}static get properties(){return{childAccountId:{type:String,attribute:"child-account-id"},_childAccountMoneyRequestsDmV1:{type:String},_enableButton:{type:Boolean},_message:{type:String},_resetValue:{type:Boolean},exitPageFlag:{type:Boolean,attribute:"exit-page-flag"}}}constructor(){super(),this.childAccountId="",this._childAccountMoneyRequestsDmV1="",this._enableButton=!1,this._message="",this._resetValue=!1,this.exitPageFlag=!1,this.prueba=!1,this.config={header:{id:"main-header",variant:"modal-initial",accessibilityTextIconRightPrimary:"Close",iconRightPrimary:"coronita:close",iconRightSecondary:"coronita:help",text:this.t("account-transaction-servicing-request-money-request-money-header-text"),closeIconAriaLabel:this.t("account-transaction-servicing-request-money-request-money-header-text"),"@header-main-icon-click":this._exitPage.bind(this)},fixedHeader:!0}}static get styles(){return[Ee,A.primary,L.primaryAlt,k.primary,s("request-money-page-shared-styles")]}firstUpdated(){this._childAccountMoneyRequestsDmV1=this.shadowRoot.querySelector('[data-tag-name="bbva-global-child-account-money-requests-api-dm"]')}updated(){this._resetValue=!1}_completeRequestMoney(){this._message=this._message.replace(/[^a-z0-9]/gi," "),ee(this,"account-transaction-servicing-request-money-service-call"),this._childAccountMoneyRequestsDmV1.postChildAccountMoneyRequests(this.childAccountId,{requestMessage:this._message})}_serviceResponse(e){e.stopPropagation();const{detail:t}=e;ee(this,"account-transaction-servicing-request-money-service-response"),e&&t?ee(this,"account-transaction-servicing-request-money-finish-request-money",t):ee(this,"account-transaction-servicing-request-money-error-on-get-mock",e),this._enableButton=!1,this._resetValue=!0,this._message=""}_selectInput(e){e.stopPropagation(),this.exitPageFlag||ee(this,"account-transaction-servicing-request-money-started-request-money")}_inputValidation(e){var t;e.stopPropagation(),this._message=null==e||null===(t=e.detail)||void 0===t?void 0:t.value,0!==this._message.length&&""!==this._message?this._enableButton=!0:this._enableButton=!1,ee(this,"account-transaction-servicing-request-money-input-validation")}_cleanInput(e){e.stopPropagation(),!this.exitPageFlag&&this._enableButton&&ee(this,"account-transaction-servicing-request-money-clean-input"),this._message="",this._enableButton=!1}_exitPage(e){this.exitPageFlag=!0,e.stopPropagation(),ee(this,"account-transaction-servicing-request-money-go-back","requestMoney"),this._enableButton=!1,this._resetValue=!0,this._message=""}render(){return n`
      ${super.render()}

      <bbva-global-child-account-money-requests-api-dm
        id="childAccountMoneyRequestsDm"
        .host="${this.host}"
        .version="${this.accountsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @child-account-money-requests-api-dm-create="${this._serviceResponse}"
        @child-account-money-requests-api-dm-create-error="${this._serviceResponse}"
      >
      </bbva-global-child-account-money-requests-api-dm>

      <bbva-type-text
        text="${this.t("account-transaction-servicing-request-money-request-money-text-one")}"
        tag="span"
      ></bbva-type-text>

      <bbva-form-input
        id="formInputRequestMoney"
        type="textarea"
        label="${this.t("account-transaction-servicing-request-money-request-money-input-label")}"
        ambient="primary-alt"
        value="${this._message}"
        @form-textarea-input-focus="${this._selectInput}"
        @form-input-value-change="${this._inputValidation}"
        @form-textarea-input-clear="${this._cleanInput}"
        ?reset-value="${this._resetValue}"
        maxlength="40"
        character-counter-label="${this.t("account-transaction-servicing-request-money-request-money-character-counter-label")}"
      ></bbva-form-input>

      <bbva-notification-message>
        ${this.t("account-transaction-servicing-request-money-request-money-notification-text")}
      </bbva-notification-message>

      <div class="button-position">
        <bbva-button-default
          id="buttonDefaultRequestMoney"
          @click="${this._completeRequestMoney}"
          text="${this.t("account-transaction-servicing-request-money-request-money-button-default-text")}"
          size="L"
          fullwidth
          ?disabled="${!this._enableButton}"
        ></bbva-button-default>
      </div>
    `}}var xe=e`
  :host {
    display: block;
    box-sizing: border-box;
    text-align: start;
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

  .pending-flex-container {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    margin: 1rem;
  }
  .pending-flex-container .left-text {
    font-weight: var(
      --fontWeightOptionsFontWeight10,
      ${y(v.fontWeight10)}
    );
    font-size: var(
      --fontSizeOptionsFontSize40,
      ${y(f.fontSize40)}
    );
    width: 50%;
  }
  .pending-flex-container .right-text {
    font-weight: var(
      --fontWeightOptionsFontWeight40,
      ${y(v.fontWeight40)}
    );
    font-size: var(
      --fontSizeOptionsFontSize40,
      ${y(f.fontSize40)}
    );
    text-align: right;
    width: 50%;
  }
  .pending-flex-container .date-text {
    font-style: var(
      --fontStyleOptionsFontStyle20,
      ${y(S.fontStyle20)}
    );
  }

  .microillustration {
    margin: 1rem 1rem 2rem;
  }
  .microillustration [data-tag-name='bbva-clip-microillustration'] {
    margin-top: 1rem;
  }
  .microillustration [data-tag-name='bbva-type-text'] {
    margin-top: 1rem;
    font-weight: var(
      --fontWeightOptionsFontWeight40,
      ${y(v.fontWeight40)}
    );
    font-size: var(
      --fontSizeOptionsFontSize70,
      ${y(f.fontSize70)}
    );
  }

  [data-tag-name='bbva-notification-message'] {
    margin: 2rem 1rem 1rem;
  }
`;class Ae extends(O(N(t(i)))){static get is(){return"pending-request-page"}static get scopedElements(){const e=[F,E,R,B];return Ae.scopedElementsFromClasses(e)}static get properties(){return{serviceParameters:{type:Object,attribute:"service-parameters"}}}constructor(){super(),this.serviceParameters={},this.config={header:{id:"main-header",variant:"modal-initial",accessibilityTextIconRightPrimary:"Close",iconRightPrimary:"coronita:close",iconRightSecondary:"coronita:help",text:this.t("account-transaction-servicing-request-money-pending-request-header-text"),closeIconAriaLabel:this.t("account-transaction-servicing-request-money-pending-request-header-text"),"@header-main-icon-click":this._exitPage.bind(this)},fixedHeader:!0}}static get styles(){return[xe,x.primary,A.primary,s("pending-request-page-shared-styles")]}_exitPage(e){e.stopPropagation(),ee(this,"account-transaction-servicing-request-money-go-back","pendingRequest")}render(){var e,t,i;return n`
      ${super.render()}

      <div class="microillustration">
        <bbva-clip-microillustration
          microillustration="pending"
          size="S"
        ></bbva-clip-microillustration>
        <bbva-type-text
          text="${this.t("account-transaction-servicing-request-money-pending-request-text-one")}"
          tag="span"
        ></bbva-type-text>
      </div>

      <div class="request-container-list">
        <div class="pending-flex-container">
          <bbva-type-text
            class="left-text"
            text="${this.t("account-transaction-servicing-request-money-pending-request-text-two")}"
            tag="span"
          ></bbva-type-text>
          <bbva-type-text
            class="right-text date-text"
            text="${null===(e=this.serviceParameters)||void 0===e?void 0:e.requestDate}"
            tag="span"
          ></bbva-type-text>
        </div>

        <div class="pending-flex-container">
          <bbva-type-text
            class="left-text"
            text="${this.t("account-transaction-servicing-request-money-pending-request-text-three")}"
            tag="span"
          ></bbva-type-text>
          <bbva-type-text
            class="right-text"
            text="${null===(t=this.serviceParameters)||void 0===t?void 0:t.requestTime}"
            tag="span"
          ></bbva-type-text>
        </div>

        <div class="pending-flex-container">
          <bbva-type-text
            class="left-text"
            text="${this.t("account-transaction-servicing-request-money-pending-request-text-four")}"
            tag="span"
          ></bbva-type-text>
          <bbva-type-text
            class="right-text"
            text="${null===(i=this.serviceParameters)||void 0===i?void 0:i.requestMessage}"
            tag="span"
          ></bbva-type-text>
        </div>
      </div>

      <bbva-notification-message>
        ${this.t("account-transaction-servicing-request-money-pending-request-notification-text")}
      </bbva-notification-message>
    `}}var Pe=e`
  :host {
    display: block;
    box-sizing: border-box;
    text-align: start;
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

  [data-tag-name='bbva-transition-container'] {
    --bbva-transition-container-padding: 0;
    --bbva-transition-container-padding-bottom: 0;
  }
`,Ce=e`
:host {
  --_account-transaction-servicing-request-money-bg-color: var(--account-transaction-servicing-request-money--custom--primary-ambient--bg-color,${C("colorPrimarySurfaceAlternativeDefault",$)});
}
`;class $e extends(O(N(t(i)))){static get is(){return"account-transaction-servicing-request-money"}static get scopedElements(){const e=[H,te,qe,Ae];return $e.scopedElementsFromClasses(e)}static get properties(){return{onboardingRequestPage:{type:Boolean,attribute:"onboarding-request-page"},requestMoneyPage:{type:Boolean,attribute:"request-money-page"},pendingRequestPage:{type:Boolean,attribute:"pending-request-page"},childAccountId:{type:String,attribute:"child-account-id"},serviceParameters:{type:Object,attribute:"service-parameters"},accountsApiVersion:{type:String,attribute:"accounts-api-version"},exitPageFlag:{type:Boolean,attribute:"exit-page-flag"}}}constructor(){super(),this.onboardingRequestPage=!1,this.requestMoneyPage=!1,this.pendingRequestPage=!1,this.childAccountId="",this.serviceParameters={},this.host="",this.accountsApiVersion="",this.native="",this.requiredToken="",this.exitPageFlag=!1}static get styles(){return[Pe,Ce,s("account-transaction-servicing-request-money-shared-styles")]}getLocalStorageData(e){let t=!1;(null!=e&&e.code||!e)&&(t=!0),t&&ee(this,"account-transaction-servicing-request-money-set-local-storage",{key:"onboardingRequestMoney",value:"true"}),this.onboardingRequestPage=t,this.requestMoneyPage=!this.onboardingRequestPage}firstUpdated(){this.onboardingRequestPage=!0,this.requestMoneyPage=!1,this.pendingRequestPage=!1,ee(this,"account-transaction-servicing-request-money-get-local-storage",{key:"onboardingRequestMoney"})}init(){this.requestMoneyPage&&ee(this,"account-transaction-servicing-request-money-view-page-request-money"),this.exitPageFlag=!1}getFinancialData(e){var t;const i=null==e||null===(t=e.data)||void 0===t?void 0:t.contracts.find((e=>{var t;return"LINK CARD"===(null==e||null===(t=e.subProductType)||void 0===t?void 0:t.name)}));this.childAccountId=null==i?void 0:i.simpleCode}finishOnboarding(e){this.onboardingRequestPage=!1,this.requestMoneyPage=!0,this.pendingRequestPage=!1,this.exitPageFlag=!1,"account-transaction-servicing-request-money-finish-onboarding"===(null==e?void 0:e.type)&&ee(this,"account-transaction-servicing-request-money-view-page-request-money")}_requestMoney(e){ee(this,"account-transaction-servicing-request-money-complete-request-money"),this.onboardingRequestPage=!1,this.requestMoneyPage=!1,this.pendingRequestPage=!0,this._convertServiceParameters(null==e?void 0:e.detail)}_convertServiceParameters(e){const t=new Date(e.requestDate),i="ene_feb_mar_abr_may_jun_jul_ago_sep_oct_nov_dic".split("_"),s=t.toLocaleDateString(void 0,{day:"2-digit"}),n=t.getMonth(),a=t.getFullYear(),r=t.toLocaleTimeString(void 0,{hour12:!1,hour:"2-digit",minute:"2-digit"});this.serviceParameters={requestMessage:null==e?void 0:e.requestMessage,requestDate:`${s} ${i[n]} ${a}`,requestTime:`${r}h`}}navigateBack(e=!0){(e??1)&&ee(this,"navigation-go-back",!0)}navigateForward({detail:e}){"onboarding"!==e&&"pendingRequest"!==e||ee(this,"navigation-go-forward",{id:e}),this.onboardingRequestPage=!1,this.requestMoneyPage=!1,this.pendingRequestPage=!1}_onboardingRequestPageUi(){return n`
      <onboarding-request-money-page
        @account-transaction-servicing-request-money-finish-onboarding=${this.finishOnboarding}
        id="onboardingRequestMoney"
        @account-transaction-servicing-request-money-go-back="${this.navigateForward}"
        ambient="secondary"
      >
      </onboarding-request-money-page>
    `}render(){return n`
      <div class="container" ambient="primary">
        ${this.onboardingRequestPage?this._onboardingRequestPageUi():""}

        <bbva-transition-container id="requestMoney" ?visible=${this.requestMoneyPage}>
          <div slot="slot-content" class="container">
            <request-money-page
              @account-transaction-servicing-request-money-finish-request-money=${this._requestMoney}
              .host=${this.host}
              .accountsApiVersion=${this.accountsApiVersion}
              .native=${this.native}
              .requiredToken=${this.requiredToken}
              .childAccountId=${this.childAccountId}
              @account-transaction-servicing-request-money-go-back="${this.navigateForward}"
              ?exitPageFlag="${this.exitPageFlag}"
              ambient="primary"
            ></request-money-page>
          </div>
        </bbva-transition-container>

        <bbva-transition-container id="pendingRequest" ?visible=${this.pendingRequestPage}>
          <div slot="slot-content" class="container">
            <pending-request-page
              .serviceParameters=${this.serviceParameters}
              @account-transaction-servicing-request-money-go-back="${this.navigateForward}"
              ambient="primary"
            ></pending-request-page>
          </div>
        </bbva-transition-container>
      </div>
    `}}customElements.define($e.is,$e);
