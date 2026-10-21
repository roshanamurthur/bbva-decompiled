import{z as t,a8 as e,ac as a,ad as i,ab as r,ar as s,aa as n,a9 as o,as as c,at as l,a as d,an as m,L as u,ak as p,al as y,au as h,h as g,av as b,i as v,V as $,ae as f,aw as S}from"./952f98a9.js";const w=new s;var C=t`:host {
  display: block;
  box-sizing: border-box;
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1em);
  --_list-multistep-account-description-color: var(--bbva-list-multistep-description-color, var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)}));
  --_list-multistep-account-name-color: var(--bbva-list-multistep-name-color, var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)}));
  --_list-multistep-account-details-color: var(--bbva-list-multistep-details-color, var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)}));
  --_list-multistep-account-number-color: var(--bbva-list-multistep-number-color, var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)}));
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

.row {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
}

.column {
  display: flex;
  flex-direction: column;
}

.full-description-width {
  width: 100%;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem);
}

.name,
.number,
.description,
.details {
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(i.typeSmall)});
}

.description {
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(r.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(r.book.fontWeight)});
  color: var(--_list-multistep-account-description-color);
  text-align: right;
}

.name {
  flex: 1;
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(r.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(r.medium.fontWeight)});
  color: var(--_list-multistep-account-name-color);
}

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.number,
.details {
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${e(r.bookItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${e(r.bookItalic.fontWeight)});
}

.details {
  color: var(--_list-multistep-account-details-color);
}

[data-tag-name=bbva-amount] {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem);
}

.number {
  color: var(--_list-multistep-account-number-color);
}

.number .row {
  flex: 1;
}

[data-tag-name=bbva-clip-entities] {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1em);
}
${w.mediaRules()}`;class k extends(c(l(d(m(u))))){static get is(){return"bbva-list-multistep-account"}static get scopedElements(){const t=[f,S];return k.scopedElementsFromClasses(t)}static get properties(){return{amountSize:{type:String,attribute:"amount-size"},name:{type:String},entity:{type:String},entityAccessibilityText:{type:String,attribute:"entity-accessibility-text"},description:{type:String},details:{type:String},number:{type:String},secondaryAmount:{type:Number,attribute:"secondary-amount"},secondaryCurrencyCode:{type:String,attribute:"secondary-currency-code"},secondaryDescription:{type:String,attribute:"secondary-description"},secondaryLocalCurrency:{type:String,attribute:"secondary-local-currency"},secondarySymbolRight:{type:Boolean,attribute:"secondary-symbol-right"},secondaryLanguage:{type:String,attribute:"secondary-language"},visibleChars:{type:Number,attribute:"visible-chars"},maskChars:{type:String,attribute:"mask-chars"},withEllipsis:{type:Boolean,attribute:"with-ellipsis",reflect:!0}}}constructor(){super(),this.name="",this.entityAccessibilityText="",this.amountSize="l",this.maskChars="•",this.visibleChars=4,this.withEllipsis=!1,this.secondaryCurrencyCode=this.currencyCode,this.secondarylocalCurrency=this.localCurrency,this.secondaryLanguage=this.language}static get styles(){return[C,p("bbva-list-multistep-account-shared-styles"),y.dark,h.dark]}get _header(){return g`
      <div class="row">
        <span class="name${b({ellipsis:this.withEllipsis})}">${this.name}</span>
        <bbva-amount
          ambient="dark"
          .amount=${this.amount}
          variant="${this.amountSize}"
          currency-code="${this.currencyCode}"
          local-currency="${this.localCurrency}"
          ?symbol-right="${this.symbolRight}"
          language="${v(this.language)}"
        ></bbva-amount>
      </div>
    `}get _content(){return g`
      <div class="row">
        <div class="column number">
          <span class="row">
            <bbva-clip-entities
              ambient="dark"
              size="small"
              variant="white"
              entity="${this.entity}"
              ?hidden="${!this.entity}"
              >${this.t(this.entityAccessibilityText)}</bbva-clip-entities
            >
            ${k._getMaskElement(this.number,this.maskChars,!0,this.visibleChars)}
          </span>
        </div>
        <div class="column description">
          <span>${this.t(this.description)}</span>
        </div>
      </div>
    `}static _getMaskElement(t,e,a,i){if(t){const r=$(t,e,a,i);return g`
        <div class="wrapper">
          <span class="mask">${e}</span>
          <span class="number">${r.substr(e.length)}</span>
        </div>
      `}return g``}get _contentBottom(){return(this.secondaryAmount||this.secondaryDescription)&&g`
        <div class="row">
          <div class="column description full-description-width">
            <bbva-amount
              ambient="dark"
              ?hidden="${!this.secondaryAmount}"
              .amount=${this.secondaryAmount}
              variant="${this.amountSize}"
              currency-code="${this.secondaryCurrencyCode}"
              local-currency="${this.secondaryLocalCurrency}"
              ?symbol-right="${this.secondarySymbolRight}"
              language="${v(this.secondaryLanguage)}"
            ></bbva-amount>
            <span>${this.t(this.secondaryDescription)}</span>
          </div>
        </div>
      `}get _footer(){return this.details&&g`
        <div class="row">
          <span class="details">${this.details}</span>
        </div>
      `}render(){return g`
      <slot></slot>
      <div class="content">
        ${this._header} ${this._content} ${this._contentBottom} ${this._footer}
      </div>
    `}}export{k as B};
