import"./751fa7b4.js";import{z as e,L as t,ak as i,h as a,i as r,a8 as s}from"./952f98a9.js";import"./0fe4c3f6.js";import{C as n,J as o}from"./216055dc.js";import{C as l,g as c,a as h,b,c as d,d as p,e as u,i as g,h as m,f as v}from"./c2354632.js";import"./6322cc13.js";import"./8c6be59b.js";import"./7f3d7ca9.js";import"./c0a2f832.js";import"./cae0f1de.js";var y=e`:host {
  display: flex;
  box-sizing: border-box;
  align-items: center;
  justify-content: center;
  position: relative;
  overflow: hidden;
  width: 1em;
  height: 1em;
  border-radius: 100%;
  background: var(--bbva-clip-box-bg-color, var(--bbva-medium-blue, #1973B8));
  font-size: var(--bbva-clip-box-size, calc(var(--bbva-global-spacer, 8px) * 6));
  color: var(--bbva-white, #FFF);
  transform: scale(1) translateZ(0);
  @apply --clip-box; }

:host([hidden]), [hidden] {
  display: none !important; }

*, *:before, *:after {
  box-sizing: inherit; }

:host(.bitone) .bitone-layer {
  width: 50%;
  height: 100%;
  position: absolute;
  top: 0;
  right: 0;
  background: var(--bbva-clip-box-bitone-bg, var(--bbva-600, #121212));
  opacity: 0.2;
  transform-origin: 0 50%;
  transform: rotate(45deg); }

.initials,
.icon {
  position: relative; }

.initials {
  font-size: var(--bbva-clip-box-font-size, 0.4em); }

.image {
  width: 100%;
  height: auto; }

:host(.small) {
  --bbva-clip-box-size: calc(var(--bbva-global-spacer, 8px) * 5);
  --cells-atom-icon-size: 0.6em; }

:host(.medium) {
  --bbva-clip-box-size: calc(var(--bbva-global-spacer, 8px) * 6);
  --cells-atom-icon-size: 0.5em;
  --bbva-clip-box-font-size: 0.37em; }

:host(.large) {
  --bbva-clip-box-size: calc(var(--bbva-global-spacer, 8px) * 9);
  --cells-atom-icon-size: 0.45em;
  --bbva-clip-box-font-size: 0.33em; }
`;const f=["bbva-medium-blue","bbva-core-blue","bbva-dark-aqua","bbva-dark-red","bbva-dark-orange","bbva-dark-yellow","bbva-dark-gold","bbva-dark-coral","bbva-dark-green","bbva-dark-pink","bbva-dark-purple","bbva-500"];class x extends(n(t)){static get is(){return"bbva-clip-box"}static get properties(){return{bgColor:{type:String,attribute:"bg-color"},accessibilityText:{type:String,attribute:"accessibility-text"},icon:{type:String},text:{type:String},image:{type:String}}}constructor(){super(),this.bgColor="",this.accessibilityText="",this.icon="",this.text="",this.image=""}static get shadyStyles(){return`\n      ${y.cssText}\n      ${i("bbva-clip-box-shared-styles").cssText}\n    `}render(){return a`
      <style>
        ${this.constructor.shadyStyles}
      </style>
      <div class="bitone-layer"></div>
      <p class="initials" id="initials" aria-label="${this.t(this.text)}" ?hidden="${!this.text}">
        ${this._initialsTransform}
      </p>
      <cells-icon
        ?aria-hidden="${this._computedIsAriaHidden}"
        aria-label="${this.t(this.accessibilityText)}"
        class="${this._addClassComputed}"
        id="icon"
        .icon="${this.icon}"
        .src="${this.image}"
        role="${r(this._computedRole)}"
        ?hidden="${this._hasIconImage}"
      >
      </cells-icon>
    `}updated(e){(e.has("bgColor")||e.has("text"))&&this._updateBgColor(this.bgColor,this._initialsTransform)}_updateBgColor(e,t){if(t){const e=t.split("").reduce(((e,t)=>e+t.charCodeAt(0)),0)%f.length;this._setBgColor(f[e])}else""!==e&&this._setBgColor(this.bgColor)}get _hasIconImage(){return!(this.icon||this.image)}get _computedIsAriaHidden(){return String(Boolean(this.image&&this.accessibilityText))}get _addClassComputed(){return this.icon?"icon":this.image?"image":""}get _initialsTransform(){return this.text.substr(0,2).toUpperCase()}get _computedRole(){return this.image?"image":void 0}_setBgColor(e){this.style.setProperty("--bbva-clip-box-bg-color",`var(--${e})`)}}customElements.define(x.is,x),window.ORPHANS=window.ORPHANS||new Set;const _=o((e=>class extends e{static get properties(){return{_parentResizable:{type:Object,observer:"_parentResizableChanged"},_notifyingDescendant:{type:Boolean,value:!1}}}constructor(){super(),this._interestedResizables=[],this._boundNotifyResize=this.notifyResize.bind(this),this._boundOnDescendantCellsResize=this._onDescendantCellsResize.bind(this),this.addEventListener("cells-request-resize-notifications",this._onCellsRequestResizeNotifications)}connectedCallback(){super.connectedCallback(),this.isAttached=!0,this._requestResizeNotifications()}disconnectedCallback(){super.disconnectedCallback(),this.isAttached=!1,this._parentResizable?this._parentResizable.stopResizeNotificationsFor(this):(window.ORPHANS.delete(this),window.removeEventListener("resize",this._boundNotifyResize)),this._parentResizable=null}notifyResize(){this.isAttached&&(this._interestedResizables.forEach((e=>{this.resizerShouldNotify(e)&&this._notifyDescendant(e)}),this),this._fireResize())}assignParentResizable(e){this._parentResizable&&this._parentResizable.stopResizeNotificationsFor(this),this._parentResizable=e,e&&-1===e._interestedResizables.indexOf(this)&&(e._interestedResizables.push(this),e._subscribeCellsResize(this))}stopResizeNotificationsFor(e){var t=this._interestedResizables.indexOf(e);t>-1&&(this._interestedResizables.splice(t,1),this._unsubscribeCellsResize(e))}_subscribeCellsResize(e){e.addEventListener("cells-resize",this._boundOnDescendantCellsResize)}_unsubscribeCellsResize(e){e.removeEventListener("cells-resize",this._boundOnDescendantCellsResize)}resizerShouldNotify(e){return!0}_onDescendantCellsResize(e){if(this._notifyingDescendant)return void e.stopPropagation();!window.ShadyDOM||this._fireResize()}_fireResize(){this.dispatchEvent(new CustomEvent("cells-resize",{bubbles:!1,composed:!0,node:this}))}_onCellsRequestResizeNotifications(e){var t=e.composedPath()[0];t!==this&&(t.assignParentResizable(this),this._notifyDescendant(t),e.stopPropagation())}_parentResizableChanged(e){e&&window.removeEventListener("resize",this._boundNotifyResize)}_notifyDescendant(e){this.isAttached&&(this._notifyingDescendant=!0,e.notifyResize(),this._notifyingDescendant=!1)}_requestResizeNotifications(){if(this.isAttached)if("loading"===document.readyState){var e=this._requestResizeNotifications.bind(this);document.addEventListener("readystatechange",(function t(){document.removeEventListener("readystatechange",t),e()}))}else this._findParent(),this._parentResizable?this._parentResizable._interestedResizables.forEach((function(e){e!==this&&e._findParent()}),this):(window.ORPHANS.forEach((function(e){e!==this&&e._findParent()}),this),window.addEventListener("resize",this._boundNotifyResize),this.notifyResize())}_findParent(){this.assignParentResizable(null),this.dispatchEvent(new CustomEvent("cells-request-resize-notifications",{bubbles:!0,composed:!0,cancelable:!0,node:this})),this._parentResizable?window.ORPHANS.delete(this):window.ORPHANS.add(this)}}));class $ extends(_(t)){static get is(){return"cells-collapse"}static get properties(){return{horizontal:{type:Boolean},opened:{type:Boolean},noAnimation:{type:Boolean,attribute:"no-animation"}}}constructor(){super(),this.horizontal=!1,this.opened=!1,this._desiredSize="",this.addEventListener("transitionend",this._onTransitionEnd.bind(this))}connectedCallback(){super.connectedCallback(),this.isAttached=!0,this.hasAttribute("role")||this.setAttribute("role","group"),this.hasAttribute("aria-hidden")||this.setAttribute("aria-hidden","true")}disconnectedCallback(){super.disconnectedCallback(),this.isAttached=!1}get dimension(){return this.horizontal?"width":"height"}get _dimensionMax(){return this.horizontal?"maxWidth":"maxHeight"}get _dimensionMaxCss(){return this.horizontal?"max-width":"max-height"}get transitioning(){return this._transitioning}updated(e){super.updated(e),e.has("horizontal")&&this._horizontalChanged(),e.has("opened")&&(this._openedChanged(),this.dispatchEvent(new CustomEvent("opened-changed",{detail:{value:this.opened}})))}render(){return a`
      <style>
        :host {
          display: block;
          transition-duration: var(--cells-collapse-transition-duration, 300ms);
          /* Safari 10 needs this property prefixed to correctly apply the custom property */
          -webkit-transition-duration: var(--cells-collapse-transition-duration, 300ms);
          overflow: visible;
        }

        :host(.cells-collapse-closed) {
          display: none;
        }

        :host(:not(.cells-collapse-opened)) {
          overflow: hidden;
        }
      </style>

      <slot></slot>
    `}_setTransitioning(e){e!==this._transitioning&&(this._transitioning=e,this.dispatchEvent(new CustomEvent("transitioning-changed",{detail:{value:e}})))}toggle(){this.opened=!this.opened}show(){this.opened=!0}hide(){this.opened=!1}updateSize(e,t){e="auto"===e?"":e;let i=t&&!this.noAnimation&&this.isAttached&&this._desiredSize!==e;if(this._desiredSize=e,this._updateTransition(!1),i){const t=this._calcSize();""===e&&(this.style[this._dimensionMax]="",e=this._calcSize()),this.style[this._dimensionMax]=t,this.scrollTop=this.scrollTop,this._updateTransition(!0),i=e!==t}this.style[this._dimensionMax]=e,i||this._transitionEnd()}_updateTransition(e){this.style.transitionDuration=e&&!this.noAnimation?"":"0s"}_horizontalChanged(){this.style.transitionProperty=this._dimensionMaxCss;const e="maxWidth"===this._dimensionMax?"maxHeight":"maxWidth";this.style[e]="",this.updateSize(this.opened?"auto":"0px",!1)}_openedChanged(){this.setAttribute("aria-hidden",!this.opened),this._setTransitioning(!0),this.classList.toggle("cells-collapse-closed",!1),this.classList.toggle("cells-collapse-opened",!1),this.updateSize(this.opened?"auto":"0px",!0),this.opened&&this.focus()}_transitionEnd(){this.style[this._dimensionMax]=this._desiredSize,this.classList.toggle("cells-collapse-closed",!this.opened),this.classList.toggle("cells-collapse-opened",this.opened),this._updateTransition(!1),this.notifyResize(),this._setTransitioning(!1)}_onTransitionEnd(e){e.composedPath()[0]===this&&this._transitionEnd()}_calcSize(){return`${this.getBoundingClientRect()[this.dimension]}px`}}customElements.define("cells-collapse",$);const z="#004481",S="#ffffff",C="#1464A5",w="#1973B8",A="#028484",T="#666666",B="#B92A45",R="#C65302",E="#277A3E",k="1.5rem",H="1.25rem",L="1.125rem",D="0.9375rem",V="0.75rem",N="2rem",F="1.5rem",P="1.5rem",I="1.5rem",O="1rem",X="8",j={fontWeight:400,fontStyle:"italic"},M={fontWeight:500,fontStyle:"normal"};var W=e`:host {
  display: inline-block;
  box-sizing: border-box;
  vertical-align: bottom;
  max-width: 100%;
  font-weight: var(--bbva-amount-font-weight, var(--fontFacePrimaryBookFontWeight, ${s({fontWeight:400,fontStyle:"normal"}.fontWeight)}));
  @apply --bbva-amount; }

*,
*:before,
*:after {
  box-sizing: inherit; }

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px; }

.amount-wrapper {
  display: block;
  word-spacing: -0.250em;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  unicode-bidi: bidi-override;
  @apply --bbva-amount-wrapper; }

.amount-block {
  margin: 0 0.125rem; }

@supports (-moz-appearance: meterbar) {
  .amount-wrapper {
    word-spacing: calc(-0.25em + 1.35px); } }

.minus {
  @apply --bbva-amount-minus; }
  .minus-left {
    float: var(--bbva-amount-minus-left-float, none);
    @apply --bbva-amount-minus-left; }
  .minus-right {
    float: var(--bbva-amount-minus-right-float, none);
    @apply --bbva-amount-minus-right; }

.currency {
  float: var(--bbva-amount-currency-float, none);
  @apply --bbva-amount-currency; }
  .currency-left, .currency-right {
    vertical-align: top; }
  .currency-left {
    @apply --bbva-amount-currency-left; }
  .currency-right {
    @apply --bbva-amount-currency-right; }

.currency-code {
  word-spacing: normal;
  @apply --bbva-amount-currency-code; }

.integer {
  @apply --bbva-amount-integer; }

.separator {
  @apply --bbva-amount-separator; }

.fractional {
  @apply --bbva-amount-fractional; }

.abbreviation {
  word-spacing: normal;
  @apply --bbva-amount-abbreviation; }

:host([hidden]),
[hidden] {
  display: none !important; }

:host([variant='l']) {
  font-size: var(--bbva-amount-l-font-size, var(--typographyTypeLarge, ${s(L)}));
  line-height: var(--bbva-amount-l-line-height, var(--lineHeightTypeLarge, ${s(P)}));
  @apply --bbva-amount-l; }
  :host([variant='l']) .currency {
    font-size: var(--bbva-amount-l-currency-font-size, var(--typographyType3XSmall, ${s(V)}));
    line-height: var(--bbva-amount-l-currency-line-height, var(--lineHeightType3XSmall, ${s(O)}));
    @apply --bbva-amount-l-currency; }

:host([variant='xl']) {
  font-size: var(--bbva-amount-xl-font-size, var(--typographyTypeXLarge, ${s(H)}));
  line-height: var(--bbva-amount-xl-line-height, var(--lineHeightTypeXLarge, ${s(F)}));
  @apply --bbva-amount-xl; }
  :host([variant='xl']) .currency {
    font-size: var(--bbva-amount-xl-currency-font-size, var(--typographyType3XSmall, ${s(V)}));
    line-height: var(--bbva-amount-xl-currency-line-height, var(--lineHeightType3XSmall, ${s(O)}));
    @apply --bbva-amount-xl-currency; }

:host([variant='3xl']) {
  font-size: var(--bbva-amount-3xl-font-size, var(--typographyType3XLarge, ${s(k)}));
  line-height: var(--bbva-amount-3xl-line-height, var(--lineHeightType3XLarge, ${s(N)}));
  @apply --bbva-amount-3xl; }
  :host([variant='3xl']) .currency {
    font-size: var(--bbva-amount-3xl-currency-font-size, var(--typographyType3XSmall, ${s(V)}));
    line-height: var(--bbva-amount-3xl-currency-line-height, var(--lineHeightType3XSmall, ${s(O)}));
    @apply --bbva-amount-3xl-currency; }

:host([variant='4xl']) {
  font-size: var(--bbva-amount-4xl-font-size, 2rem);
  line-height: var(--bbva-amount-4xl-line-height, 2rem);
  @apply --bbva-amount-4xl; }
  :host([variant='4xl']) .currency {
    font-size: var(--bbva-amount-4xl-currency-font-size, var(--typographyTypeXLarge, ${s(H)}));
    line-height: var(--bbva-amount-4xl-currency-line-height, var(--lineHeightTypeXLarge, ${s(F)}));
    @apply --bbva-amount-4xl-currency; }

:host([variant='5xl']) {
  font-size: var(--bbva-amount-5xl-font-size, 3rem);
  line-height: var(--bbva-amount-5xl-line-height, 3rem);
  @apply --bbva-amount-5xl; }
  :host([variant='5xl']) .currency {
    font-size: var(--bbva-amount-5xl-currency-font-size, 1.75rem);
    line-height: var(--bbva-amount-5xl-currency-line-height, 2rem);
    @apply --bbva-amount-5xl-currency; }
`;let q=class extends(l(t)){static get is(){return"bbva-amount"}static get properties(){return{abbr:{type:Number},abbreviations:{type:Object},decimalDigits:{type:Number,attribute:"decimal-digits"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},zeroDecimalsHidden:{type:Boolean,attribute:"zero-decimals-hidden"},trailingZeroDecimalsHidden:{type:Boolean,attribute:"trailing-zero-decimals-hidden"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.decimalDigits=2,this.language=document.documentElement.lang||"en",this.decimalsHidden=!1,this.zeroDecimalsHidden=!1,this.trailingZeroDecimalsHidden=!1,this.hasError=!1,this.abbreviations={1:"da",2:"h",3:"k",6:"M",9:"B"}}updated(e){e.has("amount")&&(this._computeHasError(this.amount),this._toggleBooleanAttribute("negative",this.negative))}_computeHasError(){const e=this.hasError,t=!this._isValidAmount;e!==t&&(this.hasError=t,this._toggleBooleanAttribute("has-error",t),this.dispatchEvent(new CustomEvent("has-error-changed",{detail:{value:t}})))}_toggleBooleanAttribute(e,t){t?this.setAttribute(e,""):this.removeAttribute(e)}get scale(){return this.abbr}set scale(e){this.abbr=e}get _isValidAmount(){return"number"==typeof this.amount&&Number.isFinite(this.amount)}get hasError(){return this._hasError}set hasError(e){this._hasError=Boolean(e)}get absAbbrAmount(){let e=c(this.amount);return this.abbr&&(e/=10**this._safeAbbrValue),e}get _fraccionalOverFlow(){return parseInt(h(this.absAbbrAmount).toFixed(this.decimalDigits),10)}get _integer(){const e=this._fraccionalOverFlow;return b(this.absAbbrAmount+e,this._groupChar)}get _groupChar(){return d(this.language)}get _separator(){return p(this.language)}get _fractional(){let e=parseFloat(h(this.absAbbrAmount).toFixed(this.decimalDigits)).toString().split(".")[1]||"";return this.trailingZeroDecimalsHidden?e:(e.length<this.decimalDigits&&(e=`${e}${new Array(this.decimalDigits+1).join("0")}`),e.slice(0,this.decimalDigits))}get _currency(){return u(this.localCurrency,this.currencyCode)}get _alignRight(){return g(this.currencyCode)}get _minusAfterSymbol(){return m(this.localCurrency)}get _decimalsHidden(){return!!this.decimalsHidden||(!v(this.currencyCode)||!!this.zeroDecimalsHidden&&!Number(this._fractional))}get _abbreviation(){const e=this.abbreviations[this._safeAbbrValue];return 0!==this._safeAbbrValue&&e?e:""}get _safeAbbrValue(){return this.abbr%1!=0?0:this.abbr}get srAmount(){let e="";return this.negative&&!this._minusAfterSymbol&&(e="-"),!this._currency||this._alignRight||this.showCurrencyCode||(e+=this._currency),this.negative&&this._minusAfterSymbol&&(e+="-"),this._isValidAmount&&(e+=this._integer),!this._decimalsHidden&&this._fractional&&(e=e+this._separator+this._fractional),this._safeAbbrValue&&(e=`${e} ${this._abbreviation}`),this._currency&&this._alignRight&&!this.showCurrencyCode&&(e=`${e} ${this._currency}`),this.showCurrencyCode&&(e=`${e} ${this.currencyCode}`),e}static get shadyStyles(){return`\n      ${W.cssText}\n      ${i("bbva-amount-shared-styles").cssText}\n    `}render(){return a`
      <style>
        ${this.constructor.shadyStyles}
      </style>
      <span class="sr-only">${this.srAmount}</span>
      <span class="amount-wrapper" aria-hidden="true">
        ${this.negative&&!this._minusAfterSymbol?a`
              <span class="minus minus-left">-</span>
            `:""}
        ${!this._currency||this._alignRight||this.showCurrencyCode?"":a`
              <span class="currency currency-left">${this._currency}</span>
            `}
        ${this.negative&&this._minusAfterSymbol?a`
              <span class="minus minus-right">-</span>
            `:""}
        ${this._isValidAmount?a`
          <span class="amount-block">
              <span class="integer">${this._integer}</span>
              ${!this._decimalsHidden&&this._fractional?a`
              <span class="separator">${this._separator}</span>
              <span class="fractional">${this._fractional}</span>
            `:""}
            ${this._safeAbbrValue?a`
              <span class="abbreviation">&nbsp;${this._abbreviation}</span>
            `:""}
              </span>`:""}


        ${this._currency&&this._alignRight&&!this.showCurrencyCode?a`
              <span class="currency currency-right">${this._currency}</span>
            `:""}
        ${this.showCurrencyCode?a`
              <span class="currency-code">&nbsp;${this.currencyCode}</span>
            `:""}
      </span>
    `}};customElements.define(q.is,q);var Z=e`:host {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
  display: block;
  box-sizing: border-box;
  font-size: var(--bbva-badge-default-font-size, var(--typographyTypeSmall, ${s(D)}));
  line-height: var(--bbva-badge-default-line-height, var(--lineHeightTypeSmall, ${s(I)}));
  font-weight: var(--bbva-badge-default-font-weight, var(--fontFacePrimaryBookItalicFontWeight, ${s(j.fontWeight)}));
  font-style: var(--bbva-badge-default-font-style, var(--fontFacePrimaryBookItalicFontStyle, ${s(j.fontStyle)}));
  color: var(--bbva-badge-default-color, var(--colorsPrimaryMedium, ${s(w)}));
  @apply --bbva-badge-default; }

:host([hidden]), [hidden] {
  display: none !important; }

*, *:before, *:after {
  box-sizing: inherit; }

:host(.error) {
  color: var(--bbva-badge-default-error-color, var(--colorsTertiaryType1Dark, ${s(B)})); }

:host(.neutral) {
  color: var(--bbva-badge-default-neutral-color, var(--colorsSecondary500, ${s(T)})); }

:host(.success) {
  color: var(--bbva-badge-default-success-color, var(--colorsTertiaryType6Dark, ${s(E)})); }

:host(.warning) {
  color: var(--bbva-badge-default-warning-color, var(--colorsTertiaryType2Dark, ${s(R)})); }

:host(.alt) {
  color: var(--bbva-badge-default-alt-color, var(--colorsPrimaryVariantDark, ${s(A)})); }
`;class G extends(n(t)){static get is(){return"bbva-badge-default"}static get properties(){return{text:{type:String}}}constructor(){super(),this.value=""}static get shadyStyles(){return`\n      ${Z.cssText}\n      ${i("bbva-badge-default-shared-styles").cssText}\n    `}render(){return a`
      <style>
        ${this.constructor.shadyStyles}
      </style>
      <span>${this.t(this.text)}</span>
    `}}customElements.define(G.is,G);var Y=e`:host {
  --_bg-color: var(--bbva-badge-notification-bg-color, var(--colorsTertiaryType1Dark, ${s(B)}));
  --_border-color: var(--bbva-badge-notification-border-color, var(--colorsPrimaryCoreLightened, ${s(S)}));
  --_color: var(--bbva-badge-notification-color, var(--colorsPrimaryCoreLightened, ${s(S)}));
  display: block;
  box-sizing: border-box;
  font-size: var(--bbva-badge-notification-font-size, var(--typographyType3XSmall, ${s(V)}));
  font-weight: var(--bbva-badge-notification-font-weight, var(--fontFacePrimaryMediumFontWeight, ${s(M.fontWeight)}));
  @apply --bbva-badge-notification; }

:host([hidden]), [hidden] {
  display: none !important; }

*, *:before, *:after {
  box-sizing: inherit; }

.badge-notification {
  display: inline-flex;
  justify-content: center;
  align-items: center;
  min-width: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 12) * 1em);
  height: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 12) * 1em);
  padding: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 12) * 1em);
  border-radius: 50%;
  background-color: var(--_bg-color);
  border: 1px solid var(--_border-color);
  color: var(--_color);
  @apply --bbva-badge-notification-span; }

:host(.border-dark) {
  --_border-color: var(--bbva-badge-notification-border-dark-border-color, var(--colorsPrimaryCore, ${s(z)}));
  @apply --bbva-badge-notification-border-dark; }

:host(.dark) {
  --_bg-color: var(--bbva-badge-notification-dark-bg-color, var(--colorsPrimaryCoreLight, ${s(C)}));
  @apply --bbva-badge-notification-dark; }

:host(.abs) {
  position: var(--bbva-badge-notification-position, absolute);
  @apply --bbva-badge-notification-abs; }

:host(.top-left) {
  bottom: 100%;
  right: 100%;
  transform: translate(1rem, 1rem);
  @apply --bbva-badge-notification-top-left; }

:host(.top-right) {
  bottom: 100%;
  left: 100%;
  transform: translate(-1rem, 1rem);
  @apply --bbva-badge-notification-top-right; }

:host(.bottom-left) {
  top: 100%;
  right: 100%;
  transform: translate(1rem, -1rem);
  @apply --bbva-badge-notification-bottom-left; }

:host(.bottom-right) {
  top: 100%;
  left: 100%;
  transform: translate(-1rem, -1rem);
  @apply --bbva-badge-notification-bottom-right; }
`;class U extends t{static get is(){return"bbva-badge-notification"}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},text:{type:String}}}static get shadyStyles(){return`\n      ${Y.cssText}\n      ${i("bbva-badge-notification-shared-styles").cssText}\n    `}render(){return a`
      <style>
        ${this.constructor.shadyStyles}
      </style>
      <span class="badge-notification" aria-label=${r(this.accessibilityText)}
        >${this.text}</span
      >
    `}}customElements.define(U.is,U);var J=e`:host {
  display: block;
  box-sizing: border-box;
  @apply --bbva-expandable-accordion; }
  :host:after {
    content: "";
    display: block;
    border-bottom: 1px solid var(--bbva-expandable-accordion-divider-color, var(--bbva-300, #D3D3D3));
    @apply --bbva-global-divider; }

bbva-badge-default {
  overflow: visible;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 16) * 1rem); }

bbva-badge-notification {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 16) * 1rem); }

:host([hidden]), [hidden] {
  display: none !important; }

*, *:before, *:after {
  box-sizing: inherit;
  padding: 0; }

.header-accordion {
  min-height: 3.5rem;
  display: flex;
  justify-content: start;
  align-items: center;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 15) * 1em);
  width: 100%;
  background: none;
  border: none;
  cursor: pointer;
  font-family: inherit;
  font-size: 0.9375rem;
  @apply --bbva-expandable-accordion-header; }

.left-icon {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 16) * 1rem);
  color: var(--bbva-expandable-accordion-left-icon-color, var(--bbva-400, #bdbdbd));
  @apply --bbva-expandable-accordion-left-icon; }

.text {
  display: flex;
  align-items: center;
  flex-grow: 1;
  text-align: left;
  font-size: 0.9375rem;
  font-weight: 400;
  color: var(--bbva-expandable-accordion-text-color, var(--bbva-600, #121212));
  @apply --bbva-expandable-accordion-text; }
  .text.bold-text {
    font-weight: 500; }
  .text.open {
    --bbva-expandable-accordion-text-color: var(--bbva-600, #121212); }
  .text.close {
    --bbva-expandable-accordion-text-color: var(--bbva-medium-blue, #1973B8); }

bbva-clip-box {
  margin-right: calc(var(--bbva-global-spacer, 0.5rem) * 2);
  @apply --bbva-expandable-accordion-clip-box; }

bbva-amount {
  font-size: var(--typographyTypeSmall, ${s(D)});
  line-height: var(--lineHeightTypeSmall, ${s(I)});
  @apply --bbva-expandable-accordion-amount; }

.right-icon {
  color: var(--bbva-expandable-accordion-right-icon-color, var(--bbva-white-core-blue, #1464A5));
  margin: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 16) * 1rem) 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 16) * 1rem);
  @apply --bbva-expandable-accordion-right-icon; }

.collapse-content {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 16) * 1rem);
  @apply --bbva-expandable-accordion-content; }
`;class K extends(l(t)){static get is(){return"bbva-expandable-accordion"}static get properties(){return{clipBox:{type:Boolean,attribute:"clip-box"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},bgClipBoxOpen:{type:String,attribute:"bg-clip-box-open"},bgClipBoxClose:{type:String,attribute:"bbva-medium-blue"},openIcon:{type:String,attribute:"open-icon"},closeIcon:{type:String,attribute:"close-icon"},stateIconSize:{type:Number,attribute:"state-icon-size"},rowTitle:{type:String,attribute:"row-title"},notificationBadgeText:{type:Number,attribute:"notification-badge-text"},notificationBadgeAccessibilityText:{type:String,attribute:"notification-badge-accessibility-text"},amountBadge:{type:String,attribute:"amount-badge"},amountBadgeClass:{type:String,attribute:"amount-badge-class"},_uniqueId:{type:Number},opened:{type:Boolean},src:{type:String}}}constructor(){super(),this.clipBox=!1,this.iconSize=24,this.bgClipBoxOpen="bbva-500",this.bgClipBoxClose="bbva-medium-blue",this.openIcon="coronita:expand",this.closeIcon="coronita:collapse",this.stateIconSize=24,this.bgClipBox="",this.amountBadgeClass="error",this.opened=!1,this._uniqueId=Math.floor(Math.random()*Date.now())}updated(e){e.has("opened")&&this.dispatchEvent(new CustomEvent("opened-changed",{bubbles:!0,composed:!0,detail:{value:this.opened}}))}static get shadyStyles(){return`\n      ${i("bbva-global-dividers-shared-styles").cssText}\n      ${J.cssText}\n      ${i("bbva-expandable-accordion-shared-styles").cssText}\n    `}render(){return a`
      <style>
        ${this.constructor.shadyStyles}
      </style>
      <button
        class="header-accordion"
        role="tab"
        aria-selected="${r(this.opened)}"
        aria-controls="${this._uniqueId}"
        aria-expanded="${r(this.opened)}"
        @click="${this._onHeaderClick}"
      >
        ${this._hasIcon?this._icon:""} ${this._hasClipbox?this._clipBox:""}
        <span class="row-title ${this._computedTextCss}"
          >${this.rowTitle}
          <bbva-badge-notification
            .accessibilityText="${r(this._notificationBadgeAccessibilityText)}"
            .text="${this.notificationBadgeText}"
            ?hidden="${!this.notificationBadgeText}"
          >
          </bbva-badge-notification
        ></span>
        ${this.amount?a`
              <span>
                <bbva-badge-default
                  .text="${r(this.amountBadge)}"
                  class="${this.amountBadgeClass}"
                >
                </bbva-badge-default>
              </span>
              <bbva-amount
                .amount="${this.amount}"
                .currencyCode="${this.currencyCode}"
                .localCurrency="${this.localCurrency}"
                .language="${this.language}"
              >
              </bbva-amount>
            `:""}
        <cells-icon
          .icon="${this.opened?this.closeIcon:this.openIcon}"
          .size="${this.stateIconSize}"
          class="right-icon"
        ></cells-icon>
      </button>

      <cells-collapse id="${this._uniqueId}" ?opened="${r(this.opened)}" data-id="collapse">
        <div class="collapse-content">
          <slot></slot>
        </div>
      </cells-collapse>
    `}get _icon(){return a`
      <cells-icon class="left-icon" .size="${this.iconSize}" .icon="${this.icon}" .src="${this.src}"> </cells-icon>
    `}get _clipBox(){return a`
      <bbva-clip-box
        class="small bitone"
        .bgColor="${this.opened?this.bgClipBoxOpen:this.bgClipBoxClose}"
        .icon="${this.icon}"
      >
      </bbva-clip-box>
    `}_onHeaderClick(){this.opened=!this.opened}get _notificationBadgeAccessibilityText(){return this.notificationBadgeAccessibilityText||void 0}get _hasIcon(){return!this.clipBox&&(this.icon||this.src)}get _hasClipbox(){return this.clipBox&&this.icon}get _computedTextCss(){const e=["text"];return this.clipBox&&(e.push("bold-text"),e.push(this.opened?"open":"close")),e.join(" ")}}customElements.define(K.is,K);var Q=e`*, *:before, *:after {
  box-sizing: inherit;
  margin: 0;
  padding: 0; }

:host {
  display: flex;
  align-items: center;
  line-height: calc(var(--bbva-global-spacer, 0.5rem) * 3);
  color: var(--bbva-list-header-color, var(--bbva-600, #121212));
  @apply --bbva-list-header; }

:host([hidden]), [hidden] {
  display: none !important; }

:host-context(button) .heading,
:host-context(button) .icon,
:host-context(a) .heading,
:host-context(a) .icon {
  color: var(--bbva-list-header-link-color, var(--bbva-medium-blue, #1973B8)); }

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis; }

.icon {
  margin-right: var(--bbva-global-spacer, 0.5rem);
  flex-shrink: 0; }

.right {
  margin-left: auto;
  white-space: nowrap; }

.right ::slotted([slot="right"]:not([icon])) {
  font-size: 0.9375rem;
  color: var(--bbva-list-header-right-content-color, var(--bbva-500, #666666)); }

.heading {
  font-weight: 500;
  font-size: 1rem;
  margin: 0 var(--bbva-global-spacer, 0.5rem) 0 0; }

.date {
  font-size: 0.9375rem;
  font-style: italic;
  font-weight: 500;
  color: inherit; }
`;class ee extends t{static get is(){return"cells-heading"}static get properties(){return{level:{type:Number}}}constructor(){super(),this.level=2}updated(e){e.has("level")&&(this._levelChanged(this.level),this.dispatchEvent(new CustomEvent("level-changed",{detail:{value:this.level}})))}static get shadyStyles(){return`\n      :host { display: block; }\n      :host([hidden]) { display: none; }\n      ${i("cells-heading-shared-styles")}\n    `}render(){return a`
      <style>${this.constructor.shadyStyles}</style>
      <slot></slot>
    `}_levelChanged(e){e>=1&&e<=6?(this.setAttribute("aria-level",e),this.setAttribute("role","heading")):(this.removeAttribute("aria-level"),this.removeAttribute("role"))}}customElements.define(ee.is,ee);const te="1.5rem",ie="1.25rem",ae="1.125rem",re="0.75rem",se="2rem",ne="1.5rem",oe="1.5rem",le="1rem";var ce=e`:host {
  display: inline-block;
  box-sizing: border-box;
  vertical-align: bottom;
  max-width: 100%;
  font-weight: var(--bbva-amount-font-weight, var(--fontFacePrimaryBookFontWeight, ${s(400)}));
  @apply --bbva-amount; }

*,
*:before,
*:after {
  box-sizing: inherit; }

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px; }

.amount-wrapper {
  display: block;
  word-spacing: -0.250em;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  unicode-bidi: bidi-override;
  @apply --bbva-amount-wrapper; }

.amount-block {
  margin: 0 0.125rem; }

@supports (-moz-appearance: meterbar) {
  .amount-wrapper {
    word-spacing: calc(-0.25em + 1.35px); } }

.minus {
  @apply --bbva-amount-minus; }
  .minus-left {
    float: var(--bbva-amount-minus-left-float, none);
    @apply --bbva-amount-minus-left; }
  .minus-right {
    float: var(--bbva-amount-minus-right-float, none);
    @apply --bbva-amount-minus-right; }

.currency {
  float: var(--bbva-amount-currency-float, none);
  @apply --bbva-amount-currency; }
  .currency-left, .currency-right {
    vertical-align: top; }
  .currency-left {
    @apply --bbva-amount-currency-left; }
  .currency-right {
    @apply --bbva-amount-currency-right; }

.currency-code {
  word-spacing: normal;
  @apply --bbva-amount-currency-code; }

.integer {
  @apply --bbva-amount-integer; }

.separator {
  @apply --bbva-amount-separator; }

.fractional {
  @apply --bbva-amount-fractional; }

.abbreviation {
  word-spacing: normal;
  @apply --bbva-amount-abbreviation; }

:host([hidden]),
[hidden] {
  display: none !important; }

:host([variant='l']) {
  font-size: var(--bbva-amount-l-font-size, var(--typographyTypeLarge, ${s(ae)}));
  line-height: var(--bbva-amount-l-line-height, var(--lineHeightTypeLarge, ${s(oe)}));
  @apply --bbva-amount-l; }
  :host([variant='l']) .currency {
    font-size: var(--bbva-amount-l-currency-font-size, var(--typographyType3XSmall, ${s(re)}));
    line-height: var(--bbva-amount-l-currency-line-height, var(--lineHeightType3XSmall, ${s(le)}));
    @apply --bbva-amount-l-currency; }

:host([variant='xl']) {
  font-size: var(--bbva-amount-xl-font-size, var(--typographyTypeXLarge, ${s(ie)}));
  line-height: var(--bbva-amount-xl-line-height, var(--lineHeightTypeXLarge, ${s(ne)}));
  @apply --bbva-amount-xl; }
  :host([variant='xl']) .currency {
    font-size: var(--bbva-amount-xl-currency-font-size, var(--typographyType3XSmall, ${s(re)}));
    line-height: var(--bbva-amount-xl-currency-line-height, var(--lineHeightType3XSmall, ${s(le)}));
    @apply --bbva-amount-xl-currency; }

:host([variant='3xl']) {
  font-size: var(--bbva-amount-3xl-font-size, var(--typographyType3XLarge, ${s(te)}));
  line-height: var(--bbva-amount-3xl-line-height, var(--lineHeightType3XLarge, ${s(se)}));
  @apply --bbva-amount-3xl; }
  :host([variant='3xl']) .currency {
    font-size: var(--bbva-amount-3xl-currency-font-size, var(--typographyType3XSmall, ${s(re)}));
    line-height: var(--bbva-amount-3xl-currency-line-height, var(--lineHeightType3XSmall, ${s(le)}));
    @apply --bbva-amount-3xl-currency; }

:host([variant='4xl']) {
  font-size: var(--bbva-amount-4xl-font-size, 2rem);
  line-height: var(--bbva-amount-4xl-line-height, 2rem);
  @apply --bbva-amount-4xl; }
  :host([variant='4xl']) .currency {
    font-size: var(--bbva-amount-4xl-currency-font-size, var(--typographyTypeXLarge, ${s(ie)}));
    line-height: var(--bbva-amount-4xl-currency-line-height, var(--lineHeightTypeXLarge, ${s(ne)}));
    @apply --bbva-amount-4xl-currency; }

:host([variant='5xl']) {
  font-size: var(--bbva-amount-5xl-font-size, 3rem);
  line-height: var(--bbva-amount-5xl-line-height, 3rem);
  @apply --bbva-amount-5xl; }
  :host([variant='5xl']) .currency {
    font-size: var(--bbva-amount-5xl-currency-font-size, 1.75rem);
    line-height: var(--bbva-amount-5xl-currency-line-height, 2rem);
    @apply --bbva-amount-5xl-currency; }
`;class he extends(l(t)){static get is(){return"bbva-amount"}static get properties(){return{abbr:{type:Number},abbreviations:{type:Object},decimalDigits:{type:Number,attribute:"decimal-digits"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},zeroDecimalsHidden:{type:Boolean,attribute:"zero-decimals-hidden"},trailingZeroDecimalsHidden:{type:Boolean,attribute:"trailing-zero-decimals-hidden"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.decimalDigits=2,this.language=document.documentElement.lang||"en",this.decimalsHidden=!1,this.zeroDecimalsHidden=!1,this.trailingZeroDecimalsHidden=!1,this.hasError=!1,this.abbreviations={1:"da",2:"h",3:"k",6:"M",9:"B"}}updated(e){e.has("amount")&&(this._computeHasError(this.amount),this._toggleBooleanAttribute("negative",this.negative))}_computeHasError(){const e=this.hasError,t=!this._isValidAmount;e!==t&&(this.hasError=t,this._toggleBooleanAttribute("has-error",t),this.dispatchEvent(new CustomEvent("has-error-changed",{detail:{value:t}})))}_toggleBooleanAttribute(e,t){t?this.setAttribute(e,""):this.removeAttribute(e)}get scale(){return this.abbr}set scale(e){this.abbr=e}get _isValidAmount(){return"number"==typeof this.amount&&Number.isFinite(this.amount)}get hasError(){return this._hasError}set hasError(e){this._hasError=Boolean(e)}get absAbbrAmount(){let e=c(this.amount);return this.abbr&&(e/=10**this._safeAbbrValue),e}get _fraccionalOverFlow(){return parseInt(h(this.absAbbrAmount).toFixed(this.decimalDigits),10)}get _integer(){const e=this._fraccionalOverFlow;return b(this.absAbbrAmount+e,this._groupChar)}get _groupChar(){return d(this.language)}get _separator(){return p(this.language)}get _fractional(){let e=parseFloat(h(this.absAbbrAmount).toFixed(this.decimalDigits)).toString().split(".")[1]||"";return this.trailingZeroDecimalsHidden?e:(e.length<this.decimalDigits&&(e=`${e}${new Array(this.decimalDigits+1).join("0")}`),e.slice(0,this.decimalDigits))}get _currency(){return u(this.localCurrency,this.currencyCode)}get _alignRight(){return g(this.currencyCode)}get _minusAfterSymbol(){return m(this.localCurrency)}get _decimalsHidden(){return!!this.decimalsHidden||(!v(this.currencyCode)||!!this.zeroDecimalsHidden&&!Number(this._fractional))}get _abbreviation(){const e=this.abbreviations[this._safeAbbrValue];return 0!==this._safeAbbrValue&&e?e:""}get _safeAbbrValue(){return this.abbr%1!=0?0:this.abbr}get srAmount(){let e="";return this.negative&&!this._minusAfterSymbol&&(e="-"),!this._currency||this._alignRight||this.showCurrencyCode||(e+=this._currency),this.negative&&this._minusAfterSymbol&&(e+="-"),this._isValidAmount&&(e+=this._integer),!this._decimalsHidden&&this._fractional&&(e=e+this._separator+this._fractional),this._safeAbbrValue&&(e=`${e} ${this._abbreviation}`),this._currency&&this._alignRight&&!this.showCurrencyCode&&(e=`${e} ${this._currency}`),this.showCurrencyCode&&(e=`${e} ${this.currencyCode}`),e}static get shadyStyles(){return`\n      ${ce.cssText}\n      ${i("bbva-amount-shared-styles").cssText}\n    `}render(){return a`
      <style>
        ${this.constructor.shadyStyles}
      </style>
      <span class="sr-only">${this.srAmount}</span>
      <span class="amount-wrapper" aria-hidden="true">
        ${this.negative&&!this._minusAfterSymbol?a`
              <span class="minus minus-left">-</span>
            `:""}
        ${!this._currency||this._alignRight||this.showCurrencyCode?"":a`
              <span class="currency currency-left">${this._currency}</span>
            `}
        ${this.negative&&this._minusAfterSymbol?a`
              <span class="minus minus-right">-</span>
            `:""}
        ${this._isValidAmount?a`
          <span class="amount-block">
              <span class="integer">${this._integer}</span>
              ${!this._decimalsHidden&&this._fractional?a`
              <span class="separator">${this._separator}</span>
              <span class="fractional">${this._fractional}</span>
            `:""}
            ${this._safeAbbrValue?a`
              <span class="abbreviation">&nbsp;${this._abbreviation}</span>
            `:""}
              </span>`:""}


        ${this._currency&&this._alignRight&&!this.showCurrencyCode?a`
              <span class="currency currency-right">${this._currency}</span>
            `:""}
        ${this.showCurrencyCode?a`
              <span class="currency-code">&nbsp;${this.currencyCode}</span>
            `:""}
      </span>
    `}}customElements.define(he.is,he);class be extends(n(l(t))){static get is(){return"bbva-list-header"}static get properties(){return{icon:{type:String,reflect:!0},src:{type:String,reflect:!0},iconSize:{type:Number,attribute:"icon-size"},iconAriaLabel:{type:String,attribute:"icon-aria-label"},heading:{type:String},headingLevel:{type:Number,attribute:"heading-level"},date:{type:String},dateFormat:{type:String,attribute:"date-format"},todayAsString:{type:Boolean,attribute:"today-as-string"}}}get _iconAriaHidden(){return Boolean(this.src&&!this.iconAriaLabel)}get _iconHidden(){return Boolean(!this.icon&&!this.src)}constructor(){super(),this.icon="",this.iconSize=24,this.headingLevel=3,this.dateFormat="DD/MM/YYYY",this.todayAsString=!1}static get shadyStyles(){return`\n      ${Q.cssText}\n      ${i("bbva-list-header-shared-styles").cssText}\n      `}render(){return a`
      <style>
        ${this.constructor.shadyStyles}
      </style>
      ${this.iconTemplate()} ${this.headerTemplate()} ${this.rightTemplate()}
    `}iconTemplate(){return a`
      <cells-icon
        id="icon"
        class="icon icon-size-${this.iconSize}"
        role="img"
        ?hidden="${this._iconHidden}"
        aria-label="${this.iconAriaLabel?this.t(this.iconAriaLabel):""}"
        ?aria-hidden=${this._iconAriaHidden}
        icon=${this.icon}
        src="${this.src}"
      ></cells-icon>
    `}headerTemplate(){return a`
      <cells-heading level="${this.headingLevel}" class="heading ellipsis" id="heading"
        >${this.t(this.heading)}</cells-heading
      >
    `}rightTemplate(){return a`
      <div class="right">
        <slot name="right">
          <div>
            ${this.amount?a`
                  <bbva-amount
                    id="amount"
                    variant="3xl"
                    amount="${this.amount}"
                    local-currency="${this.localCurrency}"
                    currency-code="${this.currencyCode}"
                    language="${this.language}"
                  >
                  </bbva-amount>
                `:""}
            ${this.date?a`
                  <cells-date
                    class="date"
                    id="date"
                    date="${this.date}"
                    format="${this.dateFormat}"
                    ?calendar-time="${this.todayAsString}"
                  ></cells-date>
                `:""}
          </div>
        </slot>
      </div>
    `}}customElements.define(be.is,be);var de=e`@charset "UTF-8";
:host {
  max-height: 100%;
  display: block;
  box-sizing: border-box;
  @apply --bbva-expandable-accordion-list; }

:host([hidden]), [hidden] {
  display: none !important; }

*, *:before, *:after {
  box-sizing: inherit; }

bbva-list-header {
  position: sticky;
  top: 0;
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 15) * 1em);
  min-height: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 16) * 1rem);
  background-color: var(--colorsPrimaryCoreLightened, ${s(S)});
  @apply --bbva-expandable-accordion-list--header; }

bbva-expandable-accordion {
  font-size: var(--typographyTypeSmall, ${s(D)});
  color: var(--colorsSecondary500, ${s(T)});
  @apply --bbva-expandable-accordion-list--expandable; }
  bbva-expandable-accordion + bbva-list-header {
    margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 16) * 1rem);
    @apply --bbva-expandable-accordion-list--header-after-expandable; }
  bbva-expandable-accordion p  {
    margin: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 16) * 1rem);
    @apply --bbva-expandable-accordion-list--p; }
  bbva-expandable-accordion p:last-child {
    margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(X)}))) / 16) * 1rem); }
`;class pe extends t{static get is(){return"bbva-expandable-accordion-list"}static get properties(){return{list:{type:Array},sorted:{type:Boolean},isGrouped:{type:Boolean,attribute:"is-grouped"},groupLabelLength:{type:Number,attribute:"group-label-length"},_list:{type:Array}}}constructor(){super(),this.list=[],this.sorted=!1,this.isGrouped=!1,this.groupLabelLength=1,this._list=[]}updated(e){let t=["list","isGrouped","sorted","groupLabelLength"];for(let[i,a]of e)if(-1!==t.indexOf(i)&&void 0!==a){this._parseList();break}e.has("list")&&this._parseList()}reset(){this.list=[],this._list=[]}_setProperties(e){let t=e||{};for(const e in t)this.hasOwnProperty(`__${e}`)&&(this[e]=t[e])}_parseList(){this.list||(this.list=[]);let e,t=[...this.list];this.sorted&&t.sort(((e,t)=>e.title>t.title?1:-1)),t=this._groupList(t),e=Object.keys(t).map((e=>({header:e,body:t[e]}))),this._list=this.sorted?e.sort(((e,t)=>e.header>t.header?1:-1)):e}_groupList(e){return e.reduce(((e,t)=>{let i=this.isGrouped?t.category||t.title.substr(0,this.groupLabelLength).toUpperCase():"";return e[i]||(e[i]=[]),e[i].push(t),e}),{})}_closeAccordions(e){this.shadowRoot.querySelectorAll("bbva-expandable-accordion").forEach((t=>{e?t.opened&&t!==e.currentTarget&&e.detail.value&&(t.opened=!1):t.opened=!1}))}_setExpandableItem(e){const t=e.params||{};return a`
      <bbva-expandable-accordion
        clip-box="${r(t.clipBox)}"
        bg-clip-box="${r(t.bgClipBox)}"
        bg-clip-box-open="${r(t.bgClipBoxOpen)}"
        bg-clip-box-close="${r(t.bgClipBoxClose)}"
        icon="${r(t.icon)}"
        icon-size="${r(t.iconSize)}"
        state-icon-size="${r(t.stateIconSize)}"
        open-icon="${r(t.openIcon)}"
        notification-badge-text="${r(t.notificationBadgeText)}"
        notification-badge-accessibility-text="${r(t.notificationBadgeAccessibilityText)}"
        amount="${r(t.amount)}"
        amount-badge="${r(t.amountBadge)}"
        amount-badge-class="${r(t.amountBadgeClass)}"
        currency-code="${r(t.currencyCode)}"
        local-currency="${r(t.localCurrency)}"
        language="${r(t.language)}"
        row-title="${e.title}"
        @opened-changed="${this._closeAccordions}">
        <div>
          ${e.content?e.content.map((e=>a`<p>${e}</p>`)):""}
        </div>
      </bbva-expandable-accordion>
    `}static get shadyStyles(){return`\n      ${de.cssText}\n      ${i("bbva-expandable-accordion-list-shared-styles").cssText}\n    `}render(){return a`
      <style>${this.constructor.shadyStyles}</style>
      ${this._list.map((e=>a`
        ${e.header?a`<bbva-list-header heading="${e.header}"></bbva-list-header>`:""}
        ${e.body?e.body.map((e=>a`${this._setExpandableItem(e)}`)):""}
      `))}
    `}}customElements.define(pe.is,pe);
