import{z as a,a8 as e,a9 as r,ab as t,ac as i,ar as o,aa as s,an as n,a as c,aJ as l,L as d,af as p,ag as m,aK as g,bu as b,V as h,ak as v,h as x,bv as u,bt as y,aV as k,Z as f,f as $,g as S}from"./952f98a9.js";import{s as X}from"./9ab4f92c.js";const z={light:a`[ambient^=light] {
  --bbva-clip-card-data-color: initial;
  --bbva-clip-card-data-skeleton-color: initial;
  --bbva-clip-card-data--skeleton-bg-color: initial;
}
`,dark:a`[ambient^=dark] {
  --bbva-clip-card-data-color: var(--colorsPrimaryCoreDark, ${e(r.primaryCoreDark)});
  --bbva-clip-card-data-skeleton-color: var(--colorsPrimaryCore, ${e(r.primaryCore)});
  --bbva-clip-card-data-skeleton-bg-color: var(--colorsPrimaryCoreDark, ${e(r.primaryCoreDark)});
  --bbva-clip-card-data-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDark, ${e(r.primaryCoreDark)});
}
`},_=new o;var w=a`:host {
  --_main-color: var(--bbva-clip-card-data-color, var(--colorsPrimaryCore, ${e(r.primaryCore)}));
  --_main-dark-color: var(--bbva-clip-card-data-dark-color,var(--colorsPrimaryCoreLightened, ${e(r.primaryCoreLightened)}));
  --_secondary-color: var(--bbva-clip-card-data-secondary-color,var(--colorsSecondary600, ${e(r.secondary600)}));
  --_type2XSmall: var(--bbva-clip-card-data-type-2x, 0.875rem);
  --_type3XSmall: var(--bbva-clip-card-data-type-3x, 0.5625rem);
  --_type4XSmall: var(--bbva-clip-card-data-type-4x, 6px);
  --_medium-text: var(--bbva-clip-card-data-text-medium, var(--fontFacePrimaryMediumFontWeight, ${e(t.medium.fontWeight)}));
  --_other-bank: var(--bbva-clip-card-data-other-bank, var(--colorsPrimaryCoreLightened, ${e(r.primaryCoreLightened)}));
  --_filter-navy: var(--bbva-clip-card-data-filter-navy, rgb(7, 33, 70, 0.2));
  --skeleton-quote-color: var(--bbva-clip-card-data-dark-mode-skeleton-color, var(--bbva-clip-card-data-skeleton-color, var(--colorsPrimaryCoreLightened, ${e(r.primaryCoreLightened)})));
  --skeleton-quote-bg: var(--bbva-clip-card-data-dark-mode-skeleton-bg-color, var(--bbva-clip-card-data-skeleton-bg-color, var(--colorsSecondary200, ${e(r.secondary200)})));
  --skeleton-animated-layer-bg: var(--bbva-clip-card-data-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-clip-card-data-skeleton-animated-layer-bg ,var(--colorsSecondary200, ${e(r.secondary200)})));
  -webkit-text-size-adjust: none;
  text-size-adjust: none;
  display: block;
  box-sizing: border-box;
  border-radius: 0.3125rem;
  overflow: hidden;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.sr-only,
.sr-only ::slotted([slot=sr-only]) {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

svg {
  display: inline-block;
  height: 100%;
  max-width: 100%;
  fill: currentColor;
  pointer-events: none;
}

figure {
  background-image: var(--bg-image);
}

.container {
  display: grid;
}

.card {
  display: grid;
  height: 100%;
  width: 100%;
  margin: auto;
  color: var(--_main-color);
  background-size: cover;
  background-position: center;
  --bbva-text-color: var(--_main-color);
}
.card.dark {
  color: var(--_main-dark-color);
  --bbva-text-color: var(--_main-dark-color);
}
.card.shadow {
  text-shadow: 0 0.125rem 0.125rem var(--_secondary-color), 0 0.0625rem 0.0625rem var(--_secondary-color), 0 -0.0625rem 0.0625rem var(--_secondary-color), -0.0625rem 0 0.0625rem var(--_secondary-color);
}

:not(.number-top) > span {
  display: block;
}

.main {
  display: flex;
  align-items: start;
  justify-content: space-between;
  text-shadow: none;
}

.main-logo {
  height: 0.875rem;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}

.main-payment {
  font-size: 0.625rem;
}

.holder-logo {
  font-size: var(--_type4XSmall);
  line-height: 1.5;
}
.holder-logo svg {
  height: 0.875rem;
}

.holder {
  display: flex;
  align-self: flex-end;
  flex-direction: column;
  text-transform: uppercase;
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(t.medium.fontWeight)});
}
.holder .holder-bottom {
  display: flex;
  align-items: flex-end;
}

:host([size=XL]) {
  width: 12.5rem;
  height: 8.5rem;
}
:host([size=XL]) .card {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1em);
}
:host([size=XL]) [data-tag-name=bbva-text] {
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  font-weight: var(--_medium-text);
}
:host([size=XL]) [data-tag-name=bbva-text].holder-number {
  word-spacing: 2px;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
  margin-bottom: 0;
}
:host([size=XL]) [data-tag-name=bbva-text].holder-name {
  letter-spacing: initial;
}
:host([size=XL]) time {
  text-align: end;
  font-size: 0.75rem;
}

:host([size=XXL]) {
  width: 16rem;
  height: 11rem;
  border-radius: 0.4375rem;
}
:host([size=XXL]) .card {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1em);
}
:host([size=XXL]) [data-tag-name=bbva-text] {
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  font-weight: var(--_medium-text);
}
:host([size=XXL]) [data-tag-name=bbva-text].holder-number {
  display: inline-flex;
  word-spacing: 2px;
  font-size: 1.125rem;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
  margin-bottom: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}
:host([size=XXL]) time {
  text-align: end;
  font-size: 0.9375rem;
  margin-bottom: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}

:host([pan-safe=true]) .expiration-text {
  visibility: hidden;
}

:host([size=XXL-collapse]) {
  width: 16rem;
  height: 5rem;
  border-radius: 0.4375rem 0.4375rem 0 0;
}
:host([size=XXL-collapse]) .container {
  background-color: var(--_filter-navy);
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1em);
}
:host([size=XXL-collapse]) .other-bank {
  background: var(--_other-bank);
  --bbva-text-color: var(--_main-dark-color);
}
:host([size=XXL-collapse]) .other-bank .holder-number {
  margin-top: 5px;
}
:host([size=XXL-collapse]) .main-logo {
  margin-bottom: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}
:host([size=XXL-collapse]) .holder {
  display: flex;
  flex-direction: row;
  align-items: last baseline;
}
:host([size=XXL-collapse]) .holder-logo {
  display: none;
}
:host([size=XXL-collapse]) [data-tag-name=bbva-text] {
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  font-weight: var(--_medium-text);
}
:host([size=XXL-collapse]) [data-tag-name=bbva-text].holder-number {
  position: relative;
  display: inline-flex;
  word-spacing: 2px;
  font-size: 0.9375rem;
  margin-bottom: 0;
  z-index: 10;
}
:host([size=XXL-collapse]) [data-tag-name=bbva-text].expiration-text {
  height: 1.25rem;
  text-transform: none;
  text-align: end;
  font-size: var(--typographyType4XSmall, ${e(i.type4XSmall)});
}
:host([size=XXL-collapse]) time {
  text-align: end;
  font-size: 0.9375rem;
  margin-left: 0.6875rem;
}

.holder-top {
  flex: 1;
  min-width: 0;
  letter-spacing: 0.128px;
}

:host([image-src]) .card {
  background-size: contain;
  background-repeat: no-repeat;
}
:host([image-src]) .main-logo, :host([image-src]) .number-top, :host([image-src]) .holder-logo {
  visibility: hidden;
}

:host([loading]) {
  position: relative;
  pointer-events: none;
  background-repeat: no-repeat;
  overflow: hidden;
  opacity: 1;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  height: inherit;
  background-color: var(--skeleton-animated-layer-bg);
  top: 0;
  right: 0;
  left: 5.625rem;
}
:host([loading]):host([size=XL]) {
  height: 8.5rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((32px * 2) + (12px/ 2)) 12px, calc((115px * 2) + (12px/ 2)) 12px, calc((90px * 2) + (12px/ 2)) 12px, calc((30px * 2) + (12px/ 2)) 12px;
  background-position: 16px 16px, 16px  86px, 16px  110px, calc(100% - 16px) 110px;
}
:host([loading]):host([size=XL]) .skeleton {
  left: 4.375rem;
}
:host([loading]):host([size=XXL]) {
  height: 10.75rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((32px * 2) + (16px/ 2)) 16px, calc((165px * 2) + (16px/ 2)) 16px, calc((145px * 2) + (16px/ 2)) 16px, calc((40px * 2) + (16px/ 2)) 16px;
  background-position: 16px 16px, 16px  107px, 16px  140px, calc(100% - 16px) 140px;
}
:host([loading]):host([size=XXL-collapse]) {
  height: 5rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((32px * 2) + (16px/ 2)) 16px, calc((145px * 2) + (16px/ 2)) 16px, calc((40px * 2) + (16px/ 2)) 16px;
  background-position: 16px 16px, 16px  50px, calc(100% - 16px) 50px;
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
${_.mediaRules()}`;class L extends(n(c(l(d)))){static get scopedElements(){return{"bbva-core-icon":p,"bbva-text":m,"bbva-clip-box":g}}static get is(){return"bbva-clip-card-data"}static get properties(){return{variant:{type:String},kind:{type:String,reflect:!0},holderName:{type:String,attribute:"holder-name"},cardNumber:{type:String,attribute:"card-number"},panSafe:{type:Boolean,attribute:"pan-safe"},visibleChars:{type:Number,attribute:"visible-chars"},expirationDate:{type:String,attribute:"expiration-date"},expirationDateText:{type:String,attribute:"expiration-date-text"},imageSrc:{type:String,attribute:"image-src"},kindPayment:{type:String,attribute:"kind-payment"},logo:{type:String},cardNet:{type:String,attribute:"card-net"},shadow:{type:Boolean,attribute:"shadow"},size:{type:String,reflect:!0},loading:{type:Boolean,reflect:!1}}}constructor(){super(),this.variant="default",this.logo=b(),this.cardNet="visa",this.cardNumber="",this.holderName="",this.expirationDate="",this.expirationDateText="bbva-clip-card-data-expiration-date",this.kind="",this.kindPayment="",this.panSafe=!1,this.visibleChars=4,this.shadow=!1,this.size="XL",this.loading=!1}static _cardNumberFormat(a){const e=a.toString().replace(/\s+/g,"").replace(/[^0-9]/gi,"").match(/\d{4,16}/g),r=e&&e[0]||"",t=[];for(let a=0,e=r.length;a<e;a+=4)t.push(r.substring(a,a+4));return t.length?t.join(" "):""}_panTruncated(a){return h(a,"•",!0,this.visibleChars)}static _dateTimeFormat(a){return a.replace(/\//,"-").replace(/\s+/g,"")}static get styles(){return[super.styles,w,z.light,z.dark,v("bbva-clip-card-data-shared-styles")]}render(){return x`${this.loading?x` <div class="skeleton"></div> `:x`
          <span class="sr-only">
            <slot name="sr-only">${this._accessibleText}</slot>
          </span>
          ${this.card}
        `}`}_holderNameTpl(){const a=`${this.holderName}`;return this.holderName&&x`<li>${a}</li>`}_cardNumberTpl(){const a=`${this.t("bbva-clip-card-data-card-number")}: ${this.cardNumber}`;return this.cardNumber&&x`<li>${a}</li>`}_expirationDateTpl(){const a=`${this.t(this.expirationDateText)}: ${this.expirationDate}`;return this.expirationDate&&x`<li>${a}</li>`}_differentBank(){return!(this.logo===b()||!this.panSafe)||null}get _accessibleText(){return x`<ul>
      ${this._holderNameTpl()} ${this._cardNumberTpl()} ${this._expirationDateTpl()}
    </ul>`}get mainLogo(){return x` <bbva-core-icon icon="${this.logo}" size="47" height="14"></bbva-core-icon> `}get typeLogo(){return u`${y[this.cardNet]}`}get _cardAsset(){return u`${y[`${this.variant}card`]}`}get _otherBank(){const a=this.cardNumber&&this.panSafe;return x` ${a&&x`<bbva-text
      class="holder-number"
      size="S"
      unset
      text=${this._panTruncated(this.cardNumber)}
    ></bbva-text>`}`}get _collapseCard(){return x`
      <div class="collapse">
        ${this._differentBank()?this._otherBank:x`
          <bbva-text class="expiration-text" unset text="${this.t(this.expirationDateText)}">
          </bbva-text>
      ${this.cardNumber?x`<bbva-text
              class="holder-number"
              size="S"
              unset
              text=${this.panSafe?this._panTruncated(this.cardNumber):this.constructor._cardNumberFormat(this.cardNumber)}
            ></bbva-text>`:""}
      <time datetime="${this.constructor._dateTimeFormat(this.expirationDate)}"
        >${this.expirationDate}</time
      >
    </div>
      `}
      </div>
    `}get card(){return x`
      <figure
        style="--bg-image: url(${this.imageSrc||X(this._cardAsset)});"
        class="card ${"default"===this.variant?"":"dark"} ${this.shadow?"shadow":""} ${this._differentBank()&&"other-bank"}"
        aria-hidden="true"
      >
        <div class="container">
          <div class="main">
            ${this._differentBank()?x`<bbva-clip-box icon="${this.logo}" size="small"> </bbva-clip-box>`:x`<span class="main-logo">${this.mainLogo}</span>`}
            <span class="main-payment">${this.kindPayment}</span>
          </div>
          <div class="holder">
            ${"XXL-collapse"===this.size?k:x` ${this.cardNumber?x`<bbva-text
                          class="holder-number"
                          size="S"
                          unset
                          text=${this.panSafe?this._panTruncated(this.cardNumber):this.constructor._cardNumberFormat(this.cardNumber)}
                        ></bbva-text>`:k}
                    <time datetime="${this.constructor._dateTimeFormat(this.expirationDate)}"
                      >${this.expirationDate}</time
                    >`}

          ${"XXL-collapse"===this.size&&this.cardNumber?this._collapseCard:x`
          <div class="holder-bottom">
            <div class="holder-top">
              <bbva-text class="holder-name" size="3XS" unset text="${this.holderName}"></bbva-text>
            </div>
            <div class="holder-logo">${this.typeLogo}</div>
          </div>
        </div>`}
          </div>
      </figure>
    `}}var N={...f,...$,bbvaClipCardData:`\n  --bbva-clip-card-data-dark-mode-skeleton-color: ${S("colors.cool50")};\n  --bbva-clip-card-data-dark-mode-skeleton-bg-color: ${S("colors.cool60")};\n  --bbva-clip-card-data-dark-mode-skeleton-animated-layer-bg-color: ${S("colors.cool60")};\n  `};export{L as B,N as a,z as b};
