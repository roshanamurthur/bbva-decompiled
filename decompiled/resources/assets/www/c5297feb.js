import{z as e,a8 as a,ac as r,ab as t,ad as o,L as n,ak as c,h as b}from"./952f98a9.js";import{R as i,S as l,u as s,D as m,v as d,w as p,G as u}from"./216055dc.js";var y=e`
:host {
  --_panel-code-number-color:
    var(--bbva-panel-code-number--_ambient--color,
      var(--bbva-panel-code-number--custom--primary-ambient--color,
        ${i("colorPrimaryText01Default",l)}));
  --_panel-code-number-background-color:
    var(--bbva-panel-code-number--_ambient--background-color,
      var(--bbva-panel-code-number--custom--primary-ambient--background-color,
        ${i("colorPrimarySurfaceAlternativeDefault",l)}));
}
`;const g=e`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-panel-code-number--_ambient--color: initial;
    --bbva-panel-code-number--_ambient--background-color: initial;
  }
`,v=e`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-panel-code-number--_ambient--color: var(
      --bbva-panel-code-number--custom--primary-alt-ambient--color,
      ${i("colorPrimaryAltText01Default",l)}
    );

    --bbva-panel-code-number--_ambient--background-color: var(
      --bbva-panel-code-number--custom--primary-alt-ambient--background-color,
      ${i("colorPrimaryAltSurfaceAlternativeDefault",l)}
    );
  }
`,h=e`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-panel-code-number--_ambient--color: var(
      --bbva-panel-code-number--custom--secondary-ambient--color,
      ${i("colorSecondaryText01Default",l)}
    );

    --bbva-panel-code-number--_ambient--background-color: var(
      --bbva-panel-code-number--custom--secondary-ambient--background-color,
      ${i("colorSecondarySurfaceAlternativeDefault",l)}
    );
  }
`,f=e`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-panel-code-number--_ambient--color: var(
      --bbva-panel-code-number--custom--secondary-alt-ambient--color,
      ${i("colorSecondaryAltText01Default",l)}
    );

    --bbva-panel-code-number--_ambient--background-color: var(
      --bbva-panel-code-number--custom--secondary-alt-ambient--background-color,
      ${i("colorSecondaryAltSurfaceAlternativeDefault",l)}
    );
  }
`;const k=s([Object.freeze({__proto__:null,primary:g,primaryAlt:v,secondary:h,secondaryAlt:f}),m]),_=Object.values(k);var x=e`
:host {
  font-size: var(--typographyTypeSmall, ${a(r.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${a(t.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${a(t.book.fontStyle)});
  line-height: var(--lineHeightTypeSmall, ${a(o.typeSmall)});
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

[role=group] {
  display: inline-flex;
  box-sizing: border-box;
}

.group {
  flex: none;
  display: flex;
  align-items: center;
  padding: 0 0.5rem;
  height: 3.5rem;
  background-color: var(--_panel-code-number-background-color);
  border-radius: 0.0625rem;
}

.char {
  display: flex;
  justify-content: center;
  align-items: center;
}

.group ~ .group {
  margin-left: var(--bbva-panel-code-number-group-spacing, 0.5rem);
}

.char ~ .char {
  margin-left: var(--bbva-panel-code-number-char-spacing, 0.5rem);
}

:host([masked]) .group {
  padding: 0 0.625rem;
}

:host([masked]) .char ~ .char {
  margin-left: var(--bbva-panel-code-number-char-spacing, 0.75rem);
}

.mask {
  height: 0.5rem;
  width: 0.5rem;
  border-radius: 50%;
  background-color: var(--_panel-code-number-color);
}
`;class S extends(d(p(n))){static get is(){return"bbva-panel-code-number"}static get scopedElements(){return{"bbva-type-text":u}}static get properties(){return{code:{type:String},masked:{type:Boolean},groupBy:{type:Number,attribute:"group-by"},accessibilityText:{type:String,attribute:"accessibility-text"},_codeToRender:{type:Array}}}updated(e){super.updated&&super.updated(e),e.has("accessibilityText")&&this.masked&&this.setAttribute("aria-label",this.accessibilityText)}static get styles(){return[super.styles,y,x,_,c("bbva-panel-code-number-shared-styles")]}get _codeToRender(){const e=(this.code||"").split("");if(this.groupBy){const a=[];for(;e.length>0;)a.push(e.splice(0,this.groupBy));return a}return[e]}get _groups(){return b`
      <div role="group">
        ${this._codeToRender.map((e=>b`
              <span class="group">
                ${e.map((e=>b`
                      <span class="char">
                        ${this.masked?b` <span class="mask"></span> `:b` <bbva-type-text text=${e} size="S"> </bbva-type-text>`}
                      </span>
                    `))}
              </span>
            `))}
      </div>
    `}render(){return b` ${this._groups} `}}export{S as B};
