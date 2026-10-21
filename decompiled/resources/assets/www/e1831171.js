import{z as a,ar as t,a8 as e,a9 as r,b0 as i,au as n,bc as o,al as l,bd as s,b1 as c,aa as d,be as b,bf as g,ac as p,ab as m,ad as u,a as v,aS as h,L as y,ag as $,bg as f,ae as S,aw as k,b6 as _,bh as x,bi as L,bj as C,S as w,ak as A,h as T,V as I,i as V}from"./952f98a9.js";var P=a`[ambient^=light] {
  --bbva-panel-detail-title-color: initial;
  --bbva-panel-detail-status-description-color: initial;
  --bbva-panel-detail-amount-info-color: initial;
  --bbva-panel-detail-negative-amount-color: initial;
  --bbva-progress-bar-main-legend-bg-color: initial;
  --bbva-progress-bar-secondary-legend-bg-color: initial;
  --bbva-panel-detail-extra-info-color: initial;
  --bbva-panel-detail-wrapper-color: initial;
  --bbva-panel-detail-progress-bar-color: initial;
}
${(new t).mediaRules()}`;const B=new t;const z={dark:a`
    ${a`[ambient^=dark] {
  --bbva-panel-detail-title-color: var(--colorsPrimaryCoreLightened, ${e(r.primaryCoreLightened)});
  --bbva-panel-detail-status-description-color: var(--colorsPrimaryCoreLightened, ${e(r.primaryCoreLightened)});
  --bbva-panel-detail-amount-info-color: var(--colorsPrimaryCoreLightened, ${e(r.primaryCoreLightened)});
  --bbva-panel-detail-negative-amount-color: var(--colorsPrimaryCoreLightened, ${e(r.primaryCoreLightened)});
  --bbva-progress-bar-main-legend-bg-color: var(--colorsPrimaryCoreLightened, ${e(r.primaryCoreLightened)});
  --bbva-progress-bar-secondary-legend-bg-color: var(--colorsPrimaryCoreLightened, ${e(r.primaryCoreLightened)});
  --bbva-panel-detail-extra-info-color: var(--colorsPrimaryCoreLightened, ${e(r.primaryCoreLightened)});
  --bbva-panel-detail-wrapper-color: var(--colorsPrimaryCoreLightened, ${e(r.primaryCoreLightened)});
  --bbva-panel-detail-progress-bar-color: var(--colorsPrimaryMediumLight, ${e(r.primaryMediumLight)});
}
${B.mediaRules()}`}
    ${i.dark}
    ${n.dark}
    ${o.dark}
    ${l.dark}
    ${s.dark}
    ${c.dark}
  `,light:a`
    ${P}
    ${i.light}
    ${n.light}
    ${o.light}
    ${l.light}
    ${s.light}
    ${c.light}
  `},F=new t;var M=a`:host {
  display: block;
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1em);
  box-sizing: border-box;
  border-radius: var(--bbva-panel-detail-border-radius, var(--borderRadiusSmall, ${e(b.small)}));
  box-shadow: var(--bbva-panel-detail-box-shadow, var(--boxShadowType1, ${e(g.type1)}));
  text-align: center;
  --_panel-detail-title-color: var(--bbva-panel-detail-title-dark-mode-color, var(--bbva-panel-detail-title-color, var(--colorsSecondary600, ${e(r.secondary600)})));
  --_panel-detail-status-description-color: var(--bbva-panel-detail-status-description-dark-mode-color, var(--bbva-panel-detail-status-description-color, var(--colorsSecondary500, ${e(r.secondary500)})));
  --_panel-detail-amount-info-color: var(--bbva-panel-detail-amount-info-dark-mode-color, var(--bbva-panel-detail-amount-info-color, var(--colorsSecondary500, ${e(r.secondary500)})));
  --_panel-detail-negative-amount-color: var(--bbva-panel-detail-negative-amount-dark-mode-color, var(--bbva-panel-detail-negative-amount-color, var(--colorsTertiaryType1Dark, ${e(r.tertiaryType1Dark)})));
  --_panel-detail-main-legend-bg-color: var(--bbva-progress-bar-main-legend-dark-mode-bg-color, var(--bbva-progress-bar-main-legend-bg-color, var(--colorsPrimaryCoreLight, ${e(r.primaryCoreLight)})));
  --_panel-detail-secondary-legend-bg-color: var(--bbva-progress-bar-secondary-legend-dark-mode-bg-color, var(--bbva-progress-bar-secondary-legend-bg-color, var(--colorsSecondary200, ${e(r.secondary200)})));
  --_panel-detail-extra-info-color: var(--bbva-panel-detail-extra-info-dark-mode-color, var(--bbva-panel-detail-extra-info-color, var(--colorsSecondary500, ${e(r.secondary500)})));
  --_panel-detail-wrapper-color: var(--bbva-panel-detail-wrapper-dark-mode-color, var(--bbva-panel-detail-wrapper-color, var(--colorsSecondary600, ${e(r.secondary600)})));
  --_panel-detail-progress-bar-color: var(--bbva-panel-detail-progress-bar-dark-mode-color, var(--bbva-panel-detail-progress-bar-color, var(--colorsPrimaryMedium, ${e(r.primaryMedium)})));
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

button {
  background-color: transparent;
  padding: 0;
  border: none;
  width: 100%;
  font-family: inherit;
}

.title {
  display: block;
  font-size: var(--bbva-panel-detail-title-font-size, var(--typographyTypeLarge, ${e(p.typeLarge)}));
  font-weight: var(--bbva-panel-detail-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(m.medium.fontWeight)}));
  line-height: var(--bbva-panel-detail-title-line-height, var(--lineHeightTypeLarge, ${e(u.typeLarge)}));
  color: var(--_panel-detail-title-color);
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-badge-default] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1rem);
  width: 100%;
}

.status-description {
  display: block;
  color: var(--_panel-detail-status-description-color);
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-clip-card] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1rem);
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1rem);
  display: inline-block;
}

.bank-info {
  display: flex;
  justify-content: center;
  align-items: center;
}

.amount-info {
  display: block;
  font-size: var(--bbva-panel-detail-amount-info-font-size, var(--typographyTypeSmall, ${e(p.typeSmall)}));
  line-height: var(--bbva-panel-detail-amount-info-line-height, var(--lineHeightTypeSmall, ${e(u.typeSmall)}));
  color: var(--_panel-detail-amount-info-color);
}

.total-amount {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1rem);
}

.main-amount,
[data-tag-name=bbva-amount] {
  align-items: center;
}

[data-tag-name=bbva-amount][negative] {
  color: var(--_panel-detail-negative-amount-color);
}

[data-tag-name=bbva-progress-bar-default] {
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1rem);
  --bbva-progress-bar-default-progress-color: var(--_panel-detail-progress-bar-color);
}

.legend {
  height: 0.625rem;
  width: 0.625rem;
  transform: skew(-27deg);
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1rem);
  display: inline-block;
}
.legend.main {
  background-color: var(--_panel-detail-main-legend-bg-color);
}
.legend.secondary {
  background-color: var(--_panel-detail-secondary-legend-bg-color);
}

.extra-info {
  display: block;
  font-weight: var(--bbva-panel-detail-extra-info-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(m.medium.fontWeight)}));
  font-style: var(--bbva-panel-detail-extra-info-font-style, var(--fontFacePrimaryMediumFontStyle, ${e(m.medium.fontStyle)}));
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1rem);
  color: var(--_panel-detail-extra-info-color);
}

[data-tag-name=bbva-clip-entities] {
  border-radius: 50%;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1rem);
}

.wrapper {
  color: var(--_panel-detail-wrapper-color);
}
.wrapper .number {
  font-weight: var(--fontFacePrimaryBookItalicTypeSmall, ${e(m.bookItalic.typeSmall)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${e(m.bookItalic.fontStyle)});
  font-size: var(--typographyTypeSmall, ${e(p.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(u.typeSmall)});
}

[data-tag-name=bbva-link] {
  font-size: var(--bbva-panel-detail-link-font-size, var(--typographyTypeSmall, ${e(p.typeSmall)}));
  line-height: var(--bbva-panel-detail-link-line-height, var(--lineHeightTypeSmall, ${e(u.typeSmall)}));
  font-weight: var(--bbva-panel-detail-link-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(m.medium.fontWeight)}));
  font-style: var(--bbva-panel-detail-link-font-style, var(--fontFacePrimaryMediumFontStyle, ${e(m.medium.fontStyle)}));
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1rem);
}

.text-left {
  text-align: left;
}

.text-right {
  text-align: right;
}

.amount {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1rem);
}
.amount .amount-wrapper-content {
  display: flex;
  justify-content: center;
}
.amount .text-right, .amount .text-left {
  flex: 1;
}
.amount .text-left .amount-wrapper-content {
  justify-content: flex-start;
}
.amount .text-right .amount-wrapper-content {
  justify-content: flex-end;
}

.short-amount {
  flex-direction: row;
  align-items: flex-start;
}

.long-amount {
  flex-direction: column;
}
.long-amount .secondary-panel {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(d.spacer)}))) / 16) * 1rem);
}
${F.mediaRules()}`;class D extends(v(h(y))){static get is(){return"bbva-panel-detail"}static get scopedElements(){return{"bbva-text":$,"bbva-clip-card":f,"bbva-clip-entities":S,"bbva-amount":k,"bbva-link":_,"bbva-badge-default":x,"bbva-progress-bar-default":L,"bbva-core-heading":C,"bbva-badge-variability":w}}static get properties(){return{cardTitle:{type:String,attribute:"card-title"},cardTitleAriaLevel:{type:Number,attribute:"card-title-aria-level"},mask:{type:Number},entity:{type:String},badgeText:{type:String,attribute:"badge-text"},badgeTextType:{type:String,attribute:"badge-text-type"},statusDescription:{type:String,attribute:"status-description"},cardImage:{type:String,attribute:"card-image"},secondaryAmount:{type:Number,attribute:"secondary-amount"},totalAmount:{type:Number,attribute:"total-amount"},amountInfo:{type:String,attribute:"amount-info"},secondaryAmountInfo:{type:String,attribute:"secondary-amount-info"},totalAmountInfo:{type:String,attribute:"total-amount-info"},extraInfo:{type:String,attribute:"extra-info"},link:{type:String},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},showProgressBar:{type:Boolean,attribute:"show-progress-bar"},ariaLabel:{type:String,attribute:"aria-label"},contentAriaLabel:{type:String,attribute:"content-aria-label"},noLink:{type:Boolean,attribute:"no-link",reflect:!0},cardStatus:{type:String,attribute:"card-status"},variant:{type:String,reflect:!0},badgeAlignment:{type:String,attribute:"badge-alignment"},badgeVariabilityLeft:{type:String,attribute:"badge-variability-left"},badgeVariabilityRight:{type:String,attribute:"badge-variability-right"},iconLink:{type:String,attribute:"icon-link"}}}constructor(){super(),this.visibleChars=4,this.maskChars="•",this.cardTitleAriaLevel="2",this.variant="long-amount",this.badgeAlignment="left",this.iconLink=""}update(a){super.update(a),a.has("ariaLabel")&&this._ariaLabelContent()}_ariaLabelContent(){this.ariaLabel&&(this.contentAriaLabel=this.ariaLabel,this.ariaLabel="",this.removeAttribute("aria-label"))}static get styles(){return[M,A("bbva-panel-detail-shared-styles"),z.light,z.dark]}get _cardImage(){return T`
      <bbva-clip-card card-image="${this.cardImage}" .status="${this.cardStatus}"> </bbva-clip-card>
    `}get _badgeText(){return T`
      <bbva-badge-default
        .text="${this.badgeText}"
        text-alignment="${this.badgeAlignment}"
        type="${this.badgeTextType}"
      >
      </bbva-badge-default>
    `}get _statusDescription(){return T`
      <bbva-text
        alignment="center"
        class="status-description"
        size="S"
        tag="span"
        .text="${this.statusDescription}"
        unset
      ></bbva-text>
    `}get _amount(){return T`
      <bbva-amount
        class="main-amount"
        variant="xl"
        .amount="${this.amount}"
        .currencyCode="${this.currencyCode}"
        .localCurrency="${this.localCurrency}"
        .language="${this.language}"
      >
      </bbva-amount>
    `}get _secondaryAmount(){return T`
      <bbva-amount
        variant="xl"
        .amount="${this.secondaryAmount}"
        .currencyCode="${this.currencyCode}"
        .localCurrency="${this.localCurrency}"
        .language="${this.language}"
      >
      </bbva-amount>
    `}get _totalAmount(){return T`
      <bbva-amount
        variant="xl"
        .amount="${this.totalAmount}"
        .currencyCode="${this.currencyCode}"
        .localCurrency="${this.localCurrency}"
        .language="${this.language}"
      >
      </bbva-amount>
    `}get _amountInfo(){return T`
      <div class="amount-info">
        ${this.showProgressBar?this.constructor._renderProgressLegend("main"):""}
        ${this.amountInfo}
      </div>
    `}get _secondaryAmountInfo(){return T`
      <div class="amount-info">
        ${this.showProgressBar?this.constructor._renderProgressLegend("secondary"):""}
        ${this.secondaryAmountInfo}
      </div>
    `}get _totalAmountInfo(){return T` <div class="amount-info">${this.totalAmountInfo}</div> `}get _extraInfo(){return T`
      <bbva-text
        alignment="center"
        class="extra-info"
        .text=${this.extraInfo}
        size="S"
        unset
        tag="span"
      ></bbva-text>
    `}get _progressBar(){return T`
      <bbva-progress-bar-default
        accessibility-text="Default progress bar"
        .currentValue=${this.amount}
        .maxValue=${this.amount+this.secondaryAmount}
      >
      </bbva-progress-bar-default>
    `}get _entity(){return T` <bbva-clip-entities size="small" .entity="${this.entity}"></bbva-clip-entities> `}get _link(){return T`
      <bbva-link @click=${this._onLinkClick} .icon="${this.iconLink}"
        ><span>${this.link}</span></bbva-link
      >
    `}static _renderProgressLegend(a){return T` <span class="legend ${a}"></span> `}get _cardTitle(){return T`
      <bbva-core-heading class="title" level="${this.cardTitleAriaLevel}"
        >${this.cardTitle}</bbva-core-heading
      >
    `}static _getMaskElement(a,t,e,r){if(a){const i=I(a,t,e,r);return T`
        <div class="wrapper">
          <span class="mask">${t}</span>
          <span class="number">${i.substr(t.length)}</span>
        </div>
      `}return T``}static _tmplBadgeVariability(a){return T` <bbva-badge-variability .status=${a}></bbva-badge-variability> `}get _accountDetail(){return T`
      <div class="bank-info">
        ${this.entity?this._entity:""}
        ${D._getMaskElement(this.mask,this.maskChars,!0,this.visibleChars)}
      </div>
    `}get _tmplAmountContent(){return T`
      ${(this.amount||0===this.amount)&&T`<div class="${"short-amount"===this.variant?"text-left":""}">
          <div class="amount-wrapper-content">
            ${this.badgeVariabilityLeft&&D._tmplBadgeVariability(this.badgeVariabilityLeft)}
            ${this._amount}
          </div>
          ${this.amountInfo?this._amountInfo:""}
        </div>`||""}
    `}get _tmplSecondaryAmountContent(){return T`
      ${(this.secondaryAmount||0===this.secondaryAmount)&&T`<div class="${"short-amount"===this.variant?"text-right":"secondary-panel"}">
          <div class="amount-wrapper-content">
            ${this.badgeVariabilityRight&&D._tmplBadgeVariability(this.badgeVariabilityRight)}
            ${this._secondaryAmount}
          </div>
          ${this.secondaryAmountInfo?this._secondaryAmountInfo:""}
        </div>`||""}
    `}get _detailContent(){return T`
      ${this.cardTitle?this._cardTitle:""} ${this.badgeText?this._badgeText:""}
      ${this.statusDescription?this._statusDescription:""}
      ${this.cardImage?this._cardImage:""} ${this.mask?this._accountDetail:""}
      ${this.showProgressBar?this._progressBar:""}
      ${(this.secondaryAmount||0===this.secondaryAmount||this.amount||0===this.amount||this.badgeVariabilityLeft||this.badgeVariabilityRight)&&T`<div class="amount ${this.variant}">
          ${this._tmplAmountContent} ${this._tmplSecondaryAmountContent}
        </div>`||""}
      ${this.totalAmount||0===this.totalAmount?T`<div class="total-amount">${this._totalAmount}</div>`:""}
      ${this.totalAmountInfo?this._totalAmountInfo:""} ${this.extraInfo?this._extraInfo:""}
      <slot></slot>
    `}render(){return T`
      ${this.noLink?T` <div class="container">${this._detailContent}</div> `:T`
            <button
              class="panel"
              @click=${this._onPanelClick}
              aria-label="${V(this.contentAriaLabel)}"
            >
              ${this._detailContent}
            </button>
          `}
      ${this.link?this._link:""}
    `}_onLinkClick(){this.dispatchEvent(new CustomEvent("panel-detail-link-click",{detail:!0,composed:!0,bubbles:!0}))}_onPanelClick(){this.dispatchEvent(new CustomEvent("panel-detail-click",{detail:{title:this.cardTitle,number:this.mask},composed:!0,bubbles:!0}))}}export{D as B,z as b};
